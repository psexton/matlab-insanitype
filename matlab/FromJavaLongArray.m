%FROMJAVALONGARRAY Unit tests for a long[] return value
% We expect a Java long to be scalar, numeric, integer, and of type int64.
%
% Part of the Matlab-Insanitype project.

classdef FromJavaLongArray < TestCase
    properties
       value; % The variable coerced from a Java type
    end
    
    methods
        function obj = FromJavaLongArray(name)
            obj = obj@TestCase(name);
            obj.value = net.psexton.insanitype.FromJavaPrimitiveArray.getLong();
        end

        function testIsScalar(this)
            assertTrue(isscalar(this.value));
        end
        
        function testIsNumeric(this)
            assertTrue(isnumeric(this.value));
        end
    
        function testIsInteger(this)
            assertTrue(isinteger(this.value));
        end
        
        function testType(this)
            assertEqual('int64', class(this.value));
        end
    end
end
