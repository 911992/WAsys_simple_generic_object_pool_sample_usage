/*
 * Copyright (c) 2020, https://github.com/911992 All rights reserved.
 * License BSD 3-Clause (https://opensource.org/licenses/BSD-3-Clause)
 */

/*
WAsys_simple_generic_object_pool_sample_usage
File: Main.java
Created on: May 7, 2020 11:17:11 PM | last edit: May 7, 2020
    @author https://github.com/911992
  
History:
    0.4(20200522)
        • Fixed the way for `new`ing the `_pool_policy:Generic_Object_Pool_Policy` in `main` method(compatible with API(WAsys_simple_generic_object_pool) change v0.4)

    initial version: 0.1(20200507)
 */

package wasys.lib.generic_object_pool_usage_example.example0;

import wasys.lib.generic_object_pool.Full_Pool_Object_Creation_Policy;
import wasys.lib.generic_object_pool.Generic_Object_Pool_Policy;
import wasys.lib.generic_object_pool_usage_example.shared.Test_Run;


/**
 * 
 * @author https://github.com/911992
 */
public class Main {
    public static void main(String[] args) {
        Generic_Object_Pool_Policy _pool_policy=new Generic_Object_Pool_Policy(2,4, Full_Pool_Object_Creation_Policy.Wait_Till_One_Free);
        int _thread_count = 32;
        boolean _threaded_pool = true;
        Test_Run.run(_pool_policy, _thread_count, _threaded_pool);
    }
    
    /*
        Sample out put: (run0):
        My_Entity_Factory:: Asking for a new instance(1588882418587)...
        Object creation, id:0
        My_Entity_Factory:: Asking for a new instance(1588882418592)...
        Object creation, id:1
        restarting object 1
        restarting object 0
        My_Entity_Factory:: Asking for a new instance(1588882418594)...
        Object creation, id:2
        My_Entity_Factory:: Asking for a new instance(1588882418594)...
        Object creation, id:3
        Objid:1 says: 0 + 7 = 7
        restarting object 1
        Objid:3 says: 6 + 13 = 19
        restarting object 3
        Objid:2 says: 8 + 15 = 23
        restarting object 2
        Objid:0 says: 7 + 14 = 21
        restarting object 0
        Objid:3 says: 3 + 10 = 13
        restarting object 3
        Objid:1 says: 5 + 12 = 17
        Objid:3 says: 1 + 8 = 9
        restarting object 1
        restarting object 3
        Objid:0 says: 2 + 9 = 11
        restarting object 0
        Objid:3 says: 30 + 37 = 67
        restarting object 3
        Objid:2 says: 4 + 11 = 15
        restarting object 2
        Objid:2 says: 27 + 34 = 61
        restarting object 2
        Objid:3 says: 28 + 35 = 63
        restarting object 3
        Objid:2 says: 26 + 33 = 59
        restarting object 2
        Objid:1 says: 31 + 38 = 69
        restarting object 1
        Objid:0 says: 29 + 36 = 65
        restarting object 0
        Objid:2 says: 24 + 31 = 55
        restarting object 2
        Objid:3 says: 25 + 32 = 57
        restarting object 3
        Objid:3 says: 21 + 28 = 49
        restarting object 3
        Objid:0 says: 20 + 27 = 47
        restarting object 0
        Objid:2 says: 22 + 29 = 51
        restarting object 2
        Objid:2 says: 18 + 25 = 43
        restarting object 2
        Objid:0 says: 12 + 19 = 31
        restarting object 0
        Objid:1 says: 23 + 30 = 53
        restarting object 1
        Objid:2 says: 17 + 24 = 41
        restarting object 2
        Objid:2 says: 13 + 20 = 33
        restarting object 2
        Objid:0 says: 16 + 23 = 39
        restarting object 0
        Objid:3 says: 19 + 26 = 45
        restarting object 3
        Objid:1 says: 9 + 16 = 25
        restarting object 1
        Objid:2 says: 10 + 17 = 27
        Objid:3 says: 14 + 21 = 35
        Objid:0 says: 15 + 22 = 37
        Objid:1 says: 11 + 18 = 29
        Object destroy, id:2
        Object destroy, id:3
        Object destroy, id:0
        Object destroy, id:1
    
    */
}
