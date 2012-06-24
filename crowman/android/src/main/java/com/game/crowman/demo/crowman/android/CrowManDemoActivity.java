package com.game.crowman.demo.crowman.android;

import playn.android.GameActivity;
import playn.core.PlayN;

import com.game.crowman.demo.crowman.core.CrowManDemo;

public class CrowManDemoActivity extends GameActivity {

  @Override
  public void main(){
    platform().assets().setPathPrefix("com/game/crowman/demo/crowman/resources");
    PlayN.run(new CrowManDemo());
  }
}
