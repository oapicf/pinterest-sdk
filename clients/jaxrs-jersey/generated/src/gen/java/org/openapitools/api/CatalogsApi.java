package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.CatalogsApiService;
import org.openapitools.api.factories.CatalogsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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

@Path("/catalogs")


@io.swagger.annotations.Api(description = "the catalogs API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2022-05-08T00:33:19.615491Z[Etc/UTC]")
public class CatalogsApi  {
   private final CatalogsApiService delegate;

   public CatalogsApi(@Context ServletConfig servletContext) {
      CatalogsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("CatalogsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (CatalogsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = CatalogsApiServiceFactory.getCatalogsApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/product_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create product group", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create product group to use in Catalogs.", response = Object.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 201, message = "Success", response = Object.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid body.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden. Account not approved for feed mutations yet.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict. Can't create this catalogs product group with this value.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response catalogsProductGroupsCreate(@ApiParam(value = "Request object used to created a catalogs product group.", required = true) @NotNull @Valid  CatalogsProductGroupCreateRequest catalogsProductGroupCreateRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.catalogsProductGroupsCreate(catalogsProductGroupCreateRequest, securityContext);
    }
    @DELETE
    @Path("/product_groups/{product_group_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete product group", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a product group from being in use in Catalogs.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 204, message = "Catalogs Product Group deleted successfully.", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid catalogs product group id parameters.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden. Account not approved for feed mutations yet.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Catalogs product group not found.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict. Can't delete this catalogs product group.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response catalogsProductGroupsDelete(@ApiParam(value = "Unique identifier of a product group", required = true) @PathParam("product_group_id") @NotNull  @Pattern(regexp="^\\d+$") String productGroupId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.catalogsProductGroupsDelete(productGroupId, securityContext);
    }
    @GET
    @Path("/product_groups")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get product groups list", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a list of product groups for a given Catalogs Feed Id.", response = Paginated.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Paginated.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid feed parameters.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden. Account not approved for feed mutations yet.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Data feed not found.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict. Can't create this catalogs product group with this value.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response catalogsProductGroupsList(@ApiParam(value = "Unique identifier of a feed", required = true) @QueryParam("feed_id") @NotNull  @Pattern(regexp="^\\d+$") String feedId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(100) Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.catalogsProductGroupsList(feedId, bookmark, pageSize, securityContext);
    }
    @PATCH
    @Path("/product_groups/{product_group_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update product group", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update product group to use in Catalogs.", response = CatalogsProductGroup.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = CatalogsProductGroup.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Catalogs product group not found.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict. Can't update this catalogs product group to this value.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response catalogsProductGroupsUpdate(@ApiParam(value = "Unique identifier of a product group", required = true) @PathParam("product_group_id") @NotNull  @Pattern(regexp="^\\d+$") String productGroupId,@ApiParam(value = "Request object used to Update a catalogs product group.", required = true) @NotNull @Valid  CatalogsProductGroupUpdateRequest catalogsProductGroupUpdateRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupUpdateRequest, securityContext);
    }
    @GET
    @Path("/feeds/{feed_id}/processing_results")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List processing results for a given feed", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch a feed processing results owned by the owner user account.", response = Paginated.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Paginated.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Feed not found.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response feedProcessingResultsList(@ApiParam(value = "Unique identifier of a feed", required = true) @PathParam("feed_id") @NotNull  @Pattern(regexp="^\\d+$") String feedId,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(100) Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.feedProcessingResultsList(feedId, bookmark, pageSize, securityContext);
    }
    @POST
    @Path("/feeds")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create feed", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create a new feed owned by the \"operating user_account\".", response = CatalogsFeed.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data"),
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 201, message = "Success", response = CatalogsFeed.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid feed parameters.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Business account required.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 409, message = "User website required.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 422, message = "Unique feed name is required.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response feedsCreate(@ApiParam(value = "Request object used to created a feed.", required = true) @NotNull @Valid  CatalogsFeedsCreateRequest catalogsFeedsCreateRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.feedsCreate(catalogsFeedsCreateRequest, securityContext);
    }
    @DELETE
    @Path("/feeds/{feed_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete feed", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a feed owned by the \"operating user_account\".", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data"),
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 204, message = "Feed deleted successfully.", response = Void.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid feed parameters.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden. Account not approved for feed mutations yet.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Data feed not found.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict. Can't delete a feed with active promotions.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response feedsDelete(@ApiParam(value = "Unique identifier of a feed", required = true) @PathParam("feed_id") @NotNull  @Pattern(regexp="^\\d+$") String feedId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.feedsDelete(feedId, securityContext);
    }
    @GET
    @Path("/feeds/{feed_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get feed", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single feed owned by the \"operating user_account\".", response = CatalogsFeed.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = CatalogsFeed.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid feed parameters.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Data feed not found.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response feedsGet(@ApiParam(value = "Unique identifier of a feed", required = true) @PathParam("feed_id") @NotNull  @Pattern(regexp="^\\d+$") String feedId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.feedsGet(feedId, securityContext);
    }
    @GET
    @Path("/feeds")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List feeds", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch feeds owned by the \"operating user_account\".", response = Paginated.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = Paginated.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid parameters.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Error.class)
    })
    public Response feedsList(@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark")  String bookmark,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.", defaultValue = "25") @DefaultValue("25") @QueryParam("page_size")  @Min(1) @Max(100) Integer pageSize,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.feedsList(bookmark, pageSize, securityContext);
    }
    @PATCH
    @Path("/feeds/{feed_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update feed", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update a feed owned by the \"operating user_account\".", response = CatalogsFeed.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data"),
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = CatalogsFeed.class),
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid feed parameters.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden. Account not approved for feed mutations yet.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Data feed not found.", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response feedsUpdate(@ApiParam(value = "Unique identifier of a feed", required = true) @PathParam("feed_id") @NotNull  @Pattern(regexp="^\\d+$") String feedId,@ApiParam(value = "Request object used to update a feed.", required = true) @NotNull @Valid  CatalogsFeedsUpdateRequest catalogsFeedsUpdateRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.feedsUpdate(feedId, catalogsFeedsUpdateRequest, securityContext);
    }
    @GET
    @Path("/items/batch/{batch_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get catalogs items batch", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single catalogs items batch created by the \"operating user_account\".", response = CatalogsItemsBatch.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Response containing the requested catalogs items batch", response = CatalogsItemsBatch.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not authorized to access catalogs items batch", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to access catalogs items batch", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 404, message = "Catalogs items batch not found", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response itemsBatchGet(@ApiParam(value = "Id of a catalogs items batch to fetch", required = true) @PathParam("batch_id") @NotNull  String batchId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.itemsBatchGet(batchId, securityContext);
    }
    @POST
    @Path("/items/batch")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Perform an operation on an item batch", notes = "<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  This endpoint supports multiple operations on a set of one or more catalog items.", response = CatalogsItemsBatch.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data"),
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Response containing the requested catalogs items batch", response = CatalogsItemsBatch.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not authorized to post catalogs items", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to post catalogs items", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response itemsBatchPost(@ApiParam(value = "Request object used to create catalogs items in a batch", required = true) @NotNull @Valid  CatalogsItemsBatchRequest catalogsItemsBatchRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.itemsBatchPost(catalogsItemsBatchRequest, securityContext);
    }
    @GET
    @Path("/items")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get catalogs items", notes = "Get the items of the catalog created by the \"operating user_account\"", response = CatalogsItems.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Response containing the requested catalogs items", response = CatalogsItems.class),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not authorized to access catalogs items", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to access catalogs items", response = Error.class),
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Error.class)
    })
    public Response itemsGet(@ApiParam(value = "Country for the Catalogs Items", required = true) @QueryParam("country") @NotNull  String country,@ApiParam(value = "Catalos Item ids", required = true) @QueryParam("item_ids") @NotNull @Valid  List<String> itemIds,@ApiParam(value = "Language for the Catalogs Items", required = true) @QueryParam("language") @NotNull  String language,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.itemsGet(country, itemIds, language, securityContext);
    }
}
