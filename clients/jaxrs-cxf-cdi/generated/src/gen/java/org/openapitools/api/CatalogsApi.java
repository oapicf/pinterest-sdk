package org.openapitools.api;

import org.openapitools.model.CatalogsFeed;
import org.openapitools.model.CatalogsFeedsCreateRequest;
import org.openapitools.model.CatalogsFeedsUpdateRequest;
import org.openapitools.model.CatalogsItems;
import org.openapitools.model.CatalogsItemsBatch;
import org.openapitools.model.CatalogsItemsBatchRequest;
import org.openapitools.model.CatalogsProductGroup;
import org.openapitools.model.CatalogsProductGroupCreateRequest;
import org.openapitools.model.CatalogsProductGroupUpdateRequest;
import org.openapitools.model.Error;
import org.openapitools.model.Paginated;
import org.openapitools.api.CatalogsApiService;

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
@Path("/catalogs")
@RequestScoped

@Api(description = "the catalogs API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2022-07-01T12:00:45.266033Z[Etc/UTC]")

public class CatalogsApi  {

  @Context SecurityContext securityContext;

  @Inject CatalogsApiService delegate;


    @POST
    @Path("/product_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create product group", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create product group to use in Catalogs.", response = Object.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data") })
         }, tags={ "catalogs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Success", response = Object.class),
        @ApiResponse(code = 400, message = "Invalid body.", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized access.", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden. Account not approved for feed mutations yet.", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict. Can't create this catalogs product group with this value.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public Response catalogsProductGroupsCreate(@ApiParam(value = "Request object used to created a catalogs product group." ,required=true) CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest) {
        return delegate.catalogsProductGroupsCreate(catalogsProductGroupCreateRequest, securityContext);
    }

    @DELETE
    @Path("/product_groups/{product_group_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete product group", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a product group from being in use in Catalogs.", response = Void.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data") })
         }, tags={ "catalogs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Catalogs Product Group deleted successfully.", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid catalogs product group id parameters.", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized access.", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden. Account not approved for feed mutations yet.", response = Error.class),
        @ApiResponse(code = 404, message = "Catalogs product group not found.", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict. Can't delete this catalogs product group.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public Response catalogsProductGroupsDelete( @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of a product group",required=true) @PathParam("product_group_id") String productGroupId) {
        return delegate.catalogsProductGroupsDelete(productGroupId, securityContext);
    }

    @GET
    @Path("/product_groups")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get product groups list", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a list of product groups for a given Catalogs Feed Id.", response = Paginated.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data") })
         }, tags={ "catalogs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Paginated.class),
        @ApiResponse(code = 400, message = "Invalid feed parameters.", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized access.", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden. Account not approved for feed mutations yet.", response = Error.class),
        @ApiResponse(code = 404, message = "Data feed not found.", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict. Can't create this catalogs product group with this value.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public Response catalogsProductGroupsList( @NotNull  @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of a feed",required=true)  @QueryParam("feed_id") String feedId, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(100)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.catalogsProductGroupsList(feedId, bookmark, pageSize, securityContext);
    }

    @PATCH
    @Path("/product_groups/{product_group_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update product group", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update product group to use in Catalogs.", response = CatalogsProductGroup.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data") })
         }, tags={ "catalogs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CatalogsProductGroup.class),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized access.", response = Error.class),
        @ApiResponse(code = 404, message = "Catalogs product group not found.", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict. Can't update this catalogs product group to this value.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public Response catalogsProductGroupsUpdate( @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of a product group",required=true) @PathParam("product_group_id") String productGroupId, @ApiParam(value = "Request object used to Update a catalogs product group." ,required=true) CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest) {
        return delegate.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupUpdateRequest, securityContext);
    }

    @GET
    @Path("/feeds/{feed_id}/processing_results")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List processing results for a given feed", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch a feed processing results owned by the owner user account.", response = Paginated.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data") })
         }, tags={ "catalogs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Paginated.class),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized access.", response = Error.class),
        @ApiResponse(code = 404, message = "Feed not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public Response feedProcessingResultsList( @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of a feed",required=true) @PathParam("feed_id") String feedId, @ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(100)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.feedProcessingResultsList(feedId, bookmark, pageSize, securityContext);
    }

    @POST
    @Path("/feeds")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create feed", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create a new feed owned by the \"operating user_account\".", response = CatalogsFeed.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data"),
            @AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data") })
         }, tags={ "catalogs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Success", response = CatalogsFeed.class),
        @ApiResponse(code = 400, message = "Invalid feed parameters.", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized access.", response = Error.class),
        @ApiResponse(code = 403, message = "Business account required.", response = Error.class),
        @ApiResponse(code = 409, message = "User website required.", response = Error.class),
        @ApiResponse(code = 422, message = "Unique feed name is required.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response feedsCreate(@ApiParam(value = "Request object used to created a feed." ,required=true) CatalogsFeedsCreateRequest catalogsFeedsCreateRequest) {
        return delegate.feedsCreate(catalogsFeedsCreateRequest, securityContext);
    }

    @DELETE
    @Path("/feeds/{feed_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete feed", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a feed owned by the \"operating user_account\".", response = Void.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data"),
            @AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data") })
         }, tags={ "catalogs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Feed deleted successfully.", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid feed parameters.", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden. Account not approved for feed mutations yet.", response = Error.class),
        @ApiResponse(code = 404, message = "Data feed not found.", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict. Can't delete a feed with active promotions.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response feedsDelete( @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of a feed",required=true) @PathParam("feed_id") String feedId) {
        return delegate.feedsDelete(feedId, securityContext);
    }

    @GET
    @Path("/feeds/{feed_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get feed", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single feed owned by the \"operating user_account\".", response = CatalogsFeed.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data") })
         }, tags={ "catalogs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CatalogsFeed.class),
        @ApiResponse(code = 400, message = "Invalid feed parameters.", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized access.", response = Error.class),
        @ApiResponse(code = 404, message = "Data feed not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public Response feedsGet( @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of a feed",required=true) @PathParam("feed_id") String feedId) {
        return delegate.feedsGet(feedId, securityContext);
    }

    @GET
    @Path("/feeds")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "List feeds", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch feeds owned by the \"operating user_account\".", response = Paginated.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data") })
         }, tags={ "catalogs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Paginated.class),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized access.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public Response feedsList(@ApiParam(value = "Cursor used to fetch the next page of items")  @QueryParam("bookmark") String bookmark,  @Min(1) @Max(100)@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25")  @QueryParam("page_size") Integer pageSize) {
        return delegate.feedsList(bookmark, pageSize, securityContext);
    }

    @PATCH
    @Path("/feeds/{feed_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update feed", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update a feed owned by the \"operating user_account\".", response = CatalogsFeed.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data"),
            @AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data") })
         }, tags={ "catalogs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CatalogsFeed.class),
        @ApiResponse(code = 400, message = "Invalid feed parameters.", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden. Account not approved for feed mutations yet.", response = Error.class),
        @ApiResponse(code = 404, message = "Data feed not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response feedsUpdate( @Pattern(regexp="^\\d+$")@ApiParam(value = "Unique identifier of a feed",required=true) @PathParam("feed_id") String feedId, @ApiParam(value = "Request object used to update a feed." ,required=true) CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest) {
        return delegate.feedsUpdate(feedId, catalogsFeedsUpdateRequest, securityContext);
    }

    @GET
    @Path("/items/batch/{batch_id}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get catalogs items batch", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single catalogs items batch created by the \"operating user_account\".", response = CatalogsItemsBatch.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data") })
         }, tags={ "catalogs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Response containing the requested catalogs items batch", response = CatalogsItemsBatch.class),
        @ApiResponse(code = 401, message = "Not authorized to access catalogs items batch", response = Error.class),
        @ApiResponse(code = 403, message = "Not authorized to access catalogs items batch", response = Error.class),
        @ApiResponse(code = 404, message = "Catalogs items batch not found", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response itemsBatchGet(@ApiParam(value = "Id of a catalogs items batch to fetch",required=true) @PathParam("batch_id") String batchId) {
        return delegate.itemsBatchGet(batchId, securityContext);
    }

    @POST
    @Path("/items/batch")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Perform an operation on an item batch", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  This endpoint supports multiple operations on a set of one or more catalog items.", response = CatalogsItemsBatch.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data"),
            @AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data") })
         }, tags={ "catalogs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Response containing the requested catalogs items batch", response = CatalogsItemsBatch.class),
        @ApiResponse(code = 401, message = "Not authorized to post catalogs items", response = Error.class),
        @ApiResponse(code = 403, message = "Not authorized to post catalogs items", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response itemsBatchPost(@ApiParam(value = "Request object used to create catalogs items in a batch" ,required=true) CatalogsItemsBatchRequest catalogsItemsBatchRequest) {
        return delegate.itemsBatchPost(catalogsItemsBatchRequest, securityContext);
    }

    @GET
    @Path("/items")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get catalogs items", notes = "Get the items of the catalog created by the \"operating user_account\"", response = CatalogsItems.class, authorizations = {
        @Authorization(value = "pinterest_oauth2", scopes = {
            @AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data") })
         }, tags={ "catalogs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Response containing the requested catalogs items", response = CatalogsItems.class),
        @ApiResponse(code = 401, message = "Not authorized to access catalogs items", response = Error.class),
        @ApiResponse(code = 403, message = "Not authorized to access catalogs items", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public Response itemsGet( @NotNull @ApiParam(value = "Country for the Catalogs Items",required=true)  @QueryParam("country") String country,  @NotNull @ApiParam(value = "Catalos Item ids",required=true)  @QueryParam("item_ids") List<String> itemIds,  @NotNull @ApiParam(value = "Language for the Catalogs Items",required=true)  @QueryParam("language") String language) {
        return delegate.itemsGet(country, itemIds, language, securityContext);
    }
}
