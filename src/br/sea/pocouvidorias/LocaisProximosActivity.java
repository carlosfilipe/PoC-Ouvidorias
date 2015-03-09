package br.sea.pocouvidorias;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.internal.widget.AdapterViewCompat;
import android.support.v7.internal.widget.AdapterViewCompat.OnItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class LocaisProximosActivity extends Activity implements android.widget.AdapterView.OnItemClickListener {
	ListView list;

	String[] orgaosProximos = { "Tribunal de Contas da União",
			"Ministério do Trabalho", "Ministério da Educação" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.locais_proximos);

		populateList();

		list.setOnItemClickListener((android.widget.AdapterView.OnItemClickListener) this);
	}

	public void populateList() {
		list = (ListView) findViewById(R.id.listproximos);
		ArrayAdapter adapter = new ArrayAdapter(this,
				android.R.layout.simple_list_item_1, orgaosProximos);
		list.setAdapter(adapter);
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,long arg3) {

		startActivity(new Intent(this,OrgaoActivity.class ));
	}





}
