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
import org.openapitools.server.api.model.CustomerList
import org.openapitools.server.api.model.CustomerListCreate
import org.openapitools.server.api.model.CustomerListUpdateWithRequiredBody
import org.openapitools.server.api.model.CustomerListsList200Response
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder

@MiskTest(startService = true)
internal class CustomerListsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var customerListsApi: CustomerListsApiAction

    /**
     * To test CustomerListsApiAction.customerListsCreate
     */
    @Test
    fun `should handle customerListsCreate`() {
        val adAccountId = TODO()
        val customerListCreate = TODO()
        val response: CustomerList = customerListsApi.customerListsCreate(adAccountId, customerListCreate)
    }

    /**
     * To test CustomerListsApiAction.customerListsGet
     */
    @Test
    fun `should handle customerListsGet`() {
        val adAccountId = TODO()
        val customerListId = TODO()
        val response: CustomerList = customerListsApi.customerListsGet(adAccountId, customerListId)
    }

    /**
     * To test CustomerListsApiAction.customerListsList
     */
    @Test
    fun `should handle customerListsList`() {
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val order = TODO()
        val excludeNca = TODO()
        val response: CustomerListsList200Response = customerListsApi.customerListsList(adAccountId, bookmark, pageSize, order, excludeNca)
    }

    /**
     * To test CustomerListsApiAction.customerListsUpdate
     */
    @Test
    fun `should handle customerListsUpdate`() {
        val adAccountId = TODO()
        val customerListId = TODO()
        val customerListUpdateWithRequiredBody = TODO()
        val response: CustomerList = customerListsApi.customerListsUpdate(adAccountId, customerListId, customerListUpdateWithRequiredBody)
    }
}
