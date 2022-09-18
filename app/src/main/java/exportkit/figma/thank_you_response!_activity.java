
	 
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

public class thank_you_response!_activity extends Activity {

	
	private View _bg__thank_you_response__ek2;
	private View rectangle_13_ek8;
	private ImageView male_user_ek6;
	private ImageView tasks_ek5;
	private View rectangle_14_ek7;
	private ImageView search_ek8;
	private TextView search_ek9;
	private View rectangle_20_ek4;
	private TextView total_contributions_given___170;
	private TextView _207_1_points;
	private TextView __1_non_recipt_buy_;
	private ImageView male_user_ek7;
	private TextView rahul_kumar;
	private TextView thanks_for_your_contribution_;
	private TextView provide_recipt_or_payment_ss_to_get_points__7__;
	private ImageView star_11_ek2;
	private View _rectangle_30;
	private TextView return_home;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.thank_you_response!);

		
		_bg__thank_you_response__ek2 = (View) findViewById(R.id._bg__thank_you_response__ek2);
		rectangle_13_ek8 = (View) findViewById(R.id.rectangle_13_ek8);
		male_user_ek6 = (ImageView) findViewById(R.id.male_user_ek6);
		tasks_ek5 = (ImageView) findViewById(R.id.tasks_ek5);
		rectangle_14_ek7 = (View) findViewById(R.id.rectangle_14_ek7);
		search_ek8 = (ImageView) findViewById(R.id.search_ek8);
		search_ek9 = (TextView) findViewById(R.id.search_ek9);
		rectangle_20_ek4 = (View) findViewById(R.id.rectangle_20_ek4);
		total_contributions_given___170 = (TextView) findViewById(R.id.total_contributions_given___170);
		_207_1_points = (TextView) findViewById(R.id._207_1_points);
		__1_non_recipt_buy_ = (TextView) findViewById(R.id.__1_non_recipt_buy_);
		male_user_ek7 = (ImageView) findViewById(R.id.male_user_ek7);
		rahul_kumar = (TextView) findViewById(R.id.rahul_kumar);
		thanks_for_your_contribution_ = (TextView) findViewById(R.id.thanks_for_your_contribution_);
		provide_recipt_or_payment_ss_to_get_points__7__ = (TextView) findViewById(R.id.provide_recipt_or_payment_ss_to_get_points__7__);
		star_11_ek2 = (ImageView) findViewById(R.id.star_11_ek2);
		_rectangle_30 = (View) findViewById(R.id._rectangle_30);
		return_home = (TextView) findViewById(R.id.return_home);
	
		
		_rectangle_30.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), search_page_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		//custom code goes here
	
	}
}
	
	