package p.b;

import p.Common;

public class B extends Common {
    
    public B() {
        super();
        System.out.println("made B Version 3!!!");

    }
    
    public Object getRef() {
        return new p.c.C();
    }
}
