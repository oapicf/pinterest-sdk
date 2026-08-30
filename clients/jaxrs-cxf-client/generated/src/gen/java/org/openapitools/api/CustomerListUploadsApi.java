package org.openapitools.api;

import org.openapitools.model.CustomerListUpload;
import org.openapitools.model.CustomerListUploadCreateRequest;
import org.openapitools.model.CustomerListUploadCreateResponse;
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
@Path("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads")
@Api(value = "/", description = "")
public interface CustomerListUploadsApi  {

    /**
     * Create customer list upload
     *
     * Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create customer list upload", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = CustomerListUploadCreateResponse.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public CustomerListUploadCreateResponse customerListUploadsCreate(@PathParam("ad_account_id") String adAccountId, @PathParam("customer_list_id") String customerListId, CustomerListUploadCreateRequest customerListUploadCreateRequest);

    /**
     * Get customer list upload
     *
     * Get the metadata for a given upload by its ID.
     *
     */
    @GET
    @Path("/{customer_list_upload_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get customer list upload", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = CustomerListUpload.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public CustomerListUpload customerListUploadsGet(@PathParam("ad_account_id") String adAccountId, @PathParam("customer_list_id") String customerListId, @PathParam("customer_list_upload_id") String customerListUploadId);

    /**
     * Run customer list upload
     *
     * Begin processing a customer list upload.
     *
     */
    @POST
    @Path("/{customer_list_upload_id}/run")
    @Produces({ "application/json" })
    @ApiOperation(value = "Run customer list upload", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = CustomerListUpload.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public CustomerListUpload customerListUploadsRun(@PathParam("ad_account_id") String adAccountId, @PathParam("customer_list_id") String customerListId, @PathParam("customer_list_upload_id") String customerListUploadId);
}
