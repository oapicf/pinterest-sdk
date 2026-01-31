package org.openapitools.api;

import org.openapitools.model.BrandAccountsCreate200Response;
import org.openapitools.model.BrandAccountsCreateRequest;
import org.openapitools.model.BrandAccountsUpdateRequest;
import org.openapitools.model.Error;

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
@Path("/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts")
@Api(description = "the business_access API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BusinessAccessApi {

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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response brandAccountsCreate(@PathParam("business_hierarchy_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("business hierarchy node id") String businessHierarchyId,@Valid @NotNull BrandAccountsCreateRequest brandAccountsCreateRequest) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response brandAccountsUpdate(@PathParam("business_hierarchy_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("business hierarchy node id") String businessHierarchyId,@PathParam("brand_account_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("Unique identifier of a brand account.") String brandAccountId,@Valid @NotNull BrandAccountsUpdateRequest brandAccountsUpdateRequest) {
        return Response.ok().entity("magic!").build();
    }
}
