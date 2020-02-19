# 设计模式

## 单例模式

### 代码示例

```java
public class Singleton {

    private static final Singleton SINGLETON = new Singleton();

    /**
     * 限制产生多个对象
     */
    private Singleton() {
    }

    /**
     * 通过该方法获取实例对象
     *
     * @return
     */
    public static Singleton getInstance() {
        return SINGLETON;
    }

    /**
     * 其他方法
     */
    public void doSomething() {
        System.out.println("do something");
    }
}
```

## 工厂方法模式

### 代码示例

```java
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
```

```java
/**
 * 具体产品类1
 *
 * @author george
 */
public class ConcreteProduct1 implements Product {

    @Override
    public void method2() {
        System.out.println("ConcreteProduct1:method2");
    }
}
```

```java
/**
 * 具体产品类2
 *
 * @author george
 */
public class ConcreteProduct2 implements Product {

    @Override
    public void method2() {
        System.out.println("ConcreteProduct2:method2");
    }
}
```

```java
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
```

```java
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
```