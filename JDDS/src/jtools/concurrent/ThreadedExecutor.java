// ************************************************************************
//    $Id$
// ************************************************************************
//
//                               jTools
//
//               Copyright (C) 2001-2003 by Angelo Corsaro.
//                         <corsaro@cs.wustl.edu>
//                          All Rights Reserved.
//
//   Permission to use, copy, modify, and distribute this software and
//   its  documentation for any purpose is hereby  granted without fee,
//   provided that the above copyright notice appear in all copies and
//   that both that copyright notice and this permission notice appear
//   in  supporting  documentation. I don't make  any  representations
//   about the  suitability  of this  software for any  purpose. It is
//   provided "as is" without express or implied warranty.
//
//
// *************************************************************************
//  
// *************************************************************************
package jtools.concurrent;

/**
 * This class provides a concrete implementation of {@link Executor}
 * that spawn a thread each time it has to execute.
 *
 * @author <a href="mailto:corsaro@doc.cs.wustl.edu">Angelo Corsaro</a>
 * @version 1.0
 */
public abstract class ThreadedExecutor implements Executor {

    private int priority;
    
    public ThreadedExecutor() {
        this(Thread.NORM_PRIORITY);
    }
    
    public ThreadedExecutor(int priority) {
        this.priority = priority;
    }
    
    public void execute(Runnable logic) {
        Thread thread = new Thread(logic);
        thread.setPriority(this.priority);
        thread.start();
        thread = null;
    }
}
