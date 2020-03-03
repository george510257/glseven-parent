package org.glseven.pattern.structural.proxy;


import org.junit.Test;


public class ProxyTest {

    @Test
    public void request() {
        Subject proxy = new Proxy();
        proxy.request();
    }
}
