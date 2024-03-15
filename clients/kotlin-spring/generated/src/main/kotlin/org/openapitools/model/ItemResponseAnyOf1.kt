package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsHotelItemErrorResponse
import org.openapitools.model.CatalogsRetailItemErrorResponse
import org.openapitools.model.CatalogsType
import org.openapitools.model.ItemValidationEvent
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
 * @param itemId The catalog item id in the merchant namespace
 * @param errors Array with the errors for the item id requested
 * @param hotelId The catalog hotel id in the merchant namespace
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = CatalogsHotelItemErrorResponse::class, name = "HOTEL"),
      JsonSubTypes.Type(value = CatalogsRetailItemErrorResponse::class, name = "RETAIL")
)

interface ItemResponseAnyOf1{
                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val catalogType: CatalogsType

                @get:Schema(example = "DS0294-M", description = "The catalog item id in the merchant namespace")
        val itemId: kotlin.String? 

                @get:Schema(example = "null", description = "Array with the errors for the item id requested")
        val errors: kotlin.collections.List<ItemValidationEvent>? 

                @get:Schema(example = "DS0294-M", description = "The catalog hotel id in the merchant namespace")
        val hotelId: kotlin.String? 


}

