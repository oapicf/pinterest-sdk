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
open class IntegrationsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation integrationsCommerceDel.
     *
     * @param externalBusinessId path parameter externalBusinessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [IntegrationsCommerceDelStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun integrationsCommerceDel(externalBusinessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): IntegrationsCommerceDelStubBuilder =
        IntegrationsCommerceDelStubBuilder(objectMapper, delete(urlPathTemplate("/integrations/commerce/{external_business_id}"))
            .withPathParam("external_business_id", externalBusinessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation integrationsCommerceGet.
     *
     * @param externalBusinessId path parameter externalBusinessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [IntegrationsCommerceGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun integrationsCommerceGet(externalBusinessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): IntegrationsCommerceGetStubBuilder =
        IntegrationsCommerceGetStubBuilder(objectMapper, get(urlPathTemplate("/integrations/commerce/{external_business_id}"))
            .withPathParam("external_business_id", externalBusinessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation integrationsCommercePatch.
     *
     * @param externalBusinessId path parameter externalBusinessId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [IntegrationsCommercePatchStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun integrationsCommercePatch(externalBusinessId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): IntegrationsCommercePatchStubBuilder =
        IntegrationsCommercePatchStubBuilder(objectMapper, patch(urlPathTemplate("/integrations/commerce/{external_business_id}"))
            .withPathParam("external_business_id", externalBusinessId)
            .configurer()
        )

    /**
     * Construct a stub for the operation integrationsCommercePost.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [IntegrationsCommercePostStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun integrationsCommercePost(configurer: MappingBuilder.() -> MappingBuilder = { this }): IntegrationsCommercePostStubBuilder =
        IntegrationsCommercePostStubBuilder(objectMapper, post(urlPathTemplate("/integrations/commerce"))
            .configurer()
        )

    /**
     * Construct a stub for the operation integrationsGetById.
     *
     * @param id path parameter id pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [IntegrationsGetByIdStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun integrationsGetById(id: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): IntegrationsGetByIdStubBuilder =
        IntegrationsGetByIdStubBuilder(objectMapper, get(urlPathTemplate("/integrations/{id}"))
            .withPathParam("id", id)
            .configurer()
        )

    /**
     * Construct a stub for the operation integrationsGetList.
     *
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [IntegrationsGetListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun integrationsGetList(bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): IntegrationsGetListStubBuilder =
        IntegrationsGetListStubBuilder(objectMapper, get(urlPathTemplate("/integrations"))
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation integrationsLogsPost.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [IntegrationsLogsPostStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun integrationsLogsPost(configurer: MappingBuilder.() -> MappingBuilder = { this }): IntegrationsLogsPostStubBuilder =
        IntegrationsLogsPostStubBuilder(objectMapper, post(urlPathTemplate("/integrations/logs"))
            .configurer()
        )
}
