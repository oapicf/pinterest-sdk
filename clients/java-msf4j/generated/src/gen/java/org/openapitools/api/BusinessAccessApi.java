package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.BusinessAccessApiService;
import org.openapitools.api.factories.BusinessAccessApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.BrandAccount;
import org.openapitools.model.BrandAccountCreate;
import org.openapitools.model.BrandAccountUpdate;
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

@Path("/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts")


@io.swagger.annotations.Api(description = "the business_access API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BusinessAccessApi  {
   private final BusinessAccessApiService delegate = BusinessAccessApiServiceFactory.getBusinessAccessApi();

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
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = BrandAccount.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = BrandAccount.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = BrandAccount.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = BrandAccount.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = BrandAccount.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = BrandAccount.class) })
    public Response brandAccountsCreate(@ApiParam(value = "business hierarchy node id",required=true) @PathParam("business_hierarchy_id") String businessHierarchyId
,@ApiParam(value = "" ,required=true) BrandAccountCreate brandAccountCreate
)
    throws NotFoundException {
        return delegate.brandAccountsCreate(businessHierarchyId,brandAccountCreate);
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
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = BrandAccount.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = BrandAccount.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = BrandAccount.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = BrandAccount.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "The request could not be processed because of a conflict in the current state of the resource.", response = BrandAccount.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = BrandAccount.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = BrandAccount.class) })
    public Response brandAccountsUpdate(@ApiParam(value = "",required=true) @PathParam("brand_account_id") String brandAccountId
,@ApiParam(value = "business hierarchy node id",required=true) @PathParam("business_hierarchy_id") String businessHierarchyId
,@ApiParam(value = "" ,required=true) BrandAccountUpdate brandAccountUpdate
)
    throws NotFoundException {
        return delegate.brandAccountsUpdate(brandAccountId,businessHierarchyId,brandAccountUpdate);
    }
}
