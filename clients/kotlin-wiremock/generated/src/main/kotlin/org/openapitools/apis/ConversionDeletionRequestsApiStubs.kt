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
open class ConversionDeletionRequestsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation conversionDeletionRequestCreate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ConversionDeletionRequestCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun conversionDeletionRequestCreate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ConversionDeletionRequestCreateStubBuilder =
        ConversionDeletionRequestCreateStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/conversion_deletion_requests"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation conversionDeletionRequestDelete.
     *
     * @param requestId path parameter requestId pattern.
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ConversionDeletionRequestDeleteStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun conversionDeletionRequestDelete(requestId: StringValuePattern, adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ConversionDeletionRequestDeleteStubBuilder =
        ConversionDeletionRequestDeleteStubBuilder(objectMapper, delete(urlPathTemplate("/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}"))
            .withPathParam("request_id", requestId)
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation conversionDeletionRequestGet.
     *
     * @param requestId path parameter requestId pattern.
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ConversionDeletionRequestGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun conversionDeletionRequestGet(requestId: StringValuePattern, adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ConversionDeletionRequestGetStubBuilder =
        ConversionDeletionRequestGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}"))
            .withPathParam("request_id", requestId)
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation conversionDeletionRequestList.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param order query parameter order pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ConversionDeletionRequestListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun conversionDeletionRequestList(adAccountId: StringValuePattern, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, order: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ConversionDeletionRequestListStubBuilder =
        ConversionDeletionRequestListStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/conversion_deletion_requests"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .apply { order?.let { withQueryParam("order", it) } }
            .configurer()
        )
}
