matlab-insanitype
=================

Sanity tests for MATLAB's handling of Java data types.

Being able to integrate Java libraries into MATLAB code is a fantastic feature. It's often the easiest way to add in functionality that's lacking in the base language (for example, all but the simplest of HTTP interactions). However, the rules by which MATLAB coerces data between its own data types and Java data types are often arbitrary and unexpected. (Currently documented [here](http://www.mathworks.com/help/matlab/matlab_external/passing-data-to-a-java-method.html) and [here](http://www.mathworks.com/help/matlab/matlab_external/handling-data-returned-from-a-java-method.html).)

For example, a Java method that returns an `int` will have that value converted to a Matlab `double`. But if that Java method instead returns an `int[]` of length 1, that's converted to a Matlab `int32`. Wat?

So I wrote this tool to assist in understanding what all the cases are, which ones work as expected, and which ones require finessing to be useful.

Using
-----

In a terminal:
```
$ mvn package
```

In MATLAB:
```
>> javaaddpath('target/insanitype-1.0-SNAPSHOT.jar')
>> net.psexton.insanitype.FromJavaPrimitive.getInt

ans =

    87539319

>> 
```

Versioning
----------

[Semantic Versioning](http://semver.org) for versions, and [Semanticly Versioned Names](http://semvername.org) for tags and releases.

License
-------

[MIT](http://opensource.org/licenses/MIT)
