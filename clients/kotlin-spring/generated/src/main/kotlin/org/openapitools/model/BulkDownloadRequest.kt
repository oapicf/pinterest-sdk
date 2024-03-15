package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.BulkDownloadRequestCampaignFilter
import org.openapitools.model.BulkEntityType
import org.openapitools.model.BulkOutputFormat
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Ad entities to get in bulk request.
 * @param entityTypes All entity types specified will be downloaded. Fewer types result in faster downloads.
 * @param entityIds All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
 * @param updatedSince Unix UTC timestamp to retrieve all entities that have changed since this time.
 * @param campaignFilter 
 * @param outputFormat 
 */
data class BulkDownloadRequest(

    @field:Valid
    @get:Size(min=1,max=5) 
    @Schema(example = "[\"CAMPAIGN\",\"AD_GROUP\"]", description = "All entity types specified will be downloaded. Fewer types result in faster downloads.")
    @get:JsonProperty("entity_types") val entityTypes: kotlin.collections.List<BulkEntityType>? = null,

    @Schema(example = "null", description = "All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.")
    @get:JsonProperty("entity_ids") val entityIds: kotlin.collections.List<kotlin.String>? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "1622848072", description = "Unix UTC timestamp to retrieve all entities that have changed since this time.")
    @get:JsonProperty("updated_since") val updatedSince: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("campaign_filter") val campaignFilter: BulkDownloadRequestCampaignFilter? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("output_format") val outputFormat: BulkOutputFormat? = "JSON"
) {

}

