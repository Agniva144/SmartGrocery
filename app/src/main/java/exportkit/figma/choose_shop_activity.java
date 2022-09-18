
	 
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
import android.content.Intent;
import android.widget.TextView;
import android.widget.ImageView;

public class choose_shop_activity extends Activity {

	
	private View _bg__choose_shop_ek2;
	private View _rectangle_11_ek1;
	private View rectangle_11_ek2;
	private TextView __;
	private TextView bengali_shop;
	private View rectangle_12_ek3;
	private TextView town_shop;
	private View rectangle_13_ek4;
	private ImageView male_user_ek1;
	private ImageView tasks_ek1;
	private View rectangle_14_ek3;
	private ImageView search_ek2;
	private TextView search_ek3;
	private View rectangle_15_ek1;
	private TextView meat_ek1;
	private TextView _1_;
	private TextView _2_;
	private TextView _3_;
	private TextView bihari_shop;
	private ImageView star_6_ek1;
	private ImageView star_7;
	private ImageView star_8;
	private View ellipse_15_ek3;
	private TextView ___ek1;
	private TextView price___230__;
	private ImageView star_6_ek2;
	private ImageView star_9;
	private View ellipse_16_ek1;
	private TextView price__225__;
	private TextView last_updated__today;
	private TextView last_updated__today_ek1;
	private TextView last_updated__yesterday;
	private View ellipse_17_ek1;
	private TextView ___ek2;
	private TextView price__245__;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.choose_shop);

		
		_bg__choose_shop_ek2 = (View) findViewById(R.id._bg__choose_shop_ek2);
		_rectangle_11_ek1 = (View) findViewById(R.id._rectangle_11_ek1);
		rectangle_11_ek2 = (View) findViewById(R.id.rectangle_11_ek2);
		__ = (TextView) findViewById(R.id.__);
		bengali_shop = (TextView) findViewById(R.id.bengali_shop);
		rectangle_12_ek3 = (View) findViewById(R.id.rectangle_12_ek3);
		town_shop = (TextView) findViewById(R.id.town_shop);
		rectangle_13_ek4 = (View) findViewById(R.id.rectangle_13_ek4);
		male_user_ek1 = (ImageView) findViewById(R.id.male_user_ek1);
		tasks_ek1 = (ImageView) findViewById(R.id.tasks_ek1);
		rectangle_14_ek3 = (View) findViewById(R.id.rectangle_14_ek3);
		search_ek2 = (ImageView) findViewById(R.id.search_ek2);
		search_ek3 = (TextView) findViewById(R.id.search_ek3);
		rectangle_15_ek1 = (View) findViewById(R.id.rectangle_15_ek1);
		meat_ek1 = (TextView) findViewById(R.id.meat_ek1);
		_1_ = (TextView) findViewById(R.id._1_);
		_2_ = (TextView) findViewById(R.id._2_);
		_3_ = (TextView) findViewById(R.id._3_);
		bihari_shop = (TextView) findViewById(R.id.bihari_shop);
		star_6_ek1 = (ImageView) findViewById(R.id.star_6_ek1);
		star_7 = (ImageView) findViewById(R.id.star_7);
		star_8 = (ImageView) findViewById(R.id.star_8);
		ellipse_15_ek3 = (View) findViewById(R.id.ellipse_15_ek3);
		___ek1 = (TextView) findViewById(R.id.___ek1);
		price___230__ = (TextView) findViewById(R.id.price___230__);
		star_6_ek2 = (ImageView) findViewById(R.id.star_6_ek2);
		star_9 = (ImageView) findViewById(R.id.star_9);
		ellipse_16_ek1 = (View) findViewById(R.id.ellipse_16_ek1);
		price__225__ = (TextView) findViewById(R.id.price__225__);
		last_updated__today = (TextView) findViewById(R.id.last_updated__today);
		last_updated__today_ek1 = (TextView) findViewById(R.id.last_updated__today_ek1);
		last_updated__yesterday = (TextView) findViewById(R.id.last_updated__yesterday);
		ellipse_17_ek1 = (View) findViewById(R.id.ellipse_17_ek1);
		___ek2 = (TextView) findViewById(R.id.___ek2);
		price__245__ = (TextView) findViewById(R.id.price__245__);
	
		
		_rectangle_11_ek1.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), shop_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	