package example.foundation.krishan.mvphelloworldapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import example.foundation.krishan.mvphelloworldapp.Model.MyModel;
import example.foundation.krishan.mvphelloworldapp.Presenter.MyPresenter;

public class MainActivity extends AppCompatActivity implements MainActivityContractor.MyView{

    Button btn;
    TextView textView;
    MyPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn_click);
        textView = (TextView) findViewById(R.id.txtView);

        presenter = new MyPresenter(this,new MyModel());

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              presenter.onBtnClick();

            }
        });
    }


    @Override
    public void setData(String data) {
        textView.setText(data);
    }
}
