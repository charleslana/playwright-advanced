package test;

import base.BaseTestClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import page.LetCodePage;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LetCodeTest extends BaseTestClass {

    private LetCodePage letCodePage;

    @BeforeEach
    void setUp() {
        letCodePage = new LetCodePage(page);
    }

    @Order(1)
    @Test
    @DisplayName("Should navigate")
    void shouldNavigate() {
        page.navigate(letCodePage.url);
        assertThat(page).hasTitle("LetCode - Testing Hub");
    }

    @Order(2)
    @Test
    @DisplayName("Should go to edit")
    void shouldGoToEdit() {
        letCodePage.goToEdit();
    }
}
