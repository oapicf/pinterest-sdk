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
open class ConversionTagsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation conversionTagsCreate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ConversionTagsCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun conversionTagsCreate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ConversionTagsCreateStubBuilder =
        ConversionTagsCreateStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/conversion_tags"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation conversionTagsGet.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param conversionTagId path parameter conversionTagId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ConversionTagsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun conversionTagsGet(adAccountId: StringValuePattern, conversionTagId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ConversionTagsGetStubBuilder =
        ConversionTagsGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}"))
            .withPathParam("ad_account_id", adAccountId)
            .withPathParam("conversion_tag_id", conversionTagId)
            .configurer()
        )

    /**
     * Construct a stub for the operation conversionTagsList.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param filterDeleted query parameter filterDeleted pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ConversionTagsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun conversionTagsList(adAccountId: StringValuePattern, filterDeleted: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ConversionTagsListStubBuilder =
        ConversionTagsListStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/conversion_tags"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { filterDeleted?.let { withQueryParam("filter_deleted", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation ocpmEligibleConversionTagsGet.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [OcpmEligibleConversionTagsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun ocpmEligibleConversionTagsGet(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): OcpmEligibleConversionTagsGetStubBuilder =
        OcpmEligibleConversionTagsGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation pageVisitConversionTagsGet.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param order query parameter order pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PageVisitConversionTagsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun pageVisitConversionTagsGet(adAccountId: StringValuePattern, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, order: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PageVisitConversionTagsGetStubBuilder =
        PageVisitConversionTagsGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/conversion_tags/page_visit"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .apply { order?.let { withQueryParam("order", it) } }
            .configurer()
        )
}
