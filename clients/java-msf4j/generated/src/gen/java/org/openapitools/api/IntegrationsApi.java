package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.IntegrationsApiService;
import org.openapitools.api.factories.IntegrationsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.DetailedError;
import org.openapitools.model.Error;
import org.openapitools.model.IntegrationLogsRequest;
import org.openapitools.model.IntegrationLogsSuccessResponse;
import org.openapitools.model.IntegrationMetadata;
import org.openapitools.model.IntegrationRecord;
import org.openapitools.model.IntegrationRequest;
import org.openapitools.model.IntegrationRequestPatch;
import org.openapitools.model.IntegrationsGetList200Response;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IntegrationsApi  {
   private final IntegrationsApiService delegate = IntegrationsApiServiceFactory.getIntegrationsApi();

    @DELETE
    @Path("/commerce/{external_business_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete commerce integration", notes = "Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "integrations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Commerce Integration deleted successfully", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Void.class) })
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
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Integration not found.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Can't access this integration metadata.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = IntegrationMetadata.class) })
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
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Integration not found.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Can't access this integration metadata.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = IntegrationMetadata.class) })
    public Response integrationsCommercePatch(@ApiParam(value = "External business ID for the integration.",required=true) @PathParam("external_business_id") String externalBusinessId
,@ApiParam(value = "Parameters to get create/update the Integration Metadata" ) IntegrationRequestPatch integrationRequestPatch
)
    throws NotFoundException {
        return delegate.integrationsCommercePatch(externalBusinessId,integrationRequestPatch);
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
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Integration not found.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Can't access this integration metadata.", response = IntegrationMetadata.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = IntegrationMetadata.class) })
    public Response integrationsCommercePost(@ApiParam(value = "Parameters to get create/update the Integration Metadata" ) IntegrationRequest integrationRequest
)
    throws NotFoundException {
        return delegate.integrationsCommercePost(integrationRequest);
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
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = IntegrationRecord.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Integration not found.", response = IntegrationRecord.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = IntegrationRecord.class) })
    public Response integrationsGetById(@ApiParam(value = "Integration ID.",required=true) @PathParam("id") String id
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
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = IntegrationsGetList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = IntegrationsGetList200Response.class) })
    public Response integrationsGetList(@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
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
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success.", response = IntegrationLogsSuccessResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = IntegrationLogsSuccessResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = IntegrationLogsSuccessResponse.class) })
    public Response integrationsLogsPost(@ApiParam(value = "Ingest log information from external integration application." ,required=true) IntegrationLogsRequest integrationLogsRequest
)
    throws NotFoundException {
        return delegate.integrationsLogsPost(integrationLogsRequest);
    }
}
