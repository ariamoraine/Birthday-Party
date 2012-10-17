package birthday.party;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ActivityMain extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void sorry (View view){
    	Toast.makeText(getApplicationContext(),"I'm sorry, that's sad.", Toast.LENGTH_SHORT).show();
    }
    
    public void Birthdaycake (View view){
    	ImageView cake = (ImageView) findViewById(R.id.cake_view);
    	if (cake.getVisibility() == View.GONE) {
    		cake.setVisibility(View.VISIBLE);
    		cake.setImageResource(R.drawable.birthdaycake);
    }
    }
}
