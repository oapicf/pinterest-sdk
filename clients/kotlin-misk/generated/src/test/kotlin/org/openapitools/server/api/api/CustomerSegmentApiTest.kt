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
import org.openapitools.server.api.model.CustomerSegment
import org.openapitools.server.api.model.CustomerSegmentCreate
import org.openapitools.server.api.model.CustomerSegmentList200Response
import org.openapitools.server.api.model.CustomerSegmentUpdateRequestUpdateWithRequiredBody
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder

@MiskTest(startService = true)
internal class CustomerSegmentApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var customerSegmentApi: CustomerSegmentApiAction

    /**
     * To test CustomerSegmentApiAction.customerSegmentCreate
     */
    @Test
    fun `should handle customerSegmentCreate`() {
        val adAccountId = TODO()
        val customerSegmentCreate = TODO()
        val response: CustomerSegment = customerSegmentApi.customerSegmentCreate(adAccountId, customerSegmentCreate)
    }

    /**
     * To test CustomerSegmentApiAction.customerSegmentList
     */
    @Test
    fun `should handle customerSegmentList`() {
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val order = TODO()
        val includeSizing = TODO()
        val searchQuery = TODO()
        val response: CustomerSegmentList200Response = customerSegmentApi.customerSegmentList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery)
    }

    /**
     * To test CustomerSegmentApiAction.customerSegmentUpdate
     */
    @Test
    fun `should handle customerSegmentUpdate`() {
        val adAccountId = TODO()
        val customerSegmentUpdateRequestUpdateWithRequiredBody = TODO()
        val response = customerSegmentApi.customerSegmentUpdate(adAccountId, customerSegmentUpdateRequestUpdateWithRequiredBody)
    }
}
