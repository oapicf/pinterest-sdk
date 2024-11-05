package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
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
 * @param creativeAssetsIds 
 * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
 */
data class CatalogsCreativeAssetsItemsFilter(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("catalog_type", required = true) val catalogType: CatalogsCreativeAssetsItemsFilter.CatalogType,

    @get:Size(min=1,max=100) 
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("creative_assets_ids", required = true) val creativeAssetsIds: kotlin.collections.List<kotlin.String>,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", description = "Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog")
    @get:JsonProperty("catalog_id") val catalogId: kotlin.String? = null
    ) {

    /**
    * 
    * Values: CREATIVE_ASSETS
    */
    enum class CatalogType(@get:JsonValue val value: kotlin.String) {

        CREATIVE_ASSETS("CREATIVE_ASSETS");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): CatalogType {
                return values().first{it -> it.value == value}
            }
        }
    }

}

