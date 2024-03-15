package org.openapitools.api;

import org.openapitools.model.Error;
import org.joda.time.LocalDate;
import java.util.Map;
import org.openapitools.model.Pin;
import org.openapitools.model.PinAnalyticsMetricsResponse;
import org.openapitools.model.PinCreate;
import org.openapitools.model.PinUpdate;
import org.openapitools.model.PinsAnalyticsMetricTypesParameterInner;
import org.openapitools.model.PinsList200Response;
import org.openapitools.model.PinsSaveRequest;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/pins")
@Api(description = "the pins API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PinsApi {

    @GET
    @Path("/{pin_id}/analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Pin analytics", notes = "Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", response = PinAnalyticsMetricsResponse.class, responseContainer = "Map", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins") })
         }, tags={ "pins" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = PinAnalyticsMetricsResponse.class, responseContainer = "Map"),
        @ApiResponse(code = 400, message = "Invalid pins analytics parameters.", response = Error.class),
        @ApiResponse(code = 403, message = "Not authorized to access board or Pin.", response = Error.class),
        @ApiResponse(code = 404, message = "Pin not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response pinsAnalytics(@PathParam("pin_id") @ApiParam("Unique identifier of a Pin.") String pinId,@QueryParam("start_date") @NotNull  @ApiParam("Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.")  LocalDate startDate,@QueryParam("end_date") @NotNull  @ApiParam("Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.")  LocalDate endDate,@QueryParam("metric_types") @NotNull  @ApiParam("Pin metric types to get data for, default is all.")  List<PinsAnalyticsMetricTypesParameterInner> metricTypes,@QueryParam("app_types") @DefaultValue("ALL")  @ApiParam("Apps or devices to get data for, default is all.")  String appTypes,@QueryParam("split_field") @DefaultValue("NO_SPLIT")  @ApiParam("How to split the data into groups. Not including this param means data won&#39;t be split.")  String splitField,@QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18)  @ApiParam("Unique identifier of an ad account.")  String adAccountId) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create Pin", notes = "Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/content/content-creation/'>Content App Solutions Guide</a>.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.", response = Pin.class, authorizations = {
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response pinsCreate(@Valid PinCreate pinCreate,@QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18)  @ApiParam("Unique identifier of an ad account.")  String adAccountId) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{pin_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete Pin", notes = "Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.", response = Void.class, authorizations = {
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response pinsDelete(@PathParam("pin_id") @ApiParam("Unique identifier of a Pin.") String pinId,@QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18)  @ApiParam("Unique identifier of an ad account.")  String adAccountId) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response pinsGet(@PathParam("pin_id") @ApiParam("Unique identifier of a Pin.") String pinId,@QueryParam("pin_metrics") @DefaultValue("false")  @ApiParam("Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.")  Boolean pinMetrics,@QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18)  @ApiParam("Unique identifier of an ad account.")  String adAccountId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "List Pins", notes = "Get a list of the Pins owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".", response = PinsList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins") })
         }, tags={ "pins" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = PinsList200Response.class),
        @ApiResponse(code = 400, message = "Invalid pin filter value", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response pinsList(@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize,@QueryParam("pin_filter")  @ApiParam("Pin filter.")  String pinFilter,@QueryParam("include_protected_pins") @DefaultValue("false")  @ApiParam("Specify if return pins from protected boards")  Boolean includeProtectedPins,@QueryParam("pin_type")  @ApiParam("The type of pins to return, currently only enabled for private pins")  String pinType,@QueryParam("creative_types")  @ApiParam("Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.")  List<String> creativeTypes,@QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18)  @ApiParam("Unique identifier of an ad account.")  String adAccountId,@QueryParam("pin_metrics") @DefaultValue("false")  @ApiParam("Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.")  Boolean pinMetrics) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/{pin_id}/save")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Save Pin", notes = "Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.", response = Pin.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "boards:write", description = "Create, update, or delete your public boards"),
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @AuthorizationScope(scope = "pins:write", description = "Create, update, or delete your public Pins") })
         }, tags={ "pins" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successfully saved pin.", response = Pin.class),
        @ApiResponse(code = 403, message = "Not authorized to access Board or Pin.", response = Error.class),
        @ApiResponse(code = 404, message = "Board or Pin not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response pinsSave(@PathParam("pin_id") @ApiParam("Unique identifier of a Pin.") String pinId,@Valid @NotNull PinsSaveRequest pinsSaveRequest,@QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18)  @ApiParam("Unique identifier of an ad account.")  String adAccountId) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{pin_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update Pin", notes = "Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>", response = Pin.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @AuthorizationScope(scope = "boards:write", description = "Create, update, or delete your public boards"),
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @AuthorizationScope(scope = "pins:write", description = "Create, update, or delete your public Pins") })
         }, tags={ "pins" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = Pin.class),
        @ApiResponse(code = 403, message = "Not authorized to update Pin.", response = Error.class),
        @ApiResponse(code = 404, message = "Pin not found.", response = Error.class),
        @ApiResponse(code = 429, message = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response pinsUpdate(@PathParam("pin_id") @ApiParam("Unique identifier of a Pin.") String pinId,@Valid PinUpdate pinUpdate,@QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18)  @ApiParam("Unique identifier of an ad account.")  String adAccountId) {
        return Response.ok().entity("magic!").build();
    }
}
