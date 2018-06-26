package com.wil.rollop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView rollDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollDisplay = (TextView) findViewById(R.id.rollDisplay);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.d100){
            Button d100 = (Button) v;
            rollDisplay.append(String.format("%s", d100.getText()));
        }else if(v.getId()==R.id.d20){
            Button d20 = (Button) v;
            rollDisplay.append(String.format("%s", d20.getText()));
        }else if(v.getId()==R.id.d12){
            Button d12 = (Button) v;
            rollDisplay.append(String.format("%s", d12.getText()));
        }else if(v.getId()==R.id.d10){
            Button d10 = (Button) v;
            rollDisplay.append(String.format("%s", d10.getText()));
        }else if(v.getId()==R.id.d8){
            Button d8 = (Button) v;
            rollDisplay.append(String.format("%s", d8.getText()));
        }else if(v.getId()==R.id.d6){
            Button d6 = (Button) v;
            rollDisplay.append(String.format("%s", d6.getText()));
        }else if(v.getId()==R.id.d4){
            Button d4 = (Button) v;
            rollDisplay.append(String.format("%s", d4.getText()));
        }else if(v.getId()==R.id.btClr){
            rollDisplay.setText(String.format(""));
        }

    }
}
