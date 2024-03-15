package org.openapitools.api;

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

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/integrations")


@io.swagger.annotations.Api(description = "the integrations API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-14T23:04:30.273794609Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class IntegrationsApi  {
   private final IntegrationsApiService delegate;

   public IntegrationsApi(@Context ServletConfig servletContext) {
      IntegrationsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("IntegrationsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (IntegrationsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = IntegrationsApiServiceFactory.getIntegrationsApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.DELETE
    @Path("/commerce/{external_business_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete commerce integration", notes = "Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:write", description = "Create, update, or delete ads, ad groups, campaigns etc.")
        })
    }, tags={ "integrations", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 204, message = "Commerce Integration deleted successfully", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response integrationsCommerceDel(@ApiParam(value = "External business ID for the integration.", required = true) @PathParam("external_business_id") @NotNull  String externalBusinessId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.integrationsCommerceDel(externalBusinessId, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/commerce/{external_business_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get commerce integration", notes = "Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = IntegrationMetadata.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "integrations", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = IntegrationMetadata.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Integration not found.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 409, message = "Can't access this integration metadata.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response integrationsCommerceGet(@ApiParam(value = "External business ID for the integration.", required = true) @PathParam("external_business_id") @NotNull  String externalBusinessId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.integrationsCommerceGet(externalBusinessId, securityContext);
    }
    @javax.ws.rs.PATCH
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
        @io.swagger.annotations.ApiResponse(code = 404, message = "Integration not found.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 409, message = "Can't access this integration metadata.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response integrationsCommercePatch(@ApiParam(value = "External business ID for the integration.", required = true) @PathParam("external_business_id") @NotNull  String externalBusinessId,@ApiParam(value = "Parameters to get create/update the Integration Metadata") @Valid  IntegrationRequestPatch integrationRequestPatch,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.integrationsCommercePatch(externalBusinessId, integrationRequestPatch, securityContext);
    }
    @javax.ws.rs.POST
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
        @io.swagger.annotations.ApiResponse(code = 404, message = "Integration not found.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 409, message = "Can't access this integration metadata.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response integrationsCommercePost(@ApiParam(value = "Parameters to get create/update the Integration Metadata") @Valid  IntegrationRequest integrationRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.integrationsCommercePost(integrationRequest, securityContext);
    }
    @javax.ws.rs.GET
    @Path("/{id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get integration metadata", notes = "Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = IntegrationRecord.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "integrations", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = IntegrationRecord.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Integration not found.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response integrationsGetById(@ApiParam(value = "Integration ID.", required = true) @PathParam("id") @NotNull  String id,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.integrationsGetById(id, securityContext);
    }
    @javax.ws.rs.GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get integration metadata list", notes = "Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.", response = IntegrationsGetList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "ads:read", description = "See all of your advertising data, including ads, ad groups, campaigns etc.")
        })
    }, tags={ "integrations", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = IntegrationsGetList200Response.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response integrationsGetList(@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(250) Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.integrationsGetList(bookmark, pageSize, securityContext);
    }
    @javax.ws.rs.POST
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
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad request.", response = DetailedError.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response integrationsLogsPost(@ApiParam(value = "Ingest log information from external integration application.", required = true) @NotNull @Valid  IntegrationLogsRequest integrationLogsRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.integrationsLogsPost(integrationLogsRequest, securityContext);
    }
}
