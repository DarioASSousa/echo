package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.BitmapFontCache;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.mygdx.game.platforms.Platform;
import com.mygdx.game.screens.StartGame;

import java.util.ArrayList;
import java.util.List;

public class PrincessOneDream extends Game {

    private final float windowWidth = 1200;
    private final float groundHeight = 100;
    public SpriteBatch batch;




    @Override
    public void create() {
        batch = new SpriteBatch();
        setScreen(new StartGame(this));

	}

    @Override
    public void render() {
        super.render();


    }

    @Override
    public void dispose() {
        super.dispose();
    }



}
