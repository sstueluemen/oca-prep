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

- Packages are used to group together a related set of classes and interfaces.
- By default, **all classes and interfaces in separate packages and subpackages** aren’t visible to each other.
- The package and subpackage names are separated using a **dot**.
- All classes and interfaces in the same package are **visible** to each other.
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
## Access modifiers
  The access modifiers control the accessibility of your class and its members outside the class and package.
  - Java(8) defines four access levels: public, protected, default, and private.
  - Java defines three access modifiers: public, protected, and private.
  - The public access modifier is the least restrictive access modifier.
  - Classes and interfaces defined using the public access modifier are accessible
  to related and unrelated classes outside the package in which they’re defined.
  - The members of a class defined using the protected access modifier are accessible 
to classes and interfaces defined in **the same package** and to **all derived
  classes**, even if they’re defined in separate packages.

  - The members of a class defined without using an explicit access modifier are
  defined with package accessibility (also called default accessibility).
  - The members with package access are accessible only to classes and interfaces
  defined in the same package.
  - A class defined using default access can’t be accessed outside its package.
  - The members of a class defined using a private access modifier are accessible
  only to the class in which they’re defined. It doesn’t matter whether the class or
  interface in question is from another package or has extended the class. Private
  members are not accessible outside the class in which they’re defined.
  - The private access modifier is the most restrictive access modifier.
 ## Non-access modifiers:
  - The nonaccess modifiers change the default properties of a Java class and its
  members.
  - The nonaccess modifiers covered by this exam are abstract, final, and static.
  - The abstract keyword, when prefixed to the definition of a concrete class, can
  change it to an abstract class, even if it does not define any abstract methods.
  - An abstract class can’t be instantiated.
  - An interface is implicitly abstract. The Java compiler automatically adds the
  keyword abstract to the definition of an interface (which means that adding
  the keyword abstract to the definition of an interface is redundant).
  - An abstract method doesn’t have a body. When a non-abstract class extends a
  class with an abstract method, it must implement the method.
  - A variable can’t be defined as an abstract variable.
  - The static modifier can be applied to inner classes, inner interfaces, variables,
  and methods. Inner classes and interfaces aren’t covered in this exam.
  - **A method can’t be defined as both abstract and static.**
  - static attributes (fields and methods) are common to all instances of a class
  and aren’t unique to any instance of a class.
  - static attributes exist independently of any instances of a class and may be
  accessed even when no instances of the class have been created.
  - static attributes are also known as class fields or class methods because they’re
  said to belong to their class, not to any instance of that class.
  - A static variable or method can be accessed using the name of a reference
  object variable or the name of a class.
  - A static method or variable can’t access non-static variables or methods of a
  class. But the reverse is true: non-static variables and methods can access
  static variables and methods.
  - static classes and interfaces are a type of nested classes and interfaces, but
  they aren’t covered in this exam.

  - You can’t prefix the definition of a top-level class or an interface with the keyword static. A top-level class or interface is one that isn’t defined within another
  class or interface.

## Features and components of Java:
- Object orientation—Java emulates real-life object definition and behavior. It uses
classes, interfaces, or enums to define all its code.
- Abstraction—Java lets you abstract objects and include only the required properties and behavior in your code.
- Encapsulation—The state or the fields of a class are protected from unwanted
access and manipulation.
- Inheritance—Java enables its classes to inherit other classes and implement interfaces. The interfaces can inherit other interfaces.
- Polymorphism—Java enables instances of its classes to exhibit multiple behaviors
for the same method calls.
- Type safety—In Java, you must declare a variable with its data type before you can
use it.
- Automatic memory management—Java uses garbage collectors for automatic memory management. They reclaim memory from objects that are no longer in use.
- Multithreading and concurrency—Java defines classes and interfaces to enable
developers to develop multithreaded code.
- Java isn’t a single-threaded language.
## LateX

$$
\int x^2 \, dx = \frac{x^3}3 + C
$$

When $a \ne 0$, there are two solutions to $(ax^2 + bx + c = 0)$ and they are

$$ x =\frac{-b \pm \sqrt{b^2-4ac}  {2a} $$