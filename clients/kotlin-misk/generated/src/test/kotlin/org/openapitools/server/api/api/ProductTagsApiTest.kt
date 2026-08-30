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
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.ProductTagsBulkAddRequest
import org.openapitools.server.api.model.ProductTagsBulkDeleteRequest
import org.openapitools.server.api.model.ProductTagsError
import org.openapitools.server.api.model.ProductTagsResponse

@MiskTest(startService = true)
internal class ProductTagsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var productTagsApi: ProductTagsApiAction

    /**
     * To test ProductTagsApiAction.productTagsBulkAdd
     */
    @Test
    fun `should handle productTagsBulkAdd`() {
        val pinId = TODO()
        val productTagsBulkAddRequest = TODO()
        val response: ProductTagsResponse = productTagsApi.productTagsBulkAdd(pinId, productTagsBulkAddRequest)
    }

    /**
     * To test ProductTagsApiAction.productTagsBulkDelete
     */
    @Test
    fun `should handle productTagsBulkDelete`() {
        val pinId = TODO()
        val productTagsBulkDeleteRequest = TODO()
        val response = productTagsApi.productTagsBulkDelete(pinId, productTagsBulkDeleteRequest)
    }

    /**
     * To test ProductTagsApiAction.productTagsList
     */
    @Test
    fun `should handle productTagsList`() {
        val pinId = TODO()
        val response: ProductTagsResponse = productTagsApi.productTagsList(pinId)
    }
}
