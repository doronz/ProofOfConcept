package com.doronzehavi.android;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.doronzehavi.ProofOfConcept;

/**
 * This class is a "starter class". It is used specifically to start the game on an Android device.
 * Normally, Android apps have many activities. However, a Libgdx game on Android usuall only has
 * one single activity that serves as the entry point to the game (and libgdx engine). The rest of
 * the action will be handled by Libgdx.
 */
public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		initialize(new ProofOfConcept(), config);
	}
}
