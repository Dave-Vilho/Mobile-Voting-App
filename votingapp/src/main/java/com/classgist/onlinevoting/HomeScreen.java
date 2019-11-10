package com.classgist.onlinevoting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HomeScreen extends Activity {

	private Button userBtn, adminBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_screen);
		adminBtn = (Button) findViewById(R.id.admin_btn);
		userBtn = (Button) findViewById(R.id.user_btn);


		adminBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				String fulladdr = "https://mobilevoteapp.000webhostapp.com/admin";

				// TODO Auto-generated method stub
				Intent i = new Intent(HomeScreen.this, AdminOpenWebAppActivity.class);
				i.putExtra("myurl", fulladdr);
				startActivity(i);
			}
		});

		userBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Intent i = new Intent(HomeScreen.this, LoginAndRegistrion.class);
				//startActivity(i);

				String fulladdr = "https://mobilevoteapp.000webhostapp.com/";

				Intent intent = new Intent(HomeScreen.this, OpenWebAppActivity.class);
				intent.putExtra("myurl", fulladdr);
				startActivity(intent);
			}
		});



	}

}
