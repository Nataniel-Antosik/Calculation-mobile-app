package com.example.adrian;

public class changeGrammage {
    public double changeGrammage(String Grammage, String Mass, String Area, Double value1, Double value2) {
        Double result = 0.0;
        if (Grammage == "g/m²") {
            if (Mass == "g" && Area == "mm²") {
                result = value1 / (value2 * 0.000001);
            } else if (Mass == "g" && Area == "cm²") {
                result = value1 / (value2 * 0.0001);
            } else if (Mass == "g" && Area == "m²") {
                result = value1 / value2;
            } else if (Mass == "mg" && Area == "mm²") {
                result = (value1 * 0.001) / (value2 * 0.000001);
            } else if (Mass == "mg" && Area == "cm²") {
                result = (value1 * 0.001) / (value2 * 0.0001);
            } else if (Mass == "mg" && Area == "m²") {
                result = (value1 * 0.001) / value2;
            } else if (Mass == "kg" && Area == "mm²") {
                result = (value1 * 1000) / (value2 * 0.000001);
            } else if (Mass == "kg" && Area == "cm²") {
                result = (value1 * 1000) / (value2 * 0.0001);
            } else if (Mass == "kg" && Area == "m²") {
                result = (value1 * 1000) / value2;
            }
        } else if ((Grammage == "g/mm²")) {
            if (Mass == "g" && Area == "mm²") {
                result = value1 / value2;
            } else if (Mass == "g" && Area == "cm²") {
                result = value1 / (value2 * 100);
            } else if (Mass == "g" && Area == "m²") {
                result = value1 / (value2 * 1000000);
            } else if (Mass == "mg" && Area == "mm²") {
                result = (value1 * 0.001) / value2;
            } else if (Mass == "mg" && Area == "cm²") {
                result = (value1 * 0.001) / (value2 * 100);
            } else if (Mass == "mg" && Area == "m²") {
                result = (value1 * 0.001) / (value2 * 1000000);
            } else if (Mass == "kg" && Area == "mm²") {
                result = (value1 * 1000) / value2;
            } else if (Mass == "kg" && Area == "cm²") {
                result = (value1 * 1000) / (value2 * 100);
            } else if (Mass == "kg" && Area == "m²") {
                result = (value1 * 1000) / (value2 * 1000000);
            }
        } else if ((Grammage == "g/cm²")) {
            if (Mass == "g" && Area == "mm²") {
                result = value1 / (value2 * 0.01);
            } else if (Mass == "g" && Area == "cm²") {
                result = value1 / value2;
            } else if (Mass == "g" && Area == "m²") {
                result = value1 / (value2 * 10000);
            } else if (Mass == "mg" && Area == "mm²") {
                result = (value1 * 0.001) / (value2 * 0.01);
            } else if (Mass == "mg" && Area == "cm²") {
                result = (value1 * 0.001) / value2;
            } else if (Mass == "mg" && Area == "m²") {
                result = (value1 * 0.001) / (value2 * 10000);
            } else if (Mass == "kg" && Area == "mm²") {
                result = (value1 * 1000) / (value2 * 0.01);
            } else if (Mass == "kg" && Area == "cm²") {
                result = (value1 * 1000) / value2;
            } else if (Mass == "kg" && Area == "m²") {
                result = (value1 * 1000) / (value2 * 10000);
            }
        } else if ((Grammage == "mg/mm²")) {
            if (Mass == "g" && Area == "mm²") {
                result = (value1 * 1000) / value2;
            } else if (Mass == "g" && Area == "cm²") {
                result = (value1 * 1000) / (value2 * 100);
            } else if (Mass == "g" && Area == "m²") {
                result = (value1 * 1000) / (value2 * 1000000);
            } else if (Mass == "mg" && Area == "mm²") {
                result = value1 / value2;
            } else if (Mass == "mg" && Area == "cm²") {
                result = value1 / (value2 * 100);
            } else if (Mass == "mg" && Area == "m²") {
                result = value1 / (value2 * 1000000);
            } else if (Mass == "kg" && Area == "mm²") {
                result = (value1 * 1000000) / value2;
            } else if (Mass == "kg" && Area == "cm²") {
                result = (value1 * 1000000) / (value2 * 100);
            } else if (Mass == "kg" && Area == "m²") {
                result = (value1 * 1000000) / (value2 * 1000000);
            }
        } else if ((Grammage == "mg/cm²")) {
            if (Mass == "g" && Area == "mm²") {
                result = (value1 * 1000) / (value2 * 0.01);
            } else if (Mass == "g" && Area == "cm²") {
                result = (value1 * 1000) / value2;
            } else if (Mass == "g" && Area == "m²") {
                result = (value1 * 1000) / (value2 * 10000);
            } else if (Mass == "mg" && Area == "mm²") {
                result = value1 / (value2 * 0.01);
            } else if (Mass == "mg" && Area == "cm²") {
                result = value1 / value2;
            } else if (Mass == "mg" && Area == "m²") {
                result = value1 / (value2 * 10000);
            } else if (Mass == "kg" && Area == "mm²") {
                result = (value1 * 1000000) / (value2 * 0.01);
            } else if (Mass == "kg" && Area == "cm²") {
                result = (value1 * 1000000) / value2;
            } else if (Mass == "kg" && Area == "m²") {
                result = (value1 * 1000000) / (value2 * 10000);
            }
        } else if ((Grammage == "mg/m²")) {
            if (Mass == "g" && Area == "mm²") {
                result = (value1 * 1000) / (value2 * 0.000001);
            } else if (Mass == "g" && Area == "cm²") {
                result = (value1 * 1000) / (value2 * 0.0001);
            } else if (Mass == "g" && Area == "m²") {
                result = (value1 * 1000) / value2;
            } else if (Mass == "mg" && Area == "mm²") {
                result = value1 / (value2 * 0.000001);
            } else if (Mass == "mg" && Area == "cm²") {
                result = value1 / (value2 * 0.0001);
            } else if (Mass == "mg" && Area == "m²") {
                result = value1 / value2;
            } else if (Mass == "kg" && Area == "mm²") {
                result = (value1 * 1000000) / (value2 * 0.000001);
            } else if (Mass == "kg" && Area == "cm²") {
                result = (value1 * 1000000) / (value2 * 0.0001);
            } else if (Mass == "kg" && Area == "m²") {
                result = (value1 * 1000000) / value2;
            }
        } else if ((Grammage == "kg/mm²")) {
            if (Mass == "g" && Area == "mm²") {
                result = (value1 * 0.001) / value2;
            } else if (Mass == "g" && Area == "cm²") {
                result = (value1 * 0.001) / (value2 * 100);
            } else if (Mass == "g" && Area == "m²") {
                result = (value1 * 0.001) / (value2 * 1000000);
            } else if (Mass == "mg" && Area == "mm²") {
                result = (value1 * 0.000001) / value2;
            } else if (Mass == "mg" && Area == "cm²") {
                result = (value1 * 0.000001) / (value2 * 100);
            } else if (Mass == "mg" && Area == "m²") {
                result = (value1 * 0.000001) / (value2 * 1000000);
            } else if (Mass == "kg" && Area == "mm²") {
                result = value1 / value2;
            } else if (Mass == "kg" && Area == "cm²") {
                result = value1 / (value2 * 100);
            } else if (Mass == "kg" && Area == "m²") {
                result = value1 / (value2 * 1000000);
            }
        } else if ((Grammage == "kg/cm²")) {
            if (Mass == "g" && Area == "mm²") {
                result = (value1 * 0.001) / (value2 * 0.01);
            } else if (Mass == "g" && Area == "cm²") {
                result = (value1 * 0.001) / value2;
            } else if (Mass == "g" && Area == "m²") {
                result = (value1 * 0.001) / (value2 * 100000);
            } else if (Mass == "mg" && Area == "mm²") {
                result = (value1 * 0.000001) / (value2 * 0.01);
            } else if (Mass == "mg" && Area == "cm²") {
                result = (value1 * 0.000001) / value2;
            } else if (Mass == "mg" && Area == "m²") {
                result = (value1 * 0.000001) / (value2 * 100000);
            } else if (Mass == "kg" && Area == "mm²") {
                result = value1 / (value2 * 0.01);
            } else if (Mass == "kg" && Area == "cm²") {
                result = value1 / value2;
            } else if (Mass == "kg" && Area == "m²") {
                result = value1 / (value2 * 100000);
            }
        } else if ((Grammage == "kg/m²")) {
            if (Mass == "g" && Area == "mm²") {
                result = (value1 * 0.001) / (value2 * 0.000001);
            } else if (Mass == "g" && Area == "cm²") {
                result = (value1 * 0.001) / (value2 * 0.0001);
            } else if (Mass == "g" && Area == "m²") {
                result = (value1 * 0.001) / value2;
            } else if (Mass == "mg" && Area == "mm²") {
                result = (value1 * 0.000001) / (value2 * 0.000001);
            } else if (Mass == "mg" && Area == "cm²") {
                result = (value1 * 0.000001) / (value2 * 0.0001);
            } else if (Mass == "mg" && Area == "m²") {
                result = (value1 * 0.000001) / value2;
            } else if (Mass == "kg" && Area == "mm²") {
                result = value1 / (value2 * 0.000001);
            } else if (Mass == "kg" && Area == "cm²") {
                result = value1 / (value2 * 0.0001);
            } else if (Mass == "kg" && Area == "m²") {
                result = value1 / value2;
            }
        }
        return result;
    }
}
