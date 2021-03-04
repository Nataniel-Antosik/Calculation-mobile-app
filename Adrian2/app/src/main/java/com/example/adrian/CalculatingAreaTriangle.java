package com.example.adrian;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class CalculatingAreaTriangle extends AppCompatActivity {

    private TextView mShowResult;
    public DecimalFormat df = new DecimalFormat("############.####");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculating_area_triangle);
        mShowResult = (TextView) findViewById(R.id.Result_triangle);
        Button Calculation = (Button) findViewById(R.id.calculation_triangle);
        Calculation.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                double result = 0.0;
                EditText a = (EditText) findViewById(R.id.value_a_triangle);
                EditText h = (EditText) findViewById(R.id.value_h_triangle);
                if(isEmpty(a) == true && isEmpty(h) == true){
                    showWrongInformation();
                }
                else {
                    double A = Double.parseDouble(a.getText().toString());
                    double H = Double.parseDouble(h.getText().toString());
                    result = (A * H) / 2.0;
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