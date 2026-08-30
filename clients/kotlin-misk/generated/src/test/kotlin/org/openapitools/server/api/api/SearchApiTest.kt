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
import org.openapitools.server.api.model.BoardsList200Response
import org.openapitools.server.api.model.PinsList200Response
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.SearchPartnerPins200Response

@MiskTest(startService = true)
internal class SearchApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var searchApi: SearchApiAction

    /**
     * To test SearchApiAction.searchPartnerPins
     */
    @Test
    fun `should handle searchPartnerPins`() {
        val term = TODO()
        val countryCode = TODO()
        val bookmark = TODO()
        val locale = TODO()
        val limit = TODO()
        val response: SearchPartnerPins200Response = searchApi.searchPartnerPins(term, countryCode, bookmark, locale, limit)
    }

    /**
     * To test SearchApiAction.searchUserBoardsGet
     */
    @Test
    fun `should handle searchUserBoardsGet`() {
        val adAccountId = TODO()
        val query = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: BoardsList200Response = searchApi.searchUserBoardsGet(adAccountId, query, bookmark, pageSize)
    }

    /**
     * To test SearchApiAction.searchUserPinsList
     */
    @Test
    fun `should handle searchUserPinsList`() {
        val query = TODO()
        val adAccountId = TODO()
        val bookmark = TODO()
        val response: PinsList200Response = searchApi.searchUserPinsList(query, adAccountId, bookmark)
    }
}
