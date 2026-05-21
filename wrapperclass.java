// wrapper class is a class that is used to wrap a primitive data type in an object. The wrapper class provides a way to use primitive data types as objects. The wrapper class is defined in the java.lang package. The wrapper class provides some methods that are common to all wrapper classes. These methods are: valueOf(), parseXXX(), toString(), equals(), hashCode(), getClass(). The wrapper class is used to convert a primitive data type to an object and vice versa. The wrapper class is also used to provide some utility methods for working with primitive data types. The wrapper class is a very important class in java and it is used in many places in java programming.
public class wrapperclass {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = new Integer(8);// boxing
        // autoboxing is the process of converting a primitive data type to an object.
        // In
        // this case, we are converting the primitive data type int to the wrapper class
        // Integer. This is called boxing because we are putting the primitive data type
        // into a box (the wrapper class). The wrapper class provides a way to use
        // primitive data types as objects, which allows us to use the methods provided
        // by the wrapper class to work with the primitive data type. In this case, we
        // can use the methods provided by the Integer class to work with the int data
        // type.
        // autoboxing is the process of converting a primitive data type to an object.
        // In this case, we are converting the primitive data type int to the wrapper
        // class Integer. This is called autoboxing because the conversion is done
        // automatically by the Java compiler. The Java compiler will automatically
        // convert the primitive data type int to the wrapper class Integer when we
        // assign a primitive data type to a wrapper class variable. This allows us to
        // use the methods provided by the wrapper class to work with the primitive data
        // type without having to manually convert it to an object.
        // unboxing is the process of converting an object to a primitive data type. In
        // this case, we are converting the wrapper class Integer to the primitive data
        // type int. This is called unboxing because we are taking the primitive data
        // type out of the box (the wrapper class). The wrapper class provides a way to
        // use primitive data types as objects, which
        // auto unboxing is the process of converting an object to a primitive data
        // type. In this case, we are converting the wrapper class Integer to the
        // primitive data type int. This is called auto unboxing because the conversion
        // is done automatically by the Java compiler. The Java compiler will
        // automatically convert the wrapper class Integer to the primitive data type
        // int when we assign a wrapper class variable to a primitive data type
        // variable. This allows us to use the methods provided by the wrapper class to
        // work with the primitive data type without having to manually convert it to a
        // primitive data type.
        System.out.println(num1);
        // abstract class is a class that cannot be instantiated. It is a class that is
        // meant to be subclassed. An abstract class can have abstract methods, which
        // are methods that do not have a body. An abstract class can also have concrete
        // methods, which are methods that have a body. An abstract class can be used to
        // provide a common interface for a group of related classes. An abstract class
        // can also be used to provide some default behavior for a group of related
        // classes. An abstract class is defined using the abstract keyword in the class
        // declaration. An abstract method is defined using the abstract keyword in the
        // method declaration. An abstract class cannot be instantiated, but it can be
        // subclassed. A subclass of an abstract class must provide an implementation
        // for all the abstract methods in the abstract class, or it must also be
        // declared as an abstract class.
        // abstract keyword is used to declare a class as abstract. An abstract class
        // cannot be instantiated, but it can be subclassed. An abstract class can have
        // abstract methods, which are methods that do not have a body. An abstract
        // class can also have concrete methods, which are methods that have a body. An
        // abstract class can be used to provide a common interface for a group of
        // related classes. An abstract class can also be used to provide some default
        // behavior for a group of related classes. An abstract class is defined using
        // the abstract keyword in the class declaration. An abstract method is defined
        // using the abstract keyword in the method declaration. An abstract class
        // cannot be instantiated, but it can be subclassed. A subclass of an abstract
        // class must provide an implementation for all the abstract methods in the
        // abstract class, or it must also be declared as an abstract class.
    }

    // i can't create object of abstract class
    // i can create reference variable of abstract class
    // i can create reference variable of abstract class and assign it to the object
    // of subclass of
    // concrete class is nothing but it is subclass of abstract class which provides
    // implementation for all the abstract methods in the abstract class. A concrete
    // class can be instantiated, and it can be used to create objects. A concrete
    // class is defined using the class keyword in the class declaration
}