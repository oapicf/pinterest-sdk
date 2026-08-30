package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.BulkDownloadCampaignFilter
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
 * Resource create operation model.
 * @param campaignFilter 
 * @param entityIds All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
 * @param entityTypes All entity types specified will be downloaded. Fewer types result in faster downloads.
 * @param outputFormat 
 * @param updatedSince Unix UTC timestamp to retrieve all entities that have changed since this time.
 */
data class BulkDownloadCreate(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("campaign_filter")
    @get:JsonProperty("campaign_filter") val campaignFilter: BulkDownloadCampaignFilter? = null,

    @Schema(description = "All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("entity_ids")
    @get:JsonProperty("entity_ids") val entityIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @get:Size(min=1,max=6) 
    @Schema(example = "[\"CAMPAIGN\",\"AD_GROUP\"]", description = "All entity types specified will be downloaded. Fewer types result in faster downloads.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("entity_types")
    @get:JsonProperty("entity_types") val entityTypes: kotlin.collections.List<BulkEntityType>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("output_format")
    @get:JsonProperty("output_format") val outputFormat: BulkOutputFormat? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "1622848072", description = "Unix UTC timestamp to retrieve all entities that have changed since this time.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("updated_since")
    @get:JsonProperty("updated_since") val updatedSince: kotlin.String? = null
) {

}

