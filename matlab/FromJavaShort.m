%FROMJAVASHORT Unit tests for a short return value
% We expect a Java short to be scalar, numeric, integer, and of type int16.
%
% Part of the Matlab-Insanitype project.

classdef FromJavaShort < TestCase
    properties
       value; % The variable coerced from a Java type
    end
    
    methods
        function obj = FromJavaShort(name)
            obj = obj@TestCase(name);
            obj.value = net.psexton.insanitype.FromJavaPrimitive.getShort();
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
            assertEqual('int16', class(this.value));
        end
    end
end
