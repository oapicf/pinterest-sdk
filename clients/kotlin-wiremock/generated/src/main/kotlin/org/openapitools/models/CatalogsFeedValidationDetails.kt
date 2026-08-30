@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsFeedValidationDetails(
    @field:JsonProperty("errors")
    val errors: CatalogsFeedValidationErrors,

    @field:JsonProperty("warnings")
    val warnings: CatalogsFeedValidationWarnings,

)
