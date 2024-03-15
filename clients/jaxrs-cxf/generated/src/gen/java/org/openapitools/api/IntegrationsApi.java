package org.openapitools.api;

import org.openapitools.model.DetailedError;
import org.openapitools.model.Error;
import org.openapitools.model.IntegrationLogsRequest;
import org.openapitools.model.IntegrationLogsSuccessResponse;
import org.openapitools.model.IntegrationMetadata;
import org.openapitools.model.IntegrationRecord;
import org.openapitools.model.IntegrationRequest;
import org.openapitools.model.IntegrationRequestPatch;
import org.openapitools.model.IntegrationsGetList200Response;

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
@Path("/integrations")
@Api(value = "/", description = "")
public interface IntegrationsApi  {

    /**
     * Delete commerce integration
     *
     * Delete commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     */
    @DELETE
    @Path("/commerce/{external_business_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete commerce integration", tags={ "integrations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Commerce Integration deleted successfully"),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public void integrationsCommerceDel(@PathParam("external_business_id") String externalBusinessId);

    /**
     * Get commerce integration
     *
     * Get commerce integration metadata associated with the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     */
    @GET
    @Path("/commerce/{external_business_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get commerce integration", tags={ "integrations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = IntegrationMetadata.class),
        @ApiResponse(code = 404, message = "Integration not found.", response = Error.class),
        @ApiResponse(code = 409, message = "Can't access this integration metadata.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public IntegrationMetadata integrationsCommerceGet(@PathParam("external_business_id") String externalBusinessId);

    /**
     * Update commerce integration
     *
     * Update commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     */
    @PATCH
    @Path("/commerce/{external_business_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update commerce integration", tags={ "integrations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = IntegrationMetadata.class),
        @ApiResponse(code = 404, message = "Integration not found.", response = Error.class),
        @ApiResponse(code = 409, message = "Can't access this integration metadata.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public IntegrationMetadata integrationsCommercePatch(@PathParam("external_business_id") String externalBusinessId, @Valid IntegrationRequestPatch integrationRequestPatch);

    /**
     * Create commerce integration
     *
     * Create commerce integration metadata to link an external business ID with a Pinterest merchant &amp; ad account. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     */
    @POST
    @Path("/commerce")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create commerce integration", tags={ "integrations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = IntegrationMetadata.class),
        @ApiResponse(code = 404, message = "Integration not found.", response = Error.class),
        @ApiResponse(code = 409, message = "Can't access this integration metadata.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public IntegrationMetadata integrationsCommercePost(@Valid IntegrationRequest integrationRequest);

    /**
     * Get integration metadata
     *
     * Get integration metadata by ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     */
    @GET
    @Path("/{id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get integration metadata", tags={ "integrations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = IntegrationRecord.class),
        @ApiResponse(code = 404, message = "Integration not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public IntegrationRecord integrationsGetById(@PathParam("id") String id);

    /**
     * Get integration metadata list
     *
     * Get integration metadata list. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     */
    @GET
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get integration metadata list", tags={ "integrations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = IntegrationsGetList200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public IntegrationsGetList200Response integrationsGetList(@QueryParam("bookmark") String bookmark, @QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")Integer pageSize);

    /**
     * Receives batched logs from integration applications.
     *
     * This endpoint receives batched logs from integration applications on partner platforms. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
     *
     */
    @POST
    @Path("/logs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Receives batched logs from integration applications.", tags={ "integrations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = IntegrationLogsSuccessResponse.class),
        @ApiResponse(code = 400, message = "Bad request.", response = DetailedError.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public IntegrationLogsSuccessResponse integrationsLogsPost(@Valid @NotNull IntegrationLogsRequest integrationLogsRequest);
}
