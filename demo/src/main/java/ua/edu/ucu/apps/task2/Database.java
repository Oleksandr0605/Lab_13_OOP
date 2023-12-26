package ua.edu.ucu.apps.task2;

public class Database extends БазаДаних{
    public String recieveUserData(){
        return отриматиДаніКористувача();
    }
    public String recieveStatisticalData(){
        return отриматиСтатистичніДані();
    }
}
