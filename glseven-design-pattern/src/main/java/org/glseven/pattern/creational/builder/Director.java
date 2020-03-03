package org.glseven.pattern.creational.builder;

/**
 * 导演类
 *
 * @author george
 */
public class Director {

    Builder builder = new ConcreteBuilder();

    public Product getProduct() {
        builder.setPart();
        return builder.buildProduct();
    }
}
