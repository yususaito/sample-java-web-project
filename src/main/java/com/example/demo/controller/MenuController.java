package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demo.constant.UrlConstant;
import com.example.demo.constant.ViewConstant;

/**
 * メニューコントローラークラス.
 *
 * @author yusuke
 *
 */
@Controller
public class MenuController {

  /**
   * 初期表示
   *
   * @return 遷移先
   */
  @RequestMapping(path = UrlConstant.MENU, method = RequestMethod.GET)
  public String init() {
    return ViewConstant.MENU;
  }

}
