%FROMJAVADOUBLE Unit tests for a double return value
% We expect a Java double to be scalar, numeric, floating-point, 
% and of type double.
%
% Part of the Matlab-Insanitype project.

classdef FromJavaDouble < TestCase
    properties
       value; % The variable coerced from a Java type
    end
    
    methods
        function obj = FromJavaDouble(name)
            obj = obj@TestCase(name);
            obj.value = net.psexton.insanitype.FromJavaPrimitive.getDouble();
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
            assertEqual('double', class(this.value));
        end
    end
end
