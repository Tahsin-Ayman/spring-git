package com.fullstackbd.springit.world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/world")
public class WorldController {
  @GetMapping("/")
  public World world() {
    return World
      .builder()
      .message("World")
      .build();
  }
  @GetMapping("/{message}")
  public World worldMessage(
    /* to get the message from path 
     * [base url]/{message}
     * @PathVarible("message") String message
     */
    @PathVariable("message") String message
  ) {
    return World
      .builder()
      .message("Hello " + message + "!")
      .build();
  }
}
