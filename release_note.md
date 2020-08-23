# WAsys_simple_generic_object_pool_sample_usage Release Note

repo: https://github.com/911992/WAsys_simple_generic_object_pool_sample_usage  
Author: [911992](https://github.com/911992)  
*(NOTE: following list carries mentionable(not all) changes. For detailed changes, check source code(s))*  

**0.5.1** (Aug 23, 2020)  

0. API sync with [WAsys_simple_generic_object_pool](https://github.com/911992/WAsys_simple_generic_object_pool) v0.5.1(Aug 23, 2020) API change
1. `Source_Code::My_Entity_Factory`
    * Using `wasys.lib.java_type_util.reflect.type_sig.Object_Factory` instead of `wasys.lib.generic_object_pool.api.Object_Factory`

<hr/>

**0.4** (May 22, 2020)  

0. API sync with [WAsys_simple_generic_object_pool](https://github.com/911992/WAsys_simple_generic_object_pool) v0.4(May 22, 2020) API change
    * Updated `Main` class(package: `wasys.lib.generic_object_pool_usage_example.example0`), fixed the way for `new`ing the `_pool_policy:Generic_Object_Pool_Policy` in `main` method
1. Removed `lib` folder(gitignore)

<hr/>

**0.2** (May 8, 2020)  

0. Update all files info headers into non javadoc(simple multiline comment) format.
1. Updated file `Test_Run.java` to be compatible with v0.2 artifcat

**Initial Release 0.1** (May 7, 2020)