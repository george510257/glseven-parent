# 设计模式

## 单例模式

### 代码示例

```java
/**
 * 单例模式
 *
 * @author george
 */
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
```

```java
/**
 * 具体产品类1
 *
 * @author george
 */
public class ProductA1 extends AbstractProductA {

    @Override
    public void method2() {
        System.out.println("ProductA1:method2");
    }
}
```

```java
/**
 * 具体产品类2
 *
 * @author george
 */
public class ProductA2 extends AbstractProductA {

    @Override
    public void method2() {
        System.out.println("ProductA2:method2");
    }
}
```

```java
/**
 * 工厂方法模式
 *
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
    <T extends AbstractProductA> T createProduct(Class<T> clazz);

}
```

```java
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
```