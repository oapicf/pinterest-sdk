@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AudienceDemographics(
    @field:JsonProperty("ages")
    val ages: kotlin.collections.List<AudienceDemographicValue>? = null,

    @field:JsonProperty("countries")
    val countries: kotlin.collections.List<AudienceDemographicValue>? = null,

    @field:JsonProperty("devices")
    val devices: kotlin.collections.List<AudienceDemographicValue>? = null,

    @field:JsonProperty("genders")
    val genders: kotlin.collections.List<AudienceDemographicValue>? = null,

    @field:JsonProperty("metros")
    val metros: kotlin.collections.List<AudienceDemographicValue>? = null,

)
