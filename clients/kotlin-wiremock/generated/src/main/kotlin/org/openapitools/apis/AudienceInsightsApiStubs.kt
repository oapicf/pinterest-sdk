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
open class AudienceInsightsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation audienceInsightsGet.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param audienceInsightType query parameter audienceInsightType pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AudienceInsightsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun audienceInsightsGet(adAccountId: StringValuePattern, audienceInsightType: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): AudienceInsightsGetStubBuilder =
        AudienceInsightsGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/audience_insights"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { audienceInsightType?.let { withQueryParam("audience_insight_type", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation audienceInsightsScopeAndTypeGet.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AudienceInsightsScopeAndTypeGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun audienceInsightsScopeAndTypeGet(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AudienceInsightsScopeAndTypeGetStubBuilder =
        AudienceInsightsScopeAndTypeGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/insights/audiences"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )
}
