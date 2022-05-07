package org.openapitools.api;

import org.openapitools.model.AnalyticsMetricsResponse;
import org.openapitools.model.Error;
import org.joda.time.LocalDate;
import org.openapitools.model.Pin;

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
@Path("/pins")
@Api(value = "/", description = "")
public interface PinsApi  {

    /**
     * Get Pin analytics
     *
     * Get analytics for a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.
     *
     */
    @GET
    @Path("/{pin_id}/analytics")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Pin analytics", tags={ "pins" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = AnalyticsMetricsResponse.class, responseContainer = "Map"),
        @ApiResponse(code = 403, message = "Not authorized to access board or Pin.", response = Error.class),
        @ApiResponse(code = 404, message = "Pin not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Map<String, AnalyticsMetricsResponse> pinsAnalytics(@PathParam("pin_id") String pinId, @QueryParam("start_date") @NotNull LocalDate startDate, @QueryParam("end_date") @NotNull LocalDate endDate, @QueryParam("metric_types") @NotNull List<String> metricTypes, @QueryParam("app_types") @DefaultValue("ALL") String appTypes, @QueryParam("split_field") @DefaultValue("NO_SPLIT") String splitField, @QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") String adAccountId);

    /**
     * Create Pin
     *
     * Create a Pin on a board or board section owned by the \&quot;operation user_account\&quot;.  Note: If the current \&quot;operation user_account\&quot; (defined by the access token) has access to another user&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called &#39;curated content&#39;, please use our &lt;a href&#x3D;&#39;/docs/add-ons/save-button&#39;&gt;Save button&lt;/a&gt; instead. For more tips on creating fresh content for Pinterest, review our &lt;a href&#x3D;&#39;/docs/solutions/content-apps&#39;&gt;Content App Solutions Guide&lt;/a&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/solutions/content-apps/#creatingvideopins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create Pin", tags={ "pins" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful pin creation.", response = Pin.class),
        @ApiResponse(code = 400, message = "Invalid Pin parameters response", response = Error.class),
        @ApiResponse(code = 403, message = "The Pin's image is too small, too large or is broken", response = Error.class),
        @ApiResponse(code = 404, message = "Board or section not found", response = Error.class),
        @ApiResponse(code = 429, message = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Pin pinsCreate(@Valid Pin pin);

    /**
     * Delete Pin
     *
     * Delete a Pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.
     *
     */
    @DELETE
    @Path("/{pin_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete Pin", tags={ "pins" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully deleted Pin"),
        @ApiResponse(code = 403, message = "Not authorized to access board or Pin.", response = Error.class),
        @ApiResponse(code = 404, message = "Pin not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public void pinsDelete(@PathParam("pin_id") String pinId);

    /**
     * Get Pin
     *
     * Get a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
     *
     */
    @GET
    @Path("/{pin_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Pin", tags={ "pins" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "response", response = Pin.class),
        @ApiResponse(code = 403, message = "Not authorized to access board or Pin.", response = Error.class),
        @ApiResponse(code = 404, message = "Pin not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Pin pinsGet(@PathParam("pin_id") String pinId, @QueryParam("ad_account_id") @Pattern(regexp="^\\d+$") String adAccountId);
}
