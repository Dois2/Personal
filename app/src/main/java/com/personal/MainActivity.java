package com.personal;

import android.content.Context;
import android.content.DialogInterface;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextClock;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private SensorManager mSensorManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Instanciar a list view
        final ListView lv = (ListView) findViewById(R.id.lvList);

//        Instanciar o serviço de sensores
        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

//        criar uma listsa de sensores
        final List<Sensor> deviceSensors = mSensorManager.getSensorList(Sensor.TYPE_ALL);

//        Instancia de array adapter, passando este contexto(Activity) + setando para simplelist
        final ArrayAdapter<String> sensorNames = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1);

//        laço de repetição para adicionar os nomes dos sensores no array adapter
        for (int i=0; i < deviceSensors.size(); i++){

            sensorNames.add(deviceSensors.get(i).getName());


        }

//        passando o adapter para o list view
        lv.setAdapter(sensorNames);


        }
}


