package org.glseven.pattern.creational.builder;

/**
 * 抽象建造者
 *
 * @author george
 */
public interface Builder {

    /**
     * 设置产品类的不同部分，以获得不同的产品。
     */
    void setPart();

    /**
     * 建造产品
     *
     * @return
     */
    Product buildProduct();
}
