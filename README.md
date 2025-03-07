# singletonlab

When running the program with multiple threads, the output showed two differenternt hash codes for the SingletonThread instance the first time i ran it:
Singleton instance hashcode: 56127353
Singleton instance hashcode: 1234577059
Singleton instance hashcode: 56127353

which might have been a glitch or something, then i tested the lazyinitializedsingleton thread gettings this output:

Instance 1 hashcode: 1595428806
Instance 2 hashcode: 1595428806
Same instance? true

and then tested the SingletonThread again and it worked giving the output: 


Singleton instance hashcode: 56127353  
Singleton instance hashcode: 56127353  
Singleton instance hashcode: 56127353  
This shows that only one instance of the singleton was created and shared across all threads, which is exactly how the singleton pattern is supposed to work.

