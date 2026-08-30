package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsFeedValidationErrors
import org.openapitools.server.api.model.CatalogsFeedValidationWarnings
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsFeedValidationDetails(
    val errors: CatalogsFeedValidationErrors,
    val warnings: CatalogsFeedValidationWarnings
)
