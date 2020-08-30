/*
 * Copyright (c) 2020, https://github.com/911992 All rights reserved.
 * License BSD 3-Clause (https://opensource.org/licenses/BSD-3-Clause)
 */

 /*
WAsys_simple_generic_object_pool_sample_usage
File: Test_Run.java
Created on: May 8, 2020 12:40:13 AM | last edit: May 8, 2020
    @author https://github.com/911992
  
History:
    0.5.7(20200829)
        • sync the codebase based on latest major changes of 0.5.7(20200829)
        • Using Generic_Object_Pool instaed of Pool_Context
        • Updated the sample for easier object grabbing as Object_Pool is generic
        • Changed arg_threaded variable to arg_thread_safe(which make sense now)

    0.2(20200508)
        •sync code with new 0.2 revision of the lib
        •Using get_pool instead of register_pool.

    initial version: 0.1(20200507)
 */
package wasys.lib.generic_object_pool_usage_example.shared;

import wasys.lib.generic_object_pool.Generic_Object_Pool;
import wasys.lib.generic_object_pool.Generic_Object_Pool_Policy;
import wasys.lib.generic_object_pool.Object_Pool;

/**
 *
 * @author https://github.com/911992
 */
public class Test_Run {

    public static void run(Generic_Object_Pool_Policy arg_pool_policy, int arg_thread_count, boolean arg_thread_safe) {
        final Object_Pool<Add_Op_Entity> _my_pool = Generic_Object_Pool.new_pool_instance(new My_Entity_Factory(), arg_pool_policy, arg_thread_safe);
        Thread _ts[] = new Thread[arg_thread_count];
        for (int a = 0; a < _ts.length; a++) {
            final int _a = a;
            final int _b = a + 7;
            _ts[a] = new Thread(new Runnable() {
                @Override
                public void run() {
                    try (Add_Op_Entity _obj = _my_pool.get_an_instance();) {
                        _obj.setA(_a);
                        _obj.setB(_b);
                        _obj.show_add();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        for (int a = 0; a < _ts.length; a++) {
            _ts[a].start();
        }
        try {
            for (int a = 0; a < _ts.length; a++) {
                _ts[a].join();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        _my_pool.shutdown_pool();
    }
}
