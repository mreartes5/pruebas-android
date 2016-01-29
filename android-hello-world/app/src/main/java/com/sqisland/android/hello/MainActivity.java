package com.sqisland.android.hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private TextView greetingView;

    public void showOpenedDoor(View view) {
        Toast.makeText(getBaseContext(), "Puerta abierta!", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.opened_door_main);
//        Button buttonPicture = (Button) findViewById(R.id.action_picture);
//
//        final int version = Build.VERSION.SDK_INT;
//        if (version >= 21) {
//            return ContextCompatApi21.getDrawable(context, id);
//        } else {
//            return context.getResources().getDrawable(id);
//        }
//
//        Drawable xxx = getResources().getDrawable(R.drawable.closed_door, getBaseContext().getTheme());
//        buttonPicture.setBackground(xxx);
    }

    public void showCloseDoor(View view){
        Toast.makeText(getBaseContext(), "Vamos boca!", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.closed_door_main);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        greetingView = (TextView) findViewById(R.id.greeting);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_bye) {
            greetingView.setText(R.string.bye);
            return true;
        }

        if (item.getItemId() == R.id.action_picture) {
            setContentView(R.layout.closed_door_main);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}