package com.github.pedrobacchini.library;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
@AllArgsConstructor
public class GreetingNameConfig implements Serializable {

    private static final long serialVersionUID = 6316207789339695463L;

    String name;
}
