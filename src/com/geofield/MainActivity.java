package com.geofield;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	
	ImageButton  addBtn;
	ImageButton  opnBtn;
	static final int START_NEW_PROJECT = 100;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		addBtn = (ImageButton) findViewById(R.id.add_project);
		opnBtn = (ImageButton) findViewById(R.id.open_project);
		addBtn.setOnClickListener(this);
		opnBtn.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void startNewProject() {
		Intent intnt = new Intent(this, NewProjectActivity.class);
		Log.e("Intent ", "Started");
		startActivityForResult(intnt, START_NEW_PROJECT);
		return;
	}
	@Override
	public void onClick(View v) {
		Toast.makeText(this, "Id is " +String.valueOf(v.getId()) + " : " + String.valueOf(R.id.add_project), Toast.LENGTH_LONG).show();
		switch (v.getId()) {
			case R.id.add_project:
				startNewProject();
				break;
		}
	}

}
