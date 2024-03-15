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

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/integrations")
@Api(description = "the integrations API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IntegrationsApi {

    @DELETE
    @Path("/commerce/{external_business_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete commerce integration", notes = "Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = Void.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "integrations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Commerce Integration deleted successfully", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response integrationsCommerceDel(@PathParam("external_business_id") @ApiParam("External business ID for the integration.") String externalBusinessId) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/commerce/{external_business_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get commerce integration", notes = "Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = IntegrationMetadata.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "integrations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = IntegrationMetadata.class),
        @ApiResponse(code = 404, message = "Integration not found.", response = Error.class),
        @ApiResponse(code = 409, message = "Can't access this integration metadata.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response integrationsCommerceGet(@PathParam("external_business_id") @ApiParam("External business ID for the integration.") String externalBusinessId) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/commerce/{external_business_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update commerce integration", notes = "Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = IntegrationMetadata.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "integrations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = IntegrationMetadata.class),
        @ApiResponse(code = 404, message = "Integration not found.", response = Error.class),
        @ApiResponse(code = 409, message = "Can't access this integration metadata.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response integrationsCommercePatch(@PathParam("external_business_id") @ApiParam("External business ID for the integration.") String externalBusinessId,@Valid IntegrationRequestPatch integrationRequestPatch) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/commerce")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create commerce integration", notes = "Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = IntegrationMetadata.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "integrations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = IntegrationMetadata.class),
        @ApiResponse(code = 404, message = "Integration not found.", response = Error.class),
        @ApiResponse(code = 409, message = "Can't access this integration metadata.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response integrationsCommercePost(@Valid IntegrationRequest integrationRequest) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get integration metadata", notes = "Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = IntegrationRecord.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "integrations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = IntegrationRecord.class),
        @ApiResponse(code = 404, message = "Integration not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response integrationsGetById(@PathParam("id") @ApiParam("Integration ID.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Get integration metadata list", notes = "Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = IntegrationsGetList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "integrations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = IntegrationsGetList200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response integrationsGetList(@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize) {
        return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/logs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Receives batched logs from integration applications.", notes = "This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = IntegrationLogsSuccessResponse.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "integrations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success.", response = IntegrationLogsSuccessResponse.class),
        @ApiResponse(code = 400, message = "Bad request.", response = DetailedError.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response integrationsLogsPost(@Valid @NotNull IntegrationLogsRequest integrationLogsRequest) {
        return Response.ok().entity("magic!").build();
    }
}
