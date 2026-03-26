package com.example.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

  @GetMapping({"/mall", "/mall/"})
  public String mallIndexPage() {
    // 服务端转发到 static 里的首页（使用干净版，避免旧文件内容重复）
    return "forward:/mall-index2.html";
  }

  @GetMapping("/mall/order")
  public String mallOrderPage() {
    // 服务端转发到 static 里的 order.html
    return "forward:/order.html";
  }
}

