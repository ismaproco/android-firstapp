package co.ismapro.myfirstapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MyActivity extends ActionBarActivity {
    // constant with the key to use in the extra message of the intent start.
    public final static String EXTRA_MESSAGE = "com.ismapro.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        //Create the intent to lunch the Display Message Activity
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        // get the EditText from the activity
        EditText editText = (EditText) findViewById(R.id.edit_message);
        // get the text of the editText
        String message = editText.getText().toString();
        // includes an additional message into the intent
        intent.putExtra( EXTRA_MESSAGE, message );
        // starts the new activity
        startActivity(intent);
    }

}
