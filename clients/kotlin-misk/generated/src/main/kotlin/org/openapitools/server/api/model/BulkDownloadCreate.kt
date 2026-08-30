package org.openapitools.server.api.model

import org.openapitools.server.api.model.BulkDownloadCampaignFilter
import org.openapitools.server.api.model.BulkEntityType
import org.openapitools.server.api.model.BulkOutputFormat
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BulkDownloadCreate(
    val campaignFilter: BulkDownloadCampaignFilter? = null,
    /** All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. */
    val entityIds: kotlin.collections.List<kotlin.String>? = null,
    /** All entity types specified will be downloaded. Fewer types result in faster downloads. */
    val entityTypes: kotlin.collections.List<BulkEntityType>? = null,
    val outputFormat: BulkOutputFormat? = null,
    /** Unix UTC timestamp to retrieve all entities that have changed since this time. */
    val updatedSince: kotlin.String? = null
)
