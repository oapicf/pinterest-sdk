package org.openapitools.api;

import org.openapitools.model.CustomerListUploadCreateRequest;
import org.openapitools.model.CustomerListUploadCreateResponse;
import org.openapitools.model.CustomerListUploadResponse;
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
@Path("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads")
@Api(value = "/", description = "")
public interface CustomerListUploadsApi  {

    /**
     * Create customer list upload
     *
     * &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt;  &lt;p&gt;Create a customer list upload request for multipart S3 upload.&lt;/p&gt; &lt;p&gt;Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Please review the &lt;u&gt;&lt;a href&#x3D;\&quot;/docs/api/v5/customer_lists-update/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;update customer list endpoint&lt;/a&gt;&lt;/u&gt; documentation for additional information.&lt;/b&gt;&lt;/p&gt;
     *
     */
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create customer list upload", tags={ "customer_list_uploads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CustomerListUploadCreateResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public CustomerListUploadCreateResponse customerListUploadsCreate(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @PathParam("customer_list_id") @Pattern(regexp="^\\d+$") @Size(max=18) String customerListId, @Valid CustomerListUploadCreateRequest customerListUploadCreateRequest);

    /**
     * Get customer list upload
     *
     * &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt; &lt;p&gt;Get the metadata for a given upload by its ID.&lt;/p&gt;
     *
     */
    @GET
    @Path("/{customer_list_upload_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get customer list upload", tags={ "customer_list_uploads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CustomerListUploadResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public CustomerListUploadResponse customerListUploadsGet(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @PathParam("customer_list_id") @Pattern(regexp="^\\d+$") @Size(max=18) String customerListId, @PathParam("customer_list_upload_id") @Pattern(regexp="^\\d+$") @Size(max=18) String customerListUploadId);

    /**
     * Run customer list upload
     *
     * &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt; &lt;p&gt;Begin processing a customer list upload.&lt;/p&gt;
     *
     */
    @POST
    @Path("/{customer_list_upload_id}/run")
    @Produces({ "application/json" })
    @ApiOperation(value = "Run customer list upload", tags={ "customer_list_uploads" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CustomerListUploadResponse.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public CustomerListUploadResponse customerListUploadsRun(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @PathParam("customer_list_id") @Pattern(regexp="^\\d+$") @Size(max=18) String customerListId, @PathParam("customer_list_upload_id") @Pattern(regexp="^\\d+$") @Size(max=18) String customerListUploadId);
}
