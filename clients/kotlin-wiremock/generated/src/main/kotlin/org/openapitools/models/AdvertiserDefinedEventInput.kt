@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdvertiserDefinedEventInput(
    @field:JsonProperty("mapped_conversion_type")
    val mappedConversionType: AdvertiserDefinedEventMappingType,

    @field:JsonProperty("name")
    val name: kotlin.String,

)
