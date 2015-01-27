package com.doronzehavi;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * This is the main application code. It it includes a listener that calls the appropriate methods
 * based on the changes to the game's state (such as pausing and resizing). It also contains the
 * main game loop, render().
 */
public class ProofOfConcept extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;

    /**
     * This is called when the application is ready and we can start loading our assets and create stage and actors.
     */
    @Override
    public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
	}

    /**
     * This is called every time the drawable surface is resized.
     */
    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
    }

    /**
     * Called when the application goes into the background.
     * A good place to save the game state.
     */
    @Override
    public void pause() {
        super.pause();
    }

    /**
     * Called when the application returns from a pause.
     */
    @Override
    public void resume() {
        super.resume();
    }

    /**
     * Called when the game is done and application is closed. Cleanup occurs here.
     */
    @Override
    public void dispose() {
        super.dispose();
    }

    /**
     * This is the infinite game loop, called until game is over.
     */
    @Override
    public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT); // This line clears the screen
        batch.begin();
        batch.draw(img, 0, 0); // draws the game
        batch.end();
	}
}
