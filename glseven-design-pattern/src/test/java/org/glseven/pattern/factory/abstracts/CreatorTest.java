package org.glseven.pattern.factory.abstracts;

import org.glseven.pattern.factory.AbstractProductA;
import org.glseven.pattern.factory.AbstractProductB;
import org.junit.Test;

public class CreatorTest {

    @Test
    public void product1() {
        Creator creator = new ProductCreator1();
        AbstractProductA productA = creator.createProductA();
        AbstractProductB productB = creator.createProductB();
        productA.method1();
        productA.method2();
        productB.method1();
        productB.method2();
    }

    @Test
    public void product2() {
        Creator creator = new ProductCreator2();
        AbstractProductA productA = creator.createProductA();
        AbstractProductB productB = creator.createProductB();
        productA.method1();
        productA.method2();
        productB.method1();
        productB.method2();
    }
}
