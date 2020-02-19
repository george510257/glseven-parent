package org.glseven.pattern.singleton;


import org.junit.Test;

public class SingletonTest {

    @Test
    public void doSomething() {
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
    }
}