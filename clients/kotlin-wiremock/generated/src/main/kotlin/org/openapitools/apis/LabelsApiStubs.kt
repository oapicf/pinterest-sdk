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
open class LabelsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation labelsApply.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param labelId path parameter labelId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [LabelsApplyStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun labelsApply(adAccountId: StringValuePattern, labelId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): LabelsApplyStubBuilder =
        LabelsApplyStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/labels/{label_id}/apply"))
            .withPathParam("ad_account_id", adAccountId)
            .withPathParam("label_id", labelId)
            .configurer()
        )

    /**
     * Construct a stub for the operation labelsCreate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [LabelsCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun labelsCreate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): LabelsCreateStubBuilder =
        LabelsCreateStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/labels"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation labelsList.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param campaignIds query parameter campaignIds pattern.
     * @param labelIds query parameter labelIds pattern.
     * @param entityStatuses query parameter entityStatuses pattern.
     * @param labelTypes query parameter labelTypes pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [LabelsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun labelsList(adAccountId: StringValuePattern, campaignIds: StringValuePattern? = null, labelIds: StringValuePattern? = null, entityStatuses: StringValuePattern? = null, labelTypes: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): LabelsListStubBuilder =
        LabelsListStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/labels"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { campaignIds?.let { withQueryParam("campaign_ids", it) } }
            .apply { labelIds?.let { withQueryParam("label_ids", it) } }
            .apply { entityStatuses?.let { withQueryParam("entity_statuses", it) } }
            .apply { labelTypes?.let { withQueryParam("label_types", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation labelsRemove.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param labelId path parameter labelId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [LabelsRemoveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun labelsRemove(adAccountId: StringValuePattern, labelId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): LabelsRemoveStubBuilder =
        LabelsRemoveStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/labels/{label_id}/remove"))
            .withPathParam("ad_account_id", adAccountId)
            .withPathParam("label_id", labelId)
            .configurer()
        )

    /**
     * Construct a stub for the operation labelsUpdate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [LabelsUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun labelsUpdate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): LabelsUpdateStubBuilder =
        LabelsUpdateStubBuilder(objectMapper, patch(urlPathTemplate("/ad_accounts/{ad_account_id}/labels"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )
}
