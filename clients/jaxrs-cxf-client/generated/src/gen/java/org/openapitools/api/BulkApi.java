package org.openapitools.api;

import org.openapitools.model.BulkDownload;
import org.openapitools.model.BulkDownloadCreate;
import org.openapitools.model.BulkJobData;
import org.openapitools.model.BulkUpsertRequest;
import org.openapitools.model.BulkUpsertResponse;
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
@Path("/ad_accounts/{ad_account_id}/bulk")
@Api(value = "/", description = "")
public interface BulkApi  {

    /**
     * Get advertiser entities in bulk
     *
     * Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, schedules,and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
     *
     */
    @POST
    @Path("/download")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get advertiser entities in bulk", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = BulkDownload.class),
        @ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = BulkDownload.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public BulkDownload bulkDownloadCreate(@PathParam("ad_account_id") String adAccountId, BulkDownloadCreate bulkDownloadCreate);

    /**
     * Download advertiser entities in bulk
     *
     * Get the status of a bulk request by &#x60;request_id&#x60;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, schedules, or keywords).
     *
     */
    @GET
    @Path("/{bulk_request_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Download advertiser entities in bulk", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = BulkJobData.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public BulkJobData bulkRequestGet(@PathParam("ad_account_id") String adAccountId, @PathParam("bulk_request_id") String bulkRequestId, @QueryParam("include_details") @DefaultValue("false")Boolean includeDetails);

    /**
     * Create/update ad entities in bulk
     *
     * Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, schedules, or labels. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request.
     *
     */
    @POST
    @Path("/upsert")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create/update ad entities in bulk", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = BulkUpsertResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = PinterestLibError.class) })
    public BulkUpsertResponse bulkUpsertCreate(@PathParam("ad_account_id") String adAccountId, BulkUpsertRequest bulkUpsertRequest);
}
