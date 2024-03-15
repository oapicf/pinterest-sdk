package org.openapitools.api

import org.openapitools.model.Error
import org.openapitools.model.RelatedTerms
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class TermsApiTest {

    private val api: TermsApiController = TermsApiController()

    /**
     * To test TermsApiController.termsRelatedList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun termsRelatedListTest() {
        val terms: kotlin.collections.List<kotlin.String> = TODO()
        val response: ResponseEntity<RelatedTerms> = api.termsRelatedList(terms)

        // TODO: test validations
    }

    /**
     * To test TermsApiController.termsSuggestedList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun termsSuggestedListTest() {
        val term: kotlin.String = TODO()
        val limit: kotlin.Int = TODO()
        val response: ResponseEntity<List<kotlin.String>> = api.termsSuggestedList(term, limit)

        // TODO: test validations
    }
}
