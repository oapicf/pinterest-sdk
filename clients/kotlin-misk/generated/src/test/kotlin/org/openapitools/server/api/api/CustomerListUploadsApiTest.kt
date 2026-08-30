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
import org.openapitools.server.api.model.CustomerListUpload
import org.openapitools.server.api.model.CustomerListUploadCreateRequest
import org.openapitools.server.api.model.CustomerListUploadCreateResponse
import org.openapitools.server.api.model.PinterestLibError

@MiskTest(startService = true)
internal class CustomerListUploadsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var customerListUploadsApi: CustomerListUploadsApiAction

    /**
     * To test CustomerListUploadsApiAction.customerListUploadsCreate
     */
    @Test
    fun `should handle customerListUploadsCreate`() {
        val adAccountId = TODO()
        val customerListId = TODO()
        val customerListUploadCreateRequest = TODO()
        val response: CustomerListUploadCreateResponse = customerListUploadsApi.customerListUploadsCreate(adAccountId, customerListId, customerListUploadCreateRequest)
    }

    /**
     * To test CustomerListUploadsApiAction.customerListUploadsGet
     */
    @Test
    fun `should handle customerListUploadsGet`() {
        val adAccountId = TODO()
        val customerListId = TODO()
        val customerListUploadId = TODO()
        val response: CustomerListUpload = customerListUploadsApi.customerListUploadsGet(adAccountId, customerListId, customerListUploadId)
    }

    /**
     * To test CustomerListUploadsApiAction.customerListUploadsRun
     */
    @Test
    fun `should handle customerListUploadsRun`() {
        val adAccountId = TODO()
        val customerListId = TODO()
        val customerListUploadId = TODO()
        val response: CustomerListUpload = customerListUploadsApi.customerListUploadsRun(adAccountId, customerListId, customerListUploadId)
    }
}
