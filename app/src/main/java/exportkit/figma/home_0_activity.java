
	 
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

public class home_0_activity extends Activity {

	
	private View _bg__home_0_ek2;
	private ImageView istockphoto_1319625327_170667a_1;
	private TextView welcome_to_grocery_store;
	private TextView _1__always_stocked_for_your_needs__2__we_focus_on_what_you_need__3__grocery_shopping_has_never_been_this_fun_;
	private View _rectangle_4;
	private View _rectangle_5;
	private TextView customer;
	private TextView seller;
	private TextView or;
	private ImageView vector_8;
	private ImageView vector_9;
	private TextView terms_of_use_and_privacy_policy;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_0);

		
		_bg__home_0_ek2 = (View) findViewById(R.id._bg__home_0_ek2);
		istockphoto_1319625327_170667a_1 = (ImageView) findViewById(R.id.istockphoto_1319625327_170667a_1);
		welcome_to_grocery_store = (TextView) findViewById(R.id.welcome_to_grocery_store);
		_1__always_stocked_for_your_needs__2__we_focus_on_what_you_need__3__grocery_shopping_has_never_been_this_fun_ = (TextView) findViewById(R.id._1__always_stocked_for_your_needs__2__we_focus_on_what_you_need__3__grocery_shopping_has_never_been_this_fun_);
		_rectangle_4 = (View) findViewById(R.id._rectangle_4);
		_rectangle_5 = (View) findViewById(R.id._rectangle_5);
		customer = (TextView) findViewById(R.id.customer);
		seller = (TextView) findViewById(R.id.seller);
		or = (TextView) findViewById(R.id.or);
		vector_8 = (ImageView) findViewById(R.id.vector_8);
		vector_9 = (ImageView) findViewById(R.id.vector_9);
		terms_of_use_and_privacy_policy = (TextView) findViewById(R.id.terms_of_use_and_privacy_policy);
	
		
		_rectangle_4.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), customer__activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_rectangle_5.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), seller_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	