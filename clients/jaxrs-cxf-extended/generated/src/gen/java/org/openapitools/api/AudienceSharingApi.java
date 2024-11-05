package org.openapitools.api;

import org.openapitools.model.AdAccountsAudiencesSharedAccountsList200Response;
import org.openapitools.model.AudienceAccountType;
import org.openapitools.model.AudiencesList200Response;
import org.openapitools.model.BusinessSharedAudience;
import org.openapitools.model.BusinessSharedAudienceResponse;
import org.openapitools.model.Error;
import org.openapitools.model.SharedAudience;
import org.openapitools.model.SharedAudienceResponse;

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
@Path("")
@Api(value = "/", description = "")
public interface AudienceSharingApi  {

    /**
     * List accounts with access to an audience owned by an ad account
     *
     * List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
     *
     */
    @GET
    @Path("/ad_accounts/{ad_account_id}/audiences/shared/accounts")
    @Produces({ "application/json" })
    @ApiOperation(value = "List accounts with access to an audience owned by an ad account", tags={ "audience_sharing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdAccountsAudiencesSharedAccountsList200Response.class),
        @ApiResponse(code = 400, message = "Invalid ad account audiences shared accounts parameters.", response = Error.class),
        @ApiResponse(code = 404, message = "Shared accounts not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public AdAccountsAudiencesSharedAccountsList200Response adAccountsAudiencesSharedAccountsList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("audience_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String audienceId, @QueryParam("account_type") @NotNull @DefaultValue("AD_ACCOUNT") AudienceAccountType accountType, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25") Integer pageSize, @QueryParam("bookmark") String bookmark);

    /**
     * List accounts with access to an audience owned by a business
     *
     * List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
     *
     */
    @GET
    @Path("/businesses/{business_id}/audiences/shared/accounts")
    @Produces({ "application/json" })
    @ApiOperation(value = "List accounts with access to an audience owned by a business", tags={ "audience_sharing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdAccountsAudiencesSharedAccountsList200Response.class),
        @ApiResponse(code = 400, message = "Invalid business audiences shared accounts parameters.", response = Error.class),
        @ApiResponse(code = 404, message = "Shared accounts not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public AdAccountsAudiencesSharedAccountsList200Response businessAccountAudiencesSharedAccountsList(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) String businessId, @QueryParam("audience_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String audienceId, @QueryParam("account_type") @NotNull @DefaultValue("AD_ACCOUNT") AudienceAccountType accountType, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25") Integer pageSize, @QueryParam("bookmark") String bookmark);

    /**
     * List received audiences for a business
     *
     * Get a list of received audiences for the given business.
     *
     */
    @GET
    @Path("/businesses/{business_id}/audiences")
    @Produces({ "application/json" })
    @ApiOperation(value = "List received audiences for a business", tags={ "audience_sharing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AudiencesList200Response.class),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public AudiencesList200Response sharedAudiencesForBusinessList(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) String businessId, @QueryParam("bookmark") String bookmark, @QueryParam("order") String order, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25") Integer pageSize);

    /**
     * Update audience sharing between ad accounts
     *
     * From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/create-and-manage-accounts&#39;&gt;Pinterest Business Hierarchy&lt;/a&gt; as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
     *
     */
    @PATCH
    @Path("/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update audience sharing between ad accounts", tags={ "audience_sharing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = SharedAudienceResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad account id.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public SharedAudienceResponse updateAdAccountToAdAccountSharedAudience(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid SharedAudience sharedAudience);

    /**
     * Update audience sharing from an ad account to businesses
     *
     * From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
     *
     */
    @PATCH
    @Path("/ad_accounts/{ad_account_id}/audiences/businesses/shared")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update audience sharing from an ad account to businesses", tags={ "audience_sharing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BusinessSharedAudienceResponse.class),
        @ApiResponse(code = 400, message = "Invalid ad account id.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public BusinessSharedAudienceResponse updateAdAccountToBusinessSharedAudience(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid BusinessSharedAudience businessSharedAudience);

    /**
     * Update audience sharing from a business to ad accounts
     *
     * From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. &lt;ul&gt; &lt;li&gt;If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.&lt;/li&gt; &lt;li&gt;If the business is the recipient of the audience, it can share with any of its owned ad accounts.&lt;/li&gt; &lt;/ul&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
     *
     */
    @PATCH
    @Path("/businesses/{business_id}/audiences/ad_accounts/shared")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update audience sharing from a business to ad accounts", tags={ "audience_sharing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = SharedAudienceResponse.class),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public SharedAudienceResponse updateBusinessToAdAccountSharedAudience(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) String businessId, @Valid SharedAudience sharedAudience);

    /**
     * Update audience sharing between businesses
     *
     * From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
     *
     */
    @PATCH
    @Path("/businesses/{business_id}/audiences/businesses/shared")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update audience sharing between businesses", tags={ "audience_sharing" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BusinessSharedAudienceResponse.class),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public BusinessSharedAudienceResponse updateBusinessToBusinessSharedAudience(@PathParam("business_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) String businessId, @Valid BusinessSharedAudience businessSharedAudience);
}
