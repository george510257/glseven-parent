package org.glseven.pattern.creational.factory.simple;

import org.glseven.pattern.creational.factory.AbstractProductA;

/**
 * 简单工厂模式
 * <p>
 * 工厂角色，简单工厂模式的核心，它负责实现创建所有实例的内部逻辑
 *
 * @author george
 */
public class ProductFactory {

    public static <T extends AbstractProductA> T createProduct(Class<T> clazz) {
        try {
            return (T) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
