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
import org.openapitools.server.api.model.ConversionEventResponse
import org.openapitools.server.api.model.ConversionTag
import org.openapitools.server.api.model.ConversionTagCreate
import org.openapitools.server.api.model.ConversionTagsList200Response
import org.openapitools.server.api.model.PageVisitConversionTagsGet200Response
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder

@MiskTest(startService = true)
internal class ConversionTagsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var conversionTagsApi: ConversionTagsApiAction

    /**
     * To test ConversionTagsApiAction.conversionTagsCreate
     */
    @Test
    fun `should handle conversionTagsCreate`() {
        val adAccountId = TODO()
        val conversionTagCreate = TODO()
        val response: ConversionTag = conversionTagsApi.conversionTagsCreate(adAccountId, conversionTagCreate)
    }

    /**
     * To test ConversionTagsApiAction.conversionTagsGet
     */
    @Test
    fun `should handle conversionTagsGet`() {
        val adAccountId = TODO()
        val conversionTagId = TODO()
        val response: ConversionTag = conversionTagsApi.conversionTagsGet(adAccountId, conversionTagId)
    }

    /**
     * To test ConversionTagsApiAction.conversionTagsList
     */
    @Test
    fun `should handle conversionTagsList`() {
        val adAccountId = TODO()
        val filterDeleted = TODO()
        val response: ConversionTagsList200Response = conversionTagsApi.conversionTagsList(adAccountId, filterDeleted)
    }

    /**
     * To test ConversionTagsApiAction.ocpmEligibleConversionTagsGet
     */
    @Test
    fun `should handle ocpmEligibleConversionTagsGet`() {
        val adAccountId = TODO()
        val response: kotlin.collections.Map<kotlin.String, kotlin.collections.List<ConversionEventResponse>> = conversionTagsApi.ocpmEligibleConversionTagsGet(adAccountId)
    }

    /**
     * To test ConversionTagsApiAction.pageVisitConversionTagsGet
     */
    @Test
    fun `should handle pageVisitConversionTagsGet`() {
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val order = TODO()
        val response: PageVisitConversionTagsGet200Response = conversionTagsApi.pageVisitConversionTagsGet(adAccountId, bookmark, pageSize, order)
    }
}
