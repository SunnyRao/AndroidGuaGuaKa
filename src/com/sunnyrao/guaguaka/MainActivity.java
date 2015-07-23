package com.sunnyrao.guaguaka;

import com.sunnyrao.guaguaka.view.GuaGuaKa;
import com.sunnyrao.guaguaka.view.GuaGuaKa.OnGuaGuaKaCompleteListener;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

	GuaGuaKa mGuaGuaKa;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mGuaGuaKa = (GuaGuaKa) findViewById(R.id.id_guaguaka);
		mGuaGuaKa
				.setOnGuaGuaKaCompleteListener(new OnGuaGuaKaCompleteListener() {

					@Override
					public void complete() {
						Toast.makeText(getApplicationContext(), "用户已经刮得差不多了",
								Toast.LENGTH_SHORT).show();
					}
				});
		mGuaGuaKa.setText("Hello world!");
	}
}
