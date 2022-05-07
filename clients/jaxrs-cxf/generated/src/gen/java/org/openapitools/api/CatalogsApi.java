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

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
@Path("/catalogs")
@Api(value = "/", description = "")
public interface CatalogsApi  {

    /**
     * Create product group
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create product group to use in Catalogs.
     *
     */
    @POST
    @Path("/product_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create product group", tags={ "catalogs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Success", response = Object.class),
        @ApiResponse(code = 400, message = "Invalid body.", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized access.", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden. Account not approved for feed mutations yet.", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict. Can't create this catalogs product group with this value.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public Object catalogsProductGroupsCreate(@Valid @NotNull CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest);

    /**
     * Delete product group
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a product group from being in use in Catalogs.
     *
     */
    @DELETE
    @Path("/product_groups/{product_group_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete product group", tags={ "catalogs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Catalogs Product Group deleted successfully."),
        @ApiResponse(code = 400, message = "Invalid catalogs product group id parameters.", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized access.", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden. Account not approved for feed mutations yet.", response = Error.class),
        @ApiResponse(code = 404, message = "Catalogs product group not found.", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict. Can't delete this catalogs product group.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public void catalogsProductGroupsDelete(@PathParam("product_group_id") @Pattern(regexp="^\\d+$") String productGroupId);

    /**
     * Get product groups list
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a list of product groups for a given Catalogs Feed Id.
     *
     */
    @GET
    @Path("/product_groups")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get product groups list", tags={ "catalogs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Paginated.class),
        @ApiResponse(code = 400, message = "Invalid feed parameters.", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized access.", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden. Account not approved for feed mutations yet.", response = Error.class),
        @ApiResponse(code = 404, message = "Data feed not found.", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict. Can't create this catalogs product group with this value.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public Paginated catalogsProductGroupsList(@QueryParam("feed_id") @NotNull @Pattern(regexp="^\\d+$") String feedId, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @Min(1) @Max(100) @DefaultValue("25")Integer pageSize);

    /**
     * Update product group
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update product group to use in Catalogs.
     *
     */
    @PATCH
    @Path("/product_groups/{product_group_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update product group", tags={ "catalogs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CatalogsProductGroup.class),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized access.", response = Error.class),
        @ApiResponse(code = 404, message = "Catalogs product group not found.", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict. Can't update this catalogs product group to this value.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public CatalogsProductGroup catalogsProductGroupsUpdate(@PathParam("product_group_id") @Pattern(regexp="^\\d+$") String productGroupId, @Valid @NotNull CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest);

    /**
     * List processing results for a given feed
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch a feed processing results owned by the owner user account.
     *
     */
    @GET
    @Path("/feeds/{feed_id}/processing_results")
    @Produces({ "application/json" })
    @ApiOperation(value = "List processing results for a given feed", tags={ "catalogs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Paginated.class),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized access.", response = Error.class),
        @ApiResponse(code = 404, message = "Feed not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public Paginated feedProcessingResultsList(@PathParam("feed_id") @Pattern(regexp="^\\d+$") String feedId, @QueryParam("bookmark") String bookmark, @QueryParam("page_size") @Min(1) @Max(100) @DefaultValue("25")Integer pageSize);

    /**
     * Create feed
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create a new feed owned by the \&quot;operating user_account\&quot;.
     *
     */
    @POST
    @Path("/feeds")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create feed", tags={ "catalogs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Success", response = CatalogsFeed.class),
        @ApiResponse(code = 400, message = "Invalid feed parameters.", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized access.", response = Error.class),
        @ApiResponse(code = 403, message = "Business account required.", response = Error.class),
        @ApiResponse(code = 409, message = "User website required.", response = Error.class),
        @ApiResponse(code = 422, message = "Unique feed name is required.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public CatalogsFeed feedsCreate(@Valid @NotNull CatalogsFeedsCreateRequest catalogsFeedsCreateRequest);

    /**
     * Delete feed
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a feed owned by the \&quot;operating user_account\&quot;.
     *
     */
    @DELETE
    @Path("/feeds/{feed_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Delete feed", tags={ "catalogs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Feed deleted successfully."),
        @ApiResponse(code = 400, message = "Invalid feed parameters.", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden. Account not approved for feed mutations yet.", response = Error.class),
        @ApiResponse(code = 404, message = "Data feed not found.", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict. Can't delete a feed with active promotions.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public void feedsDelete(@PathParam("feed_id") @Pattern(regexp="^\\d+$") String feedId);

    /**
     * Get feed
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single feed owned by the \&quot;operating user_account\&quot;.
     *
     */
    @GET
    @Path("/feeds/{feed_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get feed", tags={ "catalogs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CatalogsFeed.class),
        @ApiResponse(code = 400, message = "Invalid feed parameters.", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized access.", response = Error.class),
        @ApiResponse(code = 404, message = "Data feed not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public CatalogsFeed feedsGet(@PathParam("feed_id") @Pattern(regexp="^\\d+$") String feedId);

    /**
     * List feeds
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch feeds owned by the \&quot;operating user_account\&quot;.
     *
     */
    @GET
    @Path("/feeds")
    @Produces({ "application/json" })
    @ApiOperation(value = "List feeds", tags={ "catalogs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = Paginated.class),
        @ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized access.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error.", response = Error.class) })
    public Paginated feedsList(@QueryParam("bookmark") String bookmark, @QueryParam("page_size") @Min(1) @Max(100) @DefaultValue("25")Integer pageSize);

    /**
     * Update feed
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update a feed owned by the \&quot;operating user_account\&quot;.
     *
     */
    @PATCH
    @Path("/feeds/{feed_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update feed", tags={ "catalogs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CatalogsFeed.class),
        @ApiResponse(code = 400, message = "Invalid feed parameters.", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden. Account not approved for feed mutations yet.", response = Error.class),
        @ApiResponse(code = 404, message = "Data feed not found.", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public CatalogsFeed feedsUpdate(@PathParam("feed_id") @Pattern(regexp="^\\d+$") String feedId, @Valid @NotNull CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest);

    /**
     * Get catalogs items batch
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single catalogs items batch created by the \&quot;operating user_account\&quot;.
     *
     */
    @GET
    @Path("/items/batch/{batch_id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get catalogs items batch", tags={ "catalogs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Response containing the requested catalogs items batch", response = CatalogsItemsBatch.class),
        @ApiResponse(code = 401, message = "Not authorized to access catalogs items batch", response = Error.class),
        @ApiResponse(code = 403, message = "Not authorized to access catalogs items batch", response = Error.class),
        @ApiResponse(code = 404, message = "Catalogs items batch not found", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public CatalogsItemsBatch itemsBatchGet(@PathParam("batch_id") String batchId);

    /**
     * Perform an operation on an item batch
     *
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Understanding-catalog-management&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  This endpoint supports multiple operations on a set of one or more catalog items.
     *
     */
    @POST
    @Path("/items/batch")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Perform an operation on an item batch", tags={ "catalogs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Response containing the requested catalogs items batch", response = CatalogsItemsBatch.class),
        @ApiResponse(code = 401, message = "Not authorized to post catalogs items", response = Error.class),
        @ApiResponse(code = 403, message = "Not authorized to post catalogs items", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public CatalogsItemsBatch itemsBatchPost(@Valid @NotNull CatalogsItemsBatchRequest catalogsItemsBatchRequest);

    /**
     * Get catalogs items
     *
     * Get the items of the catalog created by the \&quot;operating user_account\&quot;
     *
     */
    @GET
    @Path("/items")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get catalogs items", tags={ "catalogs" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Response containing the requested catalogs items", response = CatalogsItems.class),
        @ApiResponse(code = 401, message = "Not authorized to access catalogs items", response = Error.class),
        @ApiResponse(code = 403, message = "Not authorized to access catalogs items", response = Error.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    public CatalogsItems itemsGet(@QueryParam("country") @NotNull String country, @QueryParam("item_ids") @NotNull List<String> itemIds, @QueryParam("language") @NotNull String language);
}
