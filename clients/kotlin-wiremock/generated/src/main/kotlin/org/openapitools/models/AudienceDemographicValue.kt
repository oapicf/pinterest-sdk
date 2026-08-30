@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AudienceDemographicValue(
    @field:JsonProperty("key")
    val key: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("ratio")
    val ratio: java.math.BigDecimal? = null,

)
