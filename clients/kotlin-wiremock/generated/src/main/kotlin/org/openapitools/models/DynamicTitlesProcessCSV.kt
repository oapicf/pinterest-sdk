@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class DynamicTitlesProcessCSV(
    @field:JsonProperty("errors")
    val errors: kotlin.collections.List<DynamicTitlesProcessCSVError>? = null,

    @field:JsonProperty("status")
    val status: kotlin.String? = null,

)
