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
import org.openapitools.server.api.model.ConversionDeletionRequest
import org.openapitools.server.api.model.ConversionDeletionRequestCreate
import org.openapitools.server.api.model.ConversionDeletionRequestList200Response
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder

@MiskTest(startService = true)
internal class ConversionDeletionRequestsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var conversionDeletionRequestsApi: ConversionDeletionRequestsApiAction

    /**
     * To test ConversionDeletionRequestsApiAction.conversionDeletionRequestCreate
     */
    @Test
    fun `should handle conversionDeletionRequestCreate`() {
        val adAccountId = TODO()
        val conversionDeletionRequestCreate = TODO()
        val response: ConversionDeletionRequest = conversionDeletionRequestsApi.conversionDeletionRequestCreate(adAccountId, conversionDeletionRequestCreate)
    }

    /**
     * To test ConversionDeletionRequestsApiAction.conversionDeletionRequestDelete
     */
    @Test
    fun `should handle conversionDeletionRequestDelete`() {
        val requestId = TODO()
        val adAccountId = TODO()
        val response: ConversionDeletionRequest = conversionDeletionRequestsApi.conversionDeletionRequestDelete(requestId, adAccountId)
    }

    /**
     * To test ConversionDeletionRequestsApiAction.conversionDeletionRequestGet
     */
    @Test
    fun `should handle conversionDeletionRequestGet`() {
        val requestId = TODO()
        val adAccountId = TODO()
        val response: ConversionDeletionRequest = conversionDeletionRequestsApi.conversionDeletionRequestGet(requestId, adAccountId)
    }

    /**
     * To test ConversionDeletionRequestsApiAction.conversionDeletionRequestList
     */
    @Test
    fun `should handle conversionDeletionRequestList`() {
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val order = TODO()
        val response: ConversionDeletionRequestList200Response = conversionDeletionRequestsApi.conversionDeletionRequestList(adAccountId, bookmark, pageSize, order)
    }
}
