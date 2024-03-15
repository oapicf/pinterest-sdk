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

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
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
     * Redeem ads credit on behalf of the ad account id and apply it towards billing.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     *
     */
    @POST
    @Path("/ads_credit/redeem")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Redeem ad credits", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully redeemed ad credits.", response = AdsCreditRedeemResponse.class),
        @ApiResponse(code = 400, message = "Error thrown when unable to redeem offer code.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public AdsCreditRedeemResponse adsCreditRedeem(@PathParam("ad_account_id") String adAccountId, AdsCreditRedeemRequest adsCreditRedeemRequest);

    /**
     * Get ads credit discounts
     *
     * Returns the list of discounts applied to the account.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     *
     */
    @GET
    @Path("/ads_credit/discounts")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ads credit discounts", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdsCreditsDiscountsGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public AdsCreditsDiscountsGet200Response adsCreditsDiscountsGet(@PathParam("ad_account_id") String adAccountId, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @DefaultValue("25")Integer pageSize);

    /**
     * Get billing profiles
     *
     * Get billing profiles in the advertiser account.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     *
     */
    @GET
    @Path("/billing_profiles")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get billing profiles", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BillingProfilesGet200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public BillingProfilesGet200Response billingProfilesGet(@PathParam("ad_account_id") String adAccountId, @QueryParam("is_active") Boolean isActive, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @DefaultValue("25")Integer pageSize);

    /**
     * Get Salesforce account details including bill-to information.
     *
     * Get Salesforce account details including bill-to information to be used in insertion orders process for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     *
     */
    @GET
    @Path("/ssio/accounts")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Salesforce account details including bill-to information.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = SSIOAccountResponse.class),
        @ApiResponse(code = 400, message = "Invalid request parameter.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public SSIOAccountResponse ssioAccountsGet(@PathParam("ad_account_id") String adAccountId);

    /**
     * Create insertion order through SSIO.
     *
     * Create insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     *
     */
    @POST
    @Path("/ssio/insertion_orders")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create insertion order through SSIO.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = SSIOCreateInsertionOrderResponse.class),
        @ApiResponse(code = 400, message = "Invalid request.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public SSIOCreateInsertionOrderResponse ssioInsertionOrderCreate(@PathParam("ad_account_id") String adAccountId, SSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest);

    /**
     * Edit insertion order through SSIO.
     *
     * Edit insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     *
     */
    @PATCH
    @Path("/ssio/insertion_orders")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Edit insertion order through SSIO.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = SSIOEditInsertionOrderResponse.class),
        @ApiResponse(code = 400, message = "Invalid request.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public SSIOEditInsertionOrderResponse ssioInsertionOrderEdit(@PathParam("ad_account_id") String adAccountId, SSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest);

    /**
     * Get insertion order status by ad account id.
     *
     * Get insertion order status for account id &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     *
     */
    @GET
    @Path("/ssio/insertion_orders/status")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get insertion order status by ad account id.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = SsioInsertionOrdersStatusGetByAdAccount200Response.class),
        @ApiResponse(code = 400, message = "Invalid request parameter.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public SsioInsertionOrdersStatusGetByAdAccount200Response ssioInsertionOrdersStatusGetByAdAccount(@PathParam("ad_account_id") String adAccountId, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @DefaultValue("25")Integer pageSize);

    /**
     * Get insertion order status by pin order id.
     *
     * Get insertion order status for pin order id &lt;code&gt;pin_order_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     *
     */
    @GET
    @Path("/ssio/insertion_orders/{pin_order_id}/status")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get insertion order status by pin order id.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = SSIOInsertionOrderStatusResponse.class),
        @ApiResponse(code = 400, message = "Invalid request parameter.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public SSIOInsertionOrderStatusResponse ssioInsertionOrdersStatusGetByPinOrderId(@PathParam("ad_account_id") String adAccountId, @PathParam("pin_order_id") String pinOrderId);

    /**
     * Get Salesforce order lines by ad account id.
     *
     * Get Salesforce order lines for account id &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.
     *
     */
    @GET
    @Path("/ssio/order_lines")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Salesforce order lines by ad account id.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = SsioOrderLinesGetByAdAccount200Response.class),
        @ApiResponse(code = 400, message = "Invalid request parameter.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public SsioOrderLinesGetByAdAccount200Response ssioOrderLinesGetByAdAccount(@PathParam("ad_account_id") String adAccountId, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @DefaultValue("25")Integer pageSize, @QueryParam("pin_order_id") String pinOrderId);
}
