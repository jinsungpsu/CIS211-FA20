package fakeBrowser;

public class Driver {

    public static void main(String[] args) {

        Browser firefox = new Browser();

        firefox.gotoUrl("google.com");
        System.out.println(firefox); // this should display "google.com"

        firefox.gotoUrl("dtcc.edu");

        System.out.println(firefox); // this should display "dtcc.edu"

        firefox.gotoUrl("news.com");

        firefox.goBack();
        System.out.println(firefox); // this should display "dtcc.edu"

        firefox.gotoUrl("espn.com");

    }
}
