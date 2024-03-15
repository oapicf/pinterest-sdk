package org.openapitools.api

import org.openapitools.model.Error
import org.openapitools.model.PinsList200Response
import org.openapitools.model.SearchPartnerPins200Response
import org.openapitools.model.SearchUserBoardsGet200Response
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class SearchApiTest {

    private val api: SearchApiController = SearchApiController()

    /**
     * To test SearchApiController.searchPartnerPins
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun searchPartnerPinsTest() {
        val term: kotlin.String = TODO()
        val countryCode: kotlin.String = TODO()
        val bookmark: kotlin.String? = TODO()
        val locale: kotlin.String? = TODO()
        val limit: kotlin.Int = TODO()
        val response: ResponseEntity<SearchPartnerPins200Response> = api.searchPartnerPins(term, countryCode, bookmark, locale, limit)

        // TODO: test validations
    }

    /**
     * To test SearchApiController.searchUserBoardsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun searchUserBoardsGetTest() {
        val adAccountId: kotlin.String? = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val query: kotlin.String? = TODO()
        val response: ResponseEntity<SearchUserBoardsGet200Response> = api.searchUserBoardsGet(adAccountId, bookmark, pageSize, query)

        // TODO: test validations
    }

    /**
     * To test SearchApiController.searchUserPinsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun searchUserPinsListTest() {
        val query: kotlin.String = TODO()
        val adAccountId: kotlin.String? = TODO()
        val bookmark: kotlin.String? = TODO()
        val response: ResponseEntity<PinsList200Response> = api.searchUserPinsList(query, adAccountId, bookmark)

        // TODO: test validations
    }
}
