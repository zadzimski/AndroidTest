package com.example.testapp;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        String values[] = {"Android", "iOS", "WindowsPhone", "Linux", "Mac OS", "Windows",
        		"Android", "iOS", "WindowsPhone", "Linux", "Mac OS", "Windows",
        		"Android", "iOS", "WindowsPhone", "Linux", "Mac OS", "Windows"
        		,"Android", "iOS", "WindowsPhone", "Linux", "Mac OS", "Windows"};
        
        
        MySimpleArrayAdapter adapter = new MySimpleArrayAdapter(this, values);
        this.setListAdapter(adapter);
        
        
    }

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		String item = (String) getListAdapter().getItem(position);
	    Toast.makeText(this, item + " selected", Toast.LENGTH_SHORT).show();
	}
    
    
    


}
