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
open class LeadFormsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation leadFormGet.
     *
     * @param leadFormId path parameter leadFormId pattern.
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [LeadFormGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun leadFormGet(leadFormId: StringValuePattern, adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): LeadFormGetStubBuilder =
        LeadFormGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}"))
            .withPathParam("lead_form_id", leadFormId)
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation leadFormTestCreate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param leadFormId path parameter leadFormId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [LeadFormTestCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun leadFormTestCreate(adAccountId: StringValuePattern, leadFormId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): LeadFormTestCreateStubBuilder =
        LeadFormTestCreateStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test"))
            .withPathParam("ad_account_id", adAccountId)
            .withPathParam("lead_form_id", leadFormId)
            .configurer()
        )

    /**
     * Construct a stub for the operation leadFormsCreate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [LeadFormsCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun leadFormsCreate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): LeadFormsCreateStubBuilder =
        LeadFormsCreateStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/lead_forms"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation leadFormsList.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param order query parameter order pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [LeadFormsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun leadFormsList(adAccountId: StringValuePattern, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, order: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): LeadFormsListStubBuilder =
        LeadFormsListStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/lead_forms"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .apply { order?.let { withQueryParam("order", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation leadFormsUpdate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [LeadFormsUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun leadFormsUpdate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): LeadFormsUpdateStubBuilder =
        LeadFormsUpdateStubBuilder(objectMapper, patch(urlPathTemplate("/ad_accounts/{ad_account_id}/lead_forms"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )
}
