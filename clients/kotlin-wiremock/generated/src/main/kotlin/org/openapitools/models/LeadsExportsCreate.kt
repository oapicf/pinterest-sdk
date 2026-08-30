@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LeadsExportsCreate(
    @field:JsonProperty("ad_id")
    val adId: kotlin.String,

    @field:JsonProperty("end_date")
    val endDate: kotlin.String,

    @field:JsonProperty("start_date")
    val startDate: kotlin.String,

)
