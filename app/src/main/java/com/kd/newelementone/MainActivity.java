package com.kd.newelementone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Observer;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;

import com.kd.newelementone.databinding.ActivityMainBinding;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Typeface fontFace = Typeface.createFromAsset(getAssets(), "fonts/simsun.ttc");
        binding.setTf(fontFace);
        initLiveData();
        initTask();
        Intent intent = new Intent(this, ElementsService.class);
        startService(intent);

    }
    public void initLiveData(){
        LiveDataBus.get().with("elements",Elements.class).observe(this, new Observer<Elements>() {
            @Override
            public void onChanged(Elements elements) {
                 binding.setElements(elements);
            }
        });
        LiveDataBus.get().with("time",String.class).observe(this, new Observer<String>() {
            @Override
            public void onChanged(String time) {
                binding.setTime(time);
            }
        });
        LiveDataBus.get().with("info",String.class).observe(this, new Observer<String>() {
            @Override
            public void onChanged(String info) {
                Log.i("TAG","info:"+info);
               ElementsService.instance.getInfo(info);
            }
        });
    }
    public TimerTask dates;
    final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年M月dd日 HH:mm");
    Timer timer1;
    public void initTask() {

        dates = new TimerTask() {
            @Override
            public void run() {
                Lunar lunar = new Lunar(Calendar.getInstance());
             LiveDataBus.get().with("time").postValue(dateFormat.format(new Date()));
            }
        };
        timer1 = new Timer();

        timer1.schedule(dates, 0, 40 * 1000);
    }
}