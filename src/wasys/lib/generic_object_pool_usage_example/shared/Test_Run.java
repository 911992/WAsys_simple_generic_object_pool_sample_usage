/*
 * Copyright (c) 2020, https://github.com/911992 All rights reserved.
 * License BSD 3-Clause (https://opensource.org/licenses/BSD-3-Clause)
 */

/**
 *  WAsys_simple_generic_object_pool_sample_usage
 *  File: Test_Run.java
 *  Created on: May 8, 2020 12:40:13 AM | last edit: May 8, 2020
 *      @author https://github.com/911992
 * 
 *  History:
 *      initial version: 0.1(20200507)
 */

package wasys.lib.generic_object_pool_usage_example.shared;

import wasys.lib.generic_object_pool.Generic_Object_Pool_Policy;
import wasys.lib.generic_object_pool.Object_Pool;
import wasys.lib.generic_object_pool.Pool_Context;


/**
 * 
 * @author https://github.com/911992
 */
public class Test_Run {
    public static void run(Generic_Object_Pool_Policy arg_pool_policy,int arg_thread_count,boolean arg_threaded_pool) {
        final Object_Pool _my_pool=Pool_Context.get_insatcne().register_pool(new My_Entity_Factory(),arg_pool_policy, arg_threaded_pool);
        Thread _ts[]=new Thread[arg_thread_count];
        for(int a=0;a<_ts.length;a++){
            final int _a=a;
            final int _b=a+7;
            _ts[a]=new Thread(new Runnable() {
                @Override
                public void run() {
                    try(Add_Op_Entity _obj =(Add_Op_Entity) _my_pool.get_an_instance();) {
                        _obj.setA(_a);
                        _obj.setB(_b);
                        _obj.show_add();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        for(int a=0;a<_ts.length;a++){
            _ts[a].start();
        }
        try {
            for(int a=0;a<_ts.length;a++){
                _ts[a].join();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        _my_pool.shutdown_pool();
    }
}
