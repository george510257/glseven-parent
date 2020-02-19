package org.glseven.pattern.factory.method;

import org.junit.Test;


public class ProductTest {


    @Test
    public void ConcreteProduct1() {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        product.method1();
        product.method2();
    }

    @Test
    public void ConcreteProduct2() {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct2.class);
        product.method1();
        product.method2();
    }
}
