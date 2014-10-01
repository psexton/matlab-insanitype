%FROMJAVABYTE Unit tests for a byte return value
% We expect a Java byte to be scalar, numeric, integer, 
% and of type int8 or uint8. (I'll accept either because it's arguable
% if a byte should be signed. But it is definitely an 8 bit integer.)
%
% Part of the Matlab-Insanitype project.

classdef FromJavaByte < TestCase
    properties
       value; % The variable coerced from a Java type
    end
    
    methods
        function obj = FromJavaByte(name)
            obj = obj@TestCase(name);
            obj.value = net.psexton.insanitype.FromJavaPrimitive.getByte();
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
            assertTrue(isa(this.value, 'int8') || isa(this.value, 'uint8'), ['Expected "int8" or "uint8" but got "' class(this.value) '"']);
        end
    end
end
