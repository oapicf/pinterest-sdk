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
open class CustomerSegmentApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation customerSegmentCreate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CustomerSegmentCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun customerSegmentCreate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CustomerSegmentCreateStubBuilder =
        CustomerSegmentCreateStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/customer_segments"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation customerSegmentList.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param order query parameter order pattern.
     * @param includeSizing query parameter includeSizing pattern.
     * @param searchQuery query parameter searchQuery pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CustomerSegmentListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun customerSegmentList(adAccountId: StringValuePattern, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, order: StringValuePattern? = null, includeSizing: StringValuePattern? = null, searchQuery: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CustomerSegmentListStubBuilder =
        CustomerSegmentListStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/customer_segments"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .apply { order?.let { withQueryParam("order", it) } }
            .apply { includeSizing?.let { withQueryParam("include_sizing", it) } }
            .apply { searchQuery?.let { withQueryParam("search_query", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation customerSegmentUpdate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CustomerSegmentUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun customerSegmentUpdate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CustomerSegmentUpdateStubBuilder =
        CustomerSegmentUpdateStubBuilder(objectMapper, patch(urlPathTemplate("/ad_accounts/{ad_account_id}/customer_segments"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )
}
