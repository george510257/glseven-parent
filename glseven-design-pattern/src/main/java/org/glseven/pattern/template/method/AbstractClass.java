package org.glseven.pattern.template.method;

/**
 * 模板方法模式
 *
 * @author george
 */
public abstract class AbstractClass {

    /**
     * 基本方法
     * <p>
     * 抽象模板中的基本方法尽量设计为protected类型，符合迪米特法则，不需要暴露的属性或方法尽量不要设置为protected类型。实现类若非必要，尽量不要扩大父类中的访问权限。
     */
    protected abstract void doSomething();

    /**
     * 基本方法
     * <p>
     * 抽象模板中的基本方法尽量设计为protected类型，符合迪米特法则，不需要暴露的属性或方法尽量不要设置为protected类型。实现类若非必要，尽量不要扩大父类中的访问权限。
     */
    protected abstract void doAnything();

    /**
     * 模板方法
     * <p>
     * 为了防止恶意的操作，一般模板方法都加上final关键字，不允许被覆写。
     */
    public final void templateMethod() {
        this.doSomething();
        this.doAnything();
    }
}
