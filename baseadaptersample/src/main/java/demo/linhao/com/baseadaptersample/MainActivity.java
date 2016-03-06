package demo.linhao.com.baseadaptersample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.lv_main);
        List<ItemBean> date = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            date.add(new ItemBean(
                    "我是内容" + i,
                    "我是标题" + i,
                    R.mipmap.ic_launcher));
        }
        SampleAdapter adapter = new SampleAdapter(this,date);
        listView.setAdapter(adapter);
    }
}
