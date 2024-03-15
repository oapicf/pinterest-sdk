package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsHotelAttributes
import org.openapitools.model.CatalogsHotelItemResponse
import org.openapitools.model.CatalogsRetailItemResponse
import org.openapitools.model.CatalogsType
import org.openapitools.model.Pin
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
 * @param itemId The catalog retail item id in the merchant namespace
 * @param pins The pins mapped to the item
 * @param attributes 
 * @param hotelId The catalog hotel id in the merchant namespace
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = CatalogsHotelItemResponse::class, name = "HOTEL"),
      JsonSubTypes.Type(value = CatalogsRetailItemResponse::class, name = "RETAIL")
)

interface ItemResponseAnyOf{
                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val catalogType: CatalogsType

                @get:Schema(example = "DS0294-M", description = "The catalog retail item id in the merchant namespace")
        val itemId: kotlin.String? 

                @get:Schema(example = "null", description = "The pins mapped to the item")
        val pins: kotlin.collections.List<Pin>? 

                @get:Schema(example = "null", description = "")
        val attributes: CatalogsHotelAttributes? 

                @get:Schema(example = "DS0294-M", description = "The catalog hotel id in the merchant namespace")
        val hotelId: kotlin.String? 


}

