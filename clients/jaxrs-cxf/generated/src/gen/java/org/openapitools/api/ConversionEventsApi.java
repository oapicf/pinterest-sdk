package org.openapitools.api;

import org.openapitools.model.ConversionApiResponse;
import org.openapitools.model.ConversionEvents;
import org.openapitools.model.DetailedError;
import org.openapitools.model.Error;

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
@Path("/ad_accounts/{ad_account_id}/events")
@Api(value = "/", description = "")
public interface ConversionEventsApi  {

    /**
     * Send conversions
     *
     * The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their &lt;code&gt;ad_account_id&lt;/code&gt;. The request body should be a JSON object. - This endpoint requires an &lt;code&gt;access_token&lt;/code&gt; be generated through Ads Manager. Review the &lt;a href&#x3D;\&quot;/docs/conversions/conversions/\&quot;&gt;Conversions Guide&lt;/a&gt; for more details. - The token&#39;s &lt;code&gt;user_account&lt;/code&gt; must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Send conversions", tags={ "conversion_events" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ConversionApiResponse.class),
        @ApiResponse(code = 400, message = "The request was invalid.", response = Error.class),
        @ApiResponse(code = 401, message = "Not authorized to send conversion events", response = Error.class),
        @ApiResponse(code = 403, message = "Unauthorized access.", response = Error.class),
        @ApiResponse(code = 422, message = "Not all events were successfully processed.", response = DetailedError.class),
        @ApiResponse(code = 429, message = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window.", response = Error.class),
        @ApiResponse(code = 503, message = "The endpoint has been ramped down and is currently not accepting any traffic.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected errors", response = Error.class) })
    public ConversionApiResponse eventsCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid @NotNull ConversionEvents conversionEvents, @QueryParam("test") Boolean test);
}
