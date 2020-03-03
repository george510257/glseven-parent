package org.glseven.pattern.creational.builder;

import org.junit.Test;

public class DirectorTest {

    @Test
    public void getProduct() {
        Director director = new Director();
        Product product = director.getProduct();
        product.doSomething();
    }
}
