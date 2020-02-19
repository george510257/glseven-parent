package org.glseven.pattern.factory.method;

/**
 * 抽象产品类
 *
 * @author george
 */
public interface Product {

    /**
     * 产品类的公共方法
     */
    default void method1() {
        System.out.println("method1");
    }

    /**
     * 抽象方法
     */
    void method2();
}
