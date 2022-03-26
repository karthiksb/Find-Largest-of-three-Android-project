package com.example.largest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText fnum,snum,tnum;
    Button find;

    int large;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fnum =(EditText) findViewById(R.id.fnum);
        snum=(EditText) findViewById(R.id.snum);
        tnum =(EditText) findViewById(R.id.tnum);
        find=(Button) findViewById(R.id.btn);

        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {



                    int fnum_val = Integer.parseInt(fnum.getText().toString());
                    int snum_val = Integer.parseInt(snum.getText().toString());
                    int tnum_val = Integer.parseInt(tnum.getText().toString());

                    if (fnum_val>=snum_val && fnum_val>=tnum_val){
                        large=fnum_val;
                    }

                    else if (snum_val>=fnum_val && snum_val>=tnum_val){
                        large=snum_val;
                    }
                    else{
                        large=tnum_val;
                    }

                    Intent intent = new Intent(MainActivity.this,secondActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("large", String.valueOf(large));
                    intent.putExtras(bundle);
                    startActivity(intent);



                }catch (Exception e){


                }

            }
        });
    }
}