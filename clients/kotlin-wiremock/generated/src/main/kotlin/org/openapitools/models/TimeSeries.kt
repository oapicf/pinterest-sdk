@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TimeSeries(
    @field:JsonProperty("date")
    val date: java.time.LocalDate? = null,

)
