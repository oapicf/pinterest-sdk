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

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/catalogs")
@Api(description = "the catalogs API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-07-01T12:01:13.464712Z[Etc/UTC]")public class CatalogsApi {

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
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response catalogsProductGroupsCreate(@Valid @NotNull CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response catalogsProductGroupsDelete(@PathParam("product_group_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of a product group") String productGroupId) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response catalogsProductGroupsList(@QueryParam("feed_id") @NotNull @Pattern(regexp="^\\d+$")  @ApiParam("Unique identifier of a feed")  String feedId,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(100) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response catalogsProductGroupsUpdate(@PathParam("product_group_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of a product group") String productGroupId,@Valid @NotNull CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response feedProcessingResultsList(@PathParam("feed_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of a feed") String feedId,@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(100) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response feedsCreate(@Valid @NotNull CatalogsFeedsCreateRequest catalogsFeedsCreateRequest) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response feedsDelete(@PathParam("feed_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of a feed") String feedId) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response feedsGet(@PathParam("feed_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of a feed") String feedId) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response feedsList(@QueryParam("bookmark")  @ApiParam("Cursor used to fetch the next page of items")  String bookmark,@QueryParam("page_size") @Min(1) @Max(100) @DefaultValue("25")  @ApiParam("Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information.")  Integer pageSize) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response feedsUpdate(@PathParam("feed_id") @Pattern(regexp="^\\d+$") @ApiParam("Unique identifier of a feed") String feedId,@Valid @NotNull CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response itemsBatchGet(@PathParam("batch_id") @ApiParam("Id of a catalogs items batch to fetch") String batchId) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response itemsBatchPost(@Valid @NotNull CatalogsItemsBatchRequest catalogsItemsBatchRequest) {
        return Response.ok().entity("magic!").build();
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
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response itemsGet(@QueryParam("country") @NotNull  @ApiParam("Country for the Catalogs Items")  String country,@QueryParam("item_ids") @NotNull  @ApiParam("Catalos Item ids")  List<String> itemIds,@QueryParam("language") @NotNull  @ApiParam("Language for the Catalogs Items")  String language) {
        return Response.ok().entity("magic!").build();
    }
}
