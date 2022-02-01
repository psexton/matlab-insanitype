%FROMJAVAFLOAT Unit tests for a float return value
% We expect a Java float to be scalar, numeric, floating-point, 
% and of type single.
%
% Part of the Matlab-Insanitype project.

classdef FromJavaFloat < TestCase
    properties
       value; % The variable coerced from a Java type
    end
    
    methods
        function obj = FromJavaFloat(name)
            obj = obj@TestCase(name);
            obj.value = net.psexton.insanitype.FromJavaPrimitive.getFloat();
        end

        function testIsScalar(this)
            assertTrue(isscalar(this.value));
        end
        
        function testIsNumeric(this)
            assertTrue(isnumeric(this.value));
        end
    
        function testIsFloat(this)
            assertTrue(isfloat(this.value));
        end
        
        function testType(this)
            assertEqual('single', class(this.value));
        end
    end
end
