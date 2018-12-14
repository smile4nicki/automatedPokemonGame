package com.cog.PokemonGame;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondPage {
	@FindBy(id = "enemyInfo")
	private WebElement clickRattata;

	public void catchPokemon() {
		clickRattata.click();	
	}
}
