package br.sea.pocouvidorias;

import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.app.LocalActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends ActionBarActivity {

	TabHost mTabHost;
	TabHost abas;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		mTabHost = (TabHost) findViewById(R.id.tabhost);
		LocalActivityManager mLocalActivityManager = new LocalActivityManager(
				this, false);
		mLocalActivityManager.dispatchCreate(savedInstanceState);
		mTabHost.setup(mLocalActivityManager);

		TabSpec abaRecentesSpec = mTabHost.newTabSpec("Ultimos Recentes");
		abaRecentesSpec.setIndicator("Ultimos locais", null);
		Intent abaRecentesIntent = new Intent(this,
				LocaisRecentesActivity.class);
		abaRecentesSpec.setContent(abaRecentesIntent);

		TabSpec abaProximosSpec = mTabHost.newTabSpec("Locais Proximos");
		abaProximosSpec.setIndicator("Locais Proximos", null);
		Intent abaProximosIntent = new Intent(this,
				LocaisProximosActivity.class);
		abaProximosSpec.setContent(abaProximosIntent);

		mTabHost.addTab(abaProximosSpec);
		mTabHost.addTab(abaRecentesSpec);

		/*
		 * abas = (TabHost) findViewById(R.id.tabhost); abas.setup();
		 * 
		 * TabSpec descritor = abas.newTabSpec("aba1");
		 * descritor.setContent(R.id.locais_proximos);
		 * descritor.setIndicator("locais Proximos"); abas.addTab(descritor);
		 * 
		 * descritor = abas.newTabSpec("aba2");
		 * descritor.setContent(R.id.locais_recentes);
		 * descritor.setIndicator("Recentes"); abas.addTab(descritor);
		 */

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void populateListView() {

	}

}
