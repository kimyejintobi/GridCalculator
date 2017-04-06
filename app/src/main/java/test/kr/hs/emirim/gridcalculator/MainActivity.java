package test.kr.hs.emirim.gridcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button[] butNums=new Button[10];
    Button[] butOps=new Button[4];
    //int[] ids={R.id.but_01, R.id.but_02, R.id.but_03, R.id.but_04, R.id.but_05, R.id.but_06, R.id.but_07, R.id.but_08, R.id.but_09, R.id.but_10}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        for(int i = 0; i<butNums.length; i++){
            //butNums[i]=(Button)findViewById(ids+i);
            butNums[i]=(Button)findViewById(R.id.but_01+i);
            butNums[i].setOnClickListener(butNumHandler);
        }
        for(int i=0;i<butOps.length;i++){
            butOps[i]=(Button)findViewById(R.id.button6+i);
            butOps[i].setOnClickListener(butOpsHandler);
        }
    }

    View.OnClickListener butNumHandler=new View.OnClickListener(){
        @Override
        public void onClick(View view){

        }

    };
    View.OnClickListener butOpsHandler=new View.OnClickListener(){
        @Override
        public void onClick(View view){


        }
    };
}
