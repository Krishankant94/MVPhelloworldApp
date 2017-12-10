package example.foundation.krishan.mvphelloworldapp.Presenter;


import example.foundation.krishan.mvphelloworldapp.MainActivityContractor;
import example.foundation.krishan.mvphelloworldapp.Model.MyModel;

/**
 * Created by krishan on 11/30/2017.
 */

public class MyPresenter implements MainActivityContractor.MyPresenter {

   MainActivityContractor.MyView myView;
   MyModel myModel;

    public MyPresenter(MainActivityContractor.MyView myView,MyModel myModel) {
        this.myView = myView;
        this.myModel = myModel;
    }
    @Override
    public void onBtnClick() {
       String result = myModel.getData();
       myView.setData(result);
    }
}
