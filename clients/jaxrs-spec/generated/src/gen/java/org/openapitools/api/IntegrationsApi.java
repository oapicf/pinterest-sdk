package org.openapitools.api;

import org.openapitools.model.IntegrationLogsInvalidLogResponse;
import org.openapitools.model.IntegrationLogsRequestCreate;
import org.openapitools.model.IntegrationLogsSuccessResponse;
import org.openapitools.model.IntegrationMetadata;
import org.openapitools.model.IntegrationMetadataCreate;
import org.openapitools.model.IntegrationMetadataUpdate;
import org.openapitools.model.IntegrationRecord;
import org.openapitools.model.IntegrationsGetList200Response;
import org.openapitools.model.PinterestLibError;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class IntegrationsApi {

    @DELETE
    @Path("/commerce/{external_business_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete commerce integration", notes = "Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = IntegrationMetadata.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "integrations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = IntegrationMetadata.class),
        @ApiResponse(code = 204, message = "Resource deleted successfully.", response = Void.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
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
        @ApiResponse(code = 200, message = "The request has succeeded.", response = IntegrationMetadata.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
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
        @ApiResponse(code = 200, message = "The request has succeeded.", response = IntegrationMetadata.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response integrationsCommercePatch(@PathParam("external_business_id") @ApiParam("External business ID for the integration.") String externalBusinessId,@Valid @NotNull IntegrationMetadataUpdate integrationMetadataUpdate) {
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
        @ApiResponse(code = 200, message = "The request has succeeded.", response = IntegrationMetadata.class),
        @ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = IntegrationMetadata.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response integrationsCommercePost(@Valid @NotNull IntegrationMetadataCreate integrationMetadataCreate) {
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
        @ApiResponse(code = 200, message = "The request has succeeded.", response = IntegrationRecord.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response integrationsGetById(@PathParam("id") @Pattern(regexp="^\\d+$") @ApiParam("Integration record ID.") String id) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Get integration metadata list", notes = "Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = IntegrationsGetList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "integrations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = IntegrationsGetList200Response.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response integrationsGetList(@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(250) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.")  Integer pageSize) {
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
        @ApiResponse(code = 200, message = "The request has succeeded.", response = IntegrationLogsSuccessResponse.class),
        @ApiResponse(code = 400, message = "The server could not understand the request due to invalid syntax.", response = IntegrationLogsInvalidLogResponse.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response integrationsLogsPost(@Valid @NotNull IntegrationLogsRequestCreate integrationLogsRequestCreate) {
        return Response.ok().entity("magic!").build();
    }
}
