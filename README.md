# WAsys_generic_object_pool(Sample Usage)
Sample usage for https://github.com/911992/WAsys_simple_generic_object_pool

## Revision History
Latest: v0.4 (May 22, 2020)  
Please refer to [release_note.md](./release_note.md) file  

## Requirements
1. [WAsys_generic_object_pool](https://github.com/911992/WAsys_simple_generic_object_pool)

## Entries

### Thread-safe Object Pool In Concurrent Env
package: `wasys.lib.generic_object_pool_usage_example.example0`  
Sample using the multi-threaded pool. Considerinng following setup for the pool object  
• Min(initial) pool size: 2  
• Max possible objects: 4  
• Policy for object creation when pool has no any idle/ready obj to return: `Wait_Till_One_Free`  
• Object pool thread-safe mode: `true`  
• Number of concurrent thread runs: 32  

Meta configs(good to be considered)  
• Random sleep time on actual business work `Add_Op_Entity::show_add(void):void` method to simulate `Wait_Till_One_Free` easier

Main class: `Main`

Sample output:
```
My_Entity_Factory:: Asking for a new instance(1588881791786)...
Object creation, id:0
My_Entity_Factory:: Asking for a new instance(1588881791792)...
Object creation, id:1
restarting object 1
restarting object 0
My_Entity_Factory:: Asking for a new instance(1588881791793)...
Object creation, id:2
restarting object 2
My_Entity_Factory:: Asking for a new instance(1588881791793)...
Object creation, id:3
restarting object 3
Objid:2 says: 7 + 14 = 21
restarting object 2
Objid:1 says: 0 + 7 = 7
restarting object 1
Objid:0 says: 6 + 13 = 19
restarting object 0
Objid:3 says: 5 + 12 = 17
restarting object 3
Objid:3 says: 3 + 10 = 13
restarting object 3
Objid:0 says: 1 + 8 = 9
restarting object 0
Objid:1 says: 4 + 11 = 15
restarting object 1
Objid:0 says: 30 + 37 = 67
Objid:2 says: 2 + 9 = 11
restarting object 0
restarting object 2
Objid:2 says: 27 + 34 = 61
Objid:0 says: 28 + 35 = 63
restarting object 2
restarting object 0
Objid:3 says: 31 + 38 = 69
restarting object 3
Objid:3 says: 24 + 31 = 55
restarting object 3
Objid:1 says: 29 + 36 = 65
restarting object 1
Objid:2 says: 26 + 33 = 59
restarting object 2
Objid:2 says: 21 + 28 = 49
restarting object 2
Objid:0 says: 25 + 32 = 57
restarting object 0
Objid:0 says: 19 + 26 = 45
restarting object 0
Objid:0 says: 18 + 25 = 43
restarting object 0
Objid:3 says: 23 + 30 = 53
restarting object 3
Objid:2 says: 20 + 27 = 47
restarting object 2
Objid:1 says: 22 + 29 = 51
restarting object 1
Objid:0 says: 17 + 24 = 41
restarting object 0
Objid:2 says: 15 + 22 = 37
restarting object 2
Objid:3 says: 16 + 23 = 39
restarting object 3
Objid:0 says: 9 + 16 = 25
restarting object 0
Objid:1 says: 10 + 17 = 27
restarting object 1
Objid:2 says: 14 + 21 = 35
restarting object 2
Objid:3 says: 13 + 20 = 33
Objid:0 says: 12 + 19 = 31
Objid:1 says: 11 + 18 = 29
Objid:2 says: 8 + 15 = 23
Object destroy, id:3
Object destroy, id:0
Object destroy, id:1
Object destroy, id:2
```


## TODOs
- [ ] More samples