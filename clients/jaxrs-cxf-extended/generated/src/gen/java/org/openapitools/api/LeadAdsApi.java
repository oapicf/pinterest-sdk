package org.openapitools.api;

import org.openapitools.model.AdAccountCreateSubscriptionRequest;
import org.openapitools.model.AdAccountCreateSubscriptionResponse;
import org.openapitools.model.AdAccountGetSubscriptionResponse;
import org.openapitools.model.AdAccountsSubscriptionsGetList200Response;
import org.openapitools.model.Error;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
@Path("/ad_accounts/{ad_account_id}/leads/subscriptions")
@Api(value = "/", description = "")
public interface LeadAdsApi  {

    /**
     * Delete lead ads subscription
     *
     * Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     *
     */
    @DELETE
    @Path("/{subscription_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete lead ads subscription", tags={ "lead_ads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Subscription deleted successfully"),
        @ApiResponse(code = 400, message = "Invalid input parameters.", response = Error.class),
        @ApiResponse(code = 403, message = "You are not authorized to delete this subscription.", response = Error.class),
        @ApiResponse(code = 404, message = "Subscription not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public void adAccountsSubscriptionsDelById(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @PathParam("subscription_id") @Pattern(regexp="^\\d+$") String subscriptionId);

    /**
     * Get lead ads subscription
     *
     * Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     *
     */
    @GET
    @Path("/{subscription_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get lead ads subscription", tags={ "lead_ads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdAccountGetSubscriptionResponse.class),
        @ApiResponse(code = 400, message = "Invalid input parameters.", response = Error.class),
        @ApiResponse(code = 403, message = "Can't access this subscription.", response = Error.class),
        @ApiResponse(code = 404, message = "Subscription not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public AdAccountGetSubscriptionResponse adAccountsSubscriptionsGetById(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @PathParam("subscription_id") @Pattern(regexp="^\\d+$") String subscriptionId);

    /**
     * Get lead ads subscriptions
     *
     * Get the advertiser&#39;s list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get lead ads subscriptions", tags={ "lead_ads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdAccountsSubscriptionsGetList200Response.class),
        @ApiResponse(code = 403, message = "Can't access this subscription.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public AdAccountsSubscriptionsGetList200Response adAccountsSubscriptionsGetList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25") Integer pageSize, @QueryParam("bookmark") String bookmark);

    /**
     * Create lead ads subscription
     *
     * Create a lead ads webhook subscription. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create lead ads subscription", tags={ "lead_ads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdAccountCreateSubscriptionResponse.class),
        @ApiResponse(code = 400, message = "Invalid input parameters.", response = Error.class),
        @ApiResponse(code = 403, message = "Can't access this subscription.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public AdAccountCreateSubscriptionResponse adAccountsSubscriptionsPost(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid AdAccountCreateSubscriptionRequest adAccountCreateSubscriptionRequest);
}
