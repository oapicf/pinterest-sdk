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
open class AudiencesApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation audiencesCreate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AudiencesCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun audiencesCreate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AudiencesCreateStubBuilder =
        AudiencesCreateStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/audiences"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation audiencesGet.
     *
     * @param audienceId path parameter audienceId pattern.
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AudiencesGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun audiencesGet(audienceId: StringValuePattern, adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AudiencesGetStubBuilder =
        AudiencesGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/audiences/{audience_id}"))
            .withPathParam("audience_id", audienceId)
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation audiencesList.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param order query parameter order pattern.
     * @param ownershipType query parameter ownershipType pattern.
     * @param excludeNca query parameter excludeNca pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AudiencesListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun audiencesList(adAccountId: StringValuePattern, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, order: StringValuePattern? = null, ownershipType: StringValuePattern? = null, excludeNca: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): AudiencesListStubBuilder =
        AudiencesListStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/audiences"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .apply { order?.let { withQueryParam("order", it) } }
            .apply { ownershipType?.let { withQueryParam("ownership_type", it) } }
            .apply { excludeNca?.let { withQueryParam("exclude_nca", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation audiencesUpdate.
     *
     * @param audienceId path parameter audienceId pattern.
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AudiencesUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun audiencesUpdate(audienceId: StringValuePattern, adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AudiencesUpdateStubBuilder =
        AudiencesUpdateStubBuilder(objectMapper, patch(urlPathTemplate("/ad_accounts/{ad_account_id}/audiences/{audience_id}"))
            .withPathParam("audience_id", audienceId)
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )
}
