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
open class BulkApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation bulkDownloadCreate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BulkDownloadCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun bulkDownloadCreate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): BulkDownloadCreateStubBuilder =
        BulkDownloadCreateStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/bulk/download"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation bulkRequestGet.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param bulkRequestId path parameter bulkRequestId pattern.
     * @param includeDetails query parameter includeDetails pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BulkRequestGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun bulkRequestGet(adAccountId: StringValuePattern, bulkRequestId: StringValuePattern, includeDetails: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): BulkRequestGetStubBuilder =
        BulkRequestGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}"))
            .withPathParam("ad_account_id", adAccountId)
            .withPathParam("bulk_request_id", bulkRequestId)
            .apply { includeDetails?.let { withQueryParam("include_details", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation bulkUpsertCreate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [BulkUpsertCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun bulkUpsertCreate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): BulkUpsertCreateStubBuilder =
        BulkUpsertCreateStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/bulk/upsert"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )
}
