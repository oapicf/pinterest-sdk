package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.CatalogsApiService;
import org.openapitools.api.factories.CatalogsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CatalogsFeed;
import org.openapitools.model.CatalogsItemValidationIssue;
import org.openapitools.model.CatalogsItems;
import org.openapitools.model.CatalogsItemsBatch;
import org.openapitools.model.CatalogsItemsFilters;
import org.openapitools.model.CatalogsList200Response;
import org.openapitools.model.CatalogsListProductsByFilterRequest;
import org.openapitools.model.CatalogsProductGroupPinsList200Response;
import org.openapitools.model.CatalogsProductGroupProductCounts;
import org.openapitools.model.CatalogsProductGroupsCreate201Response;
import org.openapitools.model.CatalogsProductGroupsCreateRequest;
import org.openapitools.model.CatalogsProductGroupsList200Response;
import org.openapitools.model.CatalogsProductGroupsUpdateRequest;
import org.openapitools.model.Error;
import org.openapitools.model.FeedProcessingResultsList200Response;
import org.openapitools.model.FeedsCreateRequest;
import org.openapitools.model.FeedsList200Response;
import org.openapitools.model.FeedsUpdateRequest;
import org.openapitools.model.ItemsBatchPostRequest;
import org.openapitools.model.ItemsIssuesList200Response;
import java.util.List;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/catalogs")


