package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsFeedIngestionErrors
import org.openapitools.server.api.model.CatalogsFeedIngestionInfo
import org.openapitools.server.api.model.CatalogsFeedIngestionWarnings
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsFeedIngestionDetails(
    val errors: CatalogsFeedIngestionErrors,
    val info: CatalogsFeedIngestionInfo,
    val warnings: CatalogsFeedIngestionWarnings
)
