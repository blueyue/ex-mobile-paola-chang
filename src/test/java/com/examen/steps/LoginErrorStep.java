package com.examen.steps;

import com.examen.view.LoginScreen;
import com.examen.view.MenuScreen;
import net.thucydides.core.annotations.Step;

public class LoginErrorStep {

    LoginScreen loginScreen;

    @Step("Obteniendo Error")
    public String getTextError(){
        return loginScreen.error();
    }

}