@io.swagger.annotations.Api(description = "the catalogs API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsApi  {
   private final CatalogsApiService delegate = CatalogsApiServiceFactory.getCatalogsApi();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List catalogs", notes = "Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>", response = CatalogsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = CatalogsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid parameters.", response = CatalogsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access.", response = CatalogsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = CatalogsList200Response.class) })
    public Response catalogsList(@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.catalogsList(bookmark,pageSize,adAccountId);
    }
    @GET
    @Path("/product_groups/{product_group_id}/products")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List products for a Product Group", notes = "Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>", response = CatalogsProductGroupPinsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data"),
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read", description = "See your public Pins")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = CatalogsProductGroupPinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid parameters.", response = CatalogsProductGroupPinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access.", response = CatalogsProductGroupPinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Catalogs product group not found.", response = CatalogsProductGroupPinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = CatalogsProductGroupPinsList200Response.class) })
    public Response catalogsProductGroupPinsList(@ApiParam(value = "Unique identifier of a product group",required=true) @PathParam("product_group_id") String productGroupId
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.catalogsProductGroupPinsList(productGroupId,bookmark,pageSize,adAccountId);
    }
    @POST
    @Path("/product_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create product group", notes = "Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>", response = CatalogsProductGroupsCreate201Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Success", response = CatalogsProductGroupsCreate201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid body.", response = CatalogsProductGroupsCreate201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access.", response = CatalogsProductGroupsCreate201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden. Account not approved for catalog product group mutations yet.", response = CatalogsProductGroupsCreate201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict. Can't create this catalogs product group with this value.", response = CatalogsProductGroupsCreate201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = CatalogsProductGroupsCreate201Response.class) })
    public Response catalogsProductGroupsCreate(@ApiParam(value = "Request object used to created a catalogs product group." ,required=true) CatalogsProductGroupsCreateRequest catalogsProductGroupsCreateRequest
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.catalogsProductGroupsCreate(catalogsProductGroupsCreateRequest,adAccountId);
    }
    @DELETE
    @Path("/product_groups/{product_group_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete product group", notes = "Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Catalogs Product Group deleted successfully.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid catalogs product group id parameters.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden. Account not approved for catalog product group mutations yet.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Catalogs product group not found.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict. Can't delete this catalogs product group.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = Void.class) })
    public Response catalogsProductGroupsDelete(@ApiParam(value = "Unique identifier of a product group",required=true) @PathParam("product_group_id") String productGroupId
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.catalogsProductGroupsDelete(productGroupId,adAccountId);
    }
    @GET
    @Path("/product_groups/{product_group_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get product group", notes = "Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>", response = CatalogsProductGroupsCreate201Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = CatalogsProductGroupsCreate201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid catalogs product group id parameters.", response = CatalogsProductGroupsCreate201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access.", response = CatalogsProductGroupsCreate201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden. Account not approved for catalog product group mutations yet.", response = CatalogsProductGroupsCreate201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Catalogs product group not found.", response = CatalogsProductGroupsCreate201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict. Can't get a catalogs product group without an existing catalog.", response = CatalogsProductGroupsCreate201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = CatalogsProductGroupsCreate201Response.class) })
    public Response catalogsProductGroupsGet(@ApiParam(value = "Unique identifier of a product group",required=true) @PathParam("product_group_id") String productGroupId
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.catalogsProductGroupsGet(productGroupId,adAccountId);
    }
    @GET
    @Path("/product_groups")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List product groups", notes = "Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>", response = CatalogsProductGroupsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = CatalogsProductGroupsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid feed parameters.", response = CatalogsProductGroupsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access.", response = CatalogsProductGroupsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden. Account not approved for catalog product group mutations yet.", response = CatalogsProductGroupsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Data feed not found.", response = CatalogsProductGroupsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict. Can't create this catalogs product group with this value.", response = CatalogsProductGroupsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = CatalogsProductGroupsList200Response.class) })
    public Response catalogsProductGroupsList(@ApiParam(value = "Filter entities for a given feed_id. If not given, all feeds are considered.") @QueryParam("feed_id") String feedId
,@ApiParam(value = "Filter entities for a given catalog_id. If not given, all catalogs are considered.") @QueryParam("catalog_id") String catalogId
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.catalogsProductGroupsList(feedId,catalogId,bookmark,pageSize,adAccountId);
    }
    @GET
    @Path("/product_groups/{product_group_id}/product_counts")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get product counts for a Product Group", notes = "Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>", response = CatalogsProductGroupProductCounts.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = CatalogsProductGroupProductCounts.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Product Group Not Found.", response = CatalogsProductGroupProductCounts.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Can't access this feature without an existing catalog.", response = CatalogsProductGroupProductCounts.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = CatalogsProductGroupProductCounts.class) })
    public Response catalogsProductGroupsProductCountsGet(@ApiParam(value = "Unique identifier of a product group",required=true) @PathParam("product_group_id") String productGroupId
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.catalogsProductGroupsProductCountsGet(productGroupId,adAccountId);
    }
    @PATCH
    @Path("/product_groups/{product_group_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update product group", notes = "Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>", response = CatalogsProductGroupsCreate201Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = CatalogsProductGroupsCreate201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid parameters.", response = CatalogsProductGroupsCreate201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access.", response = CatalogsProductGroupsCreate201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden. Account not approved for catalog product group mutations yet.", response = CatalogsProductGroupsCreate201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Catalogs product group not found.", response = CatalogsProductGroupsCreate201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict. Can't update this catalogs product group to this value.", response = CatalogsProductGroupsCreate201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = CatalogsProductGroupsCreate201Response.class) })
    public Response catalogsProductGroupsUpdate(@ApiParam(value = "Unique identifier of a product group",required=true) @PathParam("product_group_id") String productGroupId
,@ApiParam(value = "Request object used to Update a catalogs product group." ,required=true) CatalogsProductGroupsUpdateRequest catalogsProductGroupsUpdateRequest
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.catalogsProductGroupsUpdate(productGroupId,catalogsProductGroupsUpdateRequest,adAccountId);
    }
    @GET
    @Path("/feeds/{feed_id}/processing_results")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List processing results for a given feed", notes = "Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>", response = FeedProcessingResultsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = FeedProcessingResultsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid parameters.", response = FeedProcessingResultsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access.", response = FeedProcessingResultsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Feed not found.", response = FeedProcessingResultsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = FeedProcessingResultsList200Response.class) })
    public Response feedProcessingResultsList(@ApiParam(value = "Unique identifier of a feed",required=true) @PathParam("feed_id") String feedId
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.feedProcessingResultsList(feedId,bookmark,pageSize,adAccountId);
    }
    @POST
    @Path("/feeds")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create feed", notes = "Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.", response = CatalogsFeed.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data"),
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Success", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid feed parameters.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Business account required.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "User website required.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 422, message = "Unique feed name is required.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Not implemented (absent \"default_country\" or \"default_locale\").", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = CatalogsFeed.class) })
    public Response feedsCreate(@ApiParam(value = "Request object used to created a feed." ,required=true) FeedsCreateRequest feedsCreateRequest
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.feedsCreate(feedsCreateRequest,adAccountId);
    }
    @DELETE
    @Path("/feeds/{feed_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete feed", notes = "Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data"),
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Feed deleted successfully.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid feed parameters.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden. Account not approved for feed mutations yet.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Data feed not found.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict. Can't delete a feed with active promotions.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    public Response feedsDelete(@ApiParam(value = "Unique identifier of a feed",required=true) @PathParam("feed_id") String feedId
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.feedsDelete(feedId,adAccountId);
    }
    @GET
    @Path("/feeds/{feed_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get feed", notes = "Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.", response = CatalogsFeed.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid feed parameters.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Data feed not found.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = CatalogsFeed.class) })
    public Response feedsGet(@ApiParam(value = "Unique identifier of a feed",required=true) @PathParam("feed_id") String feedId
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.feedsGet(feedId,adAccountId);
    }
    @GET
    @Path("/feeds")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List feeds", notes = "Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.", response = FeedsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = FeedsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid parameters.", response = FeedsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access.", response = FeedsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = FeedsList200Response.class) })
    public Response feedsList(@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "Filter entities for a given catalog_id. If not given, all catalogs are considered.") @QueryParam("catalog_id") String catalogId
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.feedsList(bookmark,pageSize,catalogId,adAccountId);
    }
    @PATCH
    @Path("/feeds/{feed_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update feed", notes = "Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.", response = CatalogsFeed.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data"),
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid feed parameters.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden. Account not approved for feed mutations yet.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Data feed not found.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = CatalogsFeed.class) })
    public Response feedsUpdate(@ApiParam(value = "Unique identifier of a feed",required=true) @PathParam("feed_id") String feedId
,@ApiParam(value = "Request object used to update a feed." ,required=true) FeedsUpdateRequest feedsUpdateRequest
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.feedsUpdate(feedId,feedsUpdateRequest,adAccountId);
    }
    @GET
    @Path("/items/batch/{batch_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get catalogs item batch status", notes = "Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.", response = CatalogsItemsBatch.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Response containing the requested catalogs items batch", response = CatalogsItemsBatch.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not authenticated to access catalogs items batch", response = CatalogsItemsBatch.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to access catalogs items batch", response = CatalogsItemsBatch.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Catalogs items batch not found", response = CatalogsItemsBatch.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Method Not Allowed.", response = CatalogsItemsBatch.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = CatalogsItemsBatch.class) })
    public Response itemsBatchGet(@ApiParam(value = "Id of a catalogs items batch to fetch",required=true) @PathParam("batch_id") String batchId
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.itemsBatchGet(batchId,adAccountId);
    }
    @POST
    @Path("/items/batch")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Operate on item batch", notes = "This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.", response = CatalogsItemsBatch.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data"),
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Response containing the requested catalogs items batch", response = CatalogsItemsBatch.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request parameters.", response = CatalogsItemsBatch.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not authenticated to post catalogs items", response = CatalogsItemsBatch.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to post catalogs items", response = CatalogsItemsBatch.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = CatalogsItemsBatch.class) })
    public Response itemsBatchPost(@ApiParam(value = "Request object used to create catalogs items in a batch" ,required=true) ItemsBatchPostRequest itemsBatchPostRequest
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.itemsBatchPost(itemsBatchPostRequest,adAccountId);
    }
    @GET
    @Path("/items")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get catalogs items", notes = "Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/shopping/catalog/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.", response = CatalogsItems.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Response containing the requested catalogs items", response = CatalogsItems.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid request parameters.", response = CatalogsItems.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Not authorized to access catalogs items", response = CatalogsItems.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Not authorized to access catalogs items", response = CatalogsItems.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = CatalogsItems.class) })
    public Response itemsGet(@ApiParam(value = "Country for the Catalogs Items",required=true) @QueryParam("country") String country
,@ApiParam(value = "Language for the Catalogs Items",required=true) @QueryParam("language") String language
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
,@ApiParam(value = "This parameter is deprecated. Use filters instead.") @QueryParam("item_ids") List<String> itemIds
,@ApiParam(value = "Identifies items to be retrieved. This is a required parameter.") @QueryParam("filters") CatalogsItemsFilters filters
)
    throws NotFoundException {
        return delegate.itemsGet(country,language,adAccountId,itemIds,filters);
    }
    @GET
    @Path("/processing_results/{processing_result_id}/item_issues")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List item issues for a given processing result", notes = "List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>", response = ItemsIssuesList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = ItemsIssuesList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access.", response = ItemsIssuesList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Processing Result not found.", response = ItemsIssuesList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 501, message = "Not implemented.", response = ItemsIssuesList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = ItemsIssuesList200Response.class) })
    public Response itemsIssuesList(@ApiParam(value = "Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list).",required=true) @PathParam("processing_result_id") String processingResultId
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.") @QueryParam("item_numbers") List<Integer> itemNumbers
,@ApiParam(value = "Filter item validation issues that have a given type of item validation issue.", allowableValues="AD_LINK_FORMAT_WARNING, AD_LINK_SAME_AS_LINK, ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG, ADDITIONAL_IMAGE_LINK_WARNING, ADULT_INVALID, ADWORDS_FORMAT_INVALID, ADWORDS_FORMAT_WARNING, ADWORDS_SAME_AS_LINK, AGE_GROUP_INVALID, ANDROID_DEEP_LINK_INVALID, AVAILABILITY_DATE_INVALID, AVAILABILITY_INVALID, BLOCKLISTED_IMAGE_SIGNATURE, COUNTRY_DOES_NOT_MAP_TO_CURRENCY, CUSTOM_LABEL_LENGTH_TOO_LONG, DESCRIPTION_LENGTH_TOO_LONG, DESCRIPTION_MISSING, DUPLICATE_PRODUCTS, EXPIRATION_DATE_INVALID, GENDER_INVALID, GTIN_INVALID, IMAGE_LINK_INVALID, IMAGE_LINK_LENGTH_TOO_LONG, IMAGE_LINK_MISSING, IMAGE_LINK_WARNING, INVALID_DOMAIN, IOS_DEEP_LINK_INVALID, IS_BUNDLE_INVALID, ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE, ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE, ITEMID_MISSING, LINK_FORMAT_INVALID, LINK_FORMAT_WARNING, LINK_LENGTH_TOO_LONG, LIST_PRICE_INVALID, MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED, MIN_AD_PRICE_INVALID, MPN_INVALID, MULTIPACK_INVALID, OPTIONAL_CONDITION_INVALID, OPTIONAL_CONDITION_MISSING, OPTIONAL_PRODUCT_CATEGORY_INVALID, OPTIONAL_PRODUCT_CATEGORY_MISSING, PARSE_LINE_ERROR, PINJOIN_CONTENT_UNSAFE, PRICE_CANNOT_BE_DETERMINED, PRICE_MISSING, PRODUCT_CATEGORY_DEPTH_WARNING, PRODUCT_LINK_MISSING, PRODUCT_PRICE_INVALID, PRODUCT_TYPE_LENGTH_TOO_LONG, SALE_DATE_INVALID, SALES_PRICE_INVALID, SALES_PRICE_TOO_HIGH, SALES_PRICE_TOO_LOW, SHIPPING_INVALID, SHIPPING_HEIGHT_INVALID, SHIPPING_WEIGHT_INVALID, SHIPPING_WIDTH_INVALID, SIZE_SYSTEM_INVALID, SIZE_TYPE_INVALID, TAX_INVALID, TITLE_LENGTH_TOO_LONG, TITLE_MISSING, TOO_MANY_ADDITIONAL_IMAGE_LINKS, UTM_SOURCE_AUTO_CORRECTED, WEIGHT_UNIT_INVALID") @QueryParam("item_validation_issue") CatalogsItemValidationIssue itemValidationIssue
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.itemsIssuesList(processingResultId,bookmark,pageSize,itemNumbers,itemValidationIssue,adAccountId);
    }
    @POST
    @Path("/products/get_by_product_group_filters")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List filtered products", notes = "List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>", response = CatalogsProductGroupPinsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data"),
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read", description = "See your public Pins")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success", response = CatalogsProductGroupPinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized access.", response = CatalogsProductGroupPinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict. Can't get products.", response = CatalogsProductGroupPinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error.", response = CatalogsProductGroupPinsList200Response.class) })
    public Response productsByProductGroupFilterList(@ApiParam(value = "Object holding a group of filters for a catalog product group" ,required=true) CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.productsByProductGroupFilterList(catalogsListProductsByFilterRequest,bookmark,pageSize,adAccountId);
    }
}
