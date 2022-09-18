
	 
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

public class adding_review_activity extends Activity {

	
	private View _bg__adding_review_ek2;
	private View rectangle_13_ek7;
	private ImageView male_user_ek5;
	private ImageView tasks_ek4;
	private View rectangle_14_ek6;
	private ImageView search_ek6;
	private TextView search_ek7;
	private View rectangle_20_ek3;
	private TextView bihari_shop_ek2;
	private ImageView star_8_ek2;
	private ImageView star_10_ek1;
	private View ellipse_15_ek6;
	private ImageView star_11_ek1;
	private TextView _2k_reviews_active_for_last_5_months_;
	private TextView location__cb_228_axis_mall_new_town__ek1;
	private View rectangle_26;
	private View rectangle_27;
	private View rectangle_27_ek1;
	private TextView __product;
	private TextView __price__kg_;
	private TextView any_review;
	private View _rectangle_28;
	private TextView submit;
	private TextView upload_recipt_or_payment_ss;
	private View rectangle_29;
	private ImageView sort_down;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.adding_review);

		
		_bg__adding_review_ek2 = (View) findViewById(R.id._bg__adding_review_ek2);
		rectangle_13_ek7 = (View) findViewById(R.id.rectangle_13_ek7);
		male_user_ek5 = (ImageView) findViewById(R.id.male_user_ek5);
		tasks_ek4 = (ImageView) findViewById(R.id.tasks_ek4);
		rectangle_14_ek6 = (View) findViewById(R.id.rectangle_14_ek6);
		search_ek6 = (ImageView) findViewById(R.id.search_ek6);
		search_ek7 = (TextView) findViewById(R.id.search_ek7);
		rectangle_20_ek3 = (View) findViewById(R.id.rectangle_20_ek3);
		bihari_shop_ek2 = (TextView) findViewById(R.id.bihari_shop_ek2);
		star_8_ek2 = (ImageView) findViewById(R.id.star_8_ek2);
		star_10_ek1 = (ImageView) findViewById(R.id.star_10_ek1);
		ellipse_15_ek6 = (View) findViewById(R.id.ellipse_15_ek6);
		star_11_ek1 = (ImageView) findViewById(R.id.star_11_ek1);
		_2k_reviews_active_for_last_5_months_ = (TextView) findViewById(R.id._2k_reviews_active_for_last_5_months_);
		location__cb_228_axis_mall_new_town__ek1 = (TextView) findViewById(R.id.location__cb_228_axis_mall_new_town__ek1);
		rectangle_26 = (View) findViewById(R.id.rectangle_26);
		rectangle_27 = (View) findViewById(R.id.rectangle_27);
		rectangle_27_ek1 = (View) findViewById(R.id.rectangle_27_ek1);
		__product = (TextView) findViewById(R.id.__product);
		__price__kg_ = (TextView) findViewById(R.id.__price__kg_);
		any_review = (TextView) findViewById(R.id.any_review);
		_rectangle_28 = (View) findViewById(R.id._rectangle_28);
		submit = (TextView) findViewById(R.id.submit);
		upload_recipt_or_payment_ss = (TextView) findViewById(R.id.upload_recipt_or_payment_ss);
		rectangle_29 = (View) findViewById(R.id.rectangle_29);
		sort_down = (ImageView) findViewById(R.id.sort_down);
	
		
		_rectangle_28.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), thank_you_response!_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	