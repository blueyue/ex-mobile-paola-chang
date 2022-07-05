package com.examen.steps;

import com.examen.view.LoginScreen;
import com.examen.view.MenuScreen;
import net.thucydides.core.annotations.Step;

public class LoginStep {

    LoginScreen loginScreen;
    MenuScreen menuScreen;

    @Step("Logueandose")
    public void login(String user,String passwd){
        loginScreen.loguear(user,passwd);
    }
    @Step("Obtener Titulo de Menu")
    public String getTitleMenu(){
        return menuScreen.getTitle();
    }

}
