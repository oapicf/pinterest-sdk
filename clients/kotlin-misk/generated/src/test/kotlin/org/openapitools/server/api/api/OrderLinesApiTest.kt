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
import org.openapitools.server.api.model.OrderLine
import org.openapitools.server.api.model.OrderLinesList200Response
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder

@MiskTest(startService = true)
internal class OrderLinesApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var orderLinesApi: OrderLinesApiAction

    /**
     * To test OrderLinesApiAction.orderLinesGet
     */
    @Test
    fun `should handle orderLinesGet`() {
        val orderLineId = TODO()
        val adAccountId = TODO()
        val response: OrderLine = orderLinesApi.orderLinesGet(orderLineId, adAccountId)
    }

    /**
     * To test OrderLinesApiAction.orderLinesList
     */
    @Test
    fun `should handle orderLinesList`() {
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val order = TODO()
        val response: OrderLinesList200Response = orderLinesApi.orderLinesList(adAccountId, bookmark, pageSize, order)
    }
}
