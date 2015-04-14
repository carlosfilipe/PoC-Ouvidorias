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
		verOrgaoButton.setText(getIntent().getExtras().getString("siglaOrgao"));
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
			
			Intent  intent = new Intent(this, OrgaoActivity.class);
			
			intent.putExtra("siglaOrgao",getIntent().getExtras().getString("siglaOrgao"));
			intent.putExtra("nomeOrgao",getIntent().getExtras().getString("nomeOrgao"));
			intent.putExtra("imagemOrgao",getIntent().getExtras().getInt("imagemOrgao"));
			startActivity(intent);
			finish();
		}
		
	}
	
}
