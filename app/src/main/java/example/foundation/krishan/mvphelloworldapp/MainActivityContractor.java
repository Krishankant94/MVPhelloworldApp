package example.foundation.krishan.mvphelloworldapp;

/**
 * Created by krishan on 11/30/2017.
 */

public interface MainActivityContractor {
    interface  MyView {
      void setData(String data);
    }
    interface  MyModel {
      String getData();
    }
    interface  MyPresenter {
     void onBtnClick();
    }
}
