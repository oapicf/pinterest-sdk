package org.openapitools.api;

import org.openapitools.model.ConversionMSOTEvents;
import org.openapitools.model.Error;

import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
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
@Path("/ad_accounts/{ad_account_id}/msot/events")
@Api(value = "/", description = "")
public interface MsotEventsApi  {

    /**
     * Send Measurement Source Of Truth (MSOT) attributed conversion events
     *
     * &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt; &lt;br&gt; &lt;p&gt;Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &lt;code&gt;ad_account_id&lt;/code&gt;. The request body should be a JSON object.&lt;/p&gt; - These events will NOT be used in Reporting.
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Send Measurement Source Of Truth (MSOT) attributed conversion events", tags={ "msot_events" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success"),
        @ApiResponse(code = 400, message = "The request was invalid", response = Error.class),
        @ApiResponse(code = 401, message = "Not authorized to send MSOT conversion events", response = Error.class),
        @ApiResponse(code = 403, message = "Unauthorized access", response = Error.class),
        @ApiResponse(code = 429, message = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected errors", response = Error.class) })
    public void msotEventsCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid @NotNull ConversionMSOTEvents conversionMSOTEvents);
}
