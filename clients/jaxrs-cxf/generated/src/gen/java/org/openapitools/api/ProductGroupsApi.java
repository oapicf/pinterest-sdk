package org.openapitools.api;

import org.openapitools.model.AdAccountsCatalogsProductGroupsList200Response;
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
@Path("/ad_accounts/{ad_account_id}/product_groups/catalogs")
@Api(value = "/", description = "")
public interface ProductGroupsApi  {

    /**
     * Get catalog product groups
     *
     * This endpoint is completely deprecated. Please use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/catalogs_product_groups/list&#39;&gt;List product groups&lt;/a&gt; from Catalogs API instead.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get catalog product groups", tags={ "product_groups" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = AdAccountsCatalogsProductGroupsList200Response.class),
        @ApiResponse(code = 400, message = "Invalid ad account ads parameters.", response = Error.class),
        @ApiResponse(code = 401, message = "Access Denied. This can happen if account is not yet approved to operate as Merchant on Pinterest.", response = Error.class),
        @ApiResponse(code = 404, message = "Merchant data not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public AdAccountsCatalogsProductGroupsList200Response adAccountsCatalogsProductGroupsList(@PathParam("ad_account_id") @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, @QueryParam("feed_profile_id") @Pattern(regexp="^\\d+$") @Size(max=18) String feedProfileId);
}
