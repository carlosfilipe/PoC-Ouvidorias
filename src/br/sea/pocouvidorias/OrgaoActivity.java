package br.sea.pocouvidorias;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class OrgaoActivity extends ActionBarActivity implements  OnTouchListener{
	
	 private Toolbar toolbar;
	 RatingBar ratingBar;
	 View view;
	
	 TextView nomeOrgao;
	 TextView siglaOrgao;
	 ImageView imagemOrgao;
	 
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.orgao);
		view = findViewById(R.id.coment1);
		view.setOnTouchListener(this);
		getSupportActionBar().setHomeButtonEnabled(true);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		
		ratingBar = (RatingBar) findViewById(R.id.ratingBar1);
		
		nomeOrgao = (TextView) findViewById(R.id.textView1);
		nomeOrgao.setText(getIntent().getExtras().getString("nomeOrgao"));
		siglaOrgao = (TextView) findViewById(R.id.textView2);
		siglaOrgao.setText(getIntent().getExtras().getString("siglaOrgao"));
		
		imagemOrgao = (ImageView) findViewById(R.id.imageView1);
		
		int indexImage = getIntent().getExtras().getInt("imagemOrgao");
		
		
		try{
		imagemOrgao.setImageResource(ListAdapter.images[indexImage]);
		}catch(Exception e){
			imagemOrgao.setImageResource(R.drawable.tcuimagem);
		}
	
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
	public boolean onTouch(View v, MotionEvent event) {
		// TODO Auto-generated method stub
		
		if (event.getAction()==MotionEvent.ACTION_CANCEL){
			v.setBackgroundColor(getResources().getColor(R.color.abc_background_cache_hint_selector_material_light));
			v.invalidate();
				
		}
		if (event.getAction()==MotionEvent.ACTION_UP){
			v.setBackgroundColor(getResources().getColor(R.color.abc_background_cache_hint_selector_material_light));
			v.invalidate();
				
		}
		if(event.getAction()==MotionEvent.ACTION_DOWN){
		v.setBackgroundColor(Color.GRAY);
		v.invalidate();
		}
		
		
		return true;
	}
	

}
