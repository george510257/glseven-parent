package org.glseven.pattern.structural.proxy;

/**
 * 代理类
 *
 * @author george
 */
public class Proxy implements Subject {

    private Subject subject = new RealSubject();

    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    private void before() {
        System.out.println("Proxy:before");
    }

    private void after() {
        System.out.println("Proxy:after");
    }
}
