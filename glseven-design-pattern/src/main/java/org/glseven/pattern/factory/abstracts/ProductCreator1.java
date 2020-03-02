package org.glseven.pattern.factory.abstracts;

import org.glseven.pattern.factory.AbstractProductA;
import org.glseven.pattern.factory.AbstractProductB;
import org.glseven.pattern.factory.ProductA1;
import org.glseven.pattern.factory.ProductB1;

/**
 * 产品等级为1的实现类
 *
 * @author george
 */
public class ProductCreator1 implements Creator {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
