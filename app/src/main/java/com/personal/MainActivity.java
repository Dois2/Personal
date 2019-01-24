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

//        final TextView tvView = (TextView) findViewById(R.id.textView3);
//        final TextView txtVa11 = (TextView) findViewById(R.id.edtValor1);
//        final TextView txtVa12 = (TextView)findViewById(R.id.edtValor3);
//        final TextView txtVa13 = (TextView)findViewById(R.id.edtValor2);
        final ListView lv = (ListView) findViewById(R.id.lvList);

        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        final List<Sensor> deviceSensors = mSensorManager.getSensorList(Sensor.TYPE_ALL);


        final List<String> valores = Arrays.asList(new String[deviceSensors.size()]);

        final ArrayAdapter<String> sensorNames = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1);

        for (int i=0; i < deviceSensors.size(); i++){

            sensorNames.add(deviceSensors.get(i).getName());


        }
        lv.setAdapter(sensorNames);


        }
}


