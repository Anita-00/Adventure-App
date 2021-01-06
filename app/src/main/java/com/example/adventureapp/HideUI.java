package com.example.adventureapp;

import android.view.View;
import android.view.Window;

// hides the UI system at the top of the app
public class HideUI {
    Window window;

    public HideUI(Window window) {
        this.window = window;
        hideSytemUI();
    }

    private void hideSytemUI(){
        // hide the UI system
        // Resources: https://developer.android.com/training/system-ui/immersive
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }
}
