package io.mbrc.springtest;

import org.springframework.beans.factory.FactoryBean;

import java.io.PrintStream;

public class PrinterFactory implements FactoryBean<PrintStream> {

    @Override
    public PrintStream getObject() {
        return System.out;
    }

    @Override
    public Class<?> getObjectType() {
        return PrintStream.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
