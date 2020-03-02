package org.glseven.pattern.factory;

/**
 * 抽象产品类
 *
 * @author george
 */
public abstract class AbstractProductB {

    /**
     * 产品类的公共方法
     */
    public void method1() {
        System.out.println("AbstractProductB:method1");
    }

    /**
     * 抽象方法
     */
    public abstract void method2();
}
