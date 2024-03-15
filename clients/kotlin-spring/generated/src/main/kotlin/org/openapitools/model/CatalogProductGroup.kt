package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Board
import org.openapitools.model.EntityStatus
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
 * non-promoted catalog product group entity
 * @param id ID of the catalog product group.
 * @param merchantId Merchant ID pertaining to the owner of the catalog product group.
 * @param name Name of catalog product group
 * @param filters Object holding a list of filters
 * @param filterV2 Object holding a list of filters
 * @param type 
 * @param status 
 * @param feedProfileId id of the feed profile belonging to this catalog product group
 * @param createdAt Unix timestamp in seconds of when catalog product group was created.
 * @param lastUpdate Unix timestamp in seconds of last time catalog product group was updated.
 * @param productCount Amount of products in the catalog product group
 * @param featuredPosition index of the featured position of the catalog product group
 */
data class CatalogProductGroup(

    @Schema(example = "2680059592705", description = "ID of the catalog product group.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", description = "Merchant ID pertaining to the owner of the catalog product group.")
    @get:JsonProperty("merchant_id") val merchantId: kotlin.String? = null,

    @Schema(example = "Most Popular", description = "Name of catalog product group")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "{\"1\":[\"123chars_title\"]}", description = "Object holding a list of filters")
    @get:JsonProperty("filters") val filters: kotlin.Any? = null,

    @field:Valid
    @Schema(example = "{\"1\":[\"123chars_title\"]}", description = "Object holding a list of filters")
    @get:JsonProperty("filter_v2") val filterV2: kotlin.Any? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: Board? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: EntityStatus? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", description = "id of the feed profile belonging to this catalog product group")
    @get:JsonProperty("feed_profile_id") val feedProfileId: kotlin.String? = null,

    @Schema(example = "1621350033000", description = "Unix timestamp in seconds of when catalog product group was created.")
    @get:JsonProperty("created_at") val createdAt: kotlin.Int? = null,

    @Schema(example = "1622742155000", description = "Unix timestamp in seconds of last time catalog product group was updated.")
    @get:JsonProperty("last_update") val lastUpdate: kotlin.Int? = null,

    @Schema(example = "6", description = "Amount of products in the catalog product group")
    @get:JsonProperty("product_count") val productCount: kotlin.Int? = null,

    @Schema(example = "2", description = "index of the featured position of the catalog product group")
    @get:JsonProperty("featured_position") val featuredPosition: kotlin.Int? = null
) {

}

