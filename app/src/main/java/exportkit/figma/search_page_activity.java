
	 
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
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;

public class search_page_activity extends Activity {

	
	private View _bg__search_page_ek2;
	private View line_1;
	private TextView what_are_you_looking_for__;
	private TextView shop_logo;
	private TextView cart_logo;
	private TextView my_order;
	private TextView account_logo;
	private View ellipse_2;
	private View ellipse_2_ek1;
	private View ellipse_3;
	private View ellipse_4;
	private View ellipse_5;
	private View ellipse_6;
	private TextView milk;
	private TextView vegetables;
	private TextView meat;
	private TextView fruits;
	private TextView bread;
	private TextView seafood;
	private ImageView vector_3;
	private ImageView vector_4;
	private ImageView vector_5;
	private TextView stores;
	private ImageView vector_6;
	private ImageView vector_7;
	private View rectangle_2;
	private TextView a___shop_kolkata_newtown_1a_location_;
	private ImageView star_1;
	private ImageView star_2;
	private ImageView star_3;
	private View rectangle_3;
	private TextView a___shop_kolkata_newtown_1a_location__ek1;
	private ImageView star_4;
	private ImageView star_5;
	private ImageView star_6;
	private View rectangle_13;
	private ImageView tasks;
	private ImageView male_user;
	private View rectangle_14;
	private ImageView _search;
	private TextView search_ek1;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.search_page);

		
		_bg__search_page_ek2 = (View) findViewById(R.id._bg__search_page_ek2);
		line_1 = (View) findViewById(R.id.line_1);
		what_are_you_looking_for__ = (TextView) findViewById(R.id.what_are_you_looking_for__);
		shop_logo = (TextView) findViewById(R.id.shop_logo);
		cart_logo = (TextView) findViewById(R.id.cart_logo);
		my_order = (TextView) findViewById(R.id.my_order);
		account_logo = (TextView) findViewById(R.id.account_logo);
		ellipse_2 = (View) findViewById(R.id.ellipse_2);
		ellipse_2_ek1 = (View) findViewById(R.id.ellipse_2_ek1);
		ellipse_3 = (View) findViewById(R.id.ellipse_3);
		ellipse_4 = (View) findViewById(R.id.ellipse_4);
		ellipse_5 = (View) findViewById(R.id.ellipse_5);
		ellipse_6 = (View) findViewById(R.id.ellipse_6);
		milk = (TextView) findViewById(R.id.milk);
		vegetables = (TextView) findViewById(R.id.vegetables);
		meat = (TextView) findViewById(R.id.meat);
		fruits = (TextView) findViewById(R.id.fruits);
		bread = (TextView) findViewById(R.id.bread);
		seafood = (TextView) findViewById(R.id.seafood);
		vector_3 = (ImageView) findViewById(R.id.vector_3);
		vector_4 = (ImageView) findViewById(R.id.vector_4);
		vector_5 = (ImageView) findViewById(R.id.vector_5);
		stores = (TextView) findViewById(R.id.stores);
		vector_6 = (ImageView) findViewById(R.id.vector_6);
		vector_7 = (ImageView) findViewById(R.id.vector_7);
		rectangle_2 = (View) findViewById(R.id.rectangle_2);
		a___shop_kolkata_newtown_1a_location_ = (TextView) findViewById(R.id.a___shop_kolkata_newtown_1a_location_);
		star_1 = (ImageView) findViewById(R.id.star_1);
		star_2 = (ImageView) findViewById(R.id.star_2);
		star_3 = (ImageView) findViewById(R.id.star_3);
		rectangle_3 = (View) findViewById(R.id.rectangle_3);
		a___shop_kolkata_newtown_1a_location__ek1 = (TextView) findViewById(R.id.a___shop_kolkata_newtown_1a_location__ek1);
		star_4 = (ImageView) findViewById(R.id.star_4);
		star_5 = (ImageView) findViewById(R.id.star_5);
		star_6 = (ImageView) findViewById(R.id.star_6);
		rectangle_13 = (View) findViewById(R.id.rectangle_13);
		tasks = (ImageView) findViewById(R.id.tasks);
		male_user = (ImageView) findViewById(R.id.male_user);
		rectangle_14 = (View) findViewById(R.id.rectangle_14);
		_search = (ImageView) findViewById(R.id._search);
		search_ek1 = (TextView) findViewById(R.id.search_ek1);
	
		
		_search.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), choose_shop_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	