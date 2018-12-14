package com.cog.PokemonGame;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TaskOne {

	@Test
	public void pokemonTest() throws InterruptedException {
		WebDriver driver = TestRunner.driver;
		driver.manage().window().maximize();
		driver.get("http://ishadijcks.github.io/");
		Thread.sleep(6000);
		FirstPage firstpage = PageFactory.initElements(driver, FirstPage.class);
		firstpage.startAdventure();
	}
}
