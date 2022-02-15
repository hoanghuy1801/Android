package com.example.th2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView KQ=findViewById(R.id.KQ);
        EditText edita =findViewById(R.id.idsoa);
        EditText editb =findViewById(R.id.idsob);
        Button btnTong= findViewById(R.id.idbtTong);
        Button btnTich= findViewById(R.id.idbtTich);
        Button btnHieu= findViewById(R.id.idbtHieu);
        Button btnThuong= findViewById(R.id.idbtThuong);
        Button btnUoc= findViewById(R.id.idbtUoc);
        Button btnExit= findViewById(R.id.idbtExit);

        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum=0;
                try {
                    int a = Integer.parseInt(edita.getText().toString().trim());
                    int b = Integer.parseInt(editb.getText().toString().trim());

                    sum =a+b;
                }catch (Exception e){
                    e.printStackTrace();

                }
                    KQ.setText("Kết quả \b"+sum);
            }
        });
        btnTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int T=0;
                try {
                    int a = Integer.parseInt(edita.getText().toString().trim());
                    int b = Integer.parseInt(editb.getText().toString().trim());

                    T =a*b;
                }catch (Exception e){
                    e.printStackTrace();

                }
                KQ.setText("Kết quả \b"+T);

            }
        });
        btnHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int H=0;
                try {
                    int a = Integer.parseInt(edita.getText().toString().trim());
                    int b = Integer.parseInt(editb.getText().toString().trim());

                    H =a-b;
                }catch (Exception e){
                    e.printStackTrace();

                }
                KQ.setText("Kết quả \b"+H);
            }
        });
        btnThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int T=0;
                try {
                    int a = Integer.parseInt(edita.getText().toString().trim());
                    int b = Integer.parseInt(editb.getText().toString().trim());

                    T =a/b;
                }catch (Exception e){
                    e.printStackTrace();

                }
                KQ.setText("Kết quả \b"+T);
            }
        });



    }
}