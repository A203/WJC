package com.example.calculator;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
 
import com.example.calculator.R;
 
/**
 * ������
 * 
 * @author Administrator
 * 
 */
public class MainActivity extends Activity {
    String str1,str2;
    Button temp;
    TextView tv;
    int flag=0;
    int result0,result1,result;
    int code=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
     
        int [] btns={R.id.btn_calc_00,R.id.btn_calc_01,R.id.btn_calc_02,R.id.btn_calc_03,R.id.btn_calc_04,R.id.btn_calc_05,
                R.id.btn_calc_06,R.id.btn_calc_07,R.id.btn_calc_08,R.id.btn_calc_09};
 
        buttonListener((Button)findViewById(R.id.btn_calc_jia), 1);
        buttonListener((Button)findViewById(R.id.btn_calc_jian), 2);
        buttonListener((Button)findViewById(R.id.btn_calc_cheng), 3);
        buttonListener((Button)findViewById(R.id.btn_calc_chu), 4);
        Button dengyu=(Button)findViewById(R.id.btn_calc_dengyu);
        dengyu.setOnClickListener(new OnClickListener() {
             
            @Override
            public void onClick(View v) {
                calc();
            }
        });
         
         
        tv=(TextView)findViewById(R.id.tv_calc_sum);
        for (int i = 0; i < btns.length; i++) {
            temp=(Button)findViewById(btns[i]);
            temp.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(code==1){
                        tv.setText("");
                        code=0;
                    }
                    str1=tv.getText().toString().trim();
                    str1=str1+String.valueOf(((Button)v).getText().toString().trim());
                    tv.setText(str1);
                }
            });
        }
        //����
        Button ButtonC=(Button)findViewById(R.id.btn_calc_c);
        ButtonC.setOnClickListener(new OnClickListener() {
             
            @Override
            public void onClick(View v) {
                str1="";str2="";
                flag=0;
                tv.setText("");
            }
        });
 
    }
     
    public void calc(){
        result1=Integer.parseInt(str1);
        code=1;
        if(flag==1){
            result=result0+result1;
        }else if(flag==2){
            result=result0-result1;
        }else if(flag==3){
            result=result0*result1;
        }else if(flag==4){
            result=result0/result1;
        }
        tv.setText(String.valueOf(result));
    }
    public void buttonListener(Button button,final int id){
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                str2=str1;
                result0=Integer.parseInt(str2);
                flag=id;
                code=1;
            }
        });
    }
 
}