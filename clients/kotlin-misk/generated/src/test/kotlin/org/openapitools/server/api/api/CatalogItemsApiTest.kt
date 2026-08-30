package org.openapitools.server.api.api

import misk.testing.MiskTestModule
import jakarta.inject.Inject
import misk.testing.MiskTest
import misk.testing.MiskTestModule
import org.junit.jupiter.api.Test
import misk.web.HttpCall
import misk.web.PathParam
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestHeader
import org.openapitools.server.api.model.CatalogsItemsBatch
import org.openapitools.server.api.model.CatalogsItemsBatchPostRequest
import org.openapitools.server.api.model.CatalogsItemsRequest
import org.openapitools.server.api.model.ItemsPost200Response
import org.openapitools.server.api.model.PinterestLibError

@MiskTest(startService = true)
internal class CatalogItemsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var catalogItemsApi: CatalogItemsApiAction

    /**
     * To test CatalogItemsApiAction.itemsBatchGet
     */
    @Test
    fun `should handle itemsBatchGet`() {
        val batchId = TODO()
        val adAccountId = TODO()
        val response: CatalogsItemsBatch = catalogItemsApi.itemsBatchGet(batchId, adAccountId)
    }

    /**
     * To test CatalogItemsApiAction.itemsBatchPost
     */
    @Test
    fun `should handle itemsBatchPost`() {
        val catalogsItemsBatchPostRequest = TODO()
        val adAccountId = TODO()
        val response: CatalogsItemsBatch = catalogItemsApi.itemsBatchPost(catalogsItemsBatchPostRequest, adAccountId)
    }

    /**
     * To test CatalogItemsApiAction.itemsPost
     */
    @Test
    fun `should handle itemsPost`() {
        val catalogsItemsRequest = TODO()
        val adAccountId = TODO()
        val response: ItemsPost200Response = catalogItemsApi.itemsPost(catalogsItemsRequest, adAccountId)
    }
}
