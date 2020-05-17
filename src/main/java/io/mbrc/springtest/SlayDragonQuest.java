package io.mbrc.springtest;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class SlayDragonQuest implements Quest {

    @Autowired
    private Logger logger;

    public SlayDragonQuest () {
    }

    public void embark (String name) {
        logger.error("{} yes. Embarking..", this.getClass().toString());
    }
}
