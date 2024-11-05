package org.openapitools.api;

import org.openapitools.model.AdAccountsCountryResponse;
import org.openapitools.model.BookClosedResponse;
import org.openapitools.model.DeliveryMetricsResponse;
import org.openapitools.model.Error;
import org.openapitools.model.SingleInterestTargetingOptionResponse;

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
@Path("/resources")
@Api(description = "the resources API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ResourcesApi {

    @GET
    @Path("/ad_account_countries")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get ad accounts countries", notes = "Get Ad Accounts countries", response = AdAccountsCountryResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "resources" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdAccountsCountryResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response adAccountCountriesGet() {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/delivery_metrics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get available metrics' definitions", notes = "Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See <a href='/docs/api-features/analytics-overview/'>Organic Analytics</a> and <a href='/docs/api-features/ads-reporting/'>Ads Analytics</a> for more information.", response = DeliveryMetricsResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc."),
            @AuthorizationScope(scope = "pins:read", description = "See your public Pins"),
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts and followers") })
         }, tags={ "resources" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = DeliveryMetricsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response deliveryMetricsGet(@QueryParam("report_type")  @ApiParam("Report type.")  String reportType) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/targeting/interests/{interest_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get interest details", notes = "<p>Get details of a specific interest given interest ID.</p> <p>Click <a href=\"https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875\" target=\"_blank\">here</a> for a spreadsheet listing interests and their IDs.</p>", response = SingleInterestTargetingOptionResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "resources" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = SingleInterestTargetingOptionResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response interestTargetingOptionsGet(@PathParam("interest_id") @Pattern(regexp="^\\d+$") @Size(max=18) @ApiParam("Unique identifier of an interest.") String interestId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/lead_form_questions")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get lead form questions", notes = "Get a list of all lead form question type names. Some questions might not be used.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>", response = Void.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "resources" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response leadFormQuestionsGet() {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/metrics_ready_state")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get metrics ready state", notes = "Learn whether conversion or non-conversion metrics are finalized and ready to query.", response = BookClosedResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "resources" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BookClosedResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response metricsReadyStateGet(@QueryParam("date") @NotNull @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  @ApiParam("Analytics reports request date (UTC). Format: YYYY-MM-DD")  String date) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/targeting/{targeting_type}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get targeting options", notes = "<p>You can use targeting values in ads placement to define your intended audience. </p> <p>Targeting metrics are organized around targeting specifications.</p> <p>For more information on ads targeting, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.</p> <p><b>Sample return:</b></p> <pre class=\"literal-block\"> [{&quot;36313&quot;: &quot;Australia: Moreton Bay - North&quot;, &quot;124735&quot;: &quot;Canada: North Battleford&quot;, &quot;36109&quot;: &quot;Australia: Murray&quot;, &quot;36108&quot;: &quot;Australia: Mid North Coast&quot;, &quot;36101&quot;: &quot;Australia: Capital Region&quot;, &quot;811&quot;: &quot;U.S.: Reno&quot;, &quot;36103&quot;: &quot;Australia: Central West&quot;, &quot;36102&quot;: &quot;Australia: Central Coast&quot;, &quot;36105&quot;: &quot;Australia: Far West and Orana&quot;, &quot;36104&quot;: &quot;Australia: Coffs Harbour - Grafton&quot;, &quot;36107&quot;: &quot;Australia: Illawarra&quot;, &quot;36106&quot;: &quot;Australia: Hunter Valley Exc Newcastle&quot;, &quot;554017&quot;: &quot;New Zealand: Wanganui&quot;, &quot;554016&quot;: &quot;New Zealand: Marlborough&quot;, &quot;554015&quot;: &quot;New Zealand: Gisborne&quot;, &quot;554014&quot;: &quot;New Zealand: Tararua&quot;, &quot;554013&quot;: &quot;New Zealand: Invercargill&quot;, &quot;GR&quot;: &quot;Greece&quot;, &quot;554011&quot;: &quot;New Zealand: Whangarei&quot;, &quot;554010&quot;: &quot;New Zealand: Far North&quot;, &quot;717&quot;: &quot;U.S.: Quincy-Hannibal-Keokuk&quot;, &quot;716&quot;: &quot;U.S.: Baton Rouge&quot;,...}] </pre>", response = Object.class, responseContainer = "List", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "resources" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Object.class, responseContainer = "List"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response targetingOptionsGet(@PathParam("targeting_type") @ApiParam("Public targeting type.") String targetingType,@QueryParam("client_id") @Pattern(regexp="^\\d+$") @Size(max=18)  @ApiParam("Client ID.")  String clientId,@QueryParam("oauth_signature")  @ApiParam("Oauth signature")  String oauthSignature,@QueryParam("timestamp") @Pattern(regexp="\\d+")  @ApiParam("Timestamp")  String timestamp,@QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18)  @ApiParam("Unique identifier of an ad account.")  String adAccountId) {
        return Response.ok().entity("magic!").build();
    }
}
