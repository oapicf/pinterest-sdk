@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BulkDownloadCreate(
    @field:JsonProperty("campaign_filter")
    val campaignFilter: BulkDownloadCampaignFilter? = null,

    @field:JsonProperty("entity_ids")
    val entityIds: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("entity_types")
    val entityTypes: kotlin.collections.List<BulkEntityType>? = null,

    @field:JsonProperty("output_format")
    val outputFormat: BulkOutputFormat? = null,

    @field:JsonProperty("updated_since")
    val updatedSince: kotlin.String? = null,

)
