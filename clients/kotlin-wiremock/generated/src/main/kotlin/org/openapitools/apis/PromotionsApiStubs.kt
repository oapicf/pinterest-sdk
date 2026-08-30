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
open class PromotionsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation promotionsCreate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PromotionsCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun promotionsCreate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): PromotionsCreateStubBuilder =
        PromotionsCreateStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/promotions"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation promotionsDelete.
     *
     * @param promotionId path parameter promotionId pattern.
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PromotionsDeleteStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun promotionsDelete(promotionId: StringValuePattern, adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): PromotionsDeleteStubBuilder =
        PromotionsDeleteStubBuilder(objectMapper, delete(urlPathTemplate("/ad_accounts/{ad_account_id}/promotions/{promotion_id}"))
            .withPathParam("promotion_id", promotionId)
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation promotionsGet.
     *
     * @param promotionId path parameter promotionId pattern.
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PromotionsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun promotionsGet(promotionId: StringValuePattern, adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): PromotionsGetStubBuilder =
        PromotionsGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/promotions/{promotion_id}"))
            .withPathParam("promotion_id", promotionId)
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation promotionsList.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param order query parameter order pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PromotionsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun promotionsList(adAccountId: StringValuePattern, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, order: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PromotionsListStubBuilder =
        PromotionsListStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/promotions"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .apply { order?.let { withQueryParam("order", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation promotionsUpdate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PromotionsUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun promotionsUpdate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): PromotionsUpdateStubBuilder =
        PromotionsUpdateStubBuilder(objectMapper, patch(urlPathTemplate("/ad_accounts/{ad_account_id}/promotions"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )
}
