package org.glseven.pattern.factory.abstracts;

import org.glseven.pattern.factory.AbstractProductA;
import org.glseven.pattern.factory.AbstractProductB;

/**
 * 抽象工厂模式
 *
 * @author george
 */
public interface Creator {

    /**
     * 创建A产品家族
     *
     * @return
     */
    AbstractProductA createProductA();

    /**
     * 创建B产品家族
     *
     * @return
     */
    AbstractProductB createProductB();
}
