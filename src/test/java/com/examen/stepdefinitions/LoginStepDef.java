package com.examen.stepdefinitions;

import com.examen.steps.LoginErrorStep;
import com.examen.steps.LoginStep;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginStepDef {


    @Steps
    LoginStep loginStep;
    @Steps
    LoginErrorStep loginErrorStep;


    @Cuando("ingreso con las credenciales {string} y {string}")
    public void ingresoConLasCredencialesY(String user, String passwd) {
        loginStep.login(user,passwd);
    }

    @Entonces("lograré ingresar visualizar el titulo {string}")
    public void lograréIngresarVisualizarElTitulo(String title) {
        Assert.assertEquals(title,loginStep.getTitleMenu());
    }

    @Entonces("obtendré un mensaje de error {string}")
    public void obtendréUnMensajeDeError(String error) {
        Assert.assertEquals(error,loginErrorStep.getTextError());
    }
}
