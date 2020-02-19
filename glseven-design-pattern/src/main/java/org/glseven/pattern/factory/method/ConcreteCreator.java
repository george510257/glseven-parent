package org.glseven.pattern.factory.method;

/**
 * @author george
 */
public class ConcreteCreator implements Creator {

    @Override
    public <T extends Product> T createProduct(Class<T> clazz) {
        try {
            return (T) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
