# Valentine

An interpreted toy language using ANTLR4 for parser/lexer/AST generation

Currently supports:

- Dynamic typing


- Arithmetic, relational and boolean operations


- Print statement


- Lists,integers,boolean values


- First class functions (with closures) : Functions can be assigned to variables, be returned by other functions and be used as arguments.The value of the last expression is returned as the value of the function (like in Lisps)
- Anonymous Functions: Anonymous function calls and definitions can be used as function arguments and/or be bound to variables




Check test.vlnt for a sample program


Quick tutorial of the syntax/features:
-

- Variable assignment:
```
  # Identifiers may be formed from any combination of lower case characters (a-z) 
  # except for the language's keywords: if,def,lambda,true,false,list etc
  a = 5 #assigned to literal/atom
  b = f(a) #assigned to an evaluated value
  c = lambda(x,y,z): x + y +z end #binding an anonymous function
  d = (lambda (x) : x + x end(100)) # calling an anonymous function "on-the-spot" 
```
- Function definition:
```
# see test.vlnt for more elaborate examples of functions

def f (x): #typical function definition
  x + x
end  

def fibo(x): # an example function : a fibonacci series generator
  c = 0
  if x == 1 or x == 0:
    c = x
  end
  else:
    l = x - 1
    r = x - 2
    c = fibo(l) + fibo(r)
  end 
  c # last evaluated element is returned as the value of a function
end

lambda (x,y): x / y end #anonymous function declaration
lambda (func,x): func(x) end (f,100) # anonymous function call and a high order function example
```
- Lists
```
a = 10
b = list(5,a,lambda(x): 3 * x end(5)) 
```
