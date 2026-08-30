@file:Suppress(
    "RemoveRedundantQualifierName",
    "UnusedImport",
    "unused",
)

package org.openapitools.apis

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.tomakehurst.wiremock.client.MappingBuilder
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder
import com.github.tomakehurst.wiremock.client.WireMock.*
import com.github.tomakehurst.wiremock.matching.StringValuePattern
import org.openapitools.models.*

/**
 * WireMock stub request builder.
 */
open class TermsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation termsRelatedList.
     *
     * @param terms query parameter terms pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [TermsRelatedListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun termsRelatedList(terms: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): TermsRelatedListStubBuilder =
        TermsRelatedListStubBuilder(objectMapper, get(urlPathTemplate("/terms/related"))
            .apply { terms?.let { withQueryParam("terms", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation termsSuggestedList.
     *
     * @param term query parameter term pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [TermsSuggestedListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun termsSuggestedList(term: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): TermsSuggestedListStubBuilder =
        TermsSuggestedListStubBuilder(objectMapper, get(urlPathTemplate("/terms/suggested"))
            .apply { term?.let { withQueryParam("term", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )
}
