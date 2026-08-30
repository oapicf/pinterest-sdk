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
open class OrderLinesApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation orderLinesGet.
     *
     * @param orderLineId path parameter orderLineId pattern.
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [OrderLinesGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun orderLinesGet(orderLineId: StringValuePattern, adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): OrderLinesGetStubBuilder =
        OrderLinesGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/order_lines/{order_line_id}"))
            .withPathParam("order_line_id", orderLineId)
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation orderLinesList.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param order query parameter order pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [OrderLinesListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun orderLinesList(adAccountId: StringValuePattern, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, order: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): OrderLinesListStubBuilder =
        OrderLinesListStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/order_lines"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .apply { order?.let { withQueryParam("order", it) } }
            .configurer()
        )
}
