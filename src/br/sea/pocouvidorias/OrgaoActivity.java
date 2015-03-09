package br.sea.pocouvidorias;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;

public class OrgaoActivity extends ActionBarActivity implements OnRatingBarChangeListener {
	
	 private Toolbar toolbar;
	 RatingBar ratingBar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.orgao);
		
		getSupportActionBar().setHomeButtonEnabled(true);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		
		ratingBar = (RatingBar) findViewById(R.id.ratingBar1);
		ratingBar.setOnRatingBarChangeListener(this);

	
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
		
		
		if(id == android.R.id.home){
			NavUtils.navigateUpFromSameTask(this);
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onRatingChanged(RatingBar arg0, float arg1, boolean arg2) {
		Intent intent  = new Intent(this,OpniaoOrgaoActivity.class);
		
		intent.putExtra("ratingOld",ratingBar.getRating());
		startActivity(intent);
		
	}
	

}
