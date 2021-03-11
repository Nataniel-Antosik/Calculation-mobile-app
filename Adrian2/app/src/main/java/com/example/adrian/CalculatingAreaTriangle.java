package com.example.adrian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class CalculatingAreaTriangle extends AppCompatActivity {

    private TextView mShowResult;
    public DecimalFormat df = new DecimalFormat("############.####");
    public static String EXTRA_MESSAGE_TRINAGLE = "com.example.adrian.extra.MESSAGE";
    public EditText a = null;
    public EditText h = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculating_area_triangle);
        a = findViewById(R.id.value_a_triangle);
        h = findViewById(R.id.value_h_triangle);

    }

    public void returnMessage(View view){
        if(isEmpty(a) == true && isEmpty(h) == true){
            showWrongInformation();
        } else {
            double A = Double.parseDouble(a.getText().toString());
            double H = Double.parseDouble(h.getText().toString());
            double result = areaTrinagle(A, H);

            String message = Double.toString(result);
            Intent intent = new Intent();
            intent.putExtra(EXTRA_MESSAGE_TRINAGLE, message);
            setResult(RESULT_OK,intent);
            finish();
        }
    }

    public double areaTrinagle(double a, double h) {
        double result = (a * h) / 2.0;
        return result;
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