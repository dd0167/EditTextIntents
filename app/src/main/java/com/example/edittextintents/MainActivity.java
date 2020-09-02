package com.example.edittextintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText display;
    String opp="";
    double sum=0;
    double num=0;
    String n="";
    double anssum=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display=(EditText) findViewById(R.id.display);
    }

    public void plus(View view) {
        n=display.getText().toString();
        if (n.equals(""))
        {
            Toast.makeText(this, "Enter The Number!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            num=Double.parseDouble(n);
            sum=sum+num;
            opp="+";
            display.setText("");
        }
    }

    public void minus(View view) {
        n=display.getText().toString();
        if (n.equals(""))
        {
            Toast.makeText(this, "Enter The Number!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            num=Double.parseDouble(n);
            sum=num-sum;
            opp="-";
            display.setText("");
        }
    }

    public void multiplication(View view) {
        n=display.getText().toString();
        if (n.equals(""))
        {
            Toast.makeText(this, "Enter The Number!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            num=Double.parseDouble(n);
            sum=sum+num;
            opp="*";
            display.setText("");
        }
    }

    public void division(View view) {
        n=display.getText().toString();
        if (n.equals(""))
        {
            Toast.makeText(this, "Enter The Number!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            num=Double.parseDouble(n);
            sum=sum+num;
            opp="/";
            display.setText("");
        }
    }

    public void clear(View view) {
        display.setText("");
        sum=0;
        num=0;
    }

    public void enter(View view) {
        n=display.getText().toString();
        if (n.equals(""))
        {
            Toast.makeText(this, "Enter The Number!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            num=Double.parseDouble(n);
            if(opp=="+")
            {
                sum=sum+num;
            }
            else if(opp=="-")
            {
                sum=sum-num;
            }
            else if(opp=="*")
            {
                sum=sum*num;
            }
            else if(opp=="/")
            {
                sum=sum/num;
            }
            display.setText(""+sum);
            anssum=sum;
            sum=0;
        }
    }

    public void credits(View view) {
        Intent cr=new Intent(this,CreditsActivity.class);
        cr.putExtra("ans",anssum);
        startActivity(cr);
    }
}