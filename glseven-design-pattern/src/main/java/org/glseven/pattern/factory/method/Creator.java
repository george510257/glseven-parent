package org.glseven.pattern.factory.method;

/**
 * @author george
 */
public interface Creator {

    /**
     * 创建一个产品对象，其输入参数类型可以自行设置
     * <p>
     * 通常为String、Enum、Class等，当然也可以为空
     *
     * @param clazz
     * @param <T>
     * @return
     */
    <T extends Product> T createProduct(Class<T> clazz);

}
