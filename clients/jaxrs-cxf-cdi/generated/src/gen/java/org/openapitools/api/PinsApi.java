package org.openapitools.api;

import org.openapitools.model.AnalyticsMetricsResponse;
import org.openapitools.model.Error;
import org.joda.time.LocalDate;
import org.openapitools.model.Pin;
import org.openapitools.api.PinsApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.PATCH;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/pins")
@RequestScoped

@Api(description = "the pins API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-05-08T00:33:08.337307Z[Etc/UTC]")

public class PinsApi  {

  @Context SecurityContext securityContext;

  @Inject PinsApiService delegate;


    @GET
    @Path("/{pin_id}/analytics")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Pin analytics", notes = "Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.", response = AnalyticsMetricsResponse.class, responseContainer = "Map", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins") })
         }, tags={ "pins" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = AnalyticsMetricsResponse.class, responseContainer = "Map"),
        @ApiResponse(code = 403, message = "Not authorized to access board or Pin.", response = Error.class),
        @ApiResponse(code = 404, message = "Pin not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response pinsAnalytics(@ApiParam(value = "Unique identifier of a Pin.",required=true) @PathParam("pin_id") String pinId,  @NotNull @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD",required=true)  @QueryParam("start_date") LocalDate startDate,  @NotNull @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD",required=true)  @QueryParam("end_date") LocalDate endDate,  @NotNull @ApiParam(value = "Pin metric types to get data for, default is all.",required=true)  @QueryParam("metric_types") List<String> metricTypes, @ApiParam(value = "Apps or devices to get data for, default is all.", allowableValues="ALL, MOBILE, TABLET, WEB", defaultValue="ALL") @DefaultValue("ALL")  @QueryParam("app_types") String appTypes, @ApiParam(value = "How to split the data into groups. Not including this param means data won't be split.", allowableValues="NO_SPLIT, APP_TYPE", defaultValue="NO_SPLIT") @DefaultValue("NO_SPLIT")  @QueryParam("split_field") String splitField,  @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of an ad account.")  @QueryParam("ad_account_id") String adAccountId) {
        return delegate.pinsAnalytics(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId, securityContext);
    }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create Pin", notes = "Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/solutions/content-apps'>Content App Solutions Guide</a>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.", response = Pin.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "boards:write", description = "Create, update, or delete your public boards"),
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @AuthorizationScope(scope = "pins:write", description = "Create, update, or delete your public Pins") })
         }, tags={ "pins" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful pin creation.", response = Pin.class),
        @ApiResponse(code = 400, message = "Invalid Pin parameters response", response = Error.class),
        @ApiResponse(code = 403, message = "The Pin's image is too small, too large or is broken", response = Error.class),
        @ApiResponse(code = 404, message = "Board or section not found", response = Error.class),
        @ApiResponse(code = 429, message = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response pinsCreate(@ApiParam(value = "Create a new Pin." ,required=true) Pin pin) {
        return delegate.pinsCreate(pin, securityContext);
    }

    @DELETE
    @Path("/{pin_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete Pin", notes = "Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.", response = Void.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "boards:write", description = "Create, update, or delete your public boards"),
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @AuthorizationScope(scope = "pins:write", description = "Create, update, or delete your public Pins") })
         }, tags={ "pins" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully deleted Pin", response = Void.class),
        @ApiResponse(code = 403, message = "Not authorized to access board or Pin.", response = Error.class),
        @ApiResponse(code = 404, message = "Pin not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response pinsDelete(@ApiParam(value = "Unique identifier of a Pin.",required=true) @PathParam("pin_id") String pinId) {
        return delegate.pinsDelete(pinId, securityContext);
    }

    @GET
    @Path("/{pin_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Pin", notes = "Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.", response = Pin.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins") })
         }, tags={ "pins" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = Pin.class),
        @ApiResponse(code = 403, message = "Not authorized to access board or Pin.", response = Error.class),
        @ApiResponse(code = 404, message = "Pin not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response pinsGet(@ApiParam(value = "Unique identifier of a Pin.",required=true) @PathParam("pin_id") String pinId,  @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of an ad account.")  @QueryParam("ad_account_id") String adAccountId) {
        return delegate.pinsGet(pinId, adAccountId, securityContext);
    }
}
