package org.openapitools.controller;

import org.openapitools.model.AdsCreditRedeem;
import org.openapitools.model.AdsCreditRedeemCreate;
import org.openapitools.model.AdsCreditsDiscountsGet200Response;
import org.openapitools.model.BillingInvoiceDocumentType;
import org.openapitools.model.BillingInvoiceDownloadResponse;
import org.openapitools.model.BillingInvoiceSortField;
import org.openapitools.model.BillingInvoiceStatus;
import org.openapitools.model.BillingInvoicesGet200Response;
import org.openapitools.model.BillingProfilesGet200Response;
import java.time.LocalDate;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibPaginationOrder;
import org.openapitools.model.SSIOAccount;
import org.openapitools.model.SSIOInsertionOrder;
import org.openapitools.model.SSIOInsertionOrderCreate;
import org.openapitools.model.SSIOInsertionOrderStatusResponse;
import org.openapitools.model.SSIOInsertionOrderUpdate;
import org.openapitools.model.SsioInsertionOrdersStatusGetByAdAccount200Response;
import org.openapitools.model.SsioOrderLinesGetByAdAccount200Response;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for BillingController
 */
@MicronautTest
public class BillingControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    BillingController controller;

    /**
     * This test is used to validate the implementation of adsCreditRedeem() method
     *
     * The method should: Redeem ad credits
     *
     * Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adsCreditRedeemMethodTest() {
        // given
        String adAccountId = "example";
        AdsCreditRedeemCreate adsCreditRedeemCreate = new AdsCreditRedeemCreate("138e9e0ff7e38cf511b880975eb574c09aa9d5e1657590ab0431040da68caa67", true);

        // when
        AdsCreditRedeem result = controller.adsCreditRedeem(adAccountId, adsCreditRedeemCreate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/ads_credit/redeem' to the features of adsCreditRedeem() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adsCreditRedeemClientApiTest() throws IOException {
        // given
        AdsCreditRedeemCreate body = new AdsCreditRedeemCreate("138e9e0ff7e38cf511b880975eb574c09aa9d5e1657590ab0431040da68caa67", true);
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ads_credit/redeem").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@3ebdd27f");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdsCreditRedeem.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of adsCreditsDiscountsGet() method
     *
     * The method should: Get ads credit discounts
     *
     * Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void adsCreditsDiscountsGetMethodTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        AdsCreditsDiscountsGet200Response result = controller.adsCreditsDiscountsGet(adAccountId, bookmark, pageSize).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/ads_credit/discounts' to the features of adsCreditsDiscountsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void adsCreditsDiscountsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ads_credit/discounts").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@708fff8e");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, AdsCreditsDiscountsGet200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of billingInvoiceDownloadGet() method
     *
     * The method should: Get download url for a billing invoice
     *
     * Get download url for a billing invoice.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void billingInvoiceDownloadGetMethodTest() {
        // given
        String adAccountId = "example";
        String billingInvoiceId = "example";

        // when
        BillingInvoiceDownloadResponse result = controller.billingInvoiceDownloadGet(adAccountId, billingInvoiceId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download' to the features of billingInvoiceDownloadGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void billingInvoiceDownloadGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
            put("billing_invoice_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@4cbe5364");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BillingInvoiceDownloadResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of billingInvoicesGet() method
     *
     * The method should: Get billing invoices
     *
     * Get billing invoices in the advertiser account.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void billingInvoicesGetMethodTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING");
        BillingInvoiceSortField sort = BillingInvoiceSortField.fromValue("DUE_DATE");
        BillingInvoiceStatus status = BillingInvoiceStatus.fromValue("OPEN");
        BillingInvoiceDocumentType documentType = BillingInvoiceDocumentType.fromValue("INVOICE");
        LocalDate startDueDate = LocalDate.of(2001, 2, 3);
        LocalDate endDueDate = LocalDate.of(2001, 2, 3);

        // when
        BillingInvoicesGet200Response result = controller.billingInvoicesGet(adAccountId, bookmark, pageSize, order, sort, status, documentType, startDueDate, endDueDate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/billing_invoices' to the features of billingInvoicesGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void billingInvoicesGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/billing_invoices").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@4e4eacc9");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)) // The query parameter format should be 
            .add("order", String.valueOf(PinterestLibPaginationOrder.fromValue("ASCENDING"))) // The query parameter format should be 
            .add("sort", String.valueOf(BillingInvoiceSortField.fromValue("DUE_DATE"))) // The query parameter format should be 
            .add("status", String.valueOf(BillingInvoiceStatus.fromValue("OPEN"))) // The query parameter format should be 
            .add("document_type", String.valueOf(BillingInvoiceDocumentType.fromValue("INVOICE"))) // The query parameter format should be 
            .add("start_due_date", String.valueOf(LocalDate.of(2001, 2, 3))) // The query parameter format should be 
            .add("end_due_date", String.valueOf(LocalDate.of(2001, 2, 3))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BillingInvoicesGet200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of billingProfilesGet() method
     *
     * The method should: Get billing profiles
     *
     * Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void billingProfilesGetMethodTest() {
        // given
        Boolean isActive = false;
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        BillingProfilesGet200Response result = controller.billingProfilesGet(isActive, adAccountId, bookmark, pageSize).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/billing_profiles' to the features of billingProfilesGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void billingProfilesGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/billing_profiles").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@1eb0b155");
        request.getParameters()
            .add("is_active", String.valueOf(false)) // The query parameter format should be 
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, BillingProfilesGet200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of ssioAccountsGet() method
     *
     * The method should: Get Salesforce account details including bill-to information.
     *
     *   Get Salesforce account details including bill-to information to be used in insertion orders process for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void ssioAccountsGetMethodTest() {
        // given
        String adAccountId = "example";

        // when
        SSIOAccount result = controller.ssioAccountsGet(adAccountId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/ssio/accounts' to the features of ssioAccountsGet() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void ssioAccountsGetClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ssio/accounts").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@11cc4e82");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, SSIOAccount.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of ssioInsertionOrderCreate() method
     *
     * The method should: Create insertion order through SSIO.
     *
     *   Create insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void ssioInsertionOrderCreateMethodTest() {
        // given
        String adAccountId = "example";
        SSIOInsertionOrderCreate ssIOInsertionOrderCreate = new SSIOInsertionOrderCreate("example", "example", "example", "example", "example", "example", "example", org.openapitools.model.Currency.fromValue("UNK"), "example", "example", "example", org.openapitools.model.SSIOOrderLineType.fromValue("BUDGET"), "example", "example", "example", "example");

        // when
        SSIOInsertionOrder result = controller.ssioInsertionOrderCreate(adAccountId, ssIOInsertionOrderCreate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/ssio/insertion_orders' to the features of ssioInsertionOrderCreate() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void ssioInsertionOrderCreateClientApiTest() throws IOException {
        // given
        SSIOInsertionOrderCreate body = new SSIOInsertionOrderCreate("example", "example", "example", "example", "example", "example", "example", org.openapitools.model.Currency.fromValue("UNK"), "example", "example", "example", org.openapitools.model.SSIOOrderLineType.fromValue("BUDGET"), "example", "example", "example", "example");
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ssio/insertion_orders").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@2fd71aac");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, SSIOInsertionOrder.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of ssioInsertionOrderEdit() method
     *
     * The method should: Edit insertion order through SSIO.
     *
     *   Edit insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void ssioInsertionOrderEditMethodTest() {
        // given
        String adAccountId = "example";
        SSIOInsertionOrderUpdate ssIOInsertionOrderUpdate = new SSIOInsertionOrderUpdate();

        // when
        SSIOInsertionOrder result = controller.ssioInsertionOrderEdit(adAccountId, ssIOInsertionOrderUpdate).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/ssio/insertion_orders' to the features of ssioInsertionOrderEdit() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void ssioInsertionOrderEditClientApiTest() throws IOException {
        // given
        SSIOInsertionOrderUpdate body = new SSIOInsertionOrderUpdate();
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ssio/insertion_orders").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.PATCH(uri, body)
            .accept("[Ljava.lang.String;@1444d37b");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, SSIOInsertionOrder.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of ssioInsertionOrdersStatusGetByAdAccount() method
     *
     * The method should: Get insertion order status by ad account id.
     *
     *   Get insertion order status for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void ssioInsertionOrdersStatusGetByAdAccountMethodTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        SsioInsertionOrdersStatusGetByAdAccount200Response result = controller.ssioInsertionOrdersStatusGetByAdAccount(adAccountId, bookmark, pageSize).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/ssio/insertion_orders/status' to the features of ssioInsertionOrdersStatusGetByAdAccount() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void ssioInsertionOrdersStatusGetByAdAccountClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ssio/insertion_orders/status").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@fe5e2bf");
        request.getParameters()
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, SsioInsertionOrdersStatusGetByAdAccount200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of ssioInsertionOrdersStatusGetByPinOrderId() method
     *
     * The method should: Get insertion order status by pin order id.
     *
     *   Get insertion order status for &#x60;pin_order_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void ssioInsertionOrdersStatusGetByPinOrderIdMethodTest() {
        // given
        String adAccountId = "example";
        String pinOrderId = "example";

        // when
        SSIOInsertionOrderStatusResponse result = controller.ssioInsertionOrdersStatusGetByPinOrderId(adAccountId, pinOrderId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status' to the features of ssioInsertionOrdersStatusGetByPinOrderId() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void ssioInsertionOrdersStatusGetByPinOrderIdClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
            put("pin_order_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@7c2e059f");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, SSIOInsertionOrderStatusResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of ssioOrderLinesGetByAdAccount() method
     *
     * The method should: Get Salesforce order lines by ad account id.
     *
     *   Get Salesforce order lines for account id &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void ssioOrderLinesGetByAdAccountMethodTest() {
        // given
        String adAccountId = "example";
        String pinOrderId = "example";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        SsioOrderLinesGetByAdAccount200Response result = controller.ssioOrderLinesGetByAdAccount(adAccountId, pinOrderId, bookmark, pageSize).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ad_accounts/{ad_account_id}/ssio/order_lines' to the features of ssioOrderLinesGetByAdAccount() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void ssioOrderLinesGetByAdAccountClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ad_accounts/{ad_account_id}/ssio/order_lines").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("ad_account_id", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@6bbb72cc");
        request.getParameters()
            .add("pin_order_id", "example") // The query parameter format should be 
            .add("bookmark", "example") // The query parameter format should be 
            .add("page_size", String.valueOf(25)); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, SsioOrderLinesGetByAdAccount200Response.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
