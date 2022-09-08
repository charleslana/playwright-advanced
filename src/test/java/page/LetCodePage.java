package page;

import com.microsoft.playwright.Page;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class LetCodePage {

    public LetCodePage(Page page) {
        this.page = page;
    }

    public final String url = "https://letcode.in/test";

    private final Page page;

    public void goToEdit() {
        page.navigate(url);
        page.locator("text=Edit").click();
        assertThat(page).hasTitle("Interact with Input fields");
    }
}
