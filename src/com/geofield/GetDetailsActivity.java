package com.geofield;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

public class GetDetailsActivity extends Activity implements OnClickListener {
	EditText grnSize;
	EditText grnComposition;
	EditText color;
	Spinner  grainFormSpn;
	Spinner  grainShapeSpn;
	Spinner  grainPrimarySpn;
	Spinner  grainSecondarySpn;
	ImageButton nextBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_get_details);
		setupUi();
	}

	private void setupUi() {
		grnSize = (EditText)findViewById(R.id.grainSize);
		grnComposition = (EditText)findViewById(R.id.grainComposition);;
		color = (EditText)findViewById(R.id.color);
		setupSpinner(grainFormSpn, R.id.grainFormSpn, R.array.grainForm_array);
		setupSpinner(grainShapeSpn, R.id.grainShapeSpn, R.array.grainShape_array);
		setupSpinner(grainPrimarySpn, R.id.grainPrimarySpn, R.array.grainPrimary_array);
		setupSpinner(grainSecondarySpn, R.id.grainSecondarySpn, R.array.grainSecondary_array);
		nextBtn = (ImageButton) findViewById(R.id.nextBtn);
		nextBtn .setOnClickListener(this);
	}
	
	private void setupSpinner( Spinner  spn, int id, int selectionArray) {
		spn = (Spinner) findViewById(id);
		ArrayAdapter<CharSequence> spnrAdapter= ArrayAdapter.createFromResource(this,
		        										selectionArray, 
		        										android.R.layout.simple_spinner_dropdown_item);
		spnrAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spn.setAdapter(spnrAdapter);		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.get_details, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

}
