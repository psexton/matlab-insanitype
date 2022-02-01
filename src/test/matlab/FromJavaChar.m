%FROMJAVACHAR Unit tests for a char return value
% We expect a Java char to be scalar, character, and of type char.
%
% Part of the Matlab-Insanitype project.

classdef FromJavaChar < TestCase
    properties
       value; % The variable coerced from a Java type
    end
    
    methods
        function obj = FromJavaChar(name)
            obj = obj@TestCase(name);
            obj.value = net.psexton.insanitype.FromJavaPrimitive.getChar();
        end

        function testIsScalar(this)
            assertTrue(isscalar(this.value));
        end
    
        function testIsCharacter(this)
            assertTrue(ischar(this.value));
        end
        
        function testType(this)
            assertEqual('char', class(this.value));
        end
    end
end
