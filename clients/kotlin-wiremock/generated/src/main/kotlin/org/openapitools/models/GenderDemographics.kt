@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class GenderDemographics(
    @field:JsonProperty("female")
    val female: java.math.BigDecimal,

    @field:JsonProperty("male")
    val male: java.math.BigDecimal,

    @field:JsonProperty("unspecified")
    val unspecified: java.math.BigDecimal,

)
