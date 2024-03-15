package org.openapitools.api

import org.openapitools.model.CatalogsFeed
import org.openapitools.model.CatalogsItemValidationIssue
import org.openapitools.model.CatalogsItems
import org.openapitools.model.CatalogsItemsBatch
import org.openapitools.model.CatalogsItemsFilters
import org.openapitools.model.CatalogsList200Response
import org.openapitools.model.CatalogsListProductsByFilterRequest
import org.openapitools.model.CatalogsProductGroupPinsList200Response
import org.openapitools.model.CatalogsProductGroupProductCounts
import org.openapitools.model.CatalogsProductGroupsCreate201Response
import org.openapitools.model.CatalogsProductGroupsCreateRequest
import org.openapitools.model.CatalogsProductGroupsList200Response
import org.openapitools.model.CatalogsProductGroupsUpdateRequest
import org.openapitools.model.Error
import org.openapitools.model.FeedProcessingResultsList200Response
import org.openapitools.model.FeedsCreateRequest
import org.openapitools.model.FeedsList200Response
import org.openapitools.model.FeedsUpdateRequest
import org.openapitools.model.ItemsBatchPostRequest
import org.openapitools.model.ItemsIssuesList200Response
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class CatalogsApiTest {

    private val api: CatalogsApiController = CatalogsApiController()

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
        val response: ResponseEntity<CatalogsProductGroupPinsList200Response> = api.catalogsProductGroupPinsList(productGroupId, bookmark, pageSize, adAccountId)

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
        val catalogsProductGroupsCreateRequest: CatalogsProductGroupsCreateRequest = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<CatalogsProductGroupsCreate201Response> = api.catalogsProductGroupsCreate(catalogsProductGroupsCreateRequest, adAccountId)

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
     * To test CatalogsApiController.catalogsProductGroupsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun catalogsProductGroupsGetTest() {
        val productGroupId: kotlin.String = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<CatalogsProductGroupsCreate201Response> = api.catalogsProductGroupsGet(productGroupId, adAccountId)

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
        val feedId: kotlin.String? = TODO()
        val catalogId: kotlin.String? = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<CatalogsProductGroupsList200Response> = api.catalogsProductGroupsList(feedId, catalogId, bookmark, pageSize, adAccountId)

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
        val response: ResponseEntity<CatalogsProductGroupProductCounts> = api.catalogsProductGroupsProductCountsGet(productGroupId, adAccountId)

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
        val response: ResponseEntity<CatalogsProductGroupsCreate201Response> = api.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupsUpdateRequest, adAccountId)

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
        val response: ResponseEntity<CatalogsProductGroupPinsList200Response> = api.productsByProductGroupFilterList(catalogsListProductsByFilterRequest, bookmark, pageSize, adAccountId)

        // TODO: test validations
    }
}
