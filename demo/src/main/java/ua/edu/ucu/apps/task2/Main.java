package ua.edu.ucu.apps.task2;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Auth authClient = new Auth();
        if (authClient.login(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
