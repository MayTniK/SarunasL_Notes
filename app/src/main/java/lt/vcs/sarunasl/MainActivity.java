package lt.vcs.sarunasl;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "list_view";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        List<String> notes = new ArrayList<>();
        notes.add("1 - Name1 -Content1");
        notes.add("2 - Name2 -Content2");
        notes.add("3 - Name3 -Content3");
        notes.add("4 - Name4 -Content4");
        notes.add("5 - Name5 -Content5");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, notes);

        ListView listView = findViewById(R.id.listView);

        listView.setAdapter(arrayAdapter);

        AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                System.out.println(" Item position " + position);
                Log.i(TAG, "onItemClick: " + position);
            }
        } ;
        listView.setOnItemClickListener(listener);

    }
}