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
open class CatalogItemsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation itemsBatchGet.
     *
     * @param batchId path parameter batchId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ItemsBatchGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun itemsBatchGet(batchId: StringValuePattern, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ItemsBatchGetStubBuilder =
        ItemsBatchGetStubBuilder(objectMapper, get(urlPathTemplate("/catalogs/items/batch/{batch_id}"))
            .withPathParam("batch_id", batchId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation itemsBatchPost.
     *
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ItemsBatchPostStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun itemsBatchPost(adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ItemsBatchPostStubBuilder =
        ItemsBatchPostStubBuilder(objectMapper, post(urlPathTemplate("/catalogs/items/batch"))
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation itemsPost.
     *
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ItemsPostStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun itemsPost(adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ItemsPostStubBuilder =
        ItemsPostStubBuilder(objectMapper, post(urlPathTemplate("/catalogs/items"))
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )
}
