package org.openapitools.api;

import org.openapitools.model.BrandAccountsCreate200Response;
import org.openapitools.model.BrandAccountsCreateRequest;
import org.openapitools.model.BrandAccountsUpdateRequest;
import org.openapitools.model.Error;
import org.openapitools.api.BusinessAccessApiService;

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
@Path("/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts")
@RequestScoped

@Api


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-01-31T04:54:28.741368951Z[Etc/UTC]", comments = "Generator version: 7.18.0")

public class BusinessAccessApi  {

  @Context SecurityContext securityContext;

  @Inject BusinessAccessApiService delegate;


    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a Brand Account", notes = "Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.", response = BrandAccountsCreate200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_relationships" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BrandAccountsCreate200Response.class),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response brandAccountsCreate( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "business hierarchy node id",required=true) @PathParam("business_hierarchy_id") String businessHierarchyId, @ApiParam(value = "" ,required=true) BrandAccountsCreateRequest brandAccountsCreateRequest) {
        return delegate.brandAccountsCreate(businessHierarchyId, brandAccountsCreateRequest, securityContext);
    }

    @PATCH
    @Path("/{brand_account_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update a Brand Account", notes = "Update an existing Brand Account", response = BrandAccountsCreate200Response.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_relationships" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BrandAccountsCreate200Response.class),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 401, message = "Not authenticated to update Brand Account", response = Error.class),
        @ApiResponse(code = 403, message = "Not authorized to update Brand Account", response = Error.class),
        @ApiResponse(code = 404, message = "Brand account not found", response = Error.class),
        @ApiResponse(code = 409, message = "This account is not a brand account.", response = Error.class),
        @ApiResponse(code = 429, message = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response brandAccountsUpdate( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "business hierarchy node id",required=true) @PathParam("business_hierarchy_id") String businessHierarchyId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)@ApiParam(value = "Unique identifier of a brand account.",required=true) @PathParam("brand_account_id") String brandAccountId, @ApiParam(value = "" ,required=true) BrandAccountsUpdateRequest brandAccountsUpdateRequest) {
        return delegate.brandAccountsUpdate(businessHierarchyId, brandAccountId, brandAccountsUpdateRequest, securityContext);
    }
}
