package br.sea.pocouvidorias;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LogonScreenActivity extends Activity implements OnClickListener{

	Button but;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.logon_screen);
		
		but  = (Button) findViewById(R.id.button1);
		but.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		startActivity(new Intent(this,MainActivity.class ));
	}
	
	

}
