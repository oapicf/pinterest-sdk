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
open class CustomerListsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation customerListsCreate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CustomerListsCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun customerListsCreate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CustomerListsCreateStubBuilder =
        CustomerListsCreateStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/customer_lists"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation customerListsGet.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param customerListId path parameter customerListId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CustomerListsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun customerListsGet(adAccountId: StringValuePattern, customerListId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CustomerListsGetStubBuilder =
        CustomerListsGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}"))
            .withPathParam("ad_account_id", adAccountId)
            .withPathParam("customer_list_id", customerListId)
            .configurer()
        )

    /**
     * Construct a stub for the operation customerListsList.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param order query parameter order pattern.
     * @param excludeNca query parameter excludeNca pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CustomerListsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun customerListsList(adAccountId: StringValuePattern, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, order: StringValuePattern? = null, excludeNca: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CustomerListsListStubBuilder =
        CustomerListsListStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/customer_lists"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .apply { order?.let { withQueryParam("order", it) } }
            .apply { excludeNca?.let { withQueryParam("exclude_nca", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation customerListsUpdate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param customerListId path parameter customerListId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CustomerListsUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun customerListsUpdate(adAccountId: StringValuePattern, customerListId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CustomerListsUpdateStubBuilder =
        CustomerListsUpdateStubBuilder(objectMapper, patch(urlPathTemplate("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}"))
            .withPathParam("ad_account_id", adAccountId)
            .withPathParam("customer_list_id", customerListId)
            .configurer()
        )
}
