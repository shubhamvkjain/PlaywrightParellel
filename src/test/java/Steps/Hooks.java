package Steps;

import com.microsoft.playwright.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    private static ThreadLocal<Playwright> playwright = new ThreadLocal<>();
    private static ThreadLocal<Browser> browser = new ThreadLocal<>();
    private static ThreadLocal<Page> page = new ThreadLocal<>();

    @Before
    public void setUp() {
        // Start Playwright
        playwright.set(Playwright.create());
        browser.set(playwright.get().chromium().launch(new BrowserType.LaunchOptions().setHeadless(true)));
        page.set(browser.get().newPage());
        
        System.out.println("Browser launched for thread: " + Thread.currentThread());
    }

    @After
    public void tearDown() {
        if (page.get() != null) {
            page.get().close();
            System.out.println("Closed Page for thread: " + Thread.currentThread());
        }
        if (browser.get() != null) {
            browser.get().close();
        }
        if (playwright.get() != null) {
            playwright.get().close();
        }

        // Remove instances to prevent memory leaks
        page.remove();
        browser.remove();
        playwright.remove();
    }

    // Getter to be used in Page Object classes
    public static Page getPage() {
        return page.get();
    }
}
