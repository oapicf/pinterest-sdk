package org.openapitools.api;

import org.openapitools.model.BulkDownloadRequest;
import org.openapitools.model.BulkDownloadResponse;
import org.openapitools.model.BulkUpsertRequest;
import org.openapitools.model.BulkUpsertResponse;
import org.openapitools.model.BulkUpsertStatusResponse;
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
@Path("/ad_accounts/{ad_account_id}/bulk")
@Api(value = "/", description = "")
public interface BulkApi  {

    /**
     * Get advertiser entities in bulk
     *
     * Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
     *
     */
    @POST
    @Path("/download")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get advertiser entities in bulk", tags={ "bulk" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BulkDownloadResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public BulkDownloadResponse bulkDownloadCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid BulkDownloadRequest bulkDownloadRequest);

    /**
     * Download advertiser entities in bulk
     *
     * Get the status of a bulk request by &lt;code&gt;request_id&lt;/code&gt;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
     *
     */
    @GET
    @Path("/{bulk_request_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Download advertiser entities in bulk", tags={ "bulk" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BulkUpsertStatusResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public BulkUpsertStatusResponse bulkRequestGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @PathParam("bulk_request_id") String bulkRequestId, @QueryParam("include_details") @DefaultValue("false") Boolean includeDetails);

    /**
     * Create/update ad entities in bulk
     *
     * Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request.
     *
     */
    @POST
    @Path("/upsert")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create/update ad entities in bulk", tags={ "bulk" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BulkUpsertResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public BulkUpsertResponse bulkUpsertCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @Valid BulkUpsertRequest bulkUpsertRequest);
}
