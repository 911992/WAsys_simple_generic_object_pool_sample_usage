/*
 * Copyright (c) 2020, https://github.com/911992 All rights reserved.
 * License BSD 3-Clause (https://opensource.org/licenses/BSD-3-Clause)
 */

/**
 *  WAsys_simple_generic_object_pool_sample_usage
 *  File: Add_Op_Entity.java
 *  Created on: May 7, 2020 11:12:19 PM | last edit: May 7, 2020
 *      @author https://github.com/911992
 * 
 *  History:
 *      initial version: 0.1(20200507)
 */

package wasys.lib.generic_object_pool_usage_example.shared;

import java.util.concurrent.atomic.AtomicInteger;
import wasys.lib.generic_object_pool.api.Poolable_Object_Adapter;


/**
 * 
 * @author https://github.com/911992
 */
public class Add_Op_Entity extends Poolable_Object_Adapter{

    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void pre_destroy() {
        synchronized(System.out){
            System.out.printf("Object destroy, id:%d\n",obj_id);
        }
    }

    @Override
    public void post_create() {
        super.post_create(); //To change body of generated methods, choose Tools | Templates.
    }
    
    static private final AtomicInteger OBJID_CTX=new AtomicInteger(0);
    
    final private int obj_id;

    public Add_Op_Entity() {
        obj_id = OBJID_CTX.getAndIncrement();
        synchronized(System.out){
            System.out.printf("Object creation, id:%d\n",obj_id);
        }
    }
    
    public void show_add(){
        try {
                Thread.sleep((int)(Math.random()*96));
            } catch (Exception e) {
            }
        synchronized(System.out){
            /*wow! so interesting! -_-*/
            System.out.printf("Objid:%d says: %d + %d = %d\n",obj_id,a,b,(a+b));
        }
    }
    
    @Override
    public void reset_state() {
        synchronized(System.out){
            System.out.printf("restarting object %d\n",obj_id);
        }
        a=0;
        b=0;
    }

}
