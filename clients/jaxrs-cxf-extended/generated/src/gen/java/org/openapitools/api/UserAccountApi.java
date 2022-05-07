package org.openapitools.api;

import org.openapitools.model.Account;
import org.openapitools.model.AnalyticsMetricsResponse;
import org.openapitools.model.Error;
import org.joda.time.LocalDate;

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
@Path("/user_account")
@Api(value = "/", description = "")
public interface UserAccountApi  {

    /**
     * Get user account analytics
     *
     * Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
     *
     */
    @GET
    @Path("/analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user account analytics", tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AnalyticsMetricsResponse.class, responseContainer = "Map"),
        @ApiResponse(code = 403, message = "Not authorized to access the user account analytics.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Map<String, AnalyticsMetricsResponse> userAccountAnalytics(@QueryParam("start_date") @NotNull LocalDate startDate, @QueryParam("end_date") @NotNull LocalDate endDate, @QueryParam("from_claimed_content") @DefaultValue("BOTH") String fromClaimedContent, @QueryParam("pin_format") @DefaultValue("ALL") String pinFormat, @QueryParam("app_types") @DefaultValue("ALL") String appTypes, @QueryParam("metric_types") List<String> metricTypes, @QueryParam("split_field") @DefaultValue("NO_SPLIT") String splitField, @QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") String adAccountId);

    /**
     * Get user account
     *
     * Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-business-access&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user account", tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = Account.class),
        @ApiResponse(code = 403, message = "Not authorized to access the user account.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Account userAccountGet(@QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") String adAccountId);
}
