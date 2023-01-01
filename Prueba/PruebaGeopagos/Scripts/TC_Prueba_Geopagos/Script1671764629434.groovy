import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import org.cy.pruebaweb.MercadoLibre
import org.openqa.selenium.Keys as Keys

MercadoLibre ml = new MercadoLibre()

WebUI.openBrowser("https://www.mercadolibre.com.ar/")

WebUI.waitForPageLoad(10)

WebUI.maximizeWindow()

WebUI.click(ml.btnMasTarde)

WebUI.click(ml.seleccionarCategoria)

WebUI.click(ml.selectTecnologia)

WebUI.click(ml.selectCelularesTelefonos)

WebUI.click(ml.aceptCookies)

WebUI.click(ml.selectSamsung)

WebUI.click(ml.verLista)

WebUI.click(ml.listaMenorPrecio)

String primerItemPrecio = WebUI.getText(ml.primerPrecio)

String segundoItemPrecio = WebUI.getText(ml.segundoPrecio)

WebUI.verifyLessThan(primerItemPrecio,segundoItemPrecio)

WebUI.scrollToElement(ml.ultimoPrecio, 10)

String ultimoItemPrecio = WebUI.getText(ml.ultimoPrecio).replaceAll("(^0-9)", "").replace(".", "")

WebUI.verifyLessThan(segundoItemPrecio, ultimoItemPrecio)

WebUI.closeBrowser()












