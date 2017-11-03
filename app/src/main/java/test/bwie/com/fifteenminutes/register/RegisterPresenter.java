package test.bwie.com.fifteenminutes.register;

import test.bwie.com.fifteenminutes.login.LoginIView;

/**
 * 类的用途：
 *
 * @author HP
 * @date 2017/11/3 15 12
 */

public class RegisterPresenter {
    private LoginIView liv;
    private RegisterIModel im;

    public RegisterPresenter(LoginIView liv) {
        this.liv = liv;
        im=new RegisterModel();
    }
    public void getdata(String phone,String password){
        im.getdata(phone,password);
    }
}
