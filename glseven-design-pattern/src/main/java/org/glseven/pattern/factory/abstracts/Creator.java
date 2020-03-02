package org.glseven.pattern.factory.abstracts;

import org.glseven.pattern.factory.AbstractProductA;
import org.glseven.pattern.factory.AbstractProductB;

/**
 * 抽象工厂模式
 * <p>
 * 有N个产品族，在抽象工厂中就应该有N个创建方法。
 * <p>
 * 有M个产品等级，就应该有M个实现工厂类，在每个实现工厂中，实现不同产品族的生产任务。
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
