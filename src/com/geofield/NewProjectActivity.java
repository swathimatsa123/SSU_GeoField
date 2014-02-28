package com.geofield;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

public class NewProjectActivity extends Activity implements OnClickListener{
	Spinner rockTypeSpn;
	Spinner strcTypeSpn;
	ImageButton nextBtn;
	static final int START_GATHER_DETAILS = 100;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_project);
		setupUi();
	}
	private void setupUi () {
		rockTypeSpn = (Spinner) findViewById(R.id.rockTypeSpn);
		ArrayAdapter<CharSequence> rckTypeAdapter = ArrayAdapter.createFromResource(this,
		        										R.array.rockType_array, 
		        										android.R.layout.simple_spinner_dropdown_item);
		rckTypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		rockTypeSpn.setAdapter(rckTypeAdapter);

		strcTypeSpn = (Spinner) findViewById(R.id.strcTypeSpn);
		ArrayAdapter<CharSequence> strcTypeAdapter= ArrayAdapter.createFromResource(this,
		        										R.array.strcType_array, 
		        										android.R.layout.simple_spinner_dropdown_item);
		strcTypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		strcTypeSpn.setAdapter(strcTypeAdapter);		
		
		nextBtn = (ImageButton) findViewById(R.id.nextBtn);
		nextBtn .setOnClickListener(this);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.new_project, menu);
		return true;
	}
	
	public void startDetailsActivity() {
		Intent intnt = new Intent(this, GetDetailsActivity.class);
		Log.e("Intent ", "Started");
		startActivityForResult(intnt, START_GATHER_DETAILS);
		return;
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
			case R.id.nextBtn:
				startDetailsActivity();
				break;
		}
	}
}
