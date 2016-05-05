package com.example.hellojni;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {
	static{
		System.loadLibrary("hello");
	}
	public native String helloFromJNI();
	private Button btnShowJni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnShowJni=(Button) findViewById(R.id.btnShowJni);
        btnShowJni.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Toast.makeText(getApplicationContext(), helloFromJNI(), 1).show();
			}
		});
    }
}
