package org.openapitools.api;

import org.openapitools.model.BrandAccount;
import org.openapitools.model.BrandAccountCreate;
import org.openapitools.model.BrandAccountUpdate;
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
@Path("/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts")
@Api(description = "the business_access API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BusinessAccessApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create a Brand Account", notes = "Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.", response = BrandAccount.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_relationships" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = BrandAccount.class),
        @ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = BrandAccount.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response brandAccountsCreate(@PathParam("business_hierarchy_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("business hierarchy node id") String businessHierarchyId,@Valid @NotNull BrandAccountCreate brandAccountCreate) {
        return Response.ok().entity("magic!").build();
    }

    @PATCH
    @Path("/{brand_account_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update a Brand Account", notes = "Update an existing Brand Account", response = BrandAccount.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "biz_access:read", description = "See business access data"),
            @AuthorizationScope(scope = "biz_access:write", description = "Create, update, or delete business access data") })
         }, tags={ "business_access_relationships" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The request has succeeded.", response = BrandAccount.class),
        @ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = PinterestLibError.class),
        @ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = PinterestLibError.class),
        @ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = PinterestLibError.class),
        @ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = PinterestLibError.class),
        @ApiResponse(code = 409, message = "The request could not be processed because of a conflict in the current state of the resource.", response = PinterestLibError.class),
        @ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = PinterestLibError.class),
        @ApiResponse(code = 200, message = "An unexpected error response.", response = PinterestLibError.class)
    })
    public Response brandAccountsUpdate(@PathParam("brand_account_id") String brandAccountId,@PathParam("business_hierarchy_id") @Pattern(regexp="^\\d+$") @Size(min=1,max=20) @ApiParam("business hierarchy node id") String businessHierarchyId,@Valid @NotNull BrandAccountUpdate brandAccountUpdate) {
        return Response.ok().entity("magic!").build();
    }
}
