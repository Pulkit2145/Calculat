package com.moncledjogger.pro.calculat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  {
    Button button,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17;

    EditText editText2;

    float valOne,valTwo;

    boolean mul,div,sum,sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         button = (Button) findViewById(R.id.button);
         button2 = (Button) findViewById(R.id.button2);
         button3 = (Button) findViewById(R.id.button3);
         button4 = (Button) findViewById(R.id.button4);
         button5 = (Button) findViewById(R.id.button5);
         button6 = (Button) findViewById(R.id.button6);
         button7 = (Button) findViewById(R.id.button7);
         button8 = (Button) findViewById(R.id.button8);
         button9 = (Button) findViewById(R.id.button9);
         button10 = (Button) findViewById(R.id.button10);
         button11 = (Button) findViewById(R.id.button11);
         button12 = (Button) findViewById(R.id.button12);
         button13 = (Button) findViewById(R.id.button13);
         button14 = (Button) findViewById(R.id.button14);
         button15 = (Button) findViewById(R.id.button15);
         button16 = (Button) findViewById(R.id.button16);
         button17 = (Button) findViewById(R.id.button17);
         editText2 = (EditText) findViewById(R.id.editText2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText() + "4");

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText() + "7");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText() + "2");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText() + "8");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText() + "3");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText() + "6");

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText() + "9");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText() + "0");
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText2 == null) {
                    editText2.setText("");
                } else {
                    valOne = Float.parseFloat(editText2.getText() + "");
                    sum = true;
                    editText2.setText(null);
                }
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (editText2 == null) {
                    editText2.setText("");
                } else {
                    valOne = Float.parseFloat(editText2.getText() + "");
                    sub = true;
                    editText2.setText(null);
                }
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText2 == null) {
                    editText2.setText("");
                } else {
                    valOne = Float.parseFloat(editText2.getText() + "");
                    mul = true;
                    editText2.setText(null);
                }
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText2 == null) {
                    editText2.setText("");
                } else {
                    valOne = Float.parseFloat(editText2.getText() + "");
                    div = true;
                    editText2.setText(null);
                }
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valTwo = Float.parseFloat(editText2.getText() + "");

                if (sum == true) {
                    editText2.setText(valOne + valTwo + "");
                    sum = false;
                }
                if (sub == true) {
                    editText2.setText(valOne - valOne + "");
                    sub = false;
                }
                if (mul == true) {
                    editText2.setText(valOne * valTwo + "");
                    mul = false;
                }
                if (div == true) {
                    editText2.setText(valOne / valTwo + "");
                    div = false;
                }


            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText("");
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText(editText2.getText() + ".");
            }
        });
    }
        public void one(View view) {

    }

    public void four(View view) {


    }

    public void zero(View view) {

    }

    public void two(View view) {

    }

    public void three(View view) {

    }

    public void five(View view) {

    }

    public void six(View view) {

    }

    public void seven(View view) {
    }

    public void eight(View view) {

    }

    public void nine(View view) {

    }

    public void plus(View view) {


    }

    public void minus(View view) {

    }

    public void multiply(View view) {


    }

    public void divide(View view) {


    }

    public void equal(View view) {
    }

    public void clear(View view) {

    }

    public void dot(View view) {


    }
}




