@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ConversionEventsCreate(
    @field:JsonProperty("data")
    val `data`: kotlin.collections.List<ConversionEventsDataItems>,

)
