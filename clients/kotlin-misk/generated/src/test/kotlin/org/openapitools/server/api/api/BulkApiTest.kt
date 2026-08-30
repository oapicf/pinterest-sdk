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
import org.openapitools.server.api.model.BulkDownload
import org.openapitools.server.api.model.BulkDownloadCreate
import org.openapitools.server.api.model.BulkJobData
import org.openapitools.server.api.model.BulkUpsertRequest
import org.openapitools.server.api.model.BulkUpsertResponse
import org.openapitools.server.api.model.PinterestLibError

@MiskTest(startService = true)
internal class BulkApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var bulkApi: BulkApiAction

    /**
     * To test BulkApiAction.bulkDownloadCreate
     */
    @Test
    fun `should handle bulkDownloadCreate`() {
        val adAccountId = TODO()
        val bulkDownloadCreate = TODO()
        val response: BulkDownload = bulkApi.bulkDownloadCreate(adAccountId, bulkDownloadCreate)
    }

    /**
     * To test BulkApiAction.bulkRequestGet
     */
    @Test
    fun `should handle bulkRequestGet`() {
        val adAccountId = TODO()
        val bulkRequestId = TODO()
        val includeDetails = TODO()
        val response: BulkJobData = bulkApi.bulkRequestGet(adAccountId, bulkRequestId, includeDetails)
    }

    /**
     * To test BulkApiAction.bulkUpsertCreate
     */
    @Test
    fun `should handle bulkUpsertCreate`() {
        val adAccountId = TODO()
        val bulkUpsertRequest = TODO()
        val response: BulkUpsertResponse = bulkApi.bulkUpsertCreate(adAccountId, bulkUpsertRequest)
    }
}
