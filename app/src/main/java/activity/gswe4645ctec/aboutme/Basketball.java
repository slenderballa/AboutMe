package activity.gswe4645ctec.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class Basketball extends AppCompatActivity {


    private Button swapButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball);

        swapButton = (Button) findViewById(R.id.swapScreenButton);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_basketball, menu);
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

    private void setupListeners()
    {
        swapButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {


                Intent changeScreen = new Intent(buttonView.getContext(), HomeScreen.class);
                startActivityForResult(changeScreen, 0);
            }
        });
    }
}
