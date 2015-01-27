package com.doronzehavi.android.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * This class represents a tile on the map.
 */
public class Tile {
    static final float SIZE = 1f; // Unit size

    Vector2 mPosition = new Vector2(); // holds coordinates for position
    Rectangle mBounds = new Rectangle(); // holds the boundary rectangle
    char mType; // Holds the type of tile it is (e.g. 'B' or 'R' or ' ')

    public Tile(Vector2 pos, char type) {
        mPosition = pos;
        mBounds.width = SIZE;
        mBounds.height = SIZE;
        mType = type;
    }

}
