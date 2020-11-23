package com.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

//    private Button showMoney;
//    private Button showTag;
    private TextView moneyText;

    private int moneyCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moneyText = findViewById(R.id.money_text);
//        showMoney = findViewById(R.id.button_make_rain);
//        showTag = findViewById(R.id.button_show_tag);

//        showMoney.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d("MYTAG", "onClick: Show Money");
//            }
//        });

    }
    public void showTag(View v){
        Toast.makeText(getApplicationContext(),R.string.app_name, Toast.LENGTH_LONG)
                .show();
    }

    public void makeItRain(View v){

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        moneyCounter += 1000;
        moneyText.setText(String.valueOf( numberFormat.format(moneyCounter)));

        
        // moneyText.setTextColor(getResources().getColor(R.color.myColor));

        switch (moneyCounter){
            case 20000:
                moneyText.setTextColor(Color.BLACK);
                break;

            case 40000:
                moneyText.setTextColor(Color.BLUE);
                break;

            case 60000:
                moneyText.setTextColor(Color.RED);
                break;

            default:
                break;


        }
        //Log.d("MIR", "makeItRain: Tapped " + moneyCounter);
    }

}