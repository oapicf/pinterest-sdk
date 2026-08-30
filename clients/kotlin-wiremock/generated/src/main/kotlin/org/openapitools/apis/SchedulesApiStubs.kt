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
open class SchedulesApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation schedulesCreate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SchedulesCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun schedulesCreate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): SchedulesCreateStubBuilder =
        SchedulesCreateStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/schedules"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation schedulesList.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param order query parameter order pattern.
     * @param scheduleStatuses query parameter scheduleStatuses pattern.
     * @param scheduleType query parameter scheduleType pattern.
     * @param entityIds query parameter entityIds pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SchedulesListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun schedulesList(adAccountId: StringValuePattern, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, order: StringValuePattern? = null, scheduleStatuses: StringValuePattern? = null, scheduleType: StringValuePattern? = null, entityIds: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): SchedulesListStubBuilder =
        SchedulesListStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/schedules"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .apply { order?.let { withQueryParam("order", it) } }
            .apply { scheduleStatuses?.let { withQueryParam("schedule_statuses", it) } }
            .apply { scheduleType?.let { withQueryParam("schedule_type", it) } }
            .apply { entityIds?.let { withQueryParam("entity_ids", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation schedulesUpdate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SchedulesUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun schedulesUpdate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): SchedulesUpdateStubBuilder =
        SchedulesUpdateStubBuilder(objectMapper, patch(urlPathTemplate("/ad_accounts/{ad_account_id}/schedules"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )
}
