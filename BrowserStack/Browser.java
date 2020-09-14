package fakeBrowser;

import java.util.Stack;

public class Browser {
    private String currentUrl;
    private Stack<String> browserHistory;

    public void gotoUrl(String url) {

    }

    public void goBack() {

    }

    @Override
    public String toString() {
        return "Currently browsing: " + currentUrl;
    }
}
