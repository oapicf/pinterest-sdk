@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class DynamicTitlesProcessCSVError(
    @field:JsonProperty("error_type")
    val errorType: kotlin.String? = null,

    @field:JsonProperty("row_number")
    val rowNumber: kotlin.Int? = null,

)
