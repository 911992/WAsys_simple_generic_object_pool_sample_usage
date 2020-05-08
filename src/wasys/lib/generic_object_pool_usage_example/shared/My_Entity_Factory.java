/*
 * Copyright (c) 2020, https://github.com/911992 All rights reserved.
 * License BSD 3-Clause (https://opensource.org/licenses/BSD-3-Clause)
 */

/*
WAsys_simple_generic_object_pool_sample_usage
File: My_Entity_Factory.java
Created on: May 7, 2020 11:14:13 PM | last edit: May 7, 2020
    @author https://github.com/911992
  
History:
    initial version: 0.1(20200507)
 */

package wasys.lib.generic_object_pool_usage_example.shared;

import wasys.lib.generic_object_pool.api.Object_Factory;
import wasys.lib.generic_object_pool.api.Poolable_Object;


/**
 * 
 * @author https://github.com/911992
 */
public class My_Entity_Factory implements Object_Factory{

    @Override
    public Poolable_Object create_object() {
        System.out.printf("My_Entity_Factory:: Asking for a new instance(%d)...\n",System.currentTimeMillis());
        return new Add_Op_Entity();
    }

}
