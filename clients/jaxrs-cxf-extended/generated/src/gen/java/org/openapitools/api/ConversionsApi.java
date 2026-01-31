package org.openapitools.api;

import org.openapitools.model.AdvertiserDefinedEventsResponse;
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
@Path("/ad_accounts/{ad_account_id}/advertiser_defined_events")
@Api(value = "/", description = "")
public interface ConversionsApi  {

    /**
     * Get advertiser defined events
     *
     * &lt;p&gt;Get advertiser defined events for the given ad account.&lt;/p&gt;
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get advertiser defined events", tags={ "conversions" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdvertiserDefinedEventsResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public AdvertiserDefinedEventsResponse advertiserDefinedEventsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId);
}
