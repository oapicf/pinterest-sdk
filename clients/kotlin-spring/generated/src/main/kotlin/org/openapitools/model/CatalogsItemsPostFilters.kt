package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsCreativeAssetsItemsPostFilter
import org.openapitools.model.CatalogsHotelItemsPostFilter
import org.openapitools.model.CatalogsRetailItemsPostFilter
import org.openapitools.model.CatalogsType
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
 * @param hotelIds 
 * @param creativeAssetsIds 
 * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = CatalogsCreativeAssetsItemsPostFilter::class, name = "CREATIVE_ASSETS"),
      JsonSubTypes.Type(value = CatalogsHotelItemsPostFilter::class, name = "HOTEL"),
      JsonSubTypes.Type(value = CatalogsRetailItemsPostFilter::class, name = "RETAIL")
)

interface CatalogsItemsPostFilters{
                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val catalogType: CatalogsType

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val itemIds: kotlin.collections.List<kotlin.String>

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val hotelIds: kotlin.collections.List<kotlin.String>

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val creativeAssetsIds: kotlin.collections.List<kotlin.String>

                @get:Schema(example = "null", description = "Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog")
        val catalogId: kotlin.String? 


}

