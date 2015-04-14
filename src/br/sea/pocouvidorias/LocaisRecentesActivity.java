package br.sea.pocouvidorias;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class LocaisRecentesActivity extends Activity implements android.widget.AdapterView.OnItemClickListener{
	ListView list;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.locais_recentes);
		populateList();

		list.setOnItemClickListener((android.widget.AdapterView.OnItemClickListener) this);
	}

	public void populateList() {
		list = (ListView) findViewById(R.id.listrecentes);
		
		list.setAdapter(new ListAdapter(this));
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,long arg3) {
		Intent intent =new Intent(this,OpiniaoOrgaoActivity.class );
		
		View row = findViewById((int) arg3);
		
		TextView sigla= (TextView) row.findViewById(R.id.textView1);
		intent.putExtra("siglaOrgao", sigla.getText().toString());
		startActivity(intent);
	}






	  
}
