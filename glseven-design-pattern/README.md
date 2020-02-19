# 设计模式

## 单例模式

1. 单例模式通用代码

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

