%FROMJAVABOOLEANARRAY Unit tests for a boolean[] return value
% We expect a Java double to be scalar, logical, and of type logical.
%
% Part of the Matlab-Insanitype project.

classdef FromJavaBooleanArray < TestCase
    properties
       value; % The variable coerced from a Java type
    end
    
    methods
        function obj = FromJavaBooleanArray(name)
            obj = obj@TestCase(name);
            obj.value = net.psexton.insanitype.FromJavaPrimitiveArray.getBoolean();
        end

        function testIsScalar(this)
            assertTrue(isscalar(this.value));
        end
    
        function testIsLogical(this)
            assertTrue(islogical(this.value));
        end
        
        function testType(this)
            assertEqual('logical', class(this.value));
        end
    end
end
