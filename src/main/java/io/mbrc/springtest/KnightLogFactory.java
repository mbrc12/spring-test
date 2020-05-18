package io.mbrc.springtest;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.FactoryBean;

@Slf4j(topic = "knight-logger")
public class KnightLogFactory implements FactoryBean<Logger> {

    @Override
    public Logger getObject() {
        log.debug("Called getObject");
        return KnightLogFactory.log;
    }

    @Override
    public Class<Logger> getObjectType() {
        return Logger.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
