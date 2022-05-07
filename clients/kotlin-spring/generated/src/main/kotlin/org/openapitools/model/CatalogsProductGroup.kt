package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CatalogsProductGroupFilters
import org.openapitools.model.CatalogsProductGroupStatus
import org.openapitools.model.CatalogsProductGroupType
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * catalog product group entity
 * @param id ID of the catalog product group.
 * @param filters 
 * @param name Name of catalog product group
 * @param description 
 * @param type 
 * @param status 
 * @param feedId id of the catalogs feed belonging to this catalog product group
 * @param createdAt Unix timestamp in seconds of when catalog product group was created.
 * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated.
 */
data class CatalogsProductGroup(
    @get:Pattern(regexp="^\\d+$")
    @field:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @field:JsonProperty("filters", required = true) val filters: CatalogsProductGroupFilters,

    @field:JsonProperty("name") val name: kotlin.String? = null,

    @field:JsonProperty("description") val description: kotlin.String? = null,

    @field:Valid
    @field:JsonProperty("type") val type: CatalogsProductGroupType? = null,

    @field:Valid
    @field:JsonProperty("status") val status: CatalogsProductGroupStatus? = null,
    @get:Pattern(regexp="^\\d+$")
    @field:JsonProperty("feed_id") val feedId: kotlin.String? = null,

    @field:JsonProperty("created_at") val createdAt: kotlin.Int? = null,

    @field:JsonProperty("updated_at") val updatedAt: kotlin.Int? = null
) {

}

