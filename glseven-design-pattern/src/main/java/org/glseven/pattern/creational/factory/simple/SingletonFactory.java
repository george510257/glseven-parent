package org.glseven.pattern.creational.factory.simple;

import org.glseven.pattern.creational.factory.AbstractProductA;

import java.util.HashMap;
import java.util.Map;

/**
 * 延迟加载的工厂类
 *
 * @author george
 */
public class SingletonFactory {

    private static final Map<String, AbstractProductA> PRODUCT_MAP = new HashMap<>();

    public static <T extends AbstractProductA> T createProduct(Class<T> clazz) {
        String key = clazz.getName();
        if (PRODUCT_MAP.containsKey(key)) {
            return (T) PRODUCT_MAP.get(key);
        } else {
            try {
                return (T) Class.forName(key).newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
