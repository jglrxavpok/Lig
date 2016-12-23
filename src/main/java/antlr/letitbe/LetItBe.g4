grammar LetItBe;

codeblock:
    instruction*;

instruction:
    variableDeclaration;

variableDeclaration:
    let IDENTIFIER BE article? IDENTIFIER (linkToValue value)? PERIOD?;

value:
    IDENTIFIER | tuple | integer;

tuple:
    LEFT_PAREN value ',' value RIGHT_PAREN;

article:
    ('a' | 'an' | 'the');

letter:
    (LOWERCASE_LETTER | UPPERCASE_LETTER);

integer:
    DIGIT (DIGIT)*;

linkToValue:
    AS | SET_TO | EQUAL_TO;

AS:
    'as';

SET_TO:
    'set to';
EQUAL_TO:
    'equal to';

BE:
    'be';

let:
    ('Let' | 'let');

FLOAT_TERMINATOR:
    'f';

DOUBLE_COLON:
    '::';

DIGIT:
    ('0'..'9');

PERIOD:
    '.';

PLUS:
    '+';

MINUS:
    '-';

MULTIPLY:
    '*';

DIVISION:
    '/';

COLON:
    ':';

LEFT_PAREN:
    '(';

RIGHT_PAREN:
    ')';

SMALL_ARROW:
    '->';

EQUAL_SIGN:
    '=';

IDENTIFIER:
    [a-zA-Z_]+;

LOWERCASE_LETTER:
    ('a'..'z');

UPPERCASE_LETTER:
    ('A'..'Z');

WHITESPACE:
    [ \t\n\r]+ -> skip;