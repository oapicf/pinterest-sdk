package org.openapitools.api.impl;

import org.openapitools.api.*;
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

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
public class BillingApiServiceImpl implements BillingApi {
    /**
     * Redeem ad credits
     *
     * Redeem ads credit on behalf of the ad account id and apply it towards billing.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     *
     */
    @Override
    public AdsCreditRedeemResponse adsCreditRedeem(String adAccountId, AdsCreditRedeemRequest adsCreditRedeemRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get ads credit discounts
     *
     * Returns the list of discounts applied to the account.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     *
     */
    @Override
    public AdsCreditsDiscountsGet200Response adsCreditsDiscountsGet(String adAccountId, String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get billing profiles
     *
     * Get billing profiles in the advertiser account.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     *
     */
    @Override
    public BillingProfilesGet200Response billingProfilesGet(String adAccountId, Boolean isActive, String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get Salesforce account details including bill-to information.
     *
     * Get Salesforce account details including bill-to information to be used in insertion orders process for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     *
     */
    @Override
    public SSIOAccountResponse ssioAccountsGet(String adAccountId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Create insertion order through SSIO.
     *
     * Create insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     *
     */
    @Override
    public SSIOCreateInsertionOrderResponse ssioInsertionOrderCreate(String adAccountId, SSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Edit insertion order through SSIO.
     *
     * Edit insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     *
     */
    @Override
    public SSIOEditInsertionOrderResponse ssioInsertionOrderEdit(String adAccountId, SSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get insertion order status by ad account id.
     *
     * Get insertion order status for account id &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     *
     */
    @Override
    public SsioInsertionOrdersStatusGetByAdAccount200Response ssioInsertionOrdersStatusGetByAdAccount(String adAccountId, String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get insertion order status by pin order id.
     *
     * Get insertion order status for pin order id &lt;code&gt;pin_order_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     *
     */
    @Override
    public SSIOInsertionOrderStatusResponse ssioInsertionOrdersStatusGetByPinOrderId(String adAccountId, String pinOrderId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get Salesforce order lines by ad account id.
     *
     * Get Salesforce order lines for account id &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     *
     */
    @Override
    public SsioOrderLinesGetByAdAccount200Response ssioOrderLinesGetByAdAccount(String adAccountId, String bookmark, Integer pageSize, String pinOrderId) {
        // TODO: Implement...
        return null;
    }

}
