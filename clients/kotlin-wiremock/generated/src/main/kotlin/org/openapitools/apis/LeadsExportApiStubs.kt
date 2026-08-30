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
open class LeadsExportApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation leadsExportCreate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [LeadsExportCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun leadsExportCreate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): LeadsExportCreateStubBuilder =
        LeadsExportCreateStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/leads_export"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation leadsExportGet.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param leadsExportId path parameter leadsExportId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [LeadsExportGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun leadsExportGet(adAccountId: StringValuePattern, leadsExportId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): LeadsExportGetStubBuilder =
        LeadsExportGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}"))
            .withPathParam("ad_account_id", adAccountId)
            .withPathParam("leads_export_id", leadsExportId)
            .configurer()
        )
}
