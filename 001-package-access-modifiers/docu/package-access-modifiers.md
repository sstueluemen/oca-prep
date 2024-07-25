# OCA Preperation
## ``package`` and ``import``
- If a class defines a package statement, it should be the first statement in the
class definition.
- The package statement can’t appear within a class declaration or after the class
declaration.
- If present, the package statement should appear exactly once in a class.
- The import statement allows usage of simple names, non-qualified names of
classes, and interfaces.
- The import statement can’t be used to import multiple classes or interfaces
  with the same name.
- A class can include multiple import statements.
- If a class includes a package statement, all the import statements should follow
  the package statement.
- If present, an import statement must be placed before any class or interface
  definition.

## Comments
- Comments are another component of a class. Comments are used to annotate
Java code and can appear at multiple places within a class.
- A comment can appear before or after a package statement, before or after the
class definition, and before, within, or after a method definition.
- Comments come in two flavors: multiline and end-of-line comments.
- Comments can contain any special characters (including characters from the
Unicode charset).
- Multiline comments span multiple lines of code. They start with /* and end
with */.
- End-of-line comments start with // and, as the name suggests, are placed at the
end of a line of code or a blank line. The text between // and the end of the
line is treated as a comment.
## Class
- Class declarations and class definitions are components of a Java class.
- A Java class may define zero or more instance variables, methods, and constructors.
- The order of the definition of instance variables, constructors, and methods
doesn’t matter in a class.
- A class may define an instance variable before or after the definition of a
method and still use it.
- A Java source code file (.java file) can define multiple classes and interfaces.
- A public class can be defined only in a source code file with the same name.
- package and import statements apply to all the classes and interfaces defined in
the same source code file (.java file).

## Executable java applications

- An executable Java class is a class that, when handed over to the Java Virtual
Machine (JVM), starts its execution at a particular point in the class. This point
of execution is the main method.
- For a class to be executable, the class should define a main method with the signature 
``public static void main(String args[])`` or ``public static void main(String... args)``. The positions of static and
public can be interchanged, and the method parameter can use any valid name.
- A class can define multiple methods with the name main, provided that the signature of these methods doesn’t match 
the signature of the main method defined in the previous point. These overloaded versions aren’t considered the
main method.
- The main method accepts an array of type String containing the method parameters passed to it by the JVM.
- The keyword java and the name of the class aren’t passed on as command parameters to the main method.

## packages

- You can use packages to group together a related set of classes and interfaces.
- By default, all classes and interfaces in separate packages and subpackages
aren’t visible to each other.
- The package and subpackage names are separated using a dot.
- All classes and interfaces in the same package are visible to each other.
- An import statement allows the use of simple names for packaged classes and
interfaces defined in other packages.
- You can’t use the ``import`` statement to access multiple classes or interfaces with
the same names from different packages.
- You can import either a single member or all members (classes and interfaces)
of a package using the ``import`` statement.
- You can’t import classes from a subpackage by using the wildcard character, an
asterisk (*), in the import statement.
- A class from a default package can’t be used in any named packaged class,
regardless of whether it’s defined within the same directory or not.
- You can import an individual ``static`` member of a class or all its ``static`` members by using a static import statement.
- An import statement can’t be placed before a package statement in a class. Any
attempt to do so will cause the compilation of the class to fail.
- The members of default packages are accessible only to classes or interfaces
defined in the same directory on your system.