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
open class MediaApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation mediaCreate.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [MediaCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun mediaCreate(configurer: MappingBuilder.() -> MappingBuilder = { this }): MediaCreateStubBuilder =
        MediaCreateStubBuilder(objectMapper, post(urlPathTemplate("/media"))
            .configurer()
        )

    /**
     * Construct a stub for the operation mediaGet.
     *
     * @param mediaId path parameter mediaId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [MediaGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun mediaGet(mediaId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): MediaGetStubBuilder =
        MediaGetStubBuilder(objectMapper, get(urlPathTemplate("/media/{media_id}"))
            .withPathParam("media_id", mediaId)
            .configurer()
        )

    /**
     * Construct a stub for the operation mediaList.
     *
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [MediaListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun mediaList(bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): MediaListStubBuilder =
        MediaListStubBuilder(objectMapper, get(urlPathTemplate("/media"))
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )
}
