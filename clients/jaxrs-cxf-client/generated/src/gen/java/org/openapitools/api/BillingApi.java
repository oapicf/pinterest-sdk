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

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
@Path("/ad_accounts/{ad_account_id}")
@Api(value = "/", description = "")
public interface BillingApi  {

    /**
     * Redeem ad credits
     *
     * Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
     *
     */
    @POST
    @Path("/ads_credit/redeem")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Redeem ad credits", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = AdsCreditRedeem.class),
        @ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = AdsCreditRedeem.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public AdsCreditRedeem adsCreditRedeem(@PathParam("ad_account_id") String adAccountId, AdsCreditRedeemCreate adsCreditRedeemCreate);

    /**
     * Get ads credit discounts
     *
     * Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
     *
     */
    @GET
    @Path("/ads_credit/discounts")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ads credit discounts", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = AdsCreditsDiscountsGet200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public AdsCreditsDiscountsGet200Response adsCreditsDiscountsGet(@PathParam("ad_account_id") String adAccountId, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @DefaultValue("25")Integer pageSize);

    /**
     * Get download url for a billing invoice
     *
     * Get download url for a billing invoice.
     *
     */
    @GET
    @Path("/billing_invoice/{billing_invoice_id}/download")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get download url for a billing invoice", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = BillingInvoiceDownloadResponse.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public BillingInvoiceDownloadResponse billingInvoiceDownloadGet(@PathParam("ad_account_id") String adAccountId, @PathParam("billing_invoice_id") String billingInvoiceId);

    /**
     * Get billing invoices
     *
     * Get billing invoices in the advertiser account.
     *
     */
    @GET
    @Path("/billing_invoices")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get billing invoices", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = BillingInvoicesGet200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public BillingInvoicesGet200Response billingInvoicesGet(@PathParam("ad_account_id") String adAccountId, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @DefaultValue("25")Integer pageSize, @QueryParam("order") PinterestLibPaginationOrder order, @QueryParam("sort") @DefaultValue("DUE_DATE")BillingInvoiceSortField sort, @QueryParam("status") BillingInvoiceStatus status, @QueryParam("document_type") BillingInvoiceDocumentType documentType, @QueryParam("start_due_date") LocalDate startDueDate, @QueryParam("end_due_date") LocalDate endDueDate);

    /**
     * Get billing profiles
     *
     * Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
     *
     */
    @GET
    @Path("/billing_profiles")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get billing profiles", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = BillingProfilesGet200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public BillingProfilesGet200Response billingProfilesGet(@QueryParam("is_active") Boolean isActive, @PathParam("ad_account_id") String adAccountId, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @DefaultValue("25")Integer pageSize);

    /**
     * Get Salesforce account details including bill-to information.
     *
     *   Get Salesforce account details including bill-to information to be used in insertion orders process for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     *
     */
    @GET
    @Path("/ssio/accounts")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Salesforce account details including bill-to information.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = SSIOAccount.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public SSIOAccount ssioAccountsGet(@PathParam("ad_account_id") String adAccountId);

    /**
     * Create insertion order through SSIO.
     *
     *   Create insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     *
     */
    @POST
    @Path("/ssio/insertion_orders")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create insertion order through SSIO.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = SSIOInsertionOrder.class),
        @ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = SSIOInsertionOrder.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public SSIOInsertionOrder ssioInsertionOrderCreate(@PathParam("ad_account_id") String adAccountId, SSIOInsertionOrderCreate ssIOInsertionOrderCreate);

    /**
     * Edit insertion order through SSIO.
     *
     *   Edit insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     *
     */
    @PATCH
    @Path("/ssio/insertion_orders")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Edit insertion order through SSIO.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = SSIOInsertionOrder.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public SSIOInsertionOrder ssioInsertionOrderEdit(@PathParam("ad_account_id") String adAccountId, SSIOInsertionOrderUpdate ssIOInsertionOrderUpdate);

    /**
     * Get insertion order status by ad account id.
     *
     *   Get insertion order status for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     *
     */
    @GET
    @Path("/ssio/insertion_orders/status")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get insertion order status by ad account id.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = SsioInsertionOrdersStatusGetByAdAccount200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public SsioInsertionOrdersStatusGetByAdAccount200Response ssioInsertionOrdersStatusGetByAdAccount(@PathParam("ad_account_id") String adAccountId, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @DefaultValue("25")Integer pageSize);

    /**
     * Get insertion order status by pin order id.
     *
     *   Get insertion order status for &#x60;pin_order_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     *
     */
    @GET
    @Path("/ssio/insertion_orders/{pin_order_id}/status")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get insertion order status by pin order id.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = SSIOInsertionOrderStatusResponse.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public SSIOInsertionOrderStatusResponse ssioInsertionOrdersStatusGetByPinOrderId(@PathParam("ad_account_id") String adAccountId, @PathParam("pin_order_id") String pinOrderId);

    /**
     * Get Salesforce order lines by ad account id.
     *
     *   Get Salesforce order lines for account id &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     *
     */
    @GET
    @Path("/ssio/order_lines")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Salesforce order lines by ad account id.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = SsioOrderLinesGetByAdAccount200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public SsioOrderLinesGetByAdAccount200Response ssioOrderLinesGetByAdAccount(@PathParam("ad_account_id") String adAccountId, @QueryParam("pin_order_id") String pinOrderId, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @DefaultValue("25")Integer pageSize);
}
