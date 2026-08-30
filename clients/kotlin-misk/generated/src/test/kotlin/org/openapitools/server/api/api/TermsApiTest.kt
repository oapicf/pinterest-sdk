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
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.RelatedTerms

@MiskTest(startService = true)
internal class TermsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var termsApi: TermsApiAction

    /**
     * To test TermsApiAction.termsRelatedList
     */
    @Test
    fun `should handle termsRelatedList`() {
        val terms = TODO()
        val response: RelatedTerms = termsApi.termsRelatedList(terms)
    }

    /**
     * To test TermsApiAction.termsSuggestedList
     */
    @Test
    fun `should handle termsSuggestedList`() {
        val term = TODO()
        val limit = TODO()
        val response: kotlin.collections.List<kotlin.String> = termsApi.termsSuggestedList(term, limit)
    }
}
