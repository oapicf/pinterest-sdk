@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdvertiserDefinedEvent(
    @field:JsonProperty("mapped_conversion_type")
    val mappedConversionType: ConversionTagTypeOptimal? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

)
