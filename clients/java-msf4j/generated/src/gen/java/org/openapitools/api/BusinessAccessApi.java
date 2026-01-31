package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.BusinessAccessApiService;
import org.openapitools.api.factories.BusinessAccessApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.BrandAccountsCreate200Response;
import org.openapitools.model.BrandAccountsCreateRequest;
import org.openapitools.model.BrandAccountsUpdateRequest;
import org.openapitools.model.Error;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-31T04:52:33.064583645Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BusinessAccessApi  {
   private final BusinessAccessApiService delegate = BusinessAccessApiServiceFactory.getBusinessAccessApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a Brand Account", notes = "Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.", response = BrandAccountsCreate200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_relationships", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = BrandAccountsCreate200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid parameters.", response = BrandAccountsCreate200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = BrandAccountsCreate200Response.class) })
    public Response brandAccountsCreate(@ApiParam(value = "business hierarchy node id",required=true) @PathParam("business_hierarchy_id") String businessHierarchyId
,@ApiParam(value = "" ,required=true) BrandAccountsCreateRequest brandAccountsCreateRequest
)
    throws NotFoundException {
        return delegate.brandAccountsCreate(businessHierarchyId,brandAccountsCreateRequest);
    }
    @PATCH
    @Path("/{brand_account_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update a Brand Account", notes = "Update an existing Brand Account", response = BrandAccountsCreate200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @io.swagger.annotations.AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data")
        })
    }, tags={ "business_access_relationships", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = BrandAccountsCreate200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid parameters.", response = BrandAccountsCreate200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not authenticated to update Brand Account", response = BrandAccountsCreate200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to update Brand Account", response = BrandAccountsCreate200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Brand account not found", response = BrandAccountsCreate200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "This account is not a brand account.", response = BrandAccountsCreate200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window.", response = BrandAccountsCreate200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = BrandAccountsCreate200Response.class) })
    public Response brandAccountsUpdate(@ApiParam(value = "business hierarchy node id",required=true) @PathParam("business_hierarchy_id") String businessHierarchyId
,@ApiParam(value = "Unique identifier of a brand account.",required=true) @PathParam("brand_account_id") String brandAccountId
,@ApiParam(value = "" ,required=true) BrandAccountsUpdateRequest brandAccountsUpdateRequest
)
    throws NotFoundException {
        return delegate.brandAccountsUpdate(businessHierarchyId,brandAccountId,brandAccountsUpdateRequest);
    }
}
