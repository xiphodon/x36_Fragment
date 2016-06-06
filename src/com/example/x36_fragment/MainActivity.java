package com.example.x36_fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

//ʹ��import android.support.v4.app.FragmentActivity��
public class MainActivity extends FragmentActivity {

    private Fragment03 fg3;


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
    	//����Fragment01����
    	Fragment01 fg1 = new Fragment01();
    	//��ȡfragment������
    	FragmentManager fm = getSupportFragmentManager();
    	//��������
    	FragmentTransaction ft = fm.beginTransaction();
    	//��������ʾ��֡����
    	ft.replace(R.id.fl, fg1);
    	//�ύ
    	ft.commit();
    }
    
    public void click1(View v){
    	//����Fragment01����
    	Fragment01 fg1 = new Fragment01();
    	//��ȡfragment������
    	FragmentManager fm = getSupportFragmentManager();
    	//��������
    	FragmentTransaction ft = fm.beginTransaction();
    	//��������ʾ��֡����
    	ft.replace(R.id.fl, fg1);
    	//�ύ
    	ft.commit();
    }

    
    public void click2(View v){
    	//����Fragment02����
    	Fragment02 fg2 = new Fragment02();
    	//��ȡfragment������
    	FragmentManager fm = getSupportFragmentManager();
    	//��������
    	FragmentTransaction ft = fm.beginTransaction();
    	//��������ʾ��֡����
    	ft.replace(R.id.fl, fg2);
    	//�ύ
    	ft.commit();
    }
    
    
    public void click3(View v){
    	fg3 = new Fragment03();
    	//��ȡfragment������
    	FragmentManager fm = getSupportFragmentManager();
    	//��������
    	FragmentTransaction ft = fm.beginTransaction();
    	//��������ʾ��֡����
    	ft.replace(R.id.fl, fg3);
    	//�ύ
    	ft.commit();
    }
    
    public void click4(View v){
    	
    	EditText et_main = (EditText) findViewById(R.id.et_main);
    	String text = et_main.getText().toString();
    	//��������
    	fg3.setText(text);
    }
    
    public void setText(String text){
    	TextView tv_main = (TextView) findViewById(R.id.tv_main);
    	tv_main.setText(text);
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
