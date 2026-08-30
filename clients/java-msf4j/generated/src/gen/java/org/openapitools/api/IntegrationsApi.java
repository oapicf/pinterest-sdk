package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.IntegrationsApiService;
import org.openapitools.api.factories.IntegrationsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.IntegrationLogsInvalidLogResponse;
import org.openapitools.model.IntegrationLogsRequestCreate;
import org.openapitools.model.IntegrationLogsSuccessResponse;
import org.openapitools.model.IntegrationMetadata;
import org.openapitools.model.IntegrationMetadataCreate;
import org.openapitools.model.IntegrationMetadataUpdate;
import org.openapitools.model.IntegrationRecord;
import org.openapitools.model.IntegrationsGetList200Response;
import org.openapitools.model.PinterestLibError;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/integrations")


@io.swagger.annotations.Api(description = "the integrations API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class IntegrationsApi  {
   private final IntegrationsApiService delegate = IntegrationsApiServiceFactory.getIntegrationsApi();

    @DELETE
    @Path("/commerce/{external_business_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete commerce integration", notes = "Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = IntegrationMetadata.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "integrations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 204, message = "Resource deleted successfully.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = IntegrationMetadata.class) })
    public Response integrationsCommerceDel(@ApiParam(value = "External business ID for the integration.",required=true) @PathParam("external_business_id") String externalBusinessId
)
    throws NotFoundException {
        return delegate.integrationsCommerceDel(externalBusinessId);
    }
    @GET
    @Path("/commerce/{external_business_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get commerce integration", notes = "Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = IntegrationMetadata.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "integrations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = IntegrationMetadata.class) })
    public Response integrationsCommerceGet(@ApiParam(value = "External business ID for the integration.",required=true) @PathParam("external_business_id") String externalBusinessId
)
    throws NotFoundException {
        return delegate.integrationsCommerceGet(externalBusinessId);
    }
    @PATCH
    @Path("/commerce/{external_business_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update commerce integration", notes = "Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = IntegrationMetadata.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "integrations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = IntegrationMetadata.class) })
    public Response integrationsCommercePatch(@ApiParam(value = "External business ID for the integration.",required=true) @PathParam("external_business_id") String externalBusinessId
,@ApiParam(value = "" ,required=true) IntegrationMetadataUpdate integrationMetadataUpdate
)
    throws NotFoundException {
        return delegate.integrationsCommercePatch(externalBusinessId,integrationMetadataUpdate);
    }
    @POST
    @Path("/commerce")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create commerce integration", notes = "Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = IntegrationMetadata.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "integrations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = IntegrationMetadata.class) })
    public Response integrationsCommercePost(@ApiParam(value = "" ,required=true) IntegrationMetadataCreate integrationMetadataCreate
)
    throws NotFoundException {
        return delegate.integrationsCommercePost(integrationMetadataCreate);
    }
    @GET
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get integration metadata", notes = "Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = IntegrationRecord.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "integrations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = IntegrationRecord.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = IntegrationRecord.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = IntegrationRecord.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = IntegrationRecord.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = IntegrationRecord.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = IntegrationRecord.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = IntegrationRecord.class) })
    public Response integrationsGetById(@ApiParam(value = "Integration record ID.",required=true) @PathParam("id") String id
)
    throws NotFoundException {
        return delegate.integrationsGetById(id);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get integration metadata list", notes = "Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = IntegrationsGetList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "integrations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = IntegrationsGetList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = IntegrationsGetList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = IntegrationsGetList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = IntegrationsGetList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = IntegrationsGetList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = IntegrationsGetList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = IntegrationsGetList200Response.class) })
    public Response integrationsGetList(@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
)
    throws NotFoundException {
        return delegate.integrationsGetList(bookmark,pageSize);
    }
    @POST
    @Path("/logs")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Receives batched logs from integration applications.", notes = "This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = IntegrationLogsSuccessResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "integrations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = IntegrationLogsSuccessResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The server could not understand the request due to invalid syntax.", response = IntegrationLogsSuccessResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = IntegrationLogsSuccessResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = IntegrationLogsSuccessResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = IntegrationLogsSuccessResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = IntegrationLogsSuccessResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = IntegrationLogsSuccessResponse.class) })
    public Response integrationsLogsPost(@ApiParam(value = "" ,required=true) IntegrationLogsRequestCreate integrationLogsRequestCreate
)
    throws NotFoundException {
        return delegate.integrationsLogsPost(integrationLogsRequestCreate);
    }
}
