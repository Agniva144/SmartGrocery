
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		search_page
	 *	@date 		Sunday 18th of September 2022 09:59:34 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package exportkit.figma;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class seller_login_activity extends Activity {

	
	private View _bg__seller_login_ek2;
	private View line_3;
	private ImageView istockphoto_1319625327_170667a_1_ek1;
	private View rectangle_4_ek1;
	private View rectangle_12;
	private View rectangle_13_ek1;
	private TextView enter_store_id;
	private ImageView rectangle_11;
	private TextView enter_your_password;
	private ImageView vector_8_ek1;
	private ImageView vector_8_ek2;
	private TextView or_ek1;
	private ImageView vector_9_ek1;
	private TextView log_in;
	private ImageView vector_10;
	private View _rectangle_5_ek1;
	private TextView continue;
	private View ellipse_8;
	private ImageView image8_2_1;
	private View ellipse_11;
	private View ellipse_14;
	private TextView terms_of_use_and_privacy_policy_ek1;
	private View ellipse_15;
	private ImageView ellipse_16;
	private View ellipse_17;
	private View ellipse_20;
	private View ellipse_21;
	private View ellipse_22;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.seller_login);

		
		_bg__seller_login_ek2 = (View) findViewById(R.id._bg__seller_login_ek2);
		line_3 = (View) findViewById(R.id.line_3);
		istockphoto_1319625327_170667a_1_ek1 = (ImageView) findViewById(R.id.istockphoto_1319625327_170667a_1_ek1);
		rectangle_4_ek1 = (View) findViewById(R.id.rectangle_4_ek1);
		rectangle_12 = (View) findViewById(R.id.rectangle_12);
		rectangle_13_ek1 = (View) findViewById(R.id.rectangle_13_ek1);
		enter_store_id = (TextView) findViewById(R.id.enter_store_id);
		rectangle_11 = (ImageView) findViewById(R.id.rectangle_11);
		enter_your_password = (TextView) findViewById(R.id.enter_your_password);
		vector_8_ek1 = (ImageView) findViewById(R.id.vector_8_ek1);
		vector_8_ek2 = (ImageView) findViewById(R.id.vector_8_ek2);
		or_ek1 = (TextView) findViewById(R.id.or_ek1);
		vector_9_ek1 = (ImageView) findViewById(R.id.vector_9_ek1);
		log_in = (TextView) findViewById(R.id.log_in);
		vector_10 = (ImageView) findViewById(R.id.vector_10);
		_rectangle_5_ek1 = (View) findViewById(R.id._rectangle_5_ek1);
		continue = (TextView) findViewById(R.id.continue);
		ellipse_8 = (View) findViewById(R.id.ellipse_8);
		image8_2_1 = (ImageView) findViewById(R.id.image8_2_1);
		ellipse_11 = (View) findViewById(R.id.ellipse_11);
		ellipse_14 = (View) findViewById(R.id.ellipse_14);
		terms_of_use_and_privacy_policy_ek1 = (TextView) findViewById(R.id.terms_of_use_and_privacy_policy_ek1);
		ellipse_15 = (View) findViewById(R.id.ellipse_15);
		ellipse_16 = (ImageView) findViewById(R.id.ellipse_16);
		ellipse_17 = (View) findViewById(R.id.ellipse_17);
		ellipse_20 = (View) findViewById(R.id.ellipse_20);
		ellipse_21 = (View) findViewById(R.id.ellipse_21);
		ellipse_22 = (View) findViewById(R.id.ellipse_22);
	
		
		_rectangle_5_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), seller_profile_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	