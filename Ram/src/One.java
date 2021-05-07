/**
 * Hello I am Ezekiel Ramirez
 *
 * I am a computer science major at California Baptist University. I have some friends who
 * are changing majors to comp sci and I am creating these repos to help them learn basic
 * syntax in the java language. Most program languages behave the same, the major
 * difference being that the syntax changes.
 *
 * In this first lesson we will cover
 * - variable types
 * - outputting information to the screen
 * - using variables to create functions
 *
 * For more examples of what I cover in these programs you can head to w3schools.com java
 * lessons If you find yourself on a computer that doesn't have a programing environment set
 * up you can look up any online IDE, preferably one that has java. From there you can copy
 * and paste the code seen here to the IDE and the spacing/syntax should be fine.
 *
 * GIT commands
 * git add --all
 * git commit -m "Comment here"
 * git push
 */

public class One {

    public static void main(String[] args) {
        // to make comments in most java IDE's you use two slashes, this only works
        // for a single line of comments.

        /* for comments
           that span multiple lines use the multi line comment
         */

        /**
         * For special notes that would be important to users
         * use this style of commenting!!!
         */

        /*
        the data type int stores a basic form of numerical information it can be
        initialized with out an equivalence statement.

        there are two common ways to change the value of integer
        1. you can change the value directly after the equal sign
        2. you can write the variable name on a separate line equal to a new value

        WARNING: after you declare what kind of data type the variable is, you do not need
        to declare the type again, just the name is fine and this goes for other types of
        data as well. Otherwise the program may have errors.
         */

//         int integer;
        int integer = 0;
        // integer = 2;
        System.out.println("integer has a value of " + integer);

        double number = 0.0;
        System.out.println("number has a value of " + number);

        float weAll = 0;
        System.out.println("weAll has a value of " + weAll);

        String str = "hello";
        System.out.println("str wants to say " + str);

        char abc = 'd';
        System.out.println("abc has the letter " + abc);

        boolean either = false;
        System.out.println("either has the value of " + either);

        System.out.println("hello, world!");
    }
}
