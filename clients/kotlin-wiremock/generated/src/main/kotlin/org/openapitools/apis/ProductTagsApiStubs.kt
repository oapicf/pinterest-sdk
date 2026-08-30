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
open class ProductTagsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation productTagsBulkAdd.
     *
     * @param pinId path parameter pinId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ProductTagsBulkAddStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun productTagsBulkAdd(pinId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ProductTagsBulkAddStubBuilder =
        ProductTagsBulkAddStubBuilder(objectMapper, post(urlPathTemplate("/pins/{pin_id}/product_tags"))
            .withPathParam("pin_id", pinId)
            .configurer()
        )

    /**
     * Construct a stub for the operation productTagsBulkDelete.
     *
     * @param pinId path parameter pinId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ProductTagsBulkDeleteStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun productTagsBulkDelete(pinId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ProductTagsBulkDeleteStubBuilder =
        ProductTagsBulkDeleteStubBuilder(objectMapper, post(urlPathTemplate("/pins/{pin_id}/product_tags/bulk-delete"))
            .withPathParam("pin_id", pinId)
            .configurer()
        )

    /**
     * Construct a stub for the operation productTagsList.
     *
     * @param pinId path parameter pinId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ProductTagsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun productTagsList(pinId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ProductTagsListStubBuilder =
        ProductTagsListStubBuilder(objectMapper, get(urlPathTemplate("/pins/{pin_id}/product_tags"))
            .withPathParam("pin_id", pinId)
            .configurer()
        )
}
