package com.uts;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class UTS_SidikPangestuActivity  extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	Spinner spin_SP;
	Button btnHasil;
	EditText Edit_Text;
	EditText ed1;
	TextView tv_Hasil;
	String[] PS = {"Sistem Informasi","Sistem Komputer","Manajemen Informatika","Teknik Komputer"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        ed1 = (EditText) findViewById (R.id.nilai);
        btnHasil = (Button) findViewById (R.id.btnHasil);
        Edit_Text = (EditText) findViewById (R.id.editNirm);
        Edit_Text = (EditText) findViewById (R.id.editNama);
        tv_Hasil = (TextView) findViewById (R.id.tv_hasil);
        
        btnHasil.setOnClickListener(this);
        spin_SP = (Spinner)findViewById(R.id.spinPS);
        tv_Hasil = (TextView)findViewById(R.id.tv_hasil);
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this, android.R.layout.simple_spinner_item, PS); 
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin_SP.setAdapter (adapter);
        
        int nilai = Integer.parseInt(ed1.getText().toString());

        if (nilai >= 80){
            Toast.makeText(getApplicationContext(), "Yudisium A" ,Toast.LENGTH_LONG).show();
        }else if (nilai >= 70){
            Toast.makeText(getApplicationContext(), "Yudidium B" ,Toast.LENGTH_LONG).show();
        }else if (nilai >= 60){
            Toast.makeText(getApplicationContext(), "Yudisium C" , Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(), "Yudisium D" , Toast.LENGTH_LONG).show();
        }
    }

   
    public void onClick(View v) {
    	if (v == btnHasil){
    		tv_Hasil.setText("Nama Anda Adalah : " + Edit_Text + spin_SP.getSelectedItem());
    	}  	
    	
    }
    }
