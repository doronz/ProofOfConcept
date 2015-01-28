package com.doronzehavi.view;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.doronzehavi.model.Map;
import com.doronzehavi.model.Tile;
import com.doronzehavi.utils.Constants;

/**
 * This class will render a map and display it on the screen.
 */
public class MapRenderer {
    private Map mMap;
    private OrthographicCamera mCam;
    private SpriteBatch mSpriteBatch;

    // Textures
    Texture TERRAIN = Constants.TEXTURE_2D_TERRAIN;
    Texture TERRAIN_CASTLE_CANNON = Constants.TEXTURE_2D_CASTLE_CANNON;
    // Add more....

    public MapRenderer(Map map) {
        mMap = map;
        mCam = new OrthographicCamera(mMap.getWidth(), mMap.getLength()); // Possible aspect ratio
        // issues
        mCam.update();
        mSpriteBatch = new SpriteBatch();
    }

    private void loadTextures() {
        // Load textures
    }

    private void drawTiles() {
        for (Object tileObj : mMap.getTiles()) { // Not using typesafe array
            Tile tile = (Tile) tileObj;
            // TODO: Unfinished.. Continue here.

        }
    }

    public void render() {
        // render tiles
        mSpriteBatch.begin(); // Begin rendering images

        mSpriteBatch.end(); // Finished rendering images
    }

}
