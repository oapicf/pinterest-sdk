package org.openapitools.api;

import org.openapitools.model.Account;
import org.openapitools.model.AnalyticsMetricsResponse;
import org.openapitools.model.Error;
import org.joda.time.LocalDate;
import org.openapitools.api.UserAccountApiService;

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
@Path("/user_account")
@RequestScoped

@Api(description = "the user_account API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-05-07T06:41:45.100230Z[Etc/UTC]")

public class UserAccountApi  {

  @Context SecurityContext securityContext;

  @Inject UserAccountApiService delegate;


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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response userAccountAnalytics( @NotNull @ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD",required=true)  @QueryParam("start_date") LocalDate startDate,  @NotNull @ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD",required=true)  @QueryParam("end_date") LocalDate endDate, @ApiParam(value = "Filter on Pins that match your claimed domain.", allowableValues="OTHER, CLAIMED, BOTH", defaultValue="BOTH") @DefaultValue("BOTH")  @QueryParam("from_claimed_content") String fromClaimedContent, @ApiParam(value = "Pin formats to get data for, default is all.", allowableValues="ALL, PRODUCT, REGULAR, VIDEO", defaultValue="ALL") @DefaultValue("ALL")  @QueryParam("pin_format") String pinFormat, @ApiParam(value = "Apps or devices to get data for, default is all.", allowableValues="ALL, MOBILE, TABLET, WEB", defaultValue="ALL") @DefaultValue("ALL")  @QueryParam("app_types") String appTypes, @ApiParam(value = "Metric types to get data for, default is all. ")  @QueryParam("metric_types") List<String> metricTypes, @ApiParam(value = "How to split the data into groups. Not including this param means data won't be split.", allowableValues="NO_SPLIT, APP_TYPE, OWNED_CONTENT, PIN_FORMAT", defaultValue="NO_SPLIT") @DefaultValue("NO_SPLIT")  @QueryParam("split_field") String splitField,  @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of an ad account.")  @QueryParam("ad_account_id") String adAccountId) {
        return delegate.userAccountAnalytics(startDate, endDate, fromClaimedContent, pinFormat, appTypes, metricTypes, splitField, adAccountId, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response userAccountGet( @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of an ad account.")  @QueryParam("ad_account_id") String adAccountId) {
        return delegate.userAccountGet(adAccountId, securityContext);
    }
}
