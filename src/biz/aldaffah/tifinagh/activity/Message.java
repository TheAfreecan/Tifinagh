package biz.aldaffah.tifinagh.activity;


import biz.aldaffah.tifinagh.R;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;

public class Message extends Activity implements OnClickListener {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.douaa);
		GridView gridView = (GridView) findViewById(R.id.gridview);
		gridView.setAdapter(new ImageAdapter(getApplicationContext()));
		
		gridView.setOnItemClickListener(new OnItemClickListener(){
			public void onItemClick(AdapterView<?> parent, View v, int position, long id){
				switch (position){
					 case 0 : Toast.makeText(getBaseContext(), "A - Amour", Toast.LENGTH_SHORT).show();break;
					 case 1 : Toast.makeText(getBaseContext(), "B - Protection", Toast.LENGTH_SHORT).show();break;
					 case 2 : Toast.makeText(getBaseContext(), "C - Sagesse", Toast.LENGTH_SHORT).show();break;
					 case 3 : Toast.makeText(getBaseContext(), "D - Force", Toast.LENGTH_SHORT).show();break;
					 case 4 : Toast.makeText(getBaseContext(), "E - Vitalit�", Toast.LENGTH_SHORT).show();break;
					 case 5 : Toast.makeText(getBaseContext(), "F - G�n�rosit�", Toast.LENGTH_SHORT).show();break;
					 case 6 : Toast.makeText(getBaseContext(), "DJ - Sant�", Toast.LENGTH_SHORT).show();break;
					 case 7 : Toast.makeText(getBaseContext(), "CUE - Sinc�rit�", Toast.LENGTH_SHORT).show();break;
					 case 8 : Toast.makeText(getBaseContext(), "GH - Droiture", Toast.LENGTH_SHORT).show();break;
					 case 9 : Toast.makeText(getBaseContext(), "GHI - Courage", Toast.LENGTH_SHORT).show();break;
					case 10 : Toast.makeText(getBaseContext(), "H - Frat�rnit�", Toast.LENGTH_SHORT).show();break;
					case 11 : Toast.makeText(getBaseContext(), "I - Esprit", Toast.LENGTH_SHORT).show();break;
					case 12 : Toast.makeText(getBaseContext(), "J - Solidarit�", Toast.LENGTH_SHORT).show();break;
					case 13 : Toast.makeText(getBaseContext(), "K - Energie", Toast.LENGTH_SHORT).show();break;
					case 14 : Toast.makeText(getBaseContext(), "L - Patience", Toast.LENGTH_SHORT).show();break;
					case 15 : Toast.makeText(getBaseContext(), "M - Ouverture", Toast.LENGTH_SHORT).show();break;
					case 16 : Toast.makeText(getBaseContext(), "N - Puret�", Toast.LENGTH_SHORT).show();break;
					case 17 : Toast.makeText(getBaseContext(), "Q - M�ditation", Toast.LENGTH_SHORT).show();break;
					case 18 : Toast.makeText(getBaseContext(), "R - Souplesse", Toast.LENGTH_SHORT).show();break;
					case 19 : Toast.makeText(getBaseContext(), "S - Equilibre", Toast.LENGTH_SHORT).show();break;
					case 20 : Toast.makeText(getBaseContext(), "T - Rencontre", Toast.LENGTH_SHORT).show();break;
					case 21 : Toast.makeText(getBaseContext(), "TCH - Optimisme", Toast.LENGTH_SHORT).show();break;
					case 22 : Toast.makeText(getBaseContext(), "TH - Paix", Toast.LENGTH_SHORT).show();break;
					case 23 : Toast.makeText(getBaseContext(), "U - Joie", Toast.LENGTH_SHORT).show();break;
					case 24 : Toast.makeText(getBaseContext(), "W - Patience", Toast.LENGTH_SHORT).show();break;
					case 25 : Toast.makeText(getBaseContext(), "X - Chance", Toast.LENGTH_SHORT).show();break;
					case 26 : Toast.makeText(getBaseContext(), "Y - M�moire", Toast.LENGTH_SHORT).show();break;
					case 27 : Toast.makeText(getBaseContext(), "Z - Libert�", Toast.LENGTH_SHORT).show();break;
				}}});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(DialogInterface dialog, int which) {
		// TODO Auto-generated method stub
		
	}
		
}
