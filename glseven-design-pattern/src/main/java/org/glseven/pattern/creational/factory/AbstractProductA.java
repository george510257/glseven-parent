package org.glseven.pattern.creational.factory;

/**
 * 抽象产品类
 *
 * @author george
 */
public abstract class AbstractProductA {

    /**
     * 产品类的公共方法
     */
    public void method1() {
        System.out.println("AbstractProductA:method1");
    }

    /**
     * 抽象方法
     */
    public abstract void method2();
}
