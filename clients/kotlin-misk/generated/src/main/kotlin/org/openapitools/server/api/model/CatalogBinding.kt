package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogBinding(
    /** Catalog type */
    val catalogType: kotlin.String? = null,
    /** Catalog ID. */
    val id: kotlin.String? = null,
    /** Catalog name */
    val name: kotlin.String? = null
)
