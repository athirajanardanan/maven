import org.testng.annotations.Test;

public class fourthTestng {

    @Test
    public void Login(){
        System.out.println(6/6);
    }

    @Test(dependsOnMethods = {"Login"})
    public  void DashBoardVErification(){

        System.out.println(" after login in i am verifying the dashboard page");
    }
}
