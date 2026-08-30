package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Catalog(
    val catalogType: CatalogsType,
    val createdAt: java.time.OffsetDateTime,
    /** ID of the catalog entity. */
    val id: kotlin.String,
    /** A human-friendly name associated to a catalog entity. */
    val name: kotlin.String,
    val updatedAt: java.time.OffsetDateTime
)
