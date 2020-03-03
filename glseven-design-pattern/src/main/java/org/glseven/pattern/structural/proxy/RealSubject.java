package org.glseven.pattern.structural.proxy;

/**
 * 真实主题
 *
 * @author george
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("RealSubject:request");
    }
}
