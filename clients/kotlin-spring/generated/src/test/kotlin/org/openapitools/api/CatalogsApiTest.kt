package org.openapitools.api

import org.openapitools.model.CatalogsFeed
import org.openapitools.model.CatalogsFeedsCreateRequest
import org.openapitools.model.CatalogsFeedsUpdateRequest
import org.openapitools.model.CatalogsItems
import org.openapitools.model.CatalogsItemsBatch
import org.openapitools.model.CatalogsItemsBatchRequest
import org.openapitools.model.CatalogsProductGroup
import org.openapitools.model.CatalogsProductGroupCreateRequest
import org.openapitools.model.CatalogsProductGroupUpdateRequest
import org.openapitools.model.Error
import org.openapitools.model.Paginated
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class CatalogsApiTest {

    private val api: CatalogsApiController = CatalogsApiController()

    /**
     * To test CatalogsApiController.catalogsProductGroupsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun catalogsProductGroupsCreateTest() {
        val catalogsProductGroupCreateRequest:CatalogsProductGroupCreateRequest = TODO()
        val response: ResponseEntity<kotlin.Any> = api.catalogsProductGroupsCreate(catalogsProductGroupCreateRequest)

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
        val productGroupId:kotlin.String = TODO()
        val response: ResponseEntity<Unit> = api.catalogsProductGroupsDelete(productGroupId)

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
        val feedId:kotlin.String = TODO()
        val bookmark:kotlin.String? = TODO()
        val pageSize:kotlin.Int = TODO()
        val response: ResponseEntity<Paginated> = api.catalogsProductGroupsList(feedId, bookmark, pageSize)

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
        val productGroupId:kotlin.String = TODO()
        val catalogsProductGroupUpdateRequest:CatalogsProductGroupUpdateRequest = TODO()
        val response: ResponseEntity<CatalogsProductGroup> = api.catalogsProductGroupsUpdate(productGroupId, catalogsProductGroupUpdateRequest)

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
        val feedId:kotlin.String = TODO()
        val bookmark:kotlin.String? = TODO()
        val pageSize:kotlin.Int = TODO()
        val response: ResponseEntity<Paginated> = api.feedProcessingResultsList(feedId, bookmark, pageSize)

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
        val catalogsFeedsCreateRequest:CatalogsFeedsCreateRequest = TODO()
        val response: ResponseEntity<CatalogsFeed> = api.feedsCreate(catalogsFeedsCreateRequest)

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
        val feedId:kotlin.String = TODO()
        val response: ResponseEntity<Unit> = api.feedsDelete(feedId)

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
        val feedId:kotlin.String = TODO()
        val response: ResponseEntity<CatalogsFeed> = api.feedsGet(feedId)

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
        val bookmark:kotlin.String? = TODO()
        val pageSize:kotlin.Int = TODO()
        val response: ResponseEntity<Paginated> = api.feedsList(bookmark, pageSize)

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
        val feedId:kotlin.String = TODO()
        val catalogsFeedsUpdateRequest:CatalogsFeedsUpdateRequest = TODO()
        val response: ResponseEntity<CatalogsFeed> = api.feedsUpdate(feedId, catalogsFeedsUpdateRequest)

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
        val batchId:kotlin.String = TODO()
        val response: ResponseEntity<CatalogsItemsBatch> = api.itemsBatchGet(batchId)

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
        val catalogsItemsBatchRequest:CatalogsItemsBatchRequest = TODO()
        val response: ResponseEntity<CatalogsItemsBatch> = api.itemsBatchPost(catalogsItemsBatchRequest)

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
        val country:kotlin.String = TODO()
        val itemIds:kotlin.collections.List<kotlin.String> = TODO()
        val language:kotlin.String = TODO()
        val response: ResponseEntity<CatalogsItems> = api.itemsGet(country, itemIds, language)

        // TODO: test validations
    }

}
