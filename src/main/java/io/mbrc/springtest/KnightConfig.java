package io.mbrc.springtest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

    @Bean
    public KnightLogFactory logger() {
        return new KnightLogFactory();
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

    @Bean
    public Knight aladdin () {
        BraveKnight aladdin = new BraveKnight(quest1());
        aladdin.setRealName("Aladdin");
        return aladdin;
    }
}
