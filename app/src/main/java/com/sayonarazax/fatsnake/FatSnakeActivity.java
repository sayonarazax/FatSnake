package com.sayonarazax.fatsnake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sayonarazax.framework.Screen;
import com.sayonarazax.framework.impl.AndroidGame;

public class FatSnakeActivity extends AndroidGame {

    @Override
    public Screen getStartScreen(){
        return new LoadingScreen(this);
    }
}
