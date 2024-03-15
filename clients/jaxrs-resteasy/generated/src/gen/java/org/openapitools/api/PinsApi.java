package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.PinsApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.util.Date;
import org.openapitools.model.Error;
import java.util.Map;
import org.openapitools.model.Pin;
import org.openapitools.model.PinAnalyticsMetricsResponse;
import org.openapitools.model.PinCreate;
import org.openapitools.model.PinUpdate;
import org.openapitools.model.PinsAnalyticsMetricTypesParameterInner;
import org.openapitools.model.PinsList200Response;
import org.openapitools.model.PinsSaveRequest;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/pins")


@io.swagger.annotations.Api(description = "the pins API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PinsApi  {

    @Inject PinsApiService service;

    @GET
    @Path("/{pin_id}/analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Pin analytics", notes = "Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", response = PinAnalyticsMetricsResponse.class, responseContainer = "Map", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read", description = "See your public Pins")
        })
    }, tags={ "pins", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = PinAnalyticsMetricsResponse.class, responseContainer = "Map"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid pins analytics parameters.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to access board or Pin.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pin not found.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response pinsAnalytics( @PathParam("pin_id") String pinId, @NotNull @QueryParam("start_date") Date startDate, @NotNull @QueryParam("end_date") Date endDate, @NotNull @QueryParam("metric_types") List<PinsAnalyticsMetricTypesParameterInner> metricTypes,, allowableValues="ALL, MOBILE, TABLET, WEB" @DefaultValue("ALL") @QueryParam("app_types") String appTypes,, allowableValues="NO_SPLIT, APP_TYPE" @DefaultValue("NO_SPLIT") @QueryParam("split_field") String splitField, @Pattern(regexp="^\\d+$") @Size(max=18) @QueryParam("ad_account_id") String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pinsAnalytics(pinId,startDate,endDate,metricTypes,appTypes,splitField,adAccountId,securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create Pin", notes = "Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/content/content-creation/'>Content App Solutions Guide</a>.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.", response = Pin.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "boards:write", description = "Create, update, or delete your public boards"),
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @io.swagger.annotations.AuthorizationScope(scope = "pins:write", description = "Create, update, or delete your public Pins")
        })
    }, tags={ "pins", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successful pin creation.", response = Pin.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid Pin parameters response", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The Pin's image is too small, too large or is broken", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Board or section not found", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response pinsCreate(@ApiParam(value = "Create a new Pin." ,required=true) @NotNull @Valid PinCreate pinCreate, @Pattern(regexp="^\\d+$") @Size(max=18) @QueryParam("ad_account_id") String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pinsCreate(pinCreate,adAccountId,securityContext);
    }
    @DELETE
    @Path("/{pin_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete Pin", notes = "Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "boards:write", description = "Create, update, or delete your public boards"),
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @io.swagger.annotations.AuthorizationScope(scope = "pins:write", description = "Create, update, or delete your public Pins")
        })
    }, tags={ "pins", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Successfully deleted Pin", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to access board or Pin.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pin not found.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response pinsDelete( @PathParam("pin_id") String pinId, @Pattern(regexp="^\\d+$") @Size(max=18) @QueryParam("ad_account_id") String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pinsDelete(pinId,adAccountId,securityContext);
    }
    @GET
    @Path("/{pin_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Pin", notes = "Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.", response = Pin.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read", description = "See your public Pins")
        })
    }, tags={ "pins", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = Pin.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to access board or Pin.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pin not found.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response pinsGet( @PathParam("pin_id") String pinId, @DefaultValue("false") @QueryParam("pin_metrics") Boolean pinMetrics, @Pattern(regexp="^\\d+$") @Size(max=18) @QueryParam("ad_account_id") String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pinsGet(pinId,pinMetrics,adAccountId,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List Pins", notes = "Get a list of the Pins owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".", response = PinsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read", description = "See your public Pins")
        })
    }, tags={ "pins", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = PinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid pin filter value", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response pinsList( @QueryParam("bookmark") String bookmark, @Min(1) @Max(250) @DefaultValue("25") @QueryParam("page_size") Integer pageSize,, allowableValues="exclude_native, exclude_repins, has_been_promoted" @QueryParam("pin_filter") String pinFilter, @DefaultValue("false") @QueryParam("include_protected_pins") Boolean includeProtectedPins,, allowableValues="PRIVATE" @QueryParam("pin_type") String pinType, @QueryParam("creative_types") List<String> creativeTypes, @Pattern(regexp="^\\d+$") @Size(max=18) @QueryParam("ad_account_id") String adAccountId, @DefaultValue("false") @QueryParam("pin_metrics") Boolean pinMetrics,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pinsList(bookmark,pageSize,pinFilter,includeProtectedPins,pinType,creativeTypes,adAccountId,pinMetrics,securityContext);
    }
    @POST
    @Path("/{pin_id}/save")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Save Pin", notes = "Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.", response = Pin.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "boards:write", description = "Create, update, or delete your public boards"),
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @io.swagger.annotations.AuthorizationScope(scope = "pins:write", description = "Create, update, or delete your public Pins")
        })
    }, tags={ "pins", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Successfully saved pin.", response = Pin.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to access Board or Pin.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Board or Pin not found.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response pinsSave( @PathParam("pin_id") String pinId,@ApiParam(value = "Request object used to save an existing pin" ,required=true) @NotNull @Valid PinsSaveRequest pinsSaveRequest, @Pattern(regexp="^\\d+$") @Size(max=18) @QueryParam("ad_account_id") String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pinsSave(pinId,pinsSaveRequest,adAccountId,securityContext);
    }
    @PATCH
    @Path("/{pin_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update Pin", notes = "Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>", response = Pin.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "boards:write", description = "Create, update, or delete your public boards"),
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @io.swagger.annotations.AuthorizationScope(scope = "pins:write", description = "Create, update, or delete your public Pins")
        })
    }, tags={ "pins", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = Pin.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to update Pin.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pin not found.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response pinsUpdate( @PathParam("pin_id") String pinId,@ApiParam(value = "" ,required=true) @NotNull @Valid PinUpdate pinUpdate, @Pattern(regexp="^\\d+$") @Size(max=18) @QueryParam("ad_account_id") String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pinsUpdate(pinId,pinUpdate,adAccountId,securityContext);
    }
}
