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
open class TermsOfServiceApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation termsOfServiceGet.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param includeHtml query parameter includeHtml pattern.
     * @param tosType query parameter tosType pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [TermsOfServiceGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun termsOfServiceGet(adAccountId: StringValuePattern, includeHtml: StringValuePattern? = null, tosType: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): TermsOfServiceGetStubBuilder =
        TermsOfServiceGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/terms_of_service"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { includeHtml?.let { withQueryParam("include_html", it) } }
            .apply { tosType?.let { withQueryParam("tos_type", it) } }
            .configurer()
        )
}
