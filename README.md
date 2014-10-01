matlab-insanitype
=================

Sanity tests for MATLAB's handling of Java data types.

Being able to integrate Java libraries into MATLAB code is a fantastic feature. It's often the easiest way to add in functionality that's lacking in the base language (for example, all but the simplest of HTTP interactions). However, the rules by which MATLAB coerces data between its own data types and Java data types are often arbitrary and unexpected. (Currently documented [here](http://www.mathworks.com/help/matlab/matlab_external/passing-data-to-a-java-method.html) and [here](http://www.mathworks.com/help/matlab/matlab_external/handling-net-data-in-matlab_bte9owt-1.html).)

So I wrote this tool to assist in understanding what all the cases are, which ones work as expected, and which ones require finessing to be useful.

Versioning
----------

[Semantic Versioning](http://semver.org) for versions, and [Semanticly Versioned Names](http://semvername.org) for tags and releases.

License
-------

[MIT](http://opensource.org/licenses/MIT)
