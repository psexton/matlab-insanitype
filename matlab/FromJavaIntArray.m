%FROMJAVAINTARRAY Unit tests for an int[] return value
% We expect a Java int to be scalar, numeric, integer, and of type int32.
%
% Part of the Matlab-Insanitype project.

classdef FromJavaIntArray < TestCase
    properties
       value; % The variable coerced from a Java type
    end
    
    methods
        function obj = FromJavaIntArray(name)
            obj = obj@TestCase(name);
            obj.value = net.psexton.insanitype.FromJavaPrimitiveArray.getInt();
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
            assertEqual('int32', class(this.value));
        end
    end
end
