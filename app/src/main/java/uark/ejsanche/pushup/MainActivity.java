 package uark.ejsanche.pushup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void testPushup(){
        //pushing up changes
        int p = 0;

    }

    public void pullDown(){
        String  p = "Pulling string";
    }

    public void newMethod(){
        int i = 60;
        String test= "Test2";
        boolean True = false;

        if(i <= 100){
            test = "yes";
        }
    }
}


