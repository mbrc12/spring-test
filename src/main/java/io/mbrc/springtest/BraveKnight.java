package io.mbrc.springtest;

import org.slf4j.Logger;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;

public class BraveKnight implements Knight, BeanNameAware, DisposableBean {

    private final Quest quest;
    private String name;
    private String realName;

    @Autowired
    Logger logger;

    public BraveKnight (Quest quest) {
        this.quest = quest;
    }

    @Override
    public void setBeanName(String name) {
        this.name = name;
    }

    public void embarkOnQuest () {
        quest.embark(name);
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public void destroy() {
        logger.debug("{} died.", realName);
    }
}
