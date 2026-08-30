@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AvailabilityFilter(
    @field:JsonProperty("AVAILABILITY")
    val AVAILABILITY: CatalogsProductGroupMultipleStringCriteria,

)
