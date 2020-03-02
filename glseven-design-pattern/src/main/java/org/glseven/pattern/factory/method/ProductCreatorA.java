package org.glseven.pattern.factory.method;

import org.glseven.pattern.factory.AbstractProductA;

/**
 * @author george
 */
public class ProductCreatorA implements Creator {

    @Override
    public <T extends AbstractProductA> T createProduct(Class<T> clazz) {
        try {
            return (T) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
