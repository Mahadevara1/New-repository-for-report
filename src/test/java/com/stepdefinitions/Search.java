package com.stepdefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

import com.patpat.objectrepositary.EcomSearch;
import com.patpat.objectrepositary.EcommDetails;
import com.resources.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search  extends Base {
	@Given("user shuold enter the paroduct name")
	public void user_shuold_enter_the_paroduct_name() throws InterruptedException, Throwable {
		EcomSearch e=new EcomSearch();
		loadUrl("https://www.tactics.com/");
		
		
		fill(e.getSearch(), "baby");
		
		
	    
	}
	@Given("user should click sear button")
	public void user_should_click_sear_button() throws Throwable {
	   EcomSearch e=new EcomSearch();
	   btnClick( e.getEnter());
	    
	   
	}

	@When("user shuold click babygirl dress")
	public void user_shuold_click_babygirl_dress() throws InterruptedException, AWTException {
		 EcomSearch e1=new EcomSearch();
		 btnClick( e1.getClickshirt()); 

	   
	}

	@When("user shuld click the add to cart button")
	public void user_shuld_click_the_add_to_cart_button() {
		 EcomSearch d1=new EcomSearch();

		 btnClick( d1.getSize());
		 btnClick( d1.getAddtocart());
	}

	@When("user should click chechout button")
	public void user_should_click_chechout_button() {
		 EcomSearch d1=new EcomSearch();
	   
		 btnClick(d1.getChechout());
	}

	@Then("user should enter details")
	public void user_should_enter_details() {
		 
		EcommDetails d1=new EcommDetails();
		
		
		
		
		
		
		
		 fill(d1.getFname(),valuefromExcelSheet().get(1).get("fname"));
		 fill(d1.getLname(),valuefromExcelSheet().get(1).get("lname"));
		 fill(d1.getDetails(),valuefromExcelSheet().get(1).get("company"));
		 fill(d1.getStreetaddress(),valuefromExcelSheet().get(1).get("address"));
		 fill(d1.getStreetaddress2(),valuefromExcelSheet().get(1).get("address2"));
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}


}
