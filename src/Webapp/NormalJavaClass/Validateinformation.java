package Webapp.NormalJavaClass;

/**
 * Created by Kenedid on 14-04-2017.
 */
public class Validateinformation {

    public boolean validateInfo(String name,String password){

        if(name.equals("Kenedid") && password.equals("1234")){

            return true;
        }
        return false;
    }

}
