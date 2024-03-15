package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param itemIds 
 * @param catalogId Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
 */
data class CatalogsRetailItemsFilter(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("catalog_type", required = true) val catalogType: CatalogsRetailItemsFilter.CatalogType,

    @get:Size(min=1,max=100) 
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("item_ids", required = true) val itemIds: kotlin.collections.List<kotlin.String>,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", description = "Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog")
    @get:JsonProperty("catalog_id") val catalogId: kotlin.String? = null
) {

    /**
    * 
    * Values: RETAIL
    */
    enum class CatalogType(val value: kotlin.String) {

        @JsonProperty("RETAIL") RETAIL("RETAIL")
    }

}

