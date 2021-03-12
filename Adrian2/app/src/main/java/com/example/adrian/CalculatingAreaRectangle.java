package com.example.adrian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CalculatingAreaRectangle extends AppCompatActivity {
    public static String EXTRA_MESSAGE_RECTANGLE = "com.example.adrian.extra.MESSAGE";
    public EditText a = null;
    public EditText b = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculating_area_rectangle);
        a = findViewById(R.id.value_a_rectangle);
        b = findViewById(R.id.value_b_rectangle);
    }

    public void returnMessage(View view){
        if(isEmpty(a) != true){
            showWrongInformation();
        } else {
            if(isEmpty(b) != true){
                showWrongInformation();
            } else {
                double value1 = Double.parseDouble(a.getText().toString());
                double value2 = Double.parseDouble(b.getText().toString());
                double result = areaRectangle(value1, value2);

                String message = Double.toString(result);
                Intent intent = new Intent();
                intent.putExtra(EXTRA_MESSAGE_RECTANGLE, message);
                setResult(RESULT_OK,intent);
                finish();
            }
        }
    }

    public double areaRectangle(double a, double b){
        double result = a * b;
        return result;
    }

    public void showWrongInformation(){
        Toast toast = Toast.makeText(this, R.string.showInformation, Toast.LENGTH_LONG);
        toast.show();
    }

    private boolean isEmpty(EditText text) {
        if (text.getText().toString().trim().length() == 0)
            return false;
        return true;
    }
}