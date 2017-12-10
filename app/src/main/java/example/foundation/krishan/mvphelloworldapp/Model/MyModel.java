package example.foundation.krishan.mvphelloworldapp.Model;

import example.foundation.krishan.mvphelloworldapp.MainActivityContractor;

/**
 * Created by krishan on 11/30/2017.
 */

public class MyModel implements MainActivityContractor.MyModel {

    @Override
    public String getData() {
        return "hello world";
    }
}
