package com.art.bladetest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import blade.Extra;
import butterknife.BindView;
import butterknife.ButterKnife;

public class TestActivity extends AppCompatActivity {

	@BindView(R.id.activity_test_text_view_test)
	TextView mTestTextView;

	@Extra
	String mText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);
		ButterKnife.bind(this);
		mTestTextView.setText(mText);
	}
}
