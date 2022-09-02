package models.pages;

import models.components.cart.CartItemRowComponent;
import models.components.cart.TotalComponent;
import models.components.checkout.*;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class CheckoutPage extends BasePage{

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public BillingAddressComponent billingAddressComp() {
        return findComponent(BillingAddressComponent.class, driver);
    }

    public ShippingAddressComponent shippingAddressComp() {
        return findComponent(ShippingAddressComponent.class, driver);
    }

    public ShippingMethodComponent shippingMethodComp() {
        return findComponent(ShippingMethodComponent.class, driver);
    }

    public PaymentMethodComponent paymentMethodComp() {
        return findComponent(PaymentMethodComponent.class, driver);
    }

    public PaymentInfoComponent paymentInfoComp() {
        return findComponent(PaymentInfoComponent.class, driver);
    }

    public ConfirmOrderComponent confirmOrderComp() {
        return findComponent(ConfirmOrderComponent.class, driver);
    }
}