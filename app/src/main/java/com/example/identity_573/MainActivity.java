package com.example.identity_573;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView list;

    String[] maintitle ={
            "Robert John Downey Jr.",
            "John Christopher Depp II",
            "Christopher Hemsworth AM",
            "Unknown",
            "Elon Musk",
    };

    String[] subtitle ={
            "Robert John Downey Jr. is an American actor and producer. His career has been characterized by critical and popular success in his youth, followed by a period of substance abuse and legal troubles, before a resurgence of commercial success later in his career.",
            "John Christopher Depp II is an American actor and musician. He is the recipient of multiple accolades, including a Golden Globe Award and a Screen Actors Guild Award, in addition to nominations for three Academy Awards and two BAFTA awards.",
            "Christopher Hemsworth AM is an Australian actor. He rose to prominence playing Kim Hyde in the Australian television series Home and Away before beginning a film career in Hollywood.",
            "An unknown person is someone whose name you do not know or whose character you do not know anything about.",
            "Elon Reeve Musk FRS is a business magnate and investor. He is the founder, CEO and chief engineer of SpaceX; angel investor, CEO and product architect of Tesla, Inc.; owner and CEO of Twitter, Inc.; founder of The Boring Company; co-founder of Neuralink and OpenAI; and president of the philanthropic Musk Foundation.",
    };

    Integer[] imgid={
            R.drawable.person1,
            R.drawable.person2,
            R.drawable.person3,
            R.drawable.person4,
            R.drawable.person5,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListAdapter adapter=new MyListAdapter(this, maintitle, subtitle,imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // TODO Auto-generated method stub
                if(position == 0) {
                    //code specific to first list item
                    Toast.makeText(getApplicationContext(),maintitle[position],Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                    startActivity(i);
                }

                else if(position == 1) {
                    //code specific to 2nd list item
                    Toast.makeText(getApplicationContext(),maintitle[position],Toast.LENGTH_SHORT).show();
                    Intent i1 = new Intent(getApplicationContext(),MainActivity3.class);
                    startActivity(i1);
                }

                else if(position == 2) {
                    Toast.makeText(getApplicationContext(),maintitle[position],Toast.LENGTH_SHORT).show();
                    Intent i2 = new Intent(getApplicationContext(),MainActivity4.class);
                    startActivity(i2);
                }
                else if(position == 3) {
                    Toast.makeText(getApplicationContext(),maintitle[position],Toast.LENGTH_SHORT).show();
                    Intent i3 = new Intent(getApplicationContext(),MainActivity5.class);
                    startActivity(i3);
                }
                else if(position == 4) {
                    Toast.makeText(getApplicationContext(),maintitle[position], Toast.LENGTH_SHORT).show();
                    Intent i4 = new Intent(getApplicationContext(),MainActivity6.class);
                    startActivity(i4);
                }
            }
        });
    }
}