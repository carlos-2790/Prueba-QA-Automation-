package org.cy.pruebaweb

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class MercadoLibre {

	TestObject seleccionarCategoria = findTestObject('Object Repository/a_Categoras')
	TestObject selectCelularesTelefonos =  findTestObject('Object Repository/a_Celulares y Telfonos')
	TestObject selectTecnologia =  findTestObject('Object Repository/a_Tecnologa')
	TestObject selectSamsung = findTestObject('Object Repository/SAMSUNG')
	TestObject aceptCookies =  findTestObject('Object Repository/button_Entendido_Cookies')
	TestObject verLista =  findTestObject('Object Repository/dropdown')
	TestObject listaMenorPrecio =  findTestObject('Object Repository/span_Menor precio')
	TestObject primerPrecio = findTestObject('Object Repository/primerPrecioObj')
	TestObject segundoPrecio =  findTestObject('Object Repository/segundoPrecioObj')
	TestObject ultimoPrecio =  findTestObject('Object Repository/ultimoPrecioObj')
	TestObject btnMasTarde =    findTestObject('Object Repository/btnMasTarde')
}
