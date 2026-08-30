package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.BusinessAccessApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.BrandAccount;
import org.openapitools.model.BrandAccountCreate;
import org.openapitools.model.BrandAccountUpdate;
import org.openapitools.model.PinterestLibError;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts")


@io.swagger.annotations.Api(description = "the business_access API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BusinessAccessApi  {

    @Inject BusinessAccessApiService service;

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a Brand Account", notes = "Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.", response = BrandAccount.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_relationships", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = BrandAccount.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = BrandAccount.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response brandAccountsCreate( @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_hierarchy_id") String businessHierarchyId,@ApiParam(value = "" ,required=true) @NotNull @Valid BrandAccountCreate brandAccountCreate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.brandAccountsCreate(businessHierarchyId,brandAccountCreate,securityContext);
    }
    @PATCH
    @Path("/{brand_account_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update a Brand Account", notes = "Update an existing Brand Account", response = BrandAccount.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_relationships", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = BrandAccount.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "The request could not be processed because of a conflict in the current state of the resource.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class) })
    public Response brandAccountsUpdate( @PathParam("brand_account_id") String brandAccountId, @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @PathParam("business_hierarchy_id") String businessHierarchyId,@ApiParam(value = "" ,required=true) @NotNull @Valid BrandAccountUpdate brandAccountUpdate,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.brandAccountsUpdate(brandAccountId,businessHierarchyId,brandAccountUpdate,securityContext);
    }
}
