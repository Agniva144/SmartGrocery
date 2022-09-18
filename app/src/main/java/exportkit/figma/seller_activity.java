
	 
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

public class seller_activity extends Activity {

	
	private View _bg__seller_ek3;
	private ImageView istockphoto_1319625327_170667a_1_ek3;
	private TextView welcome_to_grocery_store_ek2;
	private View _rectangle_4_ek3;
	private View _rectangle_5_ek3;
	private TextView login_ek1;
	private TextView signup_ek1;
	private TextView or_ek3;
	private ImageView vector_8_ek4;
	private ImageView vector_9_ek3;
	private TextView terms_of_use_and_privacy_policy_ek3;
	private TextView _1__always_stocked_for_your_needs__2__we_focus_on_what_you_need__3__grocery_shopping_has_never_been_this_fun__ek2;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.seller);

		
		_bg__seller_ek3 = (View) findViewById(R.id._bg__seller_ek3);
		istockphoto_1319625327_170667a_1_ek3 = (ImageView) findViewById(R.id.istockphoto_1319625327_170667a_1_ek3);
		welcome_to_grocery_store_ek2 = (TextView) findViewById(R.id.welcome_to_grocery_store_ek2);
		_rectangle_4_ek3 = (View) findViewById(R.id._rectangle_4_ek3);
		_rectangle_5_ek3 = (View) findViewById(R.id._rectangle_5_ek3);
		login_ek1 = (TextView) findViewById(R.id.login_ek1);
		signup_ek1 = (TextView) findViewById(R.id.signup_ek1);
		or_ek3 = (TextView) findViewById(R.id.or_ek3);
		vector_8_ek4 = (ImageView) findViewById(R.id.vector_8_ek4);
		vector_9_ek3 = (ImageView) findViewById(R.id.vector_9_ek3);
		terms_of_use_and_privacy_policy_ek3 = (TextView) findViewById(R.id.terms_of_use_and_privacy_policy_ek3);
		_1__always_stocked_for_your_needs__2__we_focus_on_what_you_need__3__grocery_shopping_has_never_been_this_fun__ek2 = (TextView) findViewById(R.id._1__always_stocked_for_your_needs__2__we_focus_on_what_you_need__3__grocery_shopping_has_never_been_this_fun__ek2);
	
		
		_rectangle_4_ek3.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), seller_login_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_5_ek3.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), seller_signup_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	