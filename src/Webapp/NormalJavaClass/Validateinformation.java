package Webapp.NormalJavaClass;

import DatabasePackage.Databaseclass;

/**
 * Created by Kenedid on 14-04-2017.
 */
public class Validateinformation {

    public boolean validateInfo(String name,String password){

        Databaseclass databaseclass = new Databaseclass();

        return databaseclass.IsinformationValidate(name,password);
        }


    }


