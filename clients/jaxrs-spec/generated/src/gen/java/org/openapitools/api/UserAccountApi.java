package org.openapitools.api;

import org.openapitools.model.Account;
import org.openapitools.model.AnalyticsMetricsResponse;
import org.openapitools.model.Error;
import org.joda.time.LocalDate;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/user_account")
@Api(description = "the user_account API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-07-01T12:01:13.464712Z[Etc/UTC]")public class UserAccountApi {

    @GET
    @Path("/analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user account analytics", notes = "Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".", response = AnalyticsMetricsResponse.class, responseContainer = "Map", authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AnalyticsMetricsResponse.class, responseContainer = "Map"),
        @ApiResponse(code = 403, message = "Not authorized to access the user account analytics.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response userAccountAnalytics(@QueryParam("start_date") @NotNull  @ApiParam("Metric report start date (UTC). Format: YYYY-MM-DD")  LocalDate startDate,@QueryParam("end_date") @NotNull  @ApiParam("Metric report end date (UTC). Format: YYYY-MM-DD")  LocalDate endDate,@QueryParam("from_claimed_content") @DefaultValue("BOTH")  @ApiParam("Filter on Pins that match your claimed domain.")  String fromClaimedContent,@QueryParam("pin_format") @DefaultValue("ALL")  @ApiParam("Pin formats to get data for, default is all.")  String pinFormat,@QueryParam("app_types") @DefaultValue("ALL")  @ApiParam("Apps or devices to get data for, default is all.")  String appTypes,@QueryParam("metric_types")  @ApiParam("Metric types to get data for, default is all. ")  List<String> metricTypes,@QueryParam("split_field") @DefaultValue("NO_SPLIT")  @ApiParam("How to split the data into groups. Not including this param means data won&#39;t be split.")  String splitField,@QueryParam("ad_account_id") @Pattern(regexp="^\\d+$")  @ApiParam("Unique identifier of an ad account.")  String adAccountId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user account", notes = "Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/api/v5/#tag/Understanding-business-access'>Understanding Business Access</a> for more information.", response = Account.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts") })
         }, tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = Account.class),
        @ApiResponse(code = 403, message = "Not authorized to access the user account.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response userAccountGet(@QueryParam("ad_account_id") @Pattern(regexp="^\\d+$")  @ApiParam("Unique identifier of an ad account.")  String adAccountId) {
        return Response.ok().entity("magic!").build();
    }
}
