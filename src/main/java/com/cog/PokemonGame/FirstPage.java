package com.cog.PokemonGame;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstPage {
	@FindBy(id = "Bulbasaur")
	private WebElement pokeChoice;
	@FindBy(id = "startAdventure")
	private WebElement adventureStart;

	public void startAdventure() {
		pokeChoice.click();
		adventureStart.click();
	}

}
