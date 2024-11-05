package org.openapitools.api;

import org.openapitools.model.AdsCreditRedeemRequest;
import org.openapitools.model.AdsCreditRedeemResponse;
import org.openapitools.model.AdsCreditsDiscountsGet200Response;
import org.openapitools.model.BillingProfilesGet200Response;
import org.openapitools.model.Error;
import org.openapitools.model.SSIOAccountResponse;
import org.openapitools.model.SSIOCreateInsertionOrderRequest;
import org.openapitools.model.SSIOCreateInsertionOrderResponse;
import org.openapitools.model.SSIOEditInsertionOrderRequest;
import org.openapitools.model.SSIOEditInsertionOrderResponse;
import org.openapitools.model.SSIOInsertionOrderStatusResponse;
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
     * Redeem ads credit on behalf of the ad account id and apply it towards billing.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     */
    @Test
    @Disabled("Not Implemented")
    public void adsCreditRedeemTest() {
        // given
        String adAccountId = "example";
        AdsCreditRedeemRequest adsCreditRedeemRequest = new AdsCreditRedeemRequest("138e9e0ff7e38cf511b880975eb574c09aa9d5e1657590ab0431040da68caa67", true);

        // when
        AdsCreditRedeemResponse body = api.adsCreditRedeem(adAccountId, adsCreditRedeemRequest).block();

        // then
        // TODO implement the adsCreditRedeemTest()
    }

    
    /**
     * Get ads credit discounts
     *
     * Returns the list of discounts applied to the account.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
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
     * Get billing profiles
     *
     * Get billing profiles in the advertiser account.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     */
    @Test
    @Disabled("Not Implemented")
    public void billingProfilesGetTest() {
        // given
        String adAccountId = "example";
        Boolean isActive = false;
        String bookmark = "example";
        Integer pageSize = 25;

        // when
        BillingProfilesGet200Response body = api.billingProfilesGet(adAccountId, isActive, bookmark, pageSize).block();

        // then
        // TODO implement the billingProfilesGetTest()
    }

    
    /**
     * Get Salesforce account details including bill-to information.
     *
     * Get Salesforce account details including bill-to information to be used in insertion orders process for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     */
    @Test
    @Disabled("Not Implemented")
    public void ssioAccountsGetTest() {
        // given
        String adAccountId = "example";

        // when
        SSIOAccountResponse body = api.ssioAccountsGet(adAccountId).block();

        // then
        // TODO implement the ssioAccountsGetTest()
    }

    
    /**
     * Create insertion order through SSIO.
     *
     * Create insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     */
    @Test
    @Disabled("Not Implemented")
    public void ssioInsertionOrderCreateTest() {
        // given
        String adAccountId = "example";
        SSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest = new SSIOCreateInsertionOrderRequest();

        // when
        SSIOCreateInsertionOrderResponse body = api.ssioInsertionOrderCreate(adAccountId, ssIOCreateInsertionOrderRequest).block();

        // then
        // TODO implement the ssioInsertionOrderCreateTest()
    }

    
    /**
     * Edit insertion order through SSIO.
     *
     * Edit insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     */
    @Test
    @Disabled("Not Implemented")
    public void ssioInsertionOrderEditTest() {
        // given
        String adAccountId = "example";
        SSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest = new SSIOEditInsertionOrderRequest();

        // when
        SSIOEditInsertionOrderResponse body = api.ssioInsertionOrderEdit(adAccountId, ssIOEditInsertionOrderRequest).block();

        // then
        // TODO implement the ssioInsertionOrderEditTest()
    }

    
    /**
     * Get insertion order status by ad account id.
     *
     * Get insertion order status for account id &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
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
     * Get insertion order status for pin order id &lt;code&gt;pin_order_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     */
    @Test
    @Disabled("Not Implemented")
    public void ssioInsertionOrdersStatusGetByPinOrderIdTest() {
        // given
        String adAccountId = "example";
        String pinOrderId = "0Q01N0000015hekSVDFDC";

        // when
        SSIOInsertionOrderStatusResponse body = api.ssioInsertionOrdersStatusGetByPinOrderId(adAccountId, pinOrderId).block();

        // then
        // TODO implement the ssioInsertionOrdersStatusGetByPinOrderIdTest()
    }

    
    /**
     * Get Salesforce order lines by ad account id.
     *
     * Get Salesforce order lines for account id &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     */
    @Test
    @Disabled("Not Implemented")
    public void ssioOrderLinesGetByAdAccountTest() {
        // given
        String adAccountId = "example";
        String bookmark = "example";
        Integer pageSize = 25;
        String pinOrderId = "0Q01N0000015hekSVDFDC";

        // when
        SsioOrderLinesGetByAdAccount200Response body = api.ssioOrderLinesGetByAdAccount(adAccountId, bookmark, pageSize, pinOrderId).block();

        // then
        // TODO implement the ssioOrderLinesGetByAdAccountTest()
    }

    
}
