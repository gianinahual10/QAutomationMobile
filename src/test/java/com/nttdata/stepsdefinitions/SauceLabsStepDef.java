package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SuaceLabsLoginSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SauceLabsStepDef {
    @Steps
    SuaceLabsLoginSteps login;

    @When("ingreso el usuario {string}")
    public void ingresoElUsuario(String usuario) {
        login.ingresoElUsuario(usuario);
    }

    @Given("ingreso al aplicativo de SauceLabs")
    public void ingresoAlAplicativoDeSauceLabs() {
    }

    @When("inicio sesión con mi usuario {string} y clave {string}")
    public void inicioSesiónConMiUsuarioYClave(String arg0, String arg1) {
        login.ingresoElUsuario(arg0);
        login.ingresarClave(arg1);
        login.ingresar();

    }



    @And("ingreso la clave {string}")
    public void ingresoLaClave(String arg0) {
        login.ingresarClave(arg0);
    }

    @And("hago clic en LOGIN")
    public void hagoClicEn() {
        login.ingresar();
    }

    @And("valido el login OK")
    public void validoElLoginOK() {
        login.validacionLogin();
    }

    @Given("que he terminado de dibujar en el lienzo")
    public void queHeTerminadoDeDibujarEnElLienzo() {
        
    }

    @When("presiono el botón de guardar")
    public void presionoElBotónDeGuardar() {
        
    }

    @Then("el dibujo debe guardarse en la galería de imágenes del dispositivo")
    public void elDibujoDebeGuardarseEnLaGaleríaDeImágenesDelDispositivo() {
        
    }

    @And("se debe mostrar un mensaje de confirmación")
    public void seDebeMostrarUnMensajeDeConfirmación() {
        
    }

    @Given("que estoy en la aplicación de SauceLabs")
    public void queEstoyEnLaAplicaciónDeSauceLabs() {
        
    }

    @And("la galería de productos está cargada correctamente")
    public void laGaleríaDeProductosEstáCargadaCorrectamente() {
        
    }

    @When("agrego {int} unidades del producto {string} al carrito")
    public void agregoUnidadesDelProductoAlCarrito(int arg0, String arg1) {
        
    }

    @Then("el carrito de compras debe mostrar {int} unidades del producto {string}")
    public void elCarritoDeComprasDebeMostrarUnidadesDelProducto(int arg0, String arg1) {
        
    }

    @Given("que la cámara está activada en modo de escaneo")
    public void queLaCámaraEstáActivadaEnModoDeEscaneo() {
        
    }

    @When("apunto la cámara hacia un código QR válido")
    public void apuntoLaCámaraHaciaUnCódigoQRVálido() {
        
    }

    @Then("la aplicación debe detectar y escanear el código QR")
    public void laAplicaciónDebeDetectarYEscanearElCódigoQR() {
        
    }

    @And("debe mostrar la información asociada al código QR en la pantalla")
    public void debeMostrarLaInformaciónAsociadaAlCódigoQREnLaPantalla() {
    }
}
