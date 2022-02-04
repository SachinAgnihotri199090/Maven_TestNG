import org.testng.annotations.Test;

public class First {

        @Test(priority = 1)
        void setup(){
            System.out.println("This is test method");
        }
        @Test(priority = 3)
        void login(){
            System.out.println("This is the login Test");
        }
        @Test(priority = 2)
        void teardown() {
            System.out.println("closing browser");
        }
    }

