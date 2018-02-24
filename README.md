# Android-MVP
This repository is teaching you how to use Android MVP Pattern .  This is a basic Android MVP Pattern . You can learn how to achieve MVP in Android . 


Mvp is Model View Presenter . MVP is a pattern to make the Android code stay clean . In Android MVC Pattern , Code is very messy, but in MVP Pattern View is neat and clean . For Full Understanding of MVP I recommend you use read MVP HERE : http://stacklearning.blogspot.in/2018/02/android-mvp-tutorial-part1.html 


We have implemented MVP in Android  by making Activity , Interface and Class , You can check out the MVP Part 2 HERE :  http://stacklearning.blogspot.in/2018/02/android-mvp-tutorial-part2.html

In the Part 2 we have defined :

Login Activity

LoginView   ->  (Interface )

LoginPresenter   -> (Interface ) 

LoginPresenterImplemetation  -> ( class)



LoginActivity
public class LoginActivity extends AppCompatActivity implements LoginView {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}

LoginView
package com.stacklearning.androidmvp.login;

public interface LoginView {


}


LoginPresenter
package com.stacklearning.androidmvp.login;
public interface LoginPresenter {
}


 
LoginPresenterImplemetation
package com.stacklearning.androidmvp.login;
public class LoginPresenterImplementation implements LoginPresenter {


}
 

For making full Project you can download project or read MVP Part3 HERE :  http://stacklearning.blogspot.in/2018/02/android-mvp-tutorial-part3.html



