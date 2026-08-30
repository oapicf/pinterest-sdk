package org.openapitools.api.interfaces;

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
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface CatalogsService {

    /**
     * List available filter values
     * Get the available filter attributes and values associated with a given feed or catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - &#x60;country&#x60;, &#x60;language&#x60;, and &#x60;feed_id&#x60; are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     *
     * @param catalogId Filter entities for a given catalog_id. (required)
     * @param feedId Filter entities for a given feed_id. If not given, all feeds are considered. (optional)
     * @param country Country for the Catalogs Items (optional)
     * @param language Language for the Catalogs Items (optional)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return CatalogsAvailableFilterValues
     */
    CatalogsAvailableFilterValues catalogsAvailableFilterValues(
        String catalogId,
        String feedId,
        Country country,
        CatalogsLocale language,
        String adAccountId
    );

    /**
     * Create catalog
     * Create a new catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     *
     * @param catalogCreate  (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return Catalog
     */
    Catalog catalogsCreate(
        CatalogCreate catalogCreate,
        String adAccountId
    );

    /**
     * List catalogs
     * Fetch catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     *
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return CatalogsList200Response
     */
    CatalogsList200Response catalogsList(
        String adAccountId,
        String bookmark,
        Integer pageSize
    );

    /**
     * Operate on local inventory item batch
     * Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     *
     * @param catalogId Unique identifier of a catalog. (required)
     * @param localInventoryItemsBatchCreate  (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return SupplementalItemsBatchResponse
     */
    SupplementalItemsBatchResponse catalogsLocalInventoryItemsBatchOperate(
        String catalogId,
        LocalInventoryItemsBatchCreate localInventoryItemsBatchCreate,
        String adAccountId
    );

    /**
     * Get local inventory items (POST)
     * Get local inventory items for a catalog owned by the \&quot;operation user_account\&quot;.  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     *
     * @param catalogId Unique identifier of a catalog. (required)
     * @param localInventoryItemsGetCreate  (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return LocalInventoryItemsGet
     */
    LocalInventoryItemsGet catalogsLocalInventoryItemsPost(
        String catalogId,
        LocalInventoryItemsGetCreate localInventoryItemsGetCreate,
        String adAccountId
    );

    /**
     * Create local stores
     * Create a local store for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     *
     * @param catalogId Unique identifier of a catalog. (required)
     * @param localStoreCreate  (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return List<CatalogsLocalStoresCreate200ResponseInner>
     */
    List<CatalogsLocalStoresCreate200ResponseInner> catalogsLocalStoresCreate(
        String catalogId,
        List<LocalStoreCreate> localStoreCreate,
        String adAccountId
    );

    /**
     * Delete local stores
     *   Delete multiple local stores for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
     *
     * @param catalogId Unique identifier of a catalog. (required)
     * @param ids List of local store IDs to filter by. (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return List<CatalogsLocalStoresDelete200ResponseInner>
     */
    List<CatalogsLocalStoresDelete200ResponseInner> catalogsLocalStoresDelete(
        String catalogId,
        List<String> ids,
        String adAccountId
    );

    /**
     * List local stores
     * Fetch local stores for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     *
     * @param catalogId Unique identifier of a catalog. (required)
     * @param ids List of local store IDs to filter by. (optional)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return CatalogsLocalStoresList200Response
     */
    CatalogsLocalStoresList200Response catalogsLocalStoresList(
        String catalogId,
        List<String> ids,
        String adAccountId,
        String bookmark,
        Integer pageSize
    );

    /**
     * Update local stores
     *   Update a local store for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
     *
     * @param catalogId Unique identifier of a catalog. (required)
     * @param localStoreBatchUpdate  (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return List<CatalogsLocalStoresCreate200ResponseInner>
     */
    List<CatalogsLocalStoresCreate200ResponseInner> catalogsLocalStoresUpdate(
        String catalogId,
        List<LocalStoreBatchUpdate> localStoreBatchUpdate,
        String adAccountId
    );

    /**
     * List products by product group
     * Get a list of product pins for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     *
     * @param productGroupId Unique identifier of a product group (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional, default to false)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return CatalogsProductGroupPinsList200Response
     */
    CatalogsProductGroupPinsList200Response catalogsProductGroupPinsList(
        String productGroupId,
        String adAccountId,
        Boolean pinMetrics,
        String bookmark,
        Integer pageSize
    );

    /**
     * Create product group
     * Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     *
     * @param catalogsProductGroupsCreateRequestSchema  (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return CatalogsVerticalProductGroup
     */
    CatalogsVerticalProductGroup catalogsProductGroupsCreate(
        CatalogsProductGroupsCreateRequestSchema catalogsProductGroupsCreateRequestSchema,
        String adAccountId
    );

    /**
     * Create product groups
     * Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     *
     * @param catalogsProductGroupsCreateManyRequestItems  (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return List<String>
     */
    List<String> catalogsProductGroupsCreateMany(
        List<CatalogsProductGroupsCreateManyRequestItems> catalogsProductGroupsCreateManyRequestItems,
        String adAccountId
    );

    /**
     * Delete product group
     * Delete a product group owned by the \&quot;operation user_account\&quot; from being in use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     *
     * @param productGroupId Unique identifier of a product group (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return CatalogsVerticalProductGroup
     */
    CatalogsVerticalProductGroup catalogsProductGroupsDelete(
        String productGroupId,
        String adAccountId
    );

    /**
     * Delete product groups
     * Delete product groups owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     *
     * @param id Comma-separated list of product group ids (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return void
     */
    void catalogsProductGroupsDeleteMany(
        List<Integer> id,
        String adAccountId
    );

    /**
     * Get product group
     * Get a single product group for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     *
     * @param productGroupId Unique identifier of a product group (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return CatalogsVerticalProductGroup
     */
    CatalogsVerticalProductGroup catalogsProductGroupsGet(
        String productGroupId,
        String adAccountId
    );

    /**
     * List product groups
     * Get a list of product groups for a given Catalogs Feed Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     *
     * @param id Comma-separated list of product group ids (optional)
     * @param feedId Filter entities for a given feed_id. If not given, all feeds are considered. (optional)
     * @param catalogId Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return CatalogsProductGroupsList200Response
     */
    CatalogsProductGroupsList200Response catalogsProductGroupsList(
        List<Integer> id,
        String feedId,
        String catalogId,
        String adAccountId,
        String bookmark,
        Integer pageSize
    );

    /**
     * Get product counts
     * Get a product counts for a given Catalogs Product Group owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     *
     * @param productGroupId Unique identifier of a product group (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return CatalogsProductGroupProductCountsVertical
     */
    CatalogsProductGroupProductCountsVertical catalogsProductGroupsProductCountsGet(
        String productGroupId,
        String adAccountId
    );

    /**
     * Update single product group
     * Update product group owned by the \&quot;operation user_account\&quot; to use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     *
     * @param productGroupId Unique identifier of a product group (required)
     * @param catalogsProductGroupsUpdateRequestSchema  (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return CatalogsVerticalProductGroup
     */
    CatalogsVerticalProductGroup catalogsProductGroupsUpdate(
        String productGroupId,
        CatalogsProductGroupsUpdateRequestSchema catalogsProductGroupsUpdateRequestSchema,
        String adAccountId
    );

    /**
     * Get supplemental items batch status
     * Fetch the status and results of a supplemental items batch operation. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     *
     * @param catalogId Unique identifier of a catalog. (required)
     * @param batchId Unique identifier of an items batch operation. (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return SupplementalItemsBatchResponse
     */
    SupplementalItemsBatchResponse catalogsSupplementalItemsBatchGet(
        String catalogId,
        String batchId,
        String adAccountId
    );

    /**
     * List feed processing results
     * Fetch a feed processing results owned by the \&quot;operation user_account\&quot;. Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
     *
     * @param feedId Unique identifier of a feed. (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return FeedProcessingResultsList200Response
     */
    FeedProcessingResultsList200Response feedProcessingResultsList(
        String feedId,
        String adAccountId,
        String bookmark,
        Integer pageSize
    );

    /**
     * Create feed
     * Create a new feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     *
     * @param catalogsFeedCreateRequestSchema  (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return CatalogsFeed
     */
    CatalogsFeed feedsCreate(
        CatalogsFeedCreateRequestSchema catalogsFeedCreateRequestSchema,
        String adAccountId
    );

    /**
     * Delete feed
     * Delete a feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).
     *
     * @param feedId Unique identifier of a feed. (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return CatalogsFeed
     */
    CatalogsFeed feedsDelete(
        String feedId,
        String adAccountId
    );

    /**
     * Get feed
     * Get a single feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).
     *
     * @param feedId Unique identifier of a feed. (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return CatalogsFeed
     */
    CatalogsFeed feedsGet(
        String feedId,
        String adAccountId
    );

    /**
     * Ingest feed items
     * Ingest items for a given feed owned by the \&quot;operation user_account\&quot;.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     *
     * @param feedId Unique identifier of a feed. (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return CatalogsFeedIngestion
     */
    CatalogsFeedIngestion feedsIngest(
        String feedId,
        String adAccountId
    );

    /**
     * List feeds
     * Fetch feeds owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).
     *
     * @param catalogId Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return FeedsList200Response
     */
    FeedsList200Response feedsList(
        String catalogId,
        String adAccountId,
        String bookmark,
        Integer pageSize
    );

    /**
     * Update feed
     * Update a feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     *
     * @param feedId Unique identifier of a feed. (required)
     * @param catalogsFeedUpdateRequestSchema  (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return CatalogsFeed
     */
    CatalogsFeed feedsUpdate(
        String feedId,
        CatalogsFeedUpdateRequestSchema catalogsFeedUpdateRequestSchema,
        String adAccountId
    );

    /**
     * Get item batch status
     * Get a single catalogs items batch owned by the \&quot;operating user_account\&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
     *
     * @param batchId Id of a catalogs items batch to fetch (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return CatalogsItemsBatch
     */
    CatalogsItemsBatch itemsBatchGet(
        String batchId,
        String adAccountId
    );

    /**
     * Operate on item batch
     * This endpoint supports multiple operations on a set of one or more catalog items owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/work-with-catalogs/modify-items-in-batch/) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.
     *
     * @param catalogsItemsBatchPostRequest  (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return CatalogsItemsBatch
     */
    CatalogsItemsBatch itemsBatchPost(
        CatalogsItemsBatchPostRequest catalogsItemsBatchPostRequest,
        String adAccountId
    );

    /**
     * List item issues
     * List item validation issues for a given feed processing result owned by the \&quot;operation user_account\&quot;. Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters &#39;item_numbers&#39; and &#39;item_validation_issue&#39; cannot be used simultaneously until it is implemented in some release in the future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to [Build catalogs report](/docs/api/v5/#operation/reports/create) and [Get catalogs report](/docs/api/v5/#operation/reports/get) endpoints. Moreover, they support multiple types of catalogs.  [Learn more](/docs/api-features/shopping-overview/)
     *
     * @param processingResultId Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). (required)
     * @param itemNumbers Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. (optional)
     * @param itemValidationIssue Filter item validation issues that have a given type of item validation issue. (optional)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return ItemsIssuesList200Response
     */
    ItemsIssuesList200Response itemsIssuesList(
        String processingResultId,
        List<Integer> itemNumbers,
        CatalogsItemValidationIssue itemValidationIssue,
        String adAccountId,
        String bookmark,
        Integer pageSize
    );

    /**
     * Get catalogs items (POST)
     * Get the items of the catalog owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
     *
     * @param catalogsItemsRequest  (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return ItemsPost200Response
     */
    ItemsPost200Response itemsPost(
        CatalogsItemsRequest catalogsItemsRequest,
        String adAccountId
    );

    /**
     * List products by filter
     * List products Pins owned by the \&quot;operation user_account\&quot; that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  [Learn more](/docs/api-features/shopping-overview/)
     *
     * @param catalogsListProductsByFilterRequest  (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional, default to false)
     * @return CatalogsProductGroupPinsList200Response
     */
    CatalogsProductGroupPinsList200Response productsByProductGroupFilterList(
        CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest,
        String bookmark,
        Integer pageSize,
        String adAccountId,
        Boolean pinMetrics
    );

    /**
     * Build catalogs report
     * Async request to create a report of the catalog owned by the \&quot;operation user_account\&quot;. This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: The All Items report is limited to 25 million items per catalog.
     *
     * @param catalogsReportParameters  (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return CatalogsCreateReportResponse
     */
    CatalogsCreateReportResponse reportsCreate(
        CatalogsReportParameters catalogsReportParameters,
        String adAccountId
    );

    /**
     * Get catalogs report
     * This returns a URL to a report given a token returned from [Build catalogs report](/docs/api/v5/#operation/reports/create). You can use the URL to download the report. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
     *
     * @param token Token returned from the post request creation call (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return CatalogsReport
     */
    CatalogsReport reportsGet(
        String token,
        String adAccountId
    );

    /**
     * List report stats
     * List aggregated numbers of issues for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
     *
     * @param parameters Contains the parameters for report identification. (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return ReportsStats200Response
     */
    ReportsStats200Response reportsStats(
        CatalogsReportStatsParameters parameters,
        String adAccountId,
        String bookmark,
        Integer pageSize
    );
}
