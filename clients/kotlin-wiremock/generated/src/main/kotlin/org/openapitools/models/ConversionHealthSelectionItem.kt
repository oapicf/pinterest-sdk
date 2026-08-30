@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ConversionHealthSelectionItem(
    @field:JsonProperty("status")
    val status: kotlin.Any,

    @field:JsonProperty("conversionType")
    val conversionType: kotlin.Any? = null,

    @field:JsonProperty("criteria")
    val criteria: kotlin.Any? = null,

    @field:JsonProperty("ingestionSource")
    val ingestionSource: kotlin.Any? = null,

)
