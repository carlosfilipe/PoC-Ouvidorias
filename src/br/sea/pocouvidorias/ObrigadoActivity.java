package br.sea.pocouvidorias;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ObrigadoActivity extends Activity implements OnClickListener{

	Button verOrgaoButton;
	Button finalizarButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.agradecimentos);
		
		verOrgaoButton = (Button) findViewById(R.id.verReputacaoButton);
		verOrgaoButton.setOnClickListener(this);
	
		finalizarButton = (Button) findViewById(R.id.finalizarButton);
		finalizarButton.setOnClickListener(this);
		
		
		
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		int id = arg0.getId();
		
		if (id== R.id.finalizarButton)
			finish();
		else{
			startActivity(new Intent(this, OrgaoActivity.class));
			finish();
		}
		
	}
	
}
