package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.UserAccountApiService;
import org.openapitools.api.factories.UserAccountApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Account;
import org.openapitools.model.AnalyticsMetricsResponse;
import java.util.Date;
import org.openapitools.model.Error;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/user_account")


@io.swagger.annotations.Api(description = "the user_account API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2022-05-07T06:39:19.282212Z[Etc/UTC]")
public class UserAccountApi  {
   private final UserAccountApiService delegate = UserAccountApiServiceFactory.getUserAccountApi();

    @GET
    @Path("/analytics")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get user account analytics", notes = "Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".", response = AnalyticsMetricsResponse.class, responseContainer = "Map", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts")
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = AnalyticsMetricsResponse.class, responseContainer = "Map"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to access the user account analytics.", response = AnalyticsMetricsResponse.class, responseContainer = "Map"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = AnalyticsMetricsResponse.class, responseContainer = "Map") })
    public Response userAccountAnalytics(@ApiParam(value = "Metric report start date (UTC). Format: YYYY-MM-DD",required=true) @QueryParam("start_date") Date startDate
,@ApiParam(value = "Metric report end date (UTC). Format: YYYY-MM-DD",required=true) @QueryParam("end_date") Date endDate
,@ApiParam(value = "Filter on Pins that match your claimed domain.", allowableValues="OTHER, CLAIMED, BOTH", defaultValue="BOTH") @DefaultValue("BOTH") @QueryParam("from_claimed_content") String fromClaimedContent
,@ApiParam(value = "Pin formats to get data for, default is all.", allowableValues="ALL, PRODUCT, REGULAR, VIDEO", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("pin_format") String pinFormat
,@ApiParam(value = "Apps or devices to get data for, default is all.", allowableValues="ALL, MOBILE, TABLET, WEB", defaultValue="ALL") @DefaultValue("ALL") @QueryParam("app_types") String appTypes
,@ApiParam(value = "Metric types to get data for, default is all. ", allowableValues="ENGAGEMENT, ENGAGEMENT_RATE, IMPRESSION, OUTBOUND_CLICK, OUTBOUND_CLICK_RATE, PIN_CLICK, PIN_CLICK_RATE, SAVE, SAVE_RATE") @QueryParam("metric_types") List<String> metricTypes
,@ApiParam(value = "How to split the data into groups. Not including this param means data won't be split.", allowableValues="NO_SPLIT, APP_TYPE, OWNED_CONTENT, PIN_FORMAT", defaultValue="NO_SPLIT") @DefaultValue("NO_SPLIT") @QueryParam("split_field") String splitField
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.userAccountAnalytics(startDate,endDate,fromClaimedContent,pinFormat,appTypes,metricTypes,splitField,adAccountId);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get user account", notes = "Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/api/v5/#tag/Understanding-business-access'>Understanding Business Access</a> for more information.", response = Account.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "user_accounts:read", description = "See your user accounts")
        })
    }, tags={ "user_account", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "response", response = Account.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to access the user account.", response = Account.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Account.class) })
    public Response userAccountGet(@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.userAccountGet(adAccountId);
    }
}
