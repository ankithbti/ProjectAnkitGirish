package com.game.crowman.demo.crowman.html;

import playn.core.PlayN;
import playn.html.HtmlGame;
import playn.html.HtmlPlatform;

import com.game.crowman.demo.crowman.core.CrowManDemo;

public class CrowManDemoHtml extends HtmlGame {

  @Override
  public void start() {
    HtmlPlatform platform = HtmlPlatform.register();
    platform.assets().setPathPrefix("crowman/");
    PlayN.run(new CrowManDemo());
  }
}
