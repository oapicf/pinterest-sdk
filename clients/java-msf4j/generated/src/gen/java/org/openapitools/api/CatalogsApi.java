package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.CatalogsApiService;
import org.openapitools.api.factories.CatalogsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Catalog;
import org.openapitools.model.CatalogCreate;
import org.openapitools.model.CatalogsAvailableFilterValues;
import org.openapitools.model.CatalogsCreateReportResponse;
import org.openapitools.model.CatalogsFeed;
import org.openapitools.model.CatalogsFeedCreateRequestSchema;
import org.openapitools.model.CatalogsFeedIngestion;
import org.openapitools.model.CatalogsFeedUpdateRequestSchema;
import org.openapitools.model.CatalogsItemValidationIssue;
import org.openapitools.model.CatalogsItemsBatch;
import org.openapitools.model.CatalogsItemsBatchPostRequest;
import org.openapitools.model.CatalogsItemsRequest;
import org.openapitools.model.CatalogsList200Response;
import org.openapitools.model.CatalogsListProductsByFilterRequest;
import org.openapitools.model.CatalogsLocalStoresCreate200ResponseInner;
import org.openapitools.model.CatalogsLocalStoresDelete200ResponseInner;
import org.openapitools.model.CatalogsLocalStoresList200Response;
import org.openapitools.model.CatalogsLocale;
import org.openapitools.model.CatalogsProductGroupPinsList200Response;
import org.openapitools.model.CatalogsProductGroupProductCountsVertical;
import org.openapitools.model.CatalogsProductGroupsCreateManyRequestItems;
import org.openapitools.model.CatalogsProductGroupsCreateRequestSchema;
import org.openapitools.model.CatalogsProductGroupsList200Response;
import org.openapitools.model.CatalogsProductGroupsUpdateRequestSchema;
import org.openapitools.model.CatalogsReport;
import org.openapitools.model.CatalogsReportParameters;
import org.openapitools.model.CatalogsReportStatsParameters;
import org.openapitools.model.CatalogsVerticalProductGroup;
import org.openapitools.model.Country;
import org.openapitools.model.FeedProcessingResultsList200Response;
import org.openapitools.model.FeedsList200Response;
import org.openapitools.model.ItemsIssuesList200Response;
import org.openapitools.model.ItemsPost200Response;
import java.util.List;
import org.openapitools.model.LocalInventoryItemsBatch;
import org.openapitools.model.LocalInventoryItemsBatchCreate;
import org.openapitools.model.LocalInventoryItemsGet;
import org.openapitools.model.LocalInventoryItemsGetCreate;
import org.openapitools.model.LocalStore;
import org.openapitools.model.LocalStoreBatchUpdate;
import org.openapitools.model.LocalStoreCreate;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.ReportsStats200Response;
import org.openapitools.model.SupplementalItemsBatchResponse;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsApi  {
   private final CatalogsApiService delegate = CatalogsApiServiceFactory.getCatalogsApi();

    @GET
    @Path("/available_filter_values")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List available filter values", notes = "Get the available filter attributes and values associated with a given feed or catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - `country`, `language`, and `feed_id` are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)", response = CatalogsAvailableFilterValues.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CatalogsAvailableFilterValues.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = CatalogsAvailableFilterValues.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = CatalogsAvailableFilterValues.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = CatalogsAvailableFilterValues.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = CatalogsAvailableFilterValues.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = CatalogsAvailableFilterValues.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = CatalogsAvailableFilterValues.class) })
    public Response catalogsAvailableFilterValues(@ApiParam(value = "Filter entities for a given catalog_id.",required=true) @QueryParam("catalog_id") String catalogId
,@ApiParam(value = "Filter entities for a given feed_id. If not given, all feeds are considered.") @QueryParam("feed_id") String feedId
,@ApiParam(value = "Country for the Catalogs Items", allowableValues="AD, AE, AF, AG, AI, AL, AM, AO, AQ, AR, AS, AT, AU, AW, AX, AZ, BA, BB, BD, BE, BF, BG, BH, BI, BJ, BL, BM, BN, BO, BQ, BR, BS, BT, BV, BW, BY, BZ, CA, CC, CD, CF, CG, CH, CI, CK, CL, CM, CN, CO, CR, CU, CV, CW, CX, CY, CZ, DE, DJ, DK, DM, DO, DZ, EC, EE, EG, EH, ER, ES, ET, FI, FJ, FK, FM, FO, FR, GA, GB, GD, GE, GF, GG, GH, GI, GL, GM, GN, GP, GQ, GR, GS, GT, GU, GW, GY, HK, HM, HN, HR, HT, HU, ID, IE, IL, IM, IN, IO, IQ, IR, IS, IT, JE, JM, JO, JP, KE, KG, KH, KI, KM, KN, KR, KW, KY, KZ, LA, LB, LC, LI, LK, LR, LS, LT, LU, LV, LY, MA, MC, MD, ME, MF, MG, MH, MK, ML, MM, MN, MO, MP, MQ, MR, MS, MT, MU, MV, MW, MX, MY, MZ, NA, NC, NE, NF, NG, NI, NL, false, NP, NR, NU, NZ, OM, PA, PE, PF, PG, PH, PK, PL, PM, PN, PR, PS, PT, PW, PY, QA, RE, RO, RS, RU, RW, SA, SB, SC, SD, SE, SG, SH, SI, SJ, SK, SL, SM, SN, SO, SR, SS, ST, SV, SX, SY, SZ, TC, TD, TF, TG, TH, TJ, TK, TL, TM, TN, TO, TR, TT, TV, TW, TZ, UA, UG, UM, US, UY, UZ, VA, VC, VE, VG, VI, VN, VU, WF, WS, YE, YT, ZA, ZM, ZW") @QueryParam("country") Country country
,@ApiParam(value = "Language for the Catalogs Items", allowableValues="af-ZA, ar-SA, bg-BG, bn-IN, cs-CZ, da-DK, de, el-GR, en-AU, en-CA, en-GB, en-IN, en-US, es-419, es-AR, es-ES, es-MX, fi-FI, fr, fr-CA, he-IL, hi-IN, hr-HR, hu-HU, id-ID, it, ja, ko-KR, ms-MY, nb-NO, nl, pl-PL, pt-BR, pt-PT, ro-RO, ru-RU, sk-SK, sv-SE, te-IN, th-TH, tl-PH, tr, uk-UA, vi-VN, zh-CN, zh-TW") @QueryParam("language") CatalogsLocale language
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.catalogsAvailableFilterValues(catalogId,feedId,country,language,adAccountId);
    }
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create catalog", notes = "Create a new catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.", response = Catalog.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = Catalog.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = Catalog.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = Catalog.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = Catalog.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = Catalog.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = Catalog.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = Catalog.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = Catalog.class) })
    public Response catalogsCreate(@ApiParam(value = "" ,required=true) CatalogCreate catalogCreate
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.catalogsCreate(catalogCreate,adAccountId);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List catalogs", notes = "Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)", response = CatalogsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalogs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CatalogsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = CatalogsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = CatalogsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = CatalogsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = CatalogsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = CatalogsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = CatalogsList200Response.class) })
    public Response catalogsList(@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
)
    throws NotFoundException {
        return delegate.catalogsList(adAccountId,bookmark,pageSize);
    }
    @POST
    @Path("/{catalog_id}/local_inventory_items/batch")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Operate on local inventory item batch", notes = "Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)", response = SupplementalItemsBatchResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalog_supplemental", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = SupplementalItemsBatchResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = SupplementalItemsBatchResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = SupplementalItemsBatchResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = SupplementalItemsBatchResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = SupplementalItemsBatchResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = SupplementalItemsBatchResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = SupplementalItemsBatchResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = SupplementalItemsBatchResponse.class) })
    public Response catalogsLocalInventoryItemsBatchOperate(@ApiParam(value = "Unique identifier of a catalog.",required=true) @PathParam("catalog_id") String catalogId
,@ApiParam(value = "" ,required=true) LocalInventoryItemsBatchCreate localInventoryItemsBatchCreate
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.catalogsLocalInventoryItemsBatchOperate(catalogId,localInventoryItemsBatchCreate,adAccountId);
    }
    @POST
    @Path("/{catalog_id}/local_inventory_items/query")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get local inventory items (POST)", notes = "Get local inventory items for a catalog owned by the \"operation user_account\".  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)", response = LocalInventoryItemsGet.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalog_supplemental", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = LocalInventoryItemsGet.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = LocalInventoryItemsGet.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = LocalInventoryItemsGet.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = LocalInventoryItemsGet.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = LocalInventoryItemsGet.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = LocalInventoryItemsGet.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = LocalInventoryItemsGet.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = LocalInventoryItemsGet.class) })
    public Response catalogsLocalInventoryItemsPost(@ApiParam(value = "Unique identifier of a catalog.",required=true) @PathParam("catalog_id") String catalogId
,@ApiParam(value = "" ,required=true) LocalInventoryItemsGetCreate localInventoryItemsGetCreate
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.catalogsLocalInventoryItemsPost(catalogId,localInventoryItemsGetCreate,adAccountId);
    }
    @POST
    @Path("/{catalog_id}/local_stores")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create local stores", notes = "Create a local store for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)", response = CatalogsLocalStoresCreate200ResponseInner.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalog_supplemental", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CatalogsLocalStoresCreate200ResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = CatalogsLocalStoresCreate200ResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = CatalogsLocalStoresCreate200ResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = CatalogsLocalStoresCreate200ResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = CatalogsLocalStoresCreate200ResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = CatalogsLocalStoresCreate200ResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = CatalogsLocalStoresCreate200ResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = CatalogsLocalStoresCreate200ResponseInner.class, responseContainer = "List") })
    public Response catalogsLocalStoresCreate(@ApiParam(value = "Unique identifier of a catalog.",required=true) @PathParam("catalog_id") String catalogId
,@ApiParam(value = "" ,required=true) List<@Valid LocalStoreCreate> localStoreCreate
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.catalogsLocalStoresCreate(catalogId,localStoreCreate,adAccountId);
    }
    @DELETE
    @Path("/{catalog_id}/local_stores")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete local stores", notes = "  Delete multiple local stores for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)", response = CatalogsLocalStoresDelete200ResponseInner.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalog_supplemental", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CatalogsLocalStoresDelete200ResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 204, message = "Resource deleted successfully.", response = CatalogsLocalStoresDelete200ResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = CatalogsLocalStoresDelete200ResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = CatalogsLocalStoresDelete200ResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = CatalogsLocalStoresDelete200ResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = CatalogsLocalStoresDelete200ResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = CatalogsLocalStoresDelete200ResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = CatalogsLocalStoresDelete200ResponseInner.class, responseContainer = "List") })
    public Response catalogsLocalStoresDelete(@ApiParam(value = "Unique identifier of a catalog.",required=true) @PathParam("catalog_id") String catalogId
,@ApiParam(value = "List of local store IDs to filter by.",required=true) @QueryParam("ids") List<@Pattern(regexp = "^\\d+$")String> ids
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.catalogsLocalStoresDelete(catalogId,ids,adAccountId);
    }
    @GET
    @Path("/{catalog_id}/local_stores")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List local stores", notes = "Fetch local stores for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)", response = CatalogsLocalStoresList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalog_supplemental", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CatalogsLocalStoresList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = CatalogsLocalStoresList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = CatalogsLocalStoresList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = CatalogsLocalStoresList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = CatalogsLocalStoresList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = CatalogsLocalStoresList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = CatalogsLocalStoresList200Response.class) })
    public Response catalogsLocalStoresList(@ApiParam(value = "Unique identifier of a catalog.",required=true) @PathParam("catalog_id") String catalogId
,@ApiParam(value = "List of local store IDs to filter by.") @QueryParam("ids") List<@Pattern(regexp = "^\\d+$")String> ids
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
)
    throws NotFoundException {
        return delegate.catalogsLocalStoresList(catalogId,ids,adAccountId,bookmark,pageSize);
    }
    @PATCH
    @Path("/{catalog_id}/local_stores")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update local stores", notes = "  Update a local store for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)", response = CatalogsLocalStoresCreate200ResponseInner.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalog_supplemental", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CatalogsLocalStoresCreate200ResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = CatalogsLocalStoresCreate200ResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = CatalogsLocalStoresCreate200ResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = CatalogsLocalStoresCreate200ResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = CatalogsLocalStoresCreate200ResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = CatalogsLocalStoresCreate200ResponseInner.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = CatalogsLocalStoresCreate200ResponseInner.class, responseContainer = "List") })
    public Response catalogsLocalStoresUpdate(@ApiParam(value = "Unique identifier of a catalog.",required=true) @PathParam("catalog_id") String catalogId
,@ApiParam(value = "" ,required=true) List<@Valid LocalStoreBatchUpdate> localStoreBatchUpdate
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.catalogsLocalStoresUpdate(catalogId,localStoreBatchUpdate,adAccountId);
    }
    @GET
    @Path("/product_groups/{product_group_id}/products")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List products by product group", notes = "Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)", response = CatalogsProductGroupPinsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data"),
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read", description = "See your public Pins")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data"),
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read", description = "See your public Pins")
        })
    }, tags={ "catalog_product_groups", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CatalogsProductGroupPinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = CatalogsProductGroupPinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = CatalogsProductGroupPinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = CatalogsProductGroupPinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = CatalogsProductGroupPinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = CatalogsProductGroupPinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = CatalogsProductGroupPinsList200Response.class) })
    public Response catalogsProductGroupPinsList(@ApiParam(value = "Unique identifier of a product group",required=true) @PathParam("product_group_id") String productGroupId
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
,@ApiParam(value = "Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", defaultValue="false") @DefaultValue("false") @QueryParam("pin_metrics") Boolean pinMetrics
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
)
    throws NotFoundException {
        return delegate.catalogsProductGroupPinsList(productGroupId,adAccountId,pinMetrics,bookmark,pageSize);
    }
    @POST
    @Path("/product_groups")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create product group", notes = "Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.", response = CatalogsVerticalProductGroup.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalog_product_groups", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CatalogsVerticalProductGroup.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = CatalogsVerticalProductGroup.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = CatalogsVerticalProductGroup.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = CatalogsVerticalProductGroup.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = CatalogsVerticalProductGroup.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = CatalogsVerticalProductGroup.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = CatalogsVerticalProductGroup.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = CatalogsVerticalProductGroup.class) })
    public Response catalogsProductGroupsCreate(@ApiParam(value = "" ,required=true) CatalogsProductGroupsCreateRequestSchema catalogsProductGroupsCreateRequestSchema
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.catalogsProductGroupsCreate(catalogsProductGroupsCreateRequestSchema,adAccountId);
    }
    @POST
    @Path("/product_groups/multiple")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create product groups", notes = "Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.", response = String.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalog_product_groups", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "The request has succeeded and a new resource has been created as a result.", response = String.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = String.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = String.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = String.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = String.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = String.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = String.class, responseContainer = "List") })
    public Response catalogsProductGroupsCreateMany(@ApiParam(value = "" ,required=true) List<CatalogsProductGroupsCreateManyRequestItems> catalogsProductGroupsCreateManyRequestItems
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.catalogsProductGroupsCreateMany(catalogsProductGroupsCreateManyRequestItems,adAccountId);
    }
    @DELETE
    @Path("/product_groups/{product_group_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete product group", notes = "Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)", response = CatalogsVerticalProductGroup.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalog_product_groups", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CatalogsVerticalProductGroup.class),
        
        @io.swagger.annotations.ApiResponse(code = 204, message = "Resource deleted successfully.", response = CatalogsVerticalProductGroup.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = CatalogsVerticalProductGroup.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = CatalogsVerticalProductGroup.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = CatalogsVerticalProductGroup.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = CatalogsVerticalProductGroup.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = CatalogsVerticalProductGroup.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = CatalogsVerticalProductGroup.class) })
    public Response catalogsProductGroupsDelete(@ApiParam(value = "Unique identifier of a product group",required=true) @PathParam("product_group_id") String productGroupId
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.catalogsProductGroupsDelete(productGroupId,adAccountId);
    }
    @DELETE
    @Path("/product_groups/multiple")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete product groups", notes = "Delete product groups owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalog_product_groups", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Resource deleted successfully.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = Void.class) })
    public Response catalogsProductGroupsDeleteMany(@ApiParam(value = "Comma-separated list of product group ids",required=true) @QueryParam("id") List<Integer> id
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.catalogsProductGroupsDeleteMany(id,adAccountId);
    }
    @GET
    @Path("/product_groups/{product_group_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get product group", notes = "Get a single product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)", response = CatalogsVerticalProductGroup.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalog_product_groups", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CatalogsVerticalProductGroup.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = CatalogsVerticalProductGroup.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = CatalogsVerticalProductGroup.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = CatalogsVerticalProductGroup.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = CatalogsVerticalProductGroup.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = CatalogsVerticalProductGroup.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = CatalogsVerticalProductGroup.class) })
    public Response catalogsProductGroupsGet(@ApiParam(value = "Unique identifier of a product group",required=true) @PathParam("product_group_id") String productGroupId
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.catalogsProductGroupsGet(productGroupId,adAccountId);
    }
    @GET
    @Path("/product_groups")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List product groups", notes = "Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)", response = CatalogsProductGroupsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalog_product_groups", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CatalogsProductGroupsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = CatalogsProductGroupsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = CatalogsProductGroupsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = CatalogsProductGroupsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = CatalogsProductGroupsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = CatalogsProductGroupsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = CatalogsProductGroupsList200Response.class) })
    public Response catalogsProductGroupsList(@ApiParam(value = "Comma-separated list of product group ids") @QueryParam("id") List<Integer> id
,@ApiParam(value = "Filter entities for a given feed_id. If not given, all feeds are considered.") @QueryParam("feed_id") String feedId
,@ApiParam(value = "Filter entities for a given catalog_id. If not given, all catalogs are considered.") @QueryParam("catalog_id") String catalogId
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
)
    throws NotFoundException {
        return delegate.catalogsProductGroupsList(id,feedId,catalogId,adAccountId,bookmark,pageSize);
    }
    @GET
    @Path("/product_groups/{product_group_id}/product_counts")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get product counts", notes = "Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)", response = CatalogsProductGroupProductCountsVertical.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalog_product_groups", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CatalogsProductGroupProductCountsVertical.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = CatalogsProductGroupProductCountsVertical.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = CatalogsProductGroupProductCountsVertical.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = CatalogsProductGroupProductCountsVertical.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = CatalogsProductGroupProductCountsVertical.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = CatalogsProductGroupProductCountsVertical.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = CatalogsProductGroupProductCountsVertical.class) })
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
    @io.swagger.annotations.ApiOperation(value = "Update single product group", notes = "Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.", response = CatalogsVerticalProductGroup.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalog_product_groups", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CatalogsVerticalProductGroup.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = CatalogsVerticalProductGroup.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = CatalogsVerticalProductGroup.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = CatalogsVerticalProductGroup.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = CatalogsVerticalProductGroup.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = CatalogsVerticalProductGroup.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = CatalogsVerticalProductGroup.class) })
    public Response catalogsProductGroupsUpdate(@ApiParam(value = "Unique identifier of a product group",required=true) @PathParam("product_group_id") String productGroupId
,@ApiParam(value = "" ,required=true) CatalogsProductGroupsUpdateRequestSchema catalogsProductGroupsUpdateRequestSchema
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.catalogsProductGroupsUpdate(productGroupId,catalogsProductGroupsUpdateRequestSchema,adAccountId);
    }
    @GET
    @Path("/{catalog_id}/supplemental_items/batch/{batch_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get supplemental items batch status", notes = "Fetch the status and results of a supplemental items batch operation. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)", response = SupplementalItemsBatchResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalog_supplemental", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = SupplementalItemsBatchResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = SupplementalItemsBatchResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = SupplementalItemsBatchResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = SupplementalItemsBatchResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = SupplementalItemsBatchResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = SupplementalItemsBatchResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = SupplementalItemsBatchResponse.class) })
    public Response catalogsSupplementalItemsBatchGet(@ApiParam(value = "Unique identifier of a catalog.",required=true) @PathParam("catalog_id") String catalogId
,@ApiParam(value = "Unique identifier of an items batch operation.",required=true) @PathParam("batch_id") String batchId
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.catalogsSupplementalItemsBatchGet(catalogId,batchId,adAccountId);
    }
    @GET
    @Path("/feeds/{feed_id}/processing_results")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List feed processing results", notes = "Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)", response = FeedProcessingResultsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalog_feeds", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = FeedProcessingResultsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = FeedProcessingResultsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = FeedProcessingResultsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = FeedProcessingResultsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = FeedProcessingResultsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = FeedProcessingResultsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = FeedProcessingResultsList200Response.class) })
    public Response feedProcessingResultsList(@ApiParam(value = "Unique identifier of a feed.",required=true) @PathParam("feed_id") String feedId
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
)
    throws NotFoundException {
        return delegate.feedProcessingResultsList(feedId,adAccountId,bookmark,pageSize);
    }
    @POST
    @Path("/feeds")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create feed", notes = "Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.", response = CatalogsFeed.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data"),
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data"),
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalog_feeds", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = CatalogsFeed.class) })
    public Response feedsCreate(@ApiParam(value = "" ,required=true) CatalogsFeedCreateRequestSchema catalogsFeedCreateRequestSchema
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.feedsCreate(catalogsFeedCreateRequestSchema,adAccountId);
    }
    @DELETE
    @Path("/feeds/{feed_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete feed", notes = "Delete a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).", response = CatalogsFeed.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data"),
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data"),
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalog_feeds", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 204, message = "Resource deleted successfully.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = CatalogsFeed.class) })
    public Response feedsDelete(@ApiParam(value = "Unique identifier of a feed.",required=true) @PathParam("feed_id") String feedId
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.feedsDelete(feedId,adAccountId);
    }
    @GET
    @Path("/feeds/{feed_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get feed", notes = "Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).", response = CatalogsFeed.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalog_feeds", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = CatalogsFeed.class) })
    public Response feedsGet(@ApiParam(value = "Unique identifier of a feed.",required=true) @PathParam("feed_id") String feedId
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.feedsGet(feedId,adAccountId);
    }
    @POST
    @Path("/feeds/{feed_id}/ingest")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Ingest feed items", notes = "Ingest items for a given feed owned by the \"operation user_account\".  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.", response = CatalogsFeedIngestion.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalog_feeds", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CatalogsFeedIngestion.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = CatalogsFeedIngestion.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = CatalogsFeedIngestion.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = CatalogsFeedIngestion.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = CatalogsFeedIngestion.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = CatalogsFeedIngestion.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = CatalogsFeedIngestion.class) })
    public Response feedsIngest(@ApiParam(value = "Unique identifier of a feed.",required=true) @PathParam("feed_id") String feedId
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.feedsIngest(feedId,adAccountId);
    }
    @GET
    @Path("/feeds")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List feeds", notes = "Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).", response = FeedsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalog_feeds", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = FeedsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = FeedsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = FeedsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = FeedsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = FeedsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = FeedsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = FeedsList200Response.class) })
    public Response feedsList(@ApiParam(value = "Filter entities for a given catalog_id. If not given, all catalogs are considered.") @QueryParam("catalog_id") String catalogId
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
)
    throws NotFoundException {
        return delegate.feedsList(catalogId,adAccountId,bookmark,pageSize);
    }
    @PATCH
    @Path("/feeds/{feed_id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update feed", notes = "Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.", response = CatalogsFeed.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data"),
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data"),
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalog_feeds", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = CatalogsFeed.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = CatalogsFeed.class) })
    public Response feedsUpdate(@ApiParam(value = "Unique identifier of a feed.",required=true) @PathParam("feed_id") String feedId
,@ApiParam(value = "" ,required=true) CatalogsFeedUpdateRequestSchema catalogsFeedUpdateRequestSchema
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.feedsUpdate(feedId,catalogsFeedUpdateRequestSchema,adAccountId);
    }
    @GET
    @Path("/items/batch/{batch_id}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get item batch status", notes = "Get a single catalogs items batch owned by the \"operating user_account\". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.", response = CatalogsItemsBatch.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalog_items", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CatalogsItemsBatch.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = CatalogsItemsBatch.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = CatalogsItemsBatch.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = CatalogsItemsBatch.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = CatalogsItemsBatch.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = CatalogsItemsBatch.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = CatalogsItemsBatch.class) })
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
    @io.swagger.annotations.ApiOperation(value = "Operate on item batch", notes = "This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". [See detailed documentation here.](/docs/work-with-catalogs/modify-items-in-batch/) - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.", response = CatalogsItemsBatch.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data"),
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        }),
        @io.swagger.annotations.Authorization(value = "client_credentials", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data"),
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:write", description = "Create, update, or delete your catalogs data")
        })
    }, tags={ "catalog_items", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CatalogsItemsBatch.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = CatalogsItemsBatch.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = CatalogsItemsBatch.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = CatalogsItemsBatch.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = CatalogsItemsBatch.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = CatalogsItemsBatch.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = CatalogsItemsBatch.class) })
    public Response itemsBatchPost(@ApiParam(value = "" ,required=true) CatalogsItemsBatchPostRequest catalogsItemsBatchPostRequest
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.itemsBatchPost(catalogsItemsBatchPostRequest,adAccountId);
    }
    @GET
    @Path("/processing_results/{processing_result_id}/item_issues")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List item issues", notes = "List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to [Build catalogs report](/docs/api/v5/#operation/reports/create) and [Get catalogs report](/docs/api/v5/#operation/reports/get) endpoints. Moreover, they support multiple types of catalogs.  [Learn more](/docs/api-features/shopping-overview/)", response = ItemsIssuesList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalog_feeds", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = ItemsIssuesList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = ItemsIssuesList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = ItemsIssuesList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = ItemsIssuesList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = ItemsIssuesList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = ItemsIssuesList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = ItemsIssuesList200Response.class) })
    public Response itemsIssuesList(@ApiParam(value = "Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list).",required=true) @PathParam("processing_result_id") String processingResultId
,@ApiParam(value = "Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.") @QueryParam("item_numbers") List<Integer> itemNumbers
,@ApiParam(value = "Filter item validation issues that have a given type of item validation issue.", allowableValues="AD_IMAGE_0_LINK_LENGTH_TOO_LONG, AD_IMAGE_1_LINK_LENGTH_TOO_LONG, AD_IMAGE_2_LINK_LENGTH_TOO_LONG, AD_IMAGE_3_LINK_LENGTH_TOO_LONG, AD_IMAGE_4_LINK_LENGTH_TOO_LONG, AD_IMAGE_5_LINK_LENGTH_TOO_LONG, AD_IMAGE_6_LINK_LENGTH_TOO_LONG, AD_IMAGE_7_LINK_LENGTH_TOO_LONG, AD_IMAGE_8_LINK_LENGTH_TOO_LONG, AD_IMAGE_9_LINK_LENGTH_TOO_LONG, AD_IMAGE_10_LINK_LENGTH_TOO_LONG, AD_IMAGE_11_LINK_LENGTH_TOO_LONG, AD_IMAGE_12_LINK_LENGTH_TOO_LONG, AD_IMAGE_13_LINK_LENGTH_TOO_LONG, AD_IMAGE_14_LINK_LENGTH_TOO_LONG, AD_IMAGE_15_LINK_LENGTH_TOO_LONG, AD_IMAGE_16_LINK_LENGTH_TOO_LONG, AD_IMAGE_17_LINK_LENGTH_TOO_LONG, AD_IMAGE_18_LINK_LENGTH_TOO_LONG, AD_IMAGE_19_LINK_LENGTH_TOO_LONG, AD_IMAGE_0_LINK_WARNING, AD_IMAGE_1_LINK_WARNING, AD_IMAGE_2_LINK_WARNING, AD_IMAGE_3_LINK_WARNING, AD_IMAGE_4_LINK_WARNING, AD_IMAGE_5_LINK_WARNING, AD_IMAGE_6_LINK_WARNING, AD_IMAGE_7_LINK_WARNING, AD_IMAGE_8_LINK_WARNING, AD_IMAGE_9_LINK_WARNING, AD_IMAGE_10_LINK_WARNING, AD_IMAGE_11_LINK_WARNING, AD_IMAGE_12_LINK_WARNING, AD_IMAGE_13_LINK_WARNING, AD_IMAGE_14_LINK_WARNING, AD_IMAGE_15_LINK_WARNING, AD_IMAGE_16_LINK_WARNING, AD_IMAGE_17_LINK_WARNING, AD_IMAGE_18_LINK_WARNING, AD_IMAGE_19_LINK_WARNING, AD_IMAGE_0_LINK_REQUIRED, AD_IMAGE_1_LINK_REQUIRED, AD_IMAGE_2_LINK_REQUIRED, AD_IMAGE_3_LINK_REQUIRED, AD_IMAGE_4_LINK_REQUIRED, AD_IMAGE_5_LINK_REQUIRED, AD_IMAGE_6_LINK_REQUIRED, AD_IMAGE_7_LINK_REQUIRED, AD_IMAGE_8_LINK_REQUIRED, AD_IMAGE_9_LINK_REQUIRED, AD_IMAGE_10_LINK_REQUIRED, AD_IMAGE_11_LINK_REQUIRED, AD_IMAGE_12_LINK_REQUIRED, AD_IMAGE_13_LINK_REQUIRED, AD_IMAGE_14_LINK_REQUIRED, AD_IMAGE_15_LINK_REQUIRED, AD_IMAGE_16_LINK_REQUIRED, AD_IMAGE_17_LINK_REQUIRED, AD_IMAGE_18_LINK_REQUIRED, AD_IMAGE_19_LINK_REQUIRED, AD_IMAGE_0_TAG_LENGTH_TOO_LONG, AD_IMAGE_1_TAG_LENGTH_TOO_LONG, AD_IMAGE_2_TAG_LENGTH_TOO_LONG, AD_IMAGE_3_TAG_LENGTH_TOO_LONG, AD_IMAGE_4_TAG_LENGTH_TOO_LONG, AD_IMAGE_5_TAG_LENGTH_TOO_LONG, AD_IMAGE_6_TAG_LENGTH_TOO_LONG, AD_IMAGE_7_TAG_LENGTH_TOO_LONG, AD_IMAGE_8_TAG_LENGTH_TOO_LONG, AD_IMAGE_9_TAG_LENGTH_TOO_LONG, AD_IMAGE_10_TAG_LENGTH_TOO_LONG, AD_IMAGE_11_TAG_LENGTH_TOO_LONG, AD_IMAGE_12_TAG_LENGTH_TOO_LONG, AD_IMAGE_13_TAG_LENGTH_TOO_LONG, AD_IMAGE_14_TAG_LENGTH_TOO_LONG, AD_IMAGE_15_TAG_LENGTH_TOO_LONG, AD_IMAGE_16_TAG_LENGTH_TOO_LONG, AD_IMAGE_17_TAG_LENGTH_TOO_LONG, AD_IMAGE_18_TAG_LENGTH_TOO_LONG, AD_IMAGE_19_TAG_LENGTH_TOO_LONG, AD_IMAGE_0_TAG_REQUIRED, AD_IMAGE_1_TAG_REQUIRED, AD_IMAGE_2_TAG_REQUIRED, AD_IMAGE_3_TAG_REQUIRED, AD_IMAGE_4_TAG_REQUIRED, AD_IMAGE_5_TAG_REQUIRED, AD_IMAGE_6_TAG_REQUIRED, AD_IMAGE_7_TAG_REQUIRED, AD_IMAGE_8_TAG_REQUIRED, AD_IMAGE_9_TAG_REQUIRED, AD_IMAGE_10_TAG_REQUIRED, AD_IMAGE_11_TAG_REQUIRED, AD_IMAGE_12_TAG_REQUIRED, AD_IMAGE_13_TAG_REQUIRED, AD_IMAGE_14_TAG_REQUIRED, AD_IMAGE_15_TAG_REQUIRED, AD_IMAGE_16_TAG_REQUIRED, AD_IMAGE_17_TAG_REQUIRED, AD_IMAGE_18_TAG_REQUIRED, AD_IMAGE_19_TAG_REQUIRED, AD_IMAGE_0_LINK_DUPLICATED, AD_IMAGE_1_LINK_DUPLICATED, AD_IMAGE_2_LINK_DUPLICATED, AD_IMAGE_3_LINK_DUPLICATED, AD_IMAGE_4_LINK_DUPLICATED, AD_IMAGE_5_LINK_DUPLICATED, AD_IMAGE_6_LINK_DUPLICATED, AD_IMAGE_7_LINK_DUPLICATED, AD_IMAGE_8_LINK_DUPLICATED, AD_IMAGE_9_LINK_DUPLICATED, AD_IMAGE_10_LINK_DUPLICATED, AD_IMAGE_11_LINK_DUPLICATED, AD_IMAGE_12_LINK_DUPLICATED, AD_IMAGE_13_LINK_DUPLICATED, AD_IMAGE_14_LINK_DUPLICATED, AD_IMAGE_15_LINK_DUPLICATED, AD_IMAGE_16_LINK_DUPLICATED, AD_IMAGE_17_LINK_DUPLICATED, AD_IMAGE_18_LINK_DUPLICATED, AD_IMAGE_19_LINK_DUPLICATED, AD_IMAGE_0_TAG_DUPLICATED, AD_IMAGE_1_TAG_DUPLICATED, AD_IMAGE_2_TAG_DUPLICATED, AD_IMAGE_3_TAG_DUPLICATED, AD_IMAGE_4_TAG_DUPLICATED, AD_IMAGE_5_TAG_DUPLICATED, AD_IMAGE_6_TAG_DUPLICATED, AD_IMAGE_7_TAG_DUPLICATED, AD_IMAGE_8_TAG_DUPLICATED, AD_IMAGE_9_TAG_DUPLICATED, AD_IMAGE_10_TAG_DUPLICATED, AD_IMAGE_11_TAG_DUPLICATED, AD_IMAGE_12_TAG_DUPLICATED, AD_IMAGE_13_TAG_DUPLICATED, AD_IMAGE_14_TAG_DUPLICATED, AD_IMAGE_15_TAG_DUPLICATED, AD_IMAGE_16_TAG_DUPLICATED, AD_IMAGE_17_TAG_DUPLICATED, AD_IMAGE_18_TAG_DUPLICATED, AD_IMAGE_19_TAG_DUPLICATED, AD_VIDEO_0_LINK_LENGTH_TOO_LONG, AD_VIDEO_1_LINK_LENGTH_TOO_LONG, AD_VIDEO_2_LINK_LENGTH_TOO_LONG, AD_VIDEO_0_LINK_WARNING, AD_VIDEO_1_LINK_WARNING, AD_VIDEO_2_LINK_WARNING, AD_VIDEO_0_LINK_REQUIRED, AD_VIDEO_1_LINK_REQUIRED, AD_VIDEO_2_LINK_REQUIRED, AD_VIDEO_0_LINK_DUPLICATED, AD_VIDEO_1_LINK_DUPLICATED, AD_VIDEO_2_LINK_DUPLICATED, AD_VIDEO_0_TAG_LENGTH_TOO_LONG, AD_VIDEO_1_TAG_LENGTH_TOO_LONG, AD_VIDEO_2_TAG_LENGTH_TOO_LONG, AD_VIDEO_0_TAG_REQUIRED, AD_VIDEO_1_TAG_REQUIRED, AD_VIDEO_2_TAG_REQUIRED, AD_VIDEO_0_TAG_DUPLICATED, AD_VIDEO_1_TAG_DUPLICATED, AD_VIDEO_2_TAG_DUPLICATED, VIDEO_REQUIRED_WHEN_AD_VIDEO_PROVIDED, AD_LINK_FORMAT_WARNING, AD_LINK_SAME_AS_LINK, ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG, ADDITIONAL_IMAGE_LINK_WARNING, ADULT_INVALID, ADWORDS_FORMAT_INVALID, ADWORDS_FORMAT_WARNING, ADWORDS_SAME_AS_LINK, AGE_GROUP_INVALID, ANDROID_DEEP_LINK_INVALID, AVAILABILITY_DATE_INVALID, AVAILABILITY_INVALID, BLOCKLISTED_IMAGE_SIGNATURE, COUNTRY_DOES_NOT_MAP_TO_CURRENCY, CUSTOM_LABEL_LENGTH_TOO_LONG, DESCRIPTION_LENGTH_TOO_LONG, DESCRIPTION_MISSING, DUPLICATE_PRODUCTS, EXPIRATION_DATE_INVALID, GENDER_INVALID, GTIN_INVALID, IMAGE_LINK_INVALID, IMAGE_LINK_LENGTH_TOO_LONG, IMAGE_LINK_MISSING, IMAGE_LINK_WARNING, INVALID_DOMAIN, IOS_DEEP_LINK_INVALID, IS_BUNDLE_INVALID, ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE, ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE, ITEMID_MISSING, LINK_FORMAT_INVALID, LINK_FORMAT_WARNING, LINK_LENGTH_TOO_LONG, LIST_PRICE_INVALID, MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED, MIN_AD_PRICE_INVALID, MPN_INVALID, MULTIPACK_INVALID, OPTIONAL_CONDITION_INVALID, OPTIONAL_CONDITION_MISSING, OPTIONAL_PRODUCT_CATEGORY_INVALID, OPTIONAL_PRODUCT_CATEGORY_MISSING, PARSE_LINE_ERROR, PINJOIN_CONTENT_UNSAFE, PRICE_CANNOT_BE_DETERMINED, PRICE_MISSING, PRODUCT_CATEGORY_DEPTH_WARNING, PRODUCT_LINK_MISSING, PRODUCT_PRICE_INVALID, PRODUCT_TYPE_LENGTH_TOO_LONG, SALE_DATE_INVALID, SALES_PRICE_INVALID, SALES_PRICE_TOO_HIGH, SALES_PRICE_TOO_LOW, SHIPPING_INVALID, SHIPPING_HEIGHT_INVALID, SHIPPING_WEIGHT_INVALID, SHIPPING_WIDTH_INVALID, SIZE_SYSTEM_INVALID, SIZE_TYPE_INVALID, TAX_INVALID, TITLE_LENGTH_TOO_LONG, TITLE_MISSING, TOO_MANY_ADDITIONAL_IMAGE_LINKS, UTM_SOURCE_AUTO_CORRECTED, WEIGHT_UNIT_INVALID") @QueryParam("item_validation_issue") CatalogsItemValidationIssue itemValidationIssue
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
)
    throws NotFoundException {
        return delegate.itemsIssuesList(processingResultId,itemNumbers,itemValidationIssue,adAccountId,bookmark,pageSize);
    }
    @POST
    @Path("/items")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get catalogs items (POST)", notes = "Get the items of the catalog owned by the \"operation user_account\". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.", response = ItemsPost200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalog_items", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = ItemsPost200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = ItemsPost200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = ItemsPost200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = ItemsPost200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = ItemsPost200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = ItemsPost200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = ItemsPost200Response.class) })
    public Response itemsPost(@ApiParam(value = "" ,required=true) CatalogsItemsRequest catalogsItemsRequest
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.itemsPost(catalogsItemsRequest,adAccountId);
    }
    @POST
    @Path("/products/get_by_product_group_filters")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List products by filter", notes = "List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  [Learn more](/docs/api-features/shopping-overview/)", response = CatalogsProductGroupPinsList200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "boards:read", description = "See your public boards, including group boards you join"),
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data"),
            @io.swagger.annotations.AuthorizationScope(scope = "pins:read", description = "See your public Pins")
        })
    }, tags={ "catalog_product_groups", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CatalogsProductGroupPinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = CatalogsProductGroupPinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = CatalogsProductGroupPinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = CatalogsProductGroupPinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = CatalogsProductGroupPinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = CatalogsProductGroupPinsList200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = CatalogsProductGroupPinsList200Response.class) })
    public Response productsByProductGroupFilterList(@ApiParam(value = "" ,required=true) CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
,@ApiParam(value = "Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.", defaultValue="false") @DefaultValue("false") @QueryParam("pin_metrics") Boolean pinMetrics
)
    throws NotFoundException {
        return delegate.productsByProductGroupFilterList(catalogsListProductsByFilterRequest,bookmark,pageSize,adAccountId,pinMetrics);
    }
    @POST
    @Path("/reports")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Build catalogs report", notes = "Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: The All Items report is limited to 25 million items per catalog.", response = CatalogsCreateReportResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalog_reports", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CatalogsCreateReportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 201, message = "Resource create operation completed successfully.", response = CatalogsCreateReportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = CatalogsCreateReportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = CatalogsCreateReportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = CatalogsCreateReportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = CatalogsCreateReportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = CatalogsCreateReportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = CatalogsCreateReportResponse.class) })
    public Response reportsCreate(@ApiParam(value = "" ,required=true) CatalogsReportParameters catalogsReportParameters
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.reportsCreate(catalogsReportParameters,adAccountId);
    }
    @GET
    @Path("/reports")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get catalogs report", notes = "This returns a URL to a report given a token returned from [Build catalogs report](/docs/api/v5/#operation/reports/create). You can use the URL to download the report. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.", response = CatalogsReport.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalog_reports", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = CatalogsReport.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = CatalogsReport.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = CatalogsReport.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = CatalogsReport.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = CatalogsReport.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = CatalogsReport.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = CatalogsReport.class) })
    public Response reportsGet(@ApiParam(value = "Token returned from the post request creation call",required=true) @QueryParam("token") String token
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
)
    throws NotFoundException {
        return delegate.reportsGet(token,adAccountId);
    }
    @GET
    @Path("/reports/stats")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "List report stats", notes = "List aggregated numbers of issues for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.", response = ReportsStats200Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "pinterest_oauth2", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "catalogs:read", description = "See all of your catalogs data")
        })
    }, tags={ "catalog_reports", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The request has succeeded.", response = ReportsStats200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The request could not be understood by the server due to unexpected data.", response = ReportsStats200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Authentication is required and has either failed or not been provided.", response = ReportsStats200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", response = ReportsStats200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The requested resource could not be found on this server.", response = ReportsStats200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "The user has sent too many requests in a given amount of time and is being rate limited.", response = ReportsStats200Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "An unexpected error response.", response = ReportsStats200Response.class) })
    public Response reportsStats(@ApiParam(value = "Contains the parameters for report identification.",required=true) @QueryParam("parameters") CatalogsReportStatsParameters parameters
,@ApiParam(value = "Unique identifier of an ad account.") @QueryParam("ad_account_id") String adAccountId
,@ApiParam(value = "Cursor used to fetch the next page of items") @QueryParam("bookmark") String bookmark
,@ApiParam(value = "Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.", defaultValue="25") @DefaultValue("25") @QueryParam("page_size") Integer pageSize
)
    throws NotFoundException {
        return delegate.reportsStats(parameters,adAccountId,bookmark,pageSize);
    }
}
