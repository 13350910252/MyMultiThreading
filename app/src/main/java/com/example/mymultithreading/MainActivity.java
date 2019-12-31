package com.example.mymultithreading;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_main_one;
    Button btn_main_two;
    Button btn_main_three;
    Button btn_main_four;
    Button btn_main_five;
    Button btn_main_six;
    Button btn_main_seven;
    Button btn_main_eight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_main_one = findViewById(R.id.btn_main_one);
        btn_main_two = findViewById(R.id.btn_main_two);
        btn_main_three = findViewById(R.id.btn_main_three);
        btn_main_four = findViewById(R.id.btn_main_four);
        btn_main_five = findViewById(R.id.btn_main_five);
        btn_main_six = findViewById(R.id.btn_main_five);
        btn_main_seven = findViewById(R.id.btn_main_seven);
        btn_main_eight = findViewById(R.id.btn_main_seven);

        btn_main_one.setOnClickListener(this);
        btn_main_two.setOnClickListener(this);
        btn_main_three.setOnClickListener(this);
        btn_main_four.setOnClickListener(this);
        btn_main_five.setOnClickListener(this);
        btn_main_six.setOnClickListener(this);
        btn_main_seven.setOnClickListener(this);
        btn_main_eight.setOnClickListener(this);

        btn_main_one.setText("AsyncTask的使用");
        btn_main_two.setText("");
        btn_main_three.setText("");
        btn_main_four.setText("");
        btn_main_five.setText("");
        btn_main_six.setText("");
        btn_main_seven.setText("");
        btn_main_eight.setText("");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_main_one:

                break;
            case R.id.btn_main_two:

                break;
            case R.id.btn_main_three:

                break;
            case R.id.btn_main_four:

                break;
            case R.id.btn_main_five:

                break;
            case R.id.btn_main_six:

                break;
            case R.id.btn_main_seven:

                break;
            case R.id.btn_main_eight:

                break;
            default:
        }
    }
}
