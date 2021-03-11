package com.example.adrian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class CalculatingAreaCircle extends AppCompatActivity {

    private TextView mShowResult;
    public DecimalFormat df = new DecimalFormat("#######.####");
    public static String EXTRA_MESSAGE_CIRCLE = "com.example.adrian.extra.MESSAGE";
    public EditText r = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculating_area_circle);
        r = findViewById(R.id.value_a_circle);
    }

    public void returnMessage(View view){
        if(isEmpty(r) == true){
            showWrongInformation();
        } else {
            double value1 = Double.parseDouble(r.getText().toString());
            double result = areaCircle(value1);

            String message = Double.toString(result);
            Intent intent = new Intent();
            intent.putExtra(EXTRA_MESSAGE_CIRCLE, message);
            setResult(RESULT_OK,intent);
            finish();
        }
    }

    public double areaCircle(double r){
        double result = (Math.PI * Math.pow(r,2));
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