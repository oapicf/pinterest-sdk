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
import org.openapitools.api.IntegrationsApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.PATCH;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@Path("/integrations")
@RequestScoped

@Api(description = "the integrations API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-11-05T02:19:42.400563355Z[Etc/UTC]", comments = "Generator version: 7.9.0")

public class IntegrationsApi  {

  @Context SecurityContext securityContext;

  @Inject IntegrationsApiService delegate;


    @DELETE
    @Path("/commerce/{external_business_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete commerce integration", notes = "Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = Void.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.") })
         }, tags={ "integrations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Commerce Integration deleted successfully", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public Response integrationsCommerceDel(@ApiParam(value = "External business ID for the integration.",required=true) @PathParam("external_business_id") String externalBusinessId) {
        return delegate.integrationsCommerceDel(externalBusinessId, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public Response integrationsCommerceGet(@ApiParam(value = "External business ID for the integration.",required=true) @PathParam("external_business_id") String externalBusinessId) {
        return delegate.integrationsCommerceGet(externalBusinessId, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public Response integrationsCommercePatch(@ApiParam(value = "External business ID for the integration.",required=true) @PathParam("external_business_id") String externalBusinessId, @ApiParam(value = "Parameters to get create/update the Integration Metadata" ) IntegrationRequestPatch integrationRequestPatch) {
        return delegate.integrationsCommercePatch(externalBusinessId, integrationRequestPatch, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public Response integrationsCommercePost(@ApiParam(value = "Parameters to get create/update the Integration Metadata" ) IntegrationRequest integrationRequest) {
        return delegate.integrationsCommercePost(integrationRequest, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public Response integrationsGetById(@ApiParam(value = "Integration ID.",required=true) @PathParam("id") String id) {
        return delegate.integrationsGetById(id, securityContext);
    }

    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get integration metadata list", notes = "Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = IntegrationsGetList200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.") })
         }, tags={ "integrations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = IntegrationsGetList200Response.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public Response integrationsGetList(@ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(250)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.integrationsGetList(bookmark, pageSize, securityContext);
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response integrationsLogsPost(@ApiParam(value = "Ingest log information from external integration application." ,required=true) IntegrationLogsRequest integrationLogsRequest) {
        return delegate.integrationsLogsPost(integrationLogsRequest, securityContext);
    }
}
