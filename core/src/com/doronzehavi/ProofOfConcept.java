package com.doronzehavi;

import com.badlogic.gdx.Game;
import com.doronzehavi.screens.GameScreen;

/**
 * This will be the entry point of the game. And it currently just chooses the game screen.
 */
public class ProofOfConcept extends Game {

    /**
     * Called when the application is first created.
     */
    @Override
    public void create() {
        setScreen(new GameScreen()); // Creates GameScreen, calls show() and subsequently calls
        // GameScreen's render() method every cycle.
    }
}
