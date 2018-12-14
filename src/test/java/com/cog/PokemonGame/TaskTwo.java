package com.cog.PokemonGame;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TaskTwo {

	@Test
	public void testClickRattata() {
		WebDriver driver = TestRunner.driver;
		SecondPage secondpage = PageFactory.initElements(driver, SecondPage.class);
		secondpage.catchPokemon();
	}
}
