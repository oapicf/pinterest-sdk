package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AdsCreditRedeem;
import org.openapitools.model.AdsCreditRedeemCreate;
import org.openapitools.model.AdsCreditsDiscountsGet200Response;
import org.openapitools.model.BillingInvoiceDocumentType;
import org.openapitools.model.BillingInvoiceDownloadResponse;
import org.openapitools.model.BillingInvoiceSortField;
import org.openapitools.model.BillingInvoiceStatus;
import org.openapitools.model.BillingInvoicesGet200Response;
import org.openapitools.model.BillingProfilesGet200Response;
import org.joda.time.LocalDate;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibPaginationOrder;
import org.openapitools.model.SSIOAccount;
import org.openapitools.model.SSIOInsertionOrder;
import org.openapitools.model.SSIOInsertionOrderCreate;
import org.openapitools.model.SSIOInsertionOrderStatusResponse;
import org.openapitools.model.SSIOInsertionOrderUpdate;
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
     * Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
     *
     */
    @Override
    public AdsCreditRedeem adsCreditRedeem(String adAccountId, AdsCreditRedeemCreate adsCreditRedeemCreate) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get ads credit discounts
     *
     * Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
     *
     */
    @Override
    public AdsCreditsDiscountsGet200Response adsCreditsDiscountsGet(String adAccountId, String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get download url for a billing invoice
     *
     * Get download url for a billing invoice.
     *
     */
    @Override
    public BillingInvoiceDownloadResponse billingInvoiceDownloadGet(String adAccountId, String billingInvoiceId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get billing invoices
     *
     * Get billing invoices in the advertiser account.
     *
     */
    @Override
    public BillingInvoicesGet200Response billingInvoicesGet(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order, BillingInvoiceSortField sort, BillingInvoiceStatus status, BillingInvoiceDocumentType documentType, LocalDate startDueDate, LocalDate endDueDate) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get billing profiles
     *
     * Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
     *
     */
    @Override
    public BillingProfilesGet200Response billingProfilesGet(Boolean isActive, String adAccountId, String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get Salesforce account details including bill-to information.
     *
     *   Get Salesforce account details including bill-to information to be used in insertion orders process for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     *
     */
    @Override
    public SSIOAccount ssioAccountsGet(String adAccountId) {
        // TODO: Implement...
        return null;
    }

    /**
     * Create insertion order through SSIO.
     *
     *   Create insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     *
     */
    @Override
    public SSIOInsertionOrder ssioInsertionOrderCreate(String adAccountId, SSIOInsertionOrderCreate ssIOInsertionOrderCreate) {
        // TODO: Implement...
        return null;
    }

    /**
     * Edit insertion order through SSIO.
     *
     *   Edit insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     *
     */
    @Override
    public SSIOInsertionOrder ssioInsertionOrderEdit(String adAccountId, SSIOInsertionOrderUpdate ssIOInsertionOrderUpdate) {
        // TODO: Implement...
        return null;
    }

    /**
     * Get insertion order status by ad account id.
     *
     *   Get insertion order status for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
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
     *   Get insertion order status for &#x60;pin_order_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
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
     *   Get Salesforce order lines for account id &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     *
     */
    @Override
    public SsioOrderLinesGetByAdAccount200Response ssioOrderLinesGetByAdAccount(String adAccountId, String pinOrderId, String bookmark, Integer pageSize) {
        // TODO: Implement...
        return null;
    }

}
