package org.glseven.pattern.creational.builder;

/**
 * 具体建造者
 *
 * @author george
 */
public class ConcreteBuilder implements Builder {

    private Product product = new Product();

    /**
     * 设置产品
     */
    @Override
    public void setPart() {
        System.out.println("ConcreteBuilder:setPart");
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
