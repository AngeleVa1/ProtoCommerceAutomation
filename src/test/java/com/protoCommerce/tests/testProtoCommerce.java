package com.protoCommerce.tests;

import com.protoCommerce.base.BaseTest;
import com.protoCommerce.pages.ProtoCommerceHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testProtoCommerce extends BaseTest {
    ProtoCommerceHomePage protoCommerceHomePage;

    @Test
    public void protoCommerceHomePage() {
        ProtoCommerceHomePage protoCommerceHomePage = new ProtoCommerceHomePage(driver);
        protoCommerceHomePage.nameBox();
        protoCommerceHomePage.successMessage();
        System.out.println(protoCommerceHomePage.successMessage());
        Assert.assertEquals(protoCommerceHomePage.successMessage(), "Success!", "Test not passed");
    }
}
