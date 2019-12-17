package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println( "Hello World!" );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
