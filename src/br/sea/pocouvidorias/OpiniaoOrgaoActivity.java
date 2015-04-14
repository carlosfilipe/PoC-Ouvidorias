package br.sea.pocouvidorias;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class OpiniaoOrgaoActivity extends ActionBarActivity implements
		OnClickListener {

	private Toolbar toolbar;
	Button salvar;
	RatingBar ratingBar;
	TextView sigla;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.opniao_orgao);

		getSupportActionBar().setHomeButtonEnabled(true);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar1);
		// ratingBar.setRating(getIntent().getExtras().getFloat("ratingOld"));
		sigla = (TextView) findViewById(R.id.textView1);
		sigla.setText("TCU");

		salvar = (Button) findViewById(R.id.button1);
		salvar.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_orgao, menu);
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

		if (id == android.R.id.home) {
			NavUtils.navigateUpFromSameTask(this);
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub

		startActivity(new Intent(this, ObrigadoActivity.class));
		finish();

	}

}
