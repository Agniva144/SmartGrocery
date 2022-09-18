
	 
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

public class customer__activity extends Activity {

	
	private View _bg__customer__ek2;
	private ImageView istockphoto_1319625327_170667a_1_ek2;
	private TextView welcome_to_grocery_store_ek1;
	private View _rectangle_4_ek2;
	private View _rectangle_5_ek2;
	private TextView login;
	private TextView _signup;
	private TextView or_ek2;
	private ImageView vector_8_ek3;
	private ImageView vector_9_ek2;
	private TextView terms_of_use_and_privacy_policy_ek2;
	private TextView _1__always_stocked_for_your_needs__2__we_focus_on_what_you_need__3__grocery_shopping_has_never_been_this_fun__ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.customer_);

		
		_bg__customer__ek2 = (View) findViewById(R.id._bg__customer__ek2);
		istockphoto_1319625327_170667a_1_ek2 = (ImageView) findViewById(R.id.istockphoto_1319625327_170667a_1_ek2);
		welcome_to_grocery_store_ek1 = (TextView) findViewById(R.id.welcome_to_grocery_store_ek1);
		_rectangle_4_ek2 = (View) findViewById(R.id._rectangle_4_ek2);
		_rectangle_5_ek2 = (View) findViewById(R.id._rectangle_5_ek2);
		login = (TextView) findViewById(R.id.login);
		_signup = (TextView) findViewById(R.id._signup);
		or_ek2 = (TextView) findViewById(R.id.or_ek2);
		vector_8_ek3 = (ImageView) findViewById(R.id.vector_8_ek3);
		vector_9_ek2 = (ImageView) findViewById(R.id.vector_9_ek2);
		terms_of_use_and_privacy_policy_ek2 = (TextView) findViewById(R.id.terms_of_use_and_privacy_policy_ek2);
		_1__always_stocked_for_your_needs__2__we_focus_on_what_you_need__3__grocery_shopping_has_never_been_this_fun__ek1 = (TextView) findViewById(R.id._1__always_stocked_for_your_needs__2__we_focus_on_what_you_need__3__grocery_shopping_has_never_been_this_fun__ek1);
	
		
		_rectangle_4_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), search_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_5_ek2.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), signup_customer_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_signup.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), signup_customer_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	