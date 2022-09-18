
	 
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

public class shop_activity extends Activity {

	
	private View _bg__shop_ek2;
	private View rectangle_13_ek6;
	private ImageView male_user_ek4;
	private ImageView tasks_ek3;
	private View rectangle_14_ek5;
	private ImageView search_ek4;
	private TextView search_ek5;
	private View rectangle_20_ek2;
	private TextView bihari_shop_ek1;
	private ImageView star_8_ek1;
	private ImageView star_10;
	private View ellipse_15_ek5;
	private ImageView star_11;
	private TextView _245_reviews_active_for_last_5_months_;
	private TextView location__cb_228_axis_mall_new_town_;
	private View rectangle_21;
	private TextView chicken;
	private TextView __230_kg;
	private View rectangle_22;
	private View _rectangle_23;
	private TextView _bought_anything_from_here_;
	private View rectangle_24;
	private TextView __150_tray;
	private View rectangle_25;
	private TextView __45_packet;
	private TextView mutton;
	private TextView egg;
	private TextView __750_kg;
	private TextView bread_ek1;
	private TextView wrong_info__;
	private TextView wrong_info___ek1;
	private TextView wrong_info___ek2;
	private TextView wrong_info___ek3;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.shop);

		
		_bg__shop_ek2 = (View) findViewById(R.id._bg__shop_ek2);
		rectangle_13_ek6 = (View) findViewById(R.id.rectangle_13_ek6);
		male_user_ek4 = (ImageView) findViewById(R.id.male_user_ek4);
		tasks_ek3 = (ImageView) findViewById(R.id.tasks_ek3);
		rectangle_14_ek5 = (View) findViewById(R.id.rectangle_14_ek5);
		search_ek4 = (ImageView) findViewById(R.id.search_ek4);
		search_ek5 = (TextView) findViewById(R.id.search_ek5);
		rectangle_20_ek2 = (View) findViewById(R.id.rectangle_20_ek2);
		bihari_shop_ek1 = (TextView) findViewById(R.id.bihari_shop_ek1);
		star_8_ek1 = (ImageView) findViewById(R.id.star_8_ek1);
		star_10 = (ImageView) findViewById(R.id.star_10);
		ellipse_15_ek5 = (View) findViewById(R.id.ellipse_15_ek5);
		star_11 = (ImageView) findViewById(R.id.star_11);
		_245_reviews_active_for_last_5_months_ = (TextView) findViewById(R.id._245_reviews_active_for_last_5_months_);
		location__cb_228_axis_mall_new_town_ = (TextView) findViewById(R.id.location__cb_228_axis_mall_new_town_);
		rectangle_21 = (View) findViewById(R.id.rectangle_21);
		chicken = (TextView) findViewById(R.id.chicken);
		__230_kg = (TextView) findViewById(R.id.__230_kg);
		rectangle_22 = (View) findViewById(R.id.rectangle_22);
		_rectangle_23 = (View) findViewById(R.id._rectangle_23);
		_bought_anything_from_here_ = (TextView) findViewById(R.id._bought_anything_from_here_);
		rectangle_24 = (View) findViewById(R.id.rectangle_24);
		__150_tray = (TextView) findViewById(R.id.__150_tray);
		rectangle_25 = (View) findViewById(R.id.rectangle_25);
		__45_packet = (TextView) findViewById(R.id.__45_packet);
		mutton = (TextView) findViewById(R.id.mutton);
		egg = (TextView) findViewById(R.id.egg);
		__750_kg = (TextView) findViewById(R.id.__750_kg);
		bread_ek1 = (TextView) findViewById(R.id.bread_ek1);
		wrong_info__ = (TextView) findViewById(R.id.wrong_info__);
		wrong_info___ek1 = (TextView) findViewById(R.id.wrong_info___ek1);
		wrong_info___ek2 = (TextView) findViewById(R.id.wrong_info___ek2);
		wrong_info___ek3 = (TextView) findViewById(R.id.wrong_info___ek3);
	
		
		_rectangle_23.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), adding_review_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_bought_anything_from_here_.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), adding_review_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	