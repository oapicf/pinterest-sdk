@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsFeedIngestionDetails(
    @field:JsonProperty("errors")
    val errors: CatalogsFeedIngestionErrors,

    @field:JsonProperty("info")
    val info: CatalogsFeedIngestionInfo,

    @field:JsonProperty("warnings")
    val warnings: CatalogsFeedIngestionWarnings,

)
