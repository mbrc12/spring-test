package io.mbrc.springtest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = KnightConfig.class)
class Test1 {

    @Autowired
    Logger logger;

    <E> void swap(List<E> xs, int i, int j) {
        xs.set(i, xs.set(j, xs.get(i)));
    }

    @Test
    public void swapTest () {
        List<Integer> xs = new ArrayList<>(List.of(5, 4, 7));
        swap(xs, 0, 1);
        assertEquals(xs, List.of(4, 5, 7));
    }

    @Autowired
    public Knight alibaba;

    @Test
    public void alitest() {
        assertNotNull(alibaba);
    }
}
