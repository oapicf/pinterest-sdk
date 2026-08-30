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
open class AdvancedAuctionApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation advancedAuctionItemsGetPost.
     *
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdvancedAuctionItemsGetPostStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun advancedAuctionItemsGetPost(adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdvancedAuctionItemsGetPostStubBuilder =
        AdvancedAuctionItemsGetPostStubBuilder(objectMapper, post(urlPathTemplate("/advanced_auction/items/get"))
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation advancedAuctionItemsSubmitPost.
     *
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdvancedAuctionItemsSubmitPostStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun advancedAuctionItemsSubmitPost(adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdvancedAuctionItemsSubmitPostStubBuilder =
        AdvancedAuctionItemsSubmitPostStubBuilder(objectMapper, post(urlPathTemplate("/advanced_auction/items/submit"))
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )
}
