@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BulkDownloadCampaignFilter(
    @field:JsonProperty("campaign_status")
    val campaignStatus: kotlin.collections.List<SummaryStatus>? = null,

    @field:JsonProperty("end_time")
    val endTime: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("objective_type")
    val objectiveType: kotlin.collections.List<ConversionObjectiveType>? = null,

    @field:JsonProperty("start_time")
    val startTime: kotlin.String? = null,

)
