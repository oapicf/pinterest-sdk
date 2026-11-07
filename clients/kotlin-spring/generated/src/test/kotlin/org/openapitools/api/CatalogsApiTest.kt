package org.openapitools.api

import org.openapitools.model.Catalog
import org.openapitools.model.CatalogCreate
import org.openapitools.model.CatalogsAvailableFilterValues
import org.openapitools.model.CatalogsCreateReportResponse
import org.openapitools.model.CatalogsFeed
import org.openapitools.model.CatalogsFeedCreateRequestSchema
import org.openapitools.model.CatalogsFeedIngestion
import org.openapitools.model.CatalogsFeedUpdateRequestSchema
import org.openapitools.model.CatalogsItemValidationIssue
import org.openapitools.model.CatalogsItemsBatch
import org.openapitools.model.CatalogsItemsBatchPostRequest
import org.openapitools.model.CatalogsItemsRequest
import org.openapitools.model.CatalogsList200Response
import org.openapitools.model.CatalogsListProductsByFilterRequest
import org.openapitools.model.CatalogsLocalStoresCreate200ResponseInner
import org.openapitools.model.CatalogsLocalStoresDelete200ResponseInner
import org.openapitools.model.CatalogsLocalStoresList200Response
import org.openapitools.model.CatalogsLocale
import org.openapitools.model.CatalogsProductGroupPinsList200Response
import org.openapitools.model.CatalogsProductGroupProductCountsVertical
import org.openapitools.model.CatalogsProductGroupsCreateManyRequestItems
import org.openapitools.model.CatalogsProductGroupsCreateRequestSchema
import org.openapitools.model.CatalogsProductGroupsList200Response
import org.openapitools.model.CatalogsProductGroupsUpdateRequestSchema
import org.openapitools.model.CatalogsReport
import org.openapitools.model.CatalogsReportParameters
import org.openapitools.model.CatalogsReportStatsParameters
import org.openapitools.model.CatalogsVerticalProductGroup
import org.openapitools.model.Country
import org.openapitools.model.FeedProcessingResultsList200Response
import org.openapitools.model.FeedsList200Response
import org.openapitools.model.ItemsIssuesList200Response
import org.openapitools.model.ItemsPost200Response
import org.openapitools.model.LocalInventoryItemsBatch
import org.openapitools.model.LocalInventoryItemsBatchCreate
import org.openapitools.model.LocalInventoryItemsGet
import org.openapitools.model.LocalInventoryItemsGetCreate
import org.openapitools.model.LocalStore
import org.openapitools.model.LocalStoreBatchUpdate
import org.openapitools.model.LocalStoreCreate
import org.openapitools.model.PinterestLibError
import org.openapitools.model.ReportsStats200Response
import org.openapitools.model.SupplementalItemsBatchResponse
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class CatalogsApiTest {

    private val api: CatalogsApiController = CatalogsApiController()

    /**
     * To test CatalogsApiController.catalogsAvailableFilterValues
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun catalogsAvailableFilterValuesTest() {
        val catalogId: kotlin.String = TODO()
        val feedId: kotlin.String? = TODO()
        val country: Country? = TODO()
        val language: CatalogsLocale? = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<CatalogsAvailableFilterValues> = api.catalogsAvailableFilterValues(catalogId, feedId, country, language, adAccountId)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.catalogsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun catalogsCreateTest() {
        val catalogCreate: CatalogCreate = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<Catalog> = api.catalogsCreate(catalogCreate, adAccountId)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.catalogsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun catalogsListTest() {
        val adAccountId: kotlin.String? = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<CatalogsList200Response> = api.catalogsList(adAccountId, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.catalogsLocalInventoryItemsBatchOperate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun catalogsLocalInventoryItemsBatchOperateTest() {
        val catalogId: kotlin.String = TODO()
        val localInventoryItemsBatchCreate: LocalInventoryItemsBatchCreate = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<SupplementalItemsBatchResponse> = api.catalogsLocalInventoryItemsBatchOperate(catalogId, localInventoryItemsBatchCreate, adAccountId)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.catalogsLocalInventoryItemsPost
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun catalogsLocalInventoryItemsPostTest() {
        val catalogId: kotlin.String = TODO()
        val localInventoryItemsGetCreate: LocalInventoryItemsGetCreate = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<LocalInventoryItemsGet> = api.catalogsLocalInventoryItemsPost(catalogId, localInventoryItemsGetCreate, adAccountId)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.catalogsLocalStoresCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun catalogsLocalStoresCreateTest() {
        val catalogId: kotlin.String = TODO()
        val localStoreCreate: kotlin.collections.List<LocalStoreCreate> = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<List<CatalogsLocalStoresCreate200ResponseInner>> = api.catalogsLocalStoresCreate(catalogId, localStoreCreate, adAccountId)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.catalogsLocalStoresDelete
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun catalogsLocalStoresDeleteTest() {
        val catalogId: kotlin.String = TODO()
        val ids: kotlin.collections.List<kotlin.String> = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<List<CatalogsLocalStoresDelete200ResponseInner>> = api.catalogsLocalStoresDelete(catalogId, ids, adAccountId)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.catalogsLocalStoresList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun catalogsLocalStoresListTest() {
        val catalogId: kotlin.String = TODO()
        val ids: kotlin.collections.List<kotlin.String>? = TODO()
        val adAccountId: kotlin.String? = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<CatalogsLocalStoresList200Response> = api.catalogsLocalStoresList(catalogId, ids, adAccountId, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.catalogsLocalStoresUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun catalogsLocalStoresUpdateTest() {
        val catalogId: kotlin.String = TODO()
        val localStoreBatchUpdate: kotlin.collections.List<LocalStoreBatchUpdate> = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<List<CatalogsLocalStoresCreate200ResponseInner>> = api.catalogsLocalStoresUpdate(catalogId, localStoreBatchUpdate, adAccountId)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.catalogsProductGroupPinsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun catalogsProductGroupPinsListTest() {
        val productGroupId: kotlin.String = TODO()
        val adAccountId: kotlin.String? = TODO()
        val pinMetrics: kotlin.Boolean = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<CatalogsProductGroupPinsList200Response> = api.catalogsProductGroupPinsList(productGroupId, adAccountId, pinMetrics, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.catalogsProductGroupsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun catalogsProductGroupsCreateTest() {
        val catalogsProductGroupsCreateRequestSchema: CatalogsProductGroupsCreateRequestSchema = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<CatalogsVerticalProductGroup> = api.catalogsProductGroupsCreate(catalogsProductGroupsCreateRequestSchema, adAccountId)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.catalogsProductGroupsCreateMany
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun catalogsProductGroupsCreateManyTest() {
        val catalogsProductGroupsCreateManyRequestItems: kotlin.collections.List<CatalogsProductGroupsCreateManyRequestItems> = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<List<kotlin.String>> = api.catalogsProductGroupsCreateMany(catalogsProductGroupsCreateManyRequestItems, adAccountId)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.catalogsProductGroupsDelete
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun catalogsProductGroupsDeleteTest() {
        val productGroupId: kotlin.String = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<CatalogsVerticalProductGroup> = api.catalogsProductGroupsDelete(productGroupId, adAccountId)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.catalogsProductGroupsDeleteMany
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun catalogsProductGroupsDeleteManyTest() {
        val id: kotlin.collections.List<kotlin.Int> = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<Unit> = api.catalogsProductGroupsDeleteMany(id, adAccountId)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.catalogsProductGroupsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun catalogsProductGroupsGetTest() {
        val productGroupId: kotlin.String = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<CatalogsVerticalProductGroup> = api.catalogsProductGroupsGet(productGroupId, adAccountId)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.catalogsProductGroupsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun catalogsProductGroupsListTest() {
        val id: kotlin.collections.List<kotlin.Int>? = TODO()
        val feedId: kotlin.String? = TODO()
        val catalogId: kotlin.String? = TODO()
        val adAccountId: kotlin.String? = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<CatalogsProductGroupsList200Response> = api.catalogsProductGroupsList(id, feedId, catalogId, adAccountId, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.catalogsProductGroupsProductCountsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun catalogsProductGroupsProductCountsGetTest() {
        val productGroupId: kotlin.String = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<CatalogsProductGroupProductCountsVertical> = api.catalogsProductGroupsProductCountsGet(productGroupId, adAccountId)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.catalogsProductGroupsUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun catalogsProductGroupsUpdateTest() {
        val productGroupId: kotlin.String = TODO()
        val catalogsProductGroupsUpdateRequestSchema: CatalogsProductGroupsUpdateRequestSchema = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<CatalogsVerticalProductGroup> = api.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequestSchema, adAccountId)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.catalogsSupplementalItemsBatchGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun catalogsSupplementalItemsBatchGetTest() {
        val catalogId: kotlin.String = TODO()
        val batchId: kotlin.String = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<SupplementalItemsBatchResponse> = api.catalogsSupplementalItemsBatchGet(catalogId, batchId, adAccountId)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.feedProcessingResultsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun feedProcessingResultsListTest() {
        val feedId: kotlin.String = TODO()
        val adAccountId: kotlin.String? = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<FeedProcessingResultsList200Response> = api.feedProcessingResultsList(feedId, adAccountId, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.feedsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun feedsCreateTest() {
        val catalogsFeedCreateRequestSchema: CatalogsFeedCreateRequestSchema = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<CatalogsFeed> = api.feedsCreate(catalogsFeedCreateRequestSchema, adAccountId)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.feedsDelete
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun feedsDeleteTest() {
        val feedId: kotlin.String = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<CatalogsFeed> = api.feedsDelete(feedId, adAccountId)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.feedsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun feedsGetTest() {
        val feedId: kotlin.String = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<CatalogsFeed> = api.feedsGet(feedId, adAccountId)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.feedsIngest
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun feedsIngestTest() {
        val feedId: kotlin.String = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<CatalogsFeedIngestion> = api.feedsIngest(feedId, adAccountId)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.feedsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun feedsListTest() {
        val catalogId: kotlin.String? = TODO()
        val adAccountId: kotlin.String? = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<FeedsList200Response> = api.feedsList(catalogId, adAccountId, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.feedsUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun feedsUpdateTest() {
        val feedId: kotlin.String = TODO()
        val catalogsFeedUpdateRequestSchema: CatalogsFeedUpdateRequestSchema = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<CatalogsFeed> = api.feedsUpdate(feedId, catalogsFeedUpdateRequestSchema, adAccountId)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.itemsBatchGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun itemsBatchGetTest() {
        val batchId: kotlin.String = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<CatalogsItemsBatch> = api.itemsBatchGet(batchId, adAccountId)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.itemsBatchPost
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun itemsBatchPostTest() {
        val catalogsItemsBatchPostRequest: CatalogsItemsBatchPostRequest = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<CatalogsItemsBatch> = api.itemsBatchPost(catalogsItemsBatchPostRequest, adAccountId)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.itemsIssuesList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun itemsIssuesListTest() {
        val processingResultId: kotlin.String = TODO()
        val itemNumbers: kotlin.collections.List<kotlin.Int>? = TODO()
        val itemValidationIssue: CatalogsItemValidationIssue? = TODO()
        val adAccountId: kotlin.String? = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<ItemsIssuesList200Response> = api.itemsIssuesList(processingResultId, itemNumbers, itemValidationIssue, adAccountId, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.itemsPost
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun itemsPostTest() {
        val catalogsItemsRequest: CatalogsItemsRequest = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<ItemsPost200Response> = api.itemsPost(catalogsItemsRequest, adAccountId)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.productsByProductGroupFilterList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun productsByProductGroupFilterListTest() {
        val catalogsListProductsByFilterRequest: CatalogsListProductsByFilterRequest = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val adAccountId: kotlin.String? = TODO()
        val pinMetrics: kotlin.Boolean = TODO()
        
        
        val response: ResponseEntity<CatalogsProductGroupPinsList200Response> = api.productsByProductGroupFilterList(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId, pinMetrics)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.reportsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun reportsCreateTest() {
        val catalogsReportParameters: CatalogsReportParameters = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<CatalogsCreateReportResponse> = api.reportsCreate(catalogsReportParameters, adAccountId)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.reportsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun reportsGetTest() {
        val token: kotlin.String = TODO()
        val adAccountId: kotlin.String? = TODO()
        
        
        val response: ResponseEntity<CatalogsReport> = api.reportsGet(token, adAccountId)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.reportsStats
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun reportsStatsTest() {
        val parameters: CatalogsReportStatsParameters = TODO()
        val adAccountId: kotlin.String? = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<ReportsStats200Response> = api.reportsStats(parameters, adAccountId, bookmark, pageSize)

        // TODO: test validations
    }
}
