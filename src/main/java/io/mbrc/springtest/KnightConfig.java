package io.mbrc.springtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Configuration
public class KnightConfig {

    @Bean
    public Logger logger() {
        return LoggerFactory.getLogger("knight-logger");
    }

    @Bean
    public Quest quest1() {
        return new SlayDragonQuest();
    }

    @Bean
    public Knight sindbad () {
        BraveKnight sindbad = new BraveKnight(quest1());
        sindbad.setRealName("Sindbad-San");
        return sindbad;
    }
}
