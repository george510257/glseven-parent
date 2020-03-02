package org.glseven.pattern.factory.abstracts;


import org.glseven.pattern.factory.AbstractProductA;
import org.glseven.pattern.factory.AbstractProductB;
import org.glseven.pattern.factory.ProductA2;
import org.glseven.pattern.factory.ProductB2;

/**
 * 产品等级为2的实现类
 *
 * @author george
 */
public class ProductCreator2 implements Creator {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
