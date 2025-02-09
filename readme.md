1. Encapsulation - Encapsulation is one of the four pillars of Object-Oriented Programming (OOP). 
   It refers to the bundling of data (fields) and methods that operate on the data into a single unit (class), while restricting direct access to some components.<br>

   Benefits of Encapsulation
	1.	Data Hiding: Restrict access to certain fields and methods using access modifiers.
	2.	Security: Prevent unauthorized access and modification of data.
	3.	Improved Maintainability: Changes to internal implementation don’t affect other parts of 
        the program.
	4.	Reusability: Well-encapsulated classes are easier to reuse in other programs.

    Ex.
    ```java
    public class Employee {
        // Private fields (data hiding)
        private String name;
        private int age;

        // Public getter for name
        public String getName() {
            return name;
        }

        // Public setter for name
        public void setName(String name) {
            this.name = name;
        }

        // Public getter for age
        public int getAge() {
            return age;
        }

        // Public setter for age with validation
        public void setAge(int age) {
            if (age > 0) {  // Age must be positive
                this.age = age;
            } else {
                System.out.println("Age must be positive!");
            }
        }
    }




    public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();

        // Setting values using setters
        emp.setName("John Doe");
        emp.setAge(30);

        // Getting values using getters
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
    }
    }
    ```

    Key Points
	1.	Access Modifiers:
	•	private: The field is accessible only within the class.
	•	public: The field or method is accessible from anywhere.
	•	protected: Accessible within the package and subclasses.
	•	default: Accessible within the package.

2. Inheritance
   Types of Inheritance in Java
	1. Single Inheritance
        One child class inherits from one parent class.
        Example: Dog inherits from Animal.
    2. Multilevel Inheritance
        A chain of inheritance, where a class inherits from another class, which in turn inherits from another class.
        Example:
        ```java
        class Animal {
            void eat() {
                System.out.println("This animal eats food.");
            }
        }

        class Mammal extends Animal {
            void walk() {
                System.out.println("This mammal walks.");
            }
        }

        class Dog extends Mammal {
            void bark() {
                System.out.println("The dog barks.");
            }
        }
        ```
    3. Hierarchical Inheritance
        Multiple child classes inherit from a single parent class.
        Example:
        ```java
        class Animal {
            void eat() {
                System.out.println("This animal eats food.");
            }
        }

        class Cat extends Animal {
            void meow() {
                System.out.println("The cat meows.");
            }
        }

        class Dog extends Animal {
            void bark() {
                System.out.println("The dog barks.");
            }
        }
        ```
    4. Multiple Inheritance (via Interfaces)
        Java does not support multiple inheritance with classes to avoid ambiguity. Instead, it supports multiple inheritance using interfaces.