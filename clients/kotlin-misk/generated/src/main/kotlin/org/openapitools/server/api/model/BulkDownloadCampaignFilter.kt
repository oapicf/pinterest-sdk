package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConversionObjectiveType
import org.openapitools.server.api.model.SummaryStatus
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BulkDownloadCampaignFilter(
    val campaignStatus: kotlin.collections.List<SummaryStatus>? = null,
    /** Unix UTC timestamp. */
    val endTime: kotlin.String? = null,
    /** Campaign name */
    val name: kotlin.String? = null,
    val objectiveType: kotlin.collections.List<ConversionObjectiveType>? = null,
    /** Unix UTC timestamp. */
    val startTime: kotlin.String? = null
)
