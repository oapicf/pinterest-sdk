package org.openapitools.api;

import org.openapitools.model.ConversionEvents;
import org.openapitools.model.ConversionEventsCreate;
import org.openapitools.model.DetailedError;
import org.openapitools.model.PinterestLibError;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;

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
     * The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their &#x60;ad_account_id&#x60;. The request body should be a JSON object. - This endpoint requires an &#x60;access_token&#x60; be generated through Ads Manager. Review the [Conversions Guide](/docs/api-features/conversion-overview/) for more details. (Note that the authorization header required is &#x60;Authorization: Bearer &lt;access_token&gt;&#x60;). - The token&#39;s &#x60;user_account&#x60; must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Send conversions", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = ConversionEvents.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 422, message = "The request was well-formed but was unable to be followed due to semantic errors.", response = DetailedError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 503, message = "The server is currently unable to handle the request due to a temporary overload or scheduled maintenance.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public ConversionEvents eventsCreate(@PathParam("ad_account_id") String adAccountId, ConversionEventsCreate conversionEventsCreate, @QueryParam("test") Boolean test);
}
