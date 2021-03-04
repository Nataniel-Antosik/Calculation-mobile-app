package com.example.adrian;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class CalculatingAreaSquare extends AppCompatActivity {

    private TextView mShowResult;
    public DecimalFormat df = new DecimalFormat("############.####");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculating_area_square);
        mShowResult = (TextView) findViewById(R.id.Result);
        Button Calculation = (Button) findViewById(R.id.calculation_square);
        Calculation.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                double result = 0.0;
                EditText a = (EditText) findViewById(R.id.value_a_square);
                if(isEmpty(a) == true){
                    showWrongInformation();
                }
                else {
                    double value1 = Double.parseDouble(a.getText().toString());
                    result = value1 * value1;
                    mShowResult.setText(df.format(result));
                }
            }
        });
    }
    public void showWrongInformation(){
        Toast toast = Toast.makeText(this, R.string.showInformation, Toast.LENGTH_LONG);
        toast.show();
    }

    private boolean isEmpty(EditText text) {
        if (text.getText().toString().trim().length() > 0)
            return false;
        return true;
    }
}