package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsHotelProductGroupFilters
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
 * 
 * @param catalogType 
 * @param id ID of the hotel product group.
 * @param filters 
 * @param catalogId 
 * @param name Name of hotel product group
 * @param description 
 * @param createdAt Unix timestamp in seconds of when catalog product group was created.
 * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated.
 */
data class CatalogsHotelProductGroup(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("catalog_type", required = true) val catalogType: CatalogsHotelProductGroup.CatalogType,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "443727193917", required = true, description = "ID of the hotel product group.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("filters", required = true) val filters: CatalogsHotelProductGroupFilters,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("catalog_id", required = true) val catalogId: kotlin.String,

    @Schema(example = "Most Popular", description = "Name of hotel product group")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "1621350033000", description = "Unix timestamp in seconds of when catalog product group was created.")
    @get:JsonProperty("created_at") val createdAt: kotlin.Int? = null,

    @Schema(example = "1622742155000", description = "Unix timestamp in seconds of last time catalog product group was updated.")
    @get:JsonProperty("updated_at") val updatedAt: kotlin.Int? = null
) {

    /**
    * 
    * Values: HOTEL
    */
    enum class CatalogType(val value: kotlin.String) {

        @JsonProperty("HOTEL") HOTEL("HOTEL")
    }

}

