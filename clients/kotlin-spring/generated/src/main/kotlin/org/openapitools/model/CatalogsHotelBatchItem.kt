package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsCreateHotelItem
import org.openapitools.model.CatalogsDeleteHotelItem
import org.openapitools.model.CatalogsUpdatableHotelAttributes
import org.openapitools.model.CatalogsUpdateHotelItem
import org.openapitools.model.CatalogsUpsertHotelItem
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
 * Hotel batch item
 * @param hotelId The catalog hotel id in the merchant namespace
 * @param operation 
 * @param attributes 
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "operation", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = CatalogsCreateHotelItem::class, name = "CREATE"),
      JsonSubTypes.Type(value = CatalogsDeleteHotelItem::class, name = "DELETE"),
      JsonSubTypes.Type(value = CatalogsUpdateHotelItem::class, name = "UPDATE"),
      JsonSubTypes.Type(value = CatalogsUpsertHotelItem::class, name = "UPSERT")
)

interface CatalogsHotelBatchItem{
                @get:Schema(example = "DS0294-M", requiredMode = Schema.RequiredMode.REQUIRED, description = "The catalog hotel id in the merchant namespace")
        val hotelId: kotlin.String

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val operation: CatalogsHotelBatchItem.Operation

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val attributes: CatalogsUpdatableHotelAttributes


    /**
    * 
    * Values: DELETE
    */
    enum class Operation(val value: kotlin.String) {

        @JsonProperty("DELETE") DELETE("DELETE")
    }

}

