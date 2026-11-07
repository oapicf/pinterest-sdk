package org.openapitools.api;

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
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for BillingApi
 */
@MicronautTest
public class BillingApiTest {

    @Inject
    BillingApi api;

    
    /**
     * Redeem ad credits
     *
     * Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
     */
    @Test
    @Disabled("Not Implemented")
    public void adsCreditRedeemTest() {
        // given
        String adAccountId = "example";
        AdsCreditRedeemCreate adsCreditRedeemCreate = new AdsCreditRedeemCreate("138e9e0ff7e38cf511b880975eb574c09aa9d5e1657590ab0431040da68caa67", true);

        // when
        AdsCreditRedeem body = api.adsCreditRedeem(adAccountId, adsCreditRedeemCreate).block();

        // then
        // TODO implement the adsCreditRedeemTest()
    }

    
    /**
     * Get ads credit discounts
     *
     * Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
     */
    @Test
    @Disabled("Not Implemented")
    public void adsCreditsDiscountsGetTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        AdsCreditsDiscountsGet200Response body = api.adsCreditsDiscountsGet(adAccountId, bookmark, pageSize).block();

        // then
        // TODO implement the adsCreditsDiscountsGetTest()
    }

    
    /**
     * Get download url for a billing invoice
     *
     * Get download url for a billing invoice.
     */
    @Test
    @Disabled("Not Implemented")
    public void billingInvoiceDownloadGetTest() {
        // given
        String adAccountId = "example";
        String billingInvoiceId = "example";

        // when
        BillingInvoiceDownloadResponse body = api.billingInvoiceDownloadGet(adAccountId, billingInvoiceId).block();

        // then
        // TODO implement the billingInvoiceDownloadGetTest()
    }

    
    /**
     * Get billing invoices
     *
     * Get billing invoices in the advertiser account.
     */
    @Test
    @Disabled("Not Implemented")
    public void billingInvoicesGetTest() {
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
        BillingInvoicesGet200Response body = api.billingInvoicesGet(adAccountId, bookmark, pageSize, order, sort, status, documentType, startDueDate, endDueDate).block();

        // then
        // TODO implement the billingInvoicesGetTest()
    }

    
    /**
     * Get billing profiles
     *
     * Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
     */
    @Test
    @Disabled("Not Implemented")
    public void billingProfilesGetTest() {
        // given
        Boolean isActive = false;
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        BillingProfilesGet200Response body = api.billingProfilesGet(isActive, adAccountId, bookmark, pageSize).block();

        // then
        // TODO implement the billingProfilesGetTest()
    }

    
    /**
     * Get Salesforce account details including bill-to information.
     *
     *   Get Salesforce account details including bill-to information to be used in insertion orders process for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     */
    @Test
    @Disabled("Not Implemented")
    public void ssioAccountsGetTest() {
        // given
        String adAccountId = "example";

        // when
        SSIOAccount body = api.ssioAccountsGet(adAccountId).block();

        // then
        // TODO implement the ssioAccountsGetTest()
    }

    
    /**
     * Create insertion order through SSIO.
     *
     *   Create insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     */
    @Test
    @Disabled("Not Implemented")
    public void ssioInsertionOrderCreateTest() {
        // given
        String adAccountId = "example";
        SSIOInsertionOrderCreate ssIOInsertionOrderCreate = new SSIOInsertionOrderCreate("example", "example", "example", "example", "example", "example", "example", org.openapitools.model.Currency.fromValue("UNK"), "example", "example", "example", org.openapitools.model.SSIOOrderLineType.fromValue("BUDGET"), "example", "example", "example", "example");

        // when
        SSIOInsertionOrder body = api.ssioInsertionOrderCreate(adAccountId, ssIOInsertionOrderCreate).block();

        // then
        // TODO implement the ssioInsertionOrderCreateTest()
    }

    
    /**
     * Edit insertion order through SSIO.
     *
     *   Edit insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     */
    @Test
    @Disabled("Not Implemented")
    public void ssioInsertionOrderEditTest() {
        // given
        String adAccountId = "example";
        SSIOInsertionOrderUpdate ssIOInsertionOrderUpdate = new SSIOInsertionOrderUpdate();

        // when
        SSIOInsertionOrder body = api.ssioInsertionOrderEdit(adAccountId, ssIOInsertionOrderUpdate).block();

        // then
        // TODO implement the ssioInsertionOrderEditTest()
    }

    
    /**
     * Get insertion order status by ad account id.
     *
     *   Get insertion order status for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     */
    @Test
    @Disabled("Not Implemented")
    public void ssioInsertionOrdersStatusGetByAdAccountTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        SsioInsertionOrdersStatusGetByAdAccount200Response body = api.ssioInsertionOrdersStatusGetByAdAccount(adAccountId, bookmark, pageSize).block();

        // then
        // TODO implement the ssioInsertionOrdersStatusGetByAdAccountTest()
    }

    
    /**
     * Get insertion order status by pin order id.
     *
     *   Get insertion order status for &#x60;pin_order_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     */
    @Test
    @Disabled("Not Implemented")
    public void ssioInsertionOrdersStatusGetByPinOrderIdTest() {
        // given
        String adAccountId = "example";
        String pinOrderId = "example";

        // when
        SSIOInsertionOrderStatusResponse body = api.ssioInsertionOrdersStatusGetByPinOrderId(adAccountId, pinOrderId).block();

        // then
        // TODO implement the ssioInsertionOrdersStatusGetByPinOrderIdTest()
    }

    
    /**
     * Get Salesforce order lines by ad account id.
     *
     *   Get Salesforce order lines for account id &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     */
    @Test
    @Disabled("Not Implemented")
    public void ssioOrderLinesGetByAdAccountTest() {
        // given
        String adAccountId = "example";
        String pinOrderId = "example";
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        SsioOrderLinesGetByAdAccount200Response body = api.ssioOrderLinesGetByAdAccount(adAccountId, pinOrderId, bookmark, pageSize).block();

        // then
        // TODO implement the ssioOrderLinesGetByAdAccountTest()
    }

    
}
