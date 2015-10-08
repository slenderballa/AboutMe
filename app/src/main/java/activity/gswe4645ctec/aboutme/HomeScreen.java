package activity.gswe4645ctec.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class HomeScreen extends AppCompatActivity
{
    private Button basketballButton;
    private Button familyButton;
    private Button foodButton;
    private Button hikingButton;
    private Button musicButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        basketballButton = (Button) findViewById(R.id.returnBasketballButton);

        setupListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void setupListeners()
    {
        basketballButton.setOnClickListener(new View.OnClickListener()
        {
           public void onClick(View buttonView)
           {
               Intent changeScreen = new Intent(buttonView.getContext(), Basketball.class);
               startActivityForResult(changeScreen, 0);
                }
            });





        familyButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                Intent changeScreen = new Intent(buttonView.getContext(), Family.class);
                startActivityForResult(changeScreen, 0);
            }
        });





        foodButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                Intent changeScreen = new Intent(buttonView.getContext(), Food.class);
                startActivityForResult(changeScreen, 0);
            }
        });





        hikingButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                Intent changeScreen = new Intent(buttonView.getContext(), Hiking.class);
                startActivityForResult(changeScreen, 0);
            }
        });



        musicButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                Intent changeScreen = new Intent(buttonView.getContext(), Music.class);
                startActivityForResult(changeScreen, 0);
            }
        });









    }
}
