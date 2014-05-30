package com.example.delapp1;


import android.app.Activity;

import android.os.Bundle;


import android.view.View;

import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {
public static String st="hello world";
public static String s1=st;
public Button bt;
public char letter[];
public TextView tv;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);
		
		
        tv=(TextView)findViewById(R.id.textView1);
        bt=(Button)findViewById(R.id.button1);
       
	
	
		bt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {int i;
				// TODO Auto-generated method stub
				st=tv.getText().toString();
				int x;
				int y[]={0,0,0,0,0,0,0,0,0,0,0};
				for(i=0;i<11;i++)
				{
					do
					{
						x=(int)(Math.random()*11);
						
					}while(y[x]!=0);
					y[x]=1;
                st=st.substring(0,i)+s1.charAt(x)+s1.substring(i+1);				
				}
			
		tv.setText(st);
				
			}
		});
			  
        
	}}
	