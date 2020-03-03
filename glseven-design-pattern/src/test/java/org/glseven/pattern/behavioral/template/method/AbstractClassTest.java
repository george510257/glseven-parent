package org.glseven.pattern.behavioral.template.method;


import org.junit.Test;

public class AbstractClassTest {


    @Test
    public void templateMethod1() {
        AbstractClass class1 = new ConcreteClass1();
        class1.templateMethod();
    }

    @Test
    public void templateMethod2() {
        AbstractClass class2 = new ConcreteClass2();
        class2.templateMethod();
    }
}
