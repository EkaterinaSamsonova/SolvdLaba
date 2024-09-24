package library.reflection;

import library.exceptions.BookIsReservedException;

import java.lang.reflect.*;

public class ReflectionExercise {
    public static void main(String[] args) {
        try {
            // Load the Book class
            Class<?> bookClass = Class.forName("library.items.Book");

            // Get class name and interfaces
            System.out.println("Class Name: " + bookClass.getName());
            Class<?>[] interfaces = bookClass.getInterfaces();
            System.out.println("Implemented Interfaces:");
            for (Class<?> iface : interfaces) {
                System.out.println(iface.getName());
            }

            // Get and print constructors
            System.out.println("\nConstructors:");
            Constructor<?>[] constructors = bookClass.getConstructors();
            for (Constructor<?> constructor : constructors) {
                System.out.println("Constructor: " + constructor.getName());
                System.out.println("Modifiers: " + Modifier.toString(constructor.getModifiers()));
                System.out.print("Parameter types: ");
                Class<?>[] paramTypes = constructor.getParameterTypes();
                for (Class<?> paramType : paramTypes) {
                    System.out.print(paramType.getName() + " ");
                }
                System.out.println();
            }

            // Get and print fields
            System.out.println("\nFields:");
            Field[] fields = bookClass.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("Field: " + field.getName());
                System.out.println("Type: " + field.getType().getName());
                System.out.println("Modifiers: " + Modifier.toString(field.getModifiers()));
            }

            // Get and print methods
            System.out.println("\nMethods:");
            Method[] methods = bookClass.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("Method: " + method.getName());
                System.out.println("Return type: " + method.getReturnType().getName());
                System.out.println("Modifiers: " + Modifier.toString(method.getModifiers()));
                System.out.print("Parameter types: ");
                Class<?>[] paramTypes = method.getParameterTypes();
                for (Class<?> paramType : paramTypes) {
                    System.out.print(paramType.getName() + " ");
                }
                System.out.println("\n");
            }

            // Create an instance of Book class using constructor
            Constructor<?> constructor = bookClass.getConstructor(String.class, String.class, String.class, boolean.class);
            Object bookInstance = constructor.newInstance("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", true);
            System.out.println("\nBook instance created: " + bookInstance);

            // Invoke 'reserve' method using reflection
            try {
                Method reserveMethod = bookClass.getMethod("reserve");
                reserveMethod.invoke(bookInstance);
            } catch (InvocationTargetException e) {
                if (e.getCause() instanceof BookIsReservedException) {
                    System.out.println("Book is already reserved.");
                }
            }

        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException |
                 InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
