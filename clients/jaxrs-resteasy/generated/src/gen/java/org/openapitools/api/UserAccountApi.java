package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.UserAccountApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Account;
import org.openapitools.model.AnalyticsMetricsResponse;
import java.util.Date;
import org.openapitools.model.Error;

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

@Path("/user_account")


@io.swagger.annotations.Api(description = "the user_account API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-08T00:33:33.395237Z[Etc/UTC]")
public class UserAccountApi  {

    @Inject UserAccountApiService service;

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
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to access the user account analytics.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response userAccountAnalytics( @NotNull @QueryParam("start_date") Date startDate, @NotNull @QueryParam("end_date") Date endDate,, allowableValues="OTHER, CLAIMED, BOTH" @DefaultValue("BOTH") @QueryParam("from_claimed_content") String fromClaimedContent,, allowableValues="ALL, PRODUCT, REGULAR, VIDEO" @DefaultValue("ALL") @QueryParam("pin_format") String pinFormat,, allowableValues="ALL, MOBILE, TABLET, WEB" @DefaultValue("ALL") @QueryParam("app_types") String appTypes, @QueryParam("metric_types") List<String> metricTypes,, allowableValues="NO_SPLIT, APP_TYPE, OWNED_CONTENT, PIN_FORMAT" @DefaultValue("NO_SPLIT") @QueryParam("split_field") String splitField, @Pattern(regexp="^\\d+$") @QueryParam("ad_account_id") String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.userAccountAnalytics(startDate,endDate,fromClaimedContent,pinFormat,appTypes,metricTypes,splitField,adAccountId,securityContext);
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
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to access the user account.", response = Error.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response userAccountGet( @Pattern(regexp="^\\d+$") @QueryParam("ad_account_id") String adAccountId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.userAccountGet(adAccountId,securityContext);
    }
}
