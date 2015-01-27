package com.doronzehavi.model;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * This class will parse and generate maps.
 */
public class Map {

    int mLength = 0; // length of map
    int mWidth = 0; // width of map
    String mMapName; // Name of map
    Array mTiles = new Array(); // will hold all of the tiles for the map

    public Array getTiles() {
        return mTiles;
    }

    public String getMapName() {
        return mMapName;
    }

    public int getLength() {
        return mLength;
    }

    public int getWidth() {
        return mWidth;
    }


    /**
     * This constructor requires a map file to parse.
     *
     * @param mapFile The map file to parse and create.
     */
    public Map(String mapFile) {
        generateMap(mapFile);
    }

    /**
     * This method will parse the map file.
     *
     * @param mapFile The map file to parse.
     */
    private void generateMap(String mapFile) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(mapFile));
            mMapName = br.readLine(); // First line of file is map name.
            String mapDimensions = br.readLine(); // Second line of file is map dimensions.
            String[] dimensions = mapDimensions.split("\\s+"); // separate the dimensions
            mWidth = new Integer(dimensions[0]); // set width of map
            mLength = new Integer(dimensions[1]); // set length of map
            for (int y = 0; y < mLength; y++) {
                String line = br.readLine(); // get each line in the map
                for (int x = 0; x < line.length(); x++) {
                    // Read each character (e.g. 'B' or 'R' or ' ')
                    mTiles.add(new Tile(new Vector2(x, y), line.charAt(x)));
                }
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
