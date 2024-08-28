
@Test
 Feature: Sauce Labs App

   @Dibujar
   Scenario: Guardar el dibujo realizado
     Given que he terminado de dibujar en el lienzo
     When presiono el botón de guardar
     Then el dibujo debe guardarse en la galería de imágenes del dispositivo
     And se debe mostrar un mensaje de confirmación

   @Carrito
     Scenario: Agregar múltiples unidades de un producto al carrito de compras
       Given que estoy en la aplicación de SauceLabs
       And la galería de productos está cargada correctamente
       When agrego 2 unidades del producto "Sauce Labs Bike Light" al carrito
       Then el carrito de compras debe mostrar 2 unidades del producto "Sauce Labs Bike Light"

     @EscanearQR
     Scenario: Escanear un código QR válido
       Given que la cámara está activada en modo de escaneo
       When apunto la cámara hacia un código QR válido
       Then la aplicación debe detectar y escanear el código QR
       And debe mostrar la información asociada al código QR en la pantalla