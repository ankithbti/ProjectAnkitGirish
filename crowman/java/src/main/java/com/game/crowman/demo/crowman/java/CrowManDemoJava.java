package com.game.crowman.demo.crowman.java;

import playn.core.PlayN;
import playn.java.JavaPlatform;

import com.game.crowman.demo.crowman.core.CrowManDemo;

public class CrowManDemoJava {

  public static void main(String[] args) {
    JavaPlatform platform = JavaPlatform.register();
    platform.assets().setPathPrefix("com/game/crowman/demo/crowman/resources");
    PlayN.run(new CrowManDemo());
  }
}
