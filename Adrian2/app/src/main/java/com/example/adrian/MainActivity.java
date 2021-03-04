package com.example.adrian;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    Spinner spinnerX1, spinnerX2, spinnerX3;
    private changeGrammage change = new changeGrammage();
    private String Mass;
    private String Area;
    private String Grammage;
    private String oldMass;
    private String oldArea;
    private String oldGrammage;
    private TextView mShowCount;
    private int iCurrentSelectionM = 0;
    private int iCurrentSelectionA = 0;
    private int iCurrentSelectionG = 0;
    public DecimalFormat df = new DecimalFormat("############.####");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.resultValue);

        spinnerX1 = findViewById(R.id.spinner1);
        List<String> mass = new ArrayList<>();
        mass.add("Choose m");
        mass.add("mg");
        mass.add("g");
        mass.add("kg");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, mass);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerX1.setAdapter(arrayAdapter);
        spinnerX1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position != 0){
                    Mass = parent.getItemAtPosition(position).toString();
                    if (iCurrentSelectionM == position){
                        return;
                    } else {
                        oldMass = parent.getItemAtPosition(iCurrentSelectionM).toString();
                        //changeMass(oldMass, Mass);
                        //Toast.makeText(parent.getContext(), "Poprzednio było: " + oldGrammage, Toast.LENGTH_LONG).show(); //dobre do sprawdzania!!!
                    }
                    iCurrentSelectionM = position;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        List<String> area = new ArrayList<>();
        area.add("Choose p");
        area.add("mm²");
        area.add("cm²");
        area.add("m²");
        spinnerX2 = findViewById(R.id.spinner2);
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, area);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerX2.setAdapter(arrayAdapter2);
        spinnerX2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position != 0) {
                    Area  = parent.getItemAtPosition(position).toString();
                    if (iCurrentSelectionA == position){
                        return;
                    } else {
                        oldArea = parent.getItemAtPosition(iCurrentSelectionA).toString();
                        //changeArea(oldArea, Area);
                    }
                    iCurrentSelectionA = position;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spinnerX3 = findViewById(R.id.spinner3);
        List<String> grammage = new ArrayList<>();
        grammage.add("g/m²");
        grammage.add("g/mm²");
        grammage.add("g/cm²");
        grammage.add("mg/mm²");
        grammage.add("mg/cm²");
        grammage.add("mg/m²");
        grammage.add("kg/mm²");
        grammage.add("kg/cm²");
        grammage.add("kg/m²");
        ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter(this, android.R.layout.simple_list_item_1, grammage);
        arrayAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerX3.setAdapter(arrayAdapter3);
        spinnerX3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Grammage = parent.getItemAtPosition(position).toString();
                if (iCurrentSelectionG == position){
                    return;
                } else {
                    oldGrammage = parent.getItemAtPosition(iCurrentSelectionG).toString();

                    //Toast.makeText(parent.getContext(), "Poprzednio było: " + oldGrammage, Toast.LENGTH_LONG).show(); //dobre do sprawdzania!!!
                }
                iCurrentSelectionG = position;
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.circle:
                openCalculatingCircle();
                break;
            case R.id.triangle:
                openCalculatingTriangle();
                break;
            case R.id.square:
                openCalculatingSquare();
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return super.onOptionsItemSelected(item);
    }

    public void openCalculatingCircle(){
        Intent intent = new Intent(this, CalculatingAreaCircle.class);
        startActivity(intent);
    }

    public void openCalculatingSquare(){
        Intent intent = new Intent(this, CalculatingAreaSquare.class);
        startActivity(intent);
    }

    public void openCalculatingTriangle(){
        Intent intent = new Intent(this, CalculatingAreaTriangle.class);
        startActivity(intent);
    }

    public void showWrongInformation(){
        Toast toast = Toast.makeText(this, R.string.showInformation, Toast.LENGTH_LONG);
        toast.show();
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null){
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        }catch (NumberFormatException nfe){
            return false;
        }
        return true;
    }

    public void showValue(){
        EditText value1= (EditText) findViewById(R.id.value1);
        double a = 0.0;
        if (isNumeric(value1.getText().toString()) == true){
            a = Double.parseDouble(value1.getText().toString());
            Toast toast = Toast.makeText(this, String.valueOf(a), Toast.LENGTH_LONG);
            toast.show();
        } else {
            showWrongInformation();
        }
    }

    public double calculations(EditText v1,  EditText v2){
        double result = 0.0;
        if (v1.getText().toString().isEmpty() == true && v2.getText().toString().isEmpty() == true){
            showWrongInformation();
        } else {
            double value1 = Double.parseDouble(v1.getText().toString());
            double value2 = Double.parseDouble(v2.getText().toString());

            if ((isNumeric(v1.getText().toString()) == true &&  isNumeric(v2.getText().toString()) == true) && (value1 > 0.0 && value2 > 0.0)) {
                result = change.changeGrammage(Grammage, Mass, Area, value1, value2);
            } else {
                showWrongInformation();
            }
        }
        return result;
    }

    public void changeMass(String oMass, String aMass){
        Double g = 0.0;
        EditText v1= (EditText) findViewById(R.id.value1);
        if (oMass != aMass && oMass != "Wybierz masę" && aMass != "Wybierz masę"){
            if (oMass == "mg" && aMass == "g" && v1.getText().toString().isEmpty() != true){
                g = Double.parseDouble(v1.getText().toString()) * 0.001;
                v1.setText(Double.toString(g));
            } else if (oMass == "mg" && aMass == "kg" && v1.getText().toString().isEmpty() != true) {
                g = Double.parseDouble(v1.getText().toString()) * 0.000001;
                v1.setText(Double.toString(g));
            } else if (oMass== "g" && aMass == "mg" && v1.getText().toString().isEmpty() != true) {
                g = Double.parseDouble(v1.getText().toString()) * 1000;
                v1.setText(Double.toString(g));
            } else if (oMass == "g" && aMass == "kg" && v1.getText().toString().isEmpty() != true) {
                g = Double.parseDouble(v1.getText().toString()) * 0.001;
                v1.setText(Double.toString(g));
            } else if (oMass == "kg" && aMass == "mg" && v1.getText().toString().isEmpty() != true) {
                g = Double.parseDouble(v1.getText().toString()) * 1000000;
                v1.setText(Double.toString(g));
            } else if (oMass == "kg" && aMass == "g" && v1.getText().toString().isEmpty() != true) {
                g = Double.parseDouble(v1.getText().toString()) * 1000;
                v1.setText(Double.toString(g));
            }
        }
    }

    public void changeArea(String oArea, String aArea){
        Double a = 0.0;
        EditText v2= (EditText) findViewById(R.id.value2);
        if (oArea != aArea && aArea != "Wybierz powierzchnię" && aArea != "Wybierz powierzchnię"){
            if (oArea == "mm²" && aArea == "cm²" && v2.getText().toString().isEmpty() != true){
                a = Double.parseDouble(v2.getText().toString()) * 0.01;
                v2.setText(Double.toString(a));
            }else if (oArea == "mm²" && aArea == "m²" && v2.getText().toString().isEmpty() != true){
                a = Double.parseDouble(v2.getText().toString()) * 0.000001;
                v2.setText(Double.toString(a));
            } else if (oArea == "cm²" && aArea == "mm²" && v2.getText().toString().isEmpty() != true){
                a = Double.parseDouble(v2.getText().toString()) * 100;
                v2.setText(Double.toString(a));
            } else if (oArea == "cm²" && aArea == "m²" && v2.getText().toString().isEmpty() != true){
                a = Double.parseDouble(v2.getText().toString()) * 0.0001;
                v2.setText(Double.toString(a));
            } else if (oArea == "m²" && aArea == "mm²" && v2.getText().toString().isEmpty() != true){
                a = Double.parseDouble(v2.getText().toString()) * 1000000;
                v2.setText(Double.toString(a));
            } else if (oArea == "m²" && aArea == "cm²" && v2.getText().toString().isEmpty() != true){
                a = Double.parseDouble(v2.getText().toString()) * 10000;
                v2.setText(Double.toString(a));
            }
        }
    }

    public void click(View view){
        double tmp = 0.0;
        Button Converter = (Button) findViewById(R.id.Converter);
        EditText v1= (EditText) findViewById(R.id.value1);
        EditText v2= (EditText) findViewById(R.id.value2);
        if((Mass != "Wybierz masę" && Area != "Wybierz powierzchnię") && (v1.getText().toString().isEmpty() != true && v2.getText().toString().isEmpty() != true)){
            tmp = calculations(v1, v2);
            mShowCount.setText(df.format(tmp));
        } else {
            showWrongInformation();
        }
    }
}