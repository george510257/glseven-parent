package org.glseven.pattern.factory.method;

import org.glseven.pattern.factory.AbstractProductA;
import org.glseven.pattern.factory.ProductA1;
import org.glseven.pattern.factory.ProductA2;
import org.junit.Test;

public class CreatorTest {

    @Test
    public void productA1() {
        Creator creator = new ProductCreatorA();
        AbstractProductA product = creator.createProduct(ProductA1.class);
        product.method1();
        product.method2();
    }

    @Test
    public void productA2() {
        Creator creator = new ProductCreatorA();
        AbstractProductA product = creator.createProduct(ProductA2.class);
        product.method1();
        product.method2();
    }
}
