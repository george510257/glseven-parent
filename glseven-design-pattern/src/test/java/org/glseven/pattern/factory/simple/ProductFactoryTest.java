package org.glseven.pattern.factory.simple;

import org.glseven.pattern.factory.AbstractProductA;
import org.glseven.pattern.factory.ProductA1;
import org.glseven.pattern.factory.ProductA2;
import org.junit.Test;

public class ProductFactoryTest {

    @Test
    public void productA1() {
        AbstractProductA product = ProductFactory.createProduct(ProductA1.class);
        product.method1();
        product.method2();
    }

    @Test
    public void productA2() {
        AbstractProductA product = ProductFactory.createProduct(ProductA2.class);
        product.method1();
        product.method2();
    }

}
