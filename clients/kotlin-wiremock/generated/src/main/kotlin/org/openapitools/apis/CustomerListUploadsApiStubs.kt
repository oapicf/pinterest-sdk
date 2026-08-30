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
open class CustomerListUploadsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation customerListUploadsCreate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param customerListId path parameter customerListId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CustomerListUploadsCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun customerListUploadsCreate(adAccountId: StringValuePattern, customerListId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CustomerListUploadsCreateStubBuilder =
        CustomerListUploadsCreateStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads"))
            .withPathParam("ad_account_id", adAccountId)
            .withPathParam("customer_list_id", customerListId)
            .configurer()
        )

    /**
     * Construct a stub for the operation customerListUploadsGet.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param customerListId path parameter customerListId pattern.
     * @param customerListUploadId path parameter customerListUploadId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CustomerListUploadsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun customerListUploadsGet(adAccountId: StringValuePattern, customerListId: StringValuePattern, customerListUploadId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CustomerListUploadsGetStubBuilder =
        CustomerListUploadsGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}"))
            .withPathParam("ad_account_id", adAccountId)
            .withPathParam("customer_list_id", customerListId)
            .withPathParam("customer_list_upload_id", customerListUploadId)
            .configurer()
        )

    /**
     * Construct a stub for the operation customerListUploadsRun.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param customerListId path parameter customerListId pattern.
     * @param customerListUploadId path parameter customerListUploadId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CustomerListUploadsRunStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun customerListUploadsRun(adAccountId: StringValuePattern, customerListId: StringValuePattern, customerListUploadId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CustomerListUploadsRunStubBuilder =
        CustomerListUploadsRunStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run"))
            .withPathParam("ad_account_id", adAccountId)
            .withPathParam("customer_list_id", customerListId)
            .withPathParam("customer_list_upload_id", customerListUploadId)
            .configurer()
        )
}
