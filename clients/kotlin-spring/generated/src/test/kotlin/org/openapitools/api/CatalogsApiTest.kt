package org.openapitools.api

import org.openapitools.model.Catalog
import org.openapitools.model.CatalogsCreateReportResponse
import org.openapitools.model.CatalogsCreateRequest
import org.openapitools.model.CatalogsFeed
import org.openapitools.model.CatalogsFeedIngestion
import org.openapitools.model.CatalogsItemValidationIssue
import org.openapitools.model.CatalogsItems
import org.openapitools.model.CatalogsItemsBatch
import org.openapitools.model.CatalogsItemsFilters
import org.openapitools.model.CatalogsItemsRequest
import org.openapitools.model.CatalogsList200Response
import org.openapitools.model.CatalogsListProductsByFilterRequest
import org.openapitools.model.CatalogsProductGroupPinsList200Response
import org.openapitools.model.CatalogsProductGroupProductCountsVertical
import org.openapitools.model.CatalogsProductGroupsList200Response
import org.openapitools.model.CatalogsProductGroupsUpdateRequest
import org.openapitools.model.CatalogsReport
import org.openapitools.model.CatalogsReportParameters
import org.openapitools.model.CatalogsVerticalProductGroup
import org.openapitools.model.Error
import org.openapitools.model.FeedProcessingResultsList200Response
import org.openapitools.model.FeedsCreateRequest
import org.openapitools.model.FeedsList200Response
import org.openapitools.model.FeedsUpdateRequest
import org.openapitools.model.ItemsBatchPostRequest
import org.openapitools.model.ItemsIssuesList200Response
import org.openapitools.model.MultipleProductGroupsInner
import org.openapitools.model.ReportsStats200Response
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class CatalogsApiTest {

    private val api: CatalogsApiController = CatalogsApiController()

    /**
     * To test CatalogsApiController.catalogsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun catalogsCreateTest() {
        val catalogsCreateRequest: CatalogsCreateRequest = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<Catalog> = api.catalogsCreate(catalogsCreateRequest, adAccountId)

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
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<CatalogsList200Response> = api.catalogsList(bookmark, pageSize, adAccountId)

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
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val adAccountId: kotlin.String? = TODO()
        val pinMetrics: kotlin.Boolean = TODO()
        val response: ResponseEntity<CatalogsProductGroupPinsList200Response> = api.catalogsProductGroupPinsList(productGroupId, bookmark, pageSize, adAccountId, pinMetrics)

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
        val multipleProductGroupsInner: MultipleProductGroupsInner = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<CatalogsVerticalProductGroup> = api.catalogsProductGroupsCreate(multipleProductGroupsInner, adAccountId)

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
        val multipleProductGroupsInner: kotlin.collections.List<MultipleProductGroupsInner> = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<List<kotlin.String>> = api.catalogsProductGroupsCreateMany(multipleProductGroupsInner, adAccountId)

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
        val response: ResponseEntity<Unit> = api.catalogsProductGroupsDelete(productGroupId, adAccountId)

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
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<CatalogsProductGroupsList200Response> = api.catalogsProductGroupsList(id, feedId, catalogId, bookmark, pageSize, adAccountId)

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
        val catalogsProductGroupsUpdateRequest: CatalogsProductGroupsUpdateRequest = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<CatalogsVerticalProductGroup> = api.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequest, adAccountId)

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
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<FeedProcessingResultsList200Response> = api.feedProcessingResultsList(feedId, bookmark, pageSize, adAccountId)

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
        val feedsCreateRequest: FeedsCreateRequest = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<CatalogsFeed> = api.feedsCreate(feedsCreateRequest, adAccountId)

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
        val response: ResponseEntity<Unit> = api.feedsDelete(feedId, adAccountId)

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
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val catalogId: kotlin.String? = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<FeedsList200Response> = api.feedsList(bookmark, pageSize, catalogId, adAccountId)

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
        val feedsUpdateRequest: FeedsUpdateRequest = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<CatalogsFeed> = api.feedsUpdate(feedId, feedsUpdateRequest, adAccountId)

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
        val itemsBatchPostRequest: ItemsBatchPostRequest = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<CatalogsItemsBatch> = api.itemsBatchPost(itemsBatchPostRequest, adAccountId)

        // TODO: test validations
    }

    /**
     * To test CatalogsApiController.itemsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun itemsGetTest() {
        val country: kotlin.String = TODO()
        val language: kotlin.String = TODO()
        val adAccountId: kotlin.String? = TODO()
        val itemIds: kotlin.collections.List<kotlin.String>? = TODO()
        val filters: CatalogsItemsFilters? = TODO()
        val response: ResponseEntity<CatalogsItems> = api.itemsGet(country, language, adAccountId, itemIds, filters)

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
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val itemNumbers: kotlin.collections.List<kotlin.Int>? = TODO()
        val itemValidationIssue: CatalogsItemValidationIssue? = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<ItemsIssuesList200Response> = api.itemsIssuesList(processingResultId, bookmark, pageSize, itemNumbers, itemValidationIssue, adAccountId)

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
        val response: ResponseEntity<CatalogsItems> = api.itemsPost(catalogsItemsRequest, adAccountId)

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
        val parameters: CatalogsReportParameters = TODO()
        val adAccountId: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val bookmark: kotlin.String? = TODO()
        val response: ResponseEntity<ReportsStats200Response> = api.reportsStats(parameters, adAccountId, pageSize, bookmark)

        // TODO: test validations
    }
}
