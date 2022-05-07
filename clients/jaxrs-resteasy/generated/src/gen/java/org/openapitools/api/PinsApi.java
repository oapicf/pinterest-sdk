package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.PinsApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AnalyticsMetricsResponse;
import java.util.Date;
import org.openapitools.model.Error;
import org.openapitools.model.Pin;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-07T06:42:17.586199Z[Etc/UTC]")
public class PinsApi  {

    @Inject PinsApiService service;

    @GET
    @Path("/{pin_id}/analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Pin analytics", notes = "Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.", response = AnalyticsMetricsResponse.class, responseContainer = "Map", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read", description = "See your public Pins")
        })
    }, tags={ "pins", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = AnalyticsMetricsResponse.class, responseContainer = "Map"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to access board or Pin.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Pin not found.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response pinsAnalytics( @PathParam("pin_id") String pinId, @NotNull @QueryParam("start_date") Date startDate, @NotNull @QueryParam("end_date") Date endDate, @NotNull @QueryParam("metric_types") List<String> metricTypes,, allowableValues="ALL, MOBILE, TABLET, WEB" @DefaultValue("ALL") @QueryParam("app_types") String appTypes,, allowableValues="NO_SPLIT, APP_TYPE" @DefaultValue("NO_SPLIT") @QueryParam("split_field") String splitField, @Pattern(regexp="^\\d+$") @QueryParam("ad_account_id") String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pinsAnalytics(pinId,startDate,endDate,metricTypes,appTypes,splitField,adAccountId,securityContext);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create Pin", notes = "Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/solutions/content-apps'>Content App Solutions Guide</a>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.", response = Pin.class, authorizations = {
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
    public Response pinsCreate(@ApiParam(value = "Create a new Pin." ,required=true) @NotNull @Valid Pin pin,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pinsCreate(pin,securityContext);
    }
    @DELETE
    @Path("/{pin_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete Pin", notes = "Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.", response = Void.class, authorizations = {
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
    public Response pinsDelete( @PathParam("pin_id") String pinId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pinsDelete(pinId,securityContext);
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
    public Response pinsGet( @PathParam("pin_id") String pinId, @Pattern(regexp="^\\d+$") @QueryParam("ad_account_id") String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.pinsGet(pinId,adAccountId,securityContext);
    }
}
