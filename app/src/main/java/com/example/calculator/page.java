package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class page extends AppCompatActivity implements View.OnClickListener{
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Button ba,bs,bm,bd;
    Button bc,bdt,be;
    EditText txtRes;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);
        b0=(Button)findViewById(R.id.btn_zero);
        b0.setOnClickListener(this);
        b1=(Button)findViewById(R.id.btn_one);
        b1.setOnClickListener(this);
        b2=(Button)findViewById(R.id.btn_two);
        b2.setOnClickListener(this);
        b3=(Button)findViewById(R.id.btn_three);
        b3.setOnClickListener(this);
        b4=(Button)findViewById(R.id.btn_four);
        b4.setOnClickListener(this);
        b5=(Button)findViewById(R.id.btn_fiv);
        b5.setOnClickListener(this);
        b6=(Button)findViewById(R.id.btn_six);
        b6.setOnClickListener(this);
        b7=(Button)findViewById(R.id.btn_sev);
        b7.setOnClickListener(this);
        b8=(Button)findViewById(R.id.btn_eig);
        b8.setOnClickListener(this);
        b9=(Button)findViewById(R.id.btn_nine);
        b9.setOnClickListener(this);
        ba=(Button)findViewById(R.id.btn_plus);
        ba.setOnClickListener(this);
        bs=(Button)findViewById(R.id.btn_min);
        bs.setOnClickListener(this);
        bm=(Button)findViewById(R.id.btn_mul);
        bm.setOnClickListener(this);
        bd=(Button)findViewById(R.id.btn_div);
        bd.setOnClickListener(this);
        be=(Button)findViewById(R.id.btn_eq);
        be.setOnClickListener(this);
        bdt=(Button)findViewById(R.id.btn_dt);
        bdt.setOnClickListener(this);
        bc=(Button)findViewById(R.id.btn_clr);
        bc.setOnClickListener(this);
         txtRes=(EditText)findViewById(R.id.btn_tt);
         txtRes.setText(" ");
    }

    @Override
    public void onClick(View v) {
        if(v.equals(b0))
            txtRes.append("0");
        if(v.equals(b1))
            txtRes.append("1");
        if(v.equals(b2))
            txtRes.append("2");
        if(v.equals(b3))
            txtRes.append("3");
        if(v.equals(b4))
            txtRes.append("4");
        if(v.equals(b5))
            txtRes.append("5");
        if(v.equals(b6))
            txtRes.append("6");
        if(v.equals(b7))
            txtRes.append("7");
        if(v.equals(b8))
            txtRes.append("8");
        if(v.equals(b9))
            txtRes.append("9");
        if(v.equals(ba))
            txtRes.append("+");
        if(v.equals(bs))
            txtRes.append("-");
        if(v.equals(bm))
            txtRes.append("*");
        if(v.equals(bd))
            txtRes.append("/");
        if(v.equals(bc))
            txtRes.setText("");
        if(v.equals(bdt))
            txtRes.append(".");
        if(v.equals(be))
        {
            try {
                String data=txtRes.getText().toString();
                if(data.contains("/"))
                {
                    String[] operands=data.split("/");
                    if(operands.length==2)
                    {
                        Double operand1=Double.parseDouble(operands[0]);
                        Double operand2=Double.parseDouble(operands[1]);
                        Double result=operand1/operand2;
                        txtRes.setText(String.valueOf(result));
                    }
                    else {
                        Toast.makeText(getBaseContext(),"Invalid",Toast.LENGTH_LONG).show();
                    }}
                    if(data.contains("+"))
                    {
                        String[] operands=data.split(Pattern.quote("+"));
                        if(operands.length==2)
                        {
                            Double operand1=Double.parseDouble(operands[0]);
                            Double operand2=Double.parseDouble(operands[1]);
                            Double result=operand1+operand2;
                            txtRes.setText(String.valueOf(result));
                        }
                        else {
                            Toast.makeText(getBaseContext(),"Invalid",Toast.LENGTH_LONG).show();
                        }}
                        else if(data.contains("*"))
                        {
                            String[] operands=data.split(Pattern.quote("*"));
                            if(operands.length==2)
                            {
                                Double operand1=Double.parseDouble(operands[0]);
                                Double operand2=Double.parseDouble(operands[1]);
                                Double result=operand1*operand2;
                                txtRes.setText(String.valueOf(result));
                            }
                            else {
                                Toast.makeText(getBaseContext(),"Invalid",Toast.LENGTH_LONG).show();
                            }}
                           else if(data.contains("-"))
                            {
                                String[] operands=data.split("-");
                                if(operands.length==2)
                                {
                                    Double operand1=Double.parseDouble(operands[0]);
                                    Double operand2=Double.parseDouble(operands[1]);
                                    Double result=operand1-operand2;
                                    txtRes.setText(String.valueOf(result));
                                }
                                else {
                                    Toast.makeText(getBaseContext(),"Invalid",Toast.LENGTH_LONG).show();
                                }}
            }
            catch(Exception e)
            {
                Toast.makeText(getBaseContext(),"Invalid",Toast.LENGTH_LONG).show();
            }
        }
    }
}