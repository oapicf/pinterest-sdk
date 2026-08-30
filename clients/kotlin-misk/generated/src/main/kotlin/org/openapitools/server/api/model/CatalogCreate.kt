package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogCreate(
    val catalogType: CatalogsType,
    /** A human-friendly name associated to a catalog entity. */
    val name: kotlin.String
)
