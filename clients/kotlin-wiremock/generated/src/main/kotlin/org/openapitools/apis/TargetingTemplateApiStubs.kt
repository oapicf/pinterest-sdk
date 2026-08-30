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
open class TargetingTemplateApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation targetingTemplateCreate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [TargetingTemplateCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun targetingTemplateCreate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): TargetingTemplateCreateStubBuilder =
        TargetingTemplateCreateStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/targeting_templates"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation targetingTemplateList.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param order query parameter order pattern.
     * @param includeSizing query parameter includeSizing pattern.
     * @param searchQuery query parameter searchQuery pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [TargetingTemplateListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun targetingTemplateList(adAccountId: StringValuePattern, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, order: StringValuePattern? = null, includeSizing: StringValuePattern? = null, searchQuery: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): TargetingTemplateListStubBuilder =
        TargetingTemplateListStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/targeting_templates"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .apply { order?.let { withQueryParam("order", it) } }
            .apply { includeSizing?.let { withQueryParam("include_sizing", it) } }
            .apply { searchQuery?.let { withQueryParam("search_query", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation targetingTemplateUpdate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [TargetingTemplateUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun targetingTemplateUpdate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): TargetingTemplateUpdateStubBuilder =
        TargetingTemplateUpdateStubBuilder(objectMapper, patch(urlPathTemplate("/ad_accounts/{ad_account_id}/targeting_templates"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )
}
