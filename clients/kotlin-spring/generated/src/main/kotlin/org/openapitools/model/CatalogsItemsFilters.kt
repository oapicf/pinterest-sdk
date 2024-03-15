package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsHotelItemsFilter
import org.openapitools.model.CatalogsRetailItemsFilter
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
 * @param catalogId Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = CatalogsHotelItemsFilter::class, name = "HOTEL"),
      JsonSubTypes.Type(value = CatalogsRetailItemsFilter::class, name = "RETAIL")
)

interface CatalogsItemsFilters{
                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val catalogType: CatalogsType

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val itemIds: kotlin.collections.List<kotlin.String>

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val hotelIds: kotlin.collections.List<kotlin.String>

                @get:Schema(example = "null", description = "Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog")
        val catalogId: kotlin.String? 


}

