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
open class LeadAdsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation adAccountsSubscriptionsDelById.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param subscriptionId path parameter subscriptionId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdAccountsSubscriptionsDelByIdStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adAccountsSubscriptionsDelById(adAccountId: StringValuePattern, subscriptionId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdAccountsSubscriptionsDelByIdStubBuilder =
        AdAccountsSubscriptionsDelByIdStubBuilder(objectMapper, delete(urlPathTemplate("/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}"))
            .withPathParam("ad_account_id", adAccountId)
            .withPathParam("subscription_id", subscriptionId)
            .configurer()
        )

    /**
     * Construct a stub for the operation adAccountsSubscriptionsGetById.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param subscriptionId path parameter subscriptionId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdAccountsSubscriptionsGetByIdStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adAccountsSubscriptionsGetById(adAccountId: StringValuePattern, subscriptionId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdAccountsSubscriptionsGetByIdStubBuilder =
        AdAccountsSubscriptionsGetByIdStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}"))
            .withPathParam("ad_account_id", adAccountId)
            .withPathParam("subscription_id", subscriptionId)
            .configurer()
        )

    /**
     * Construct a stub for the operation adAccountsSubscriptionsGetList.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdAccountsSubscriptionsGetListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adAccountsSubscriptionsGetList(adAccountId: StringValuePattern, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdAccountsSubscriptionsGetListStubBuilder =
        AdAccountsSubscriptionsGetListStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/leads/subscriptions"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation adAccountsSubscriptionsPost.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdAccountsSubscriptionsPostStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adAccountsSubscriptionsPost(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdAccountsSubscriptionsPostStubBuilder =
        AdAccountsSubscriptionsPostStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/leads/subscriptions"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )
}
