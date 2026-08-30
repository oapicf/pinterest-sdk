package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ItemAttributesRequest
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.Nulls
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
 * An item to be upserted
 * @param attributes 
 * @param itemId The catalog item id in the merchant namespace
 * @param operation 
 */
data class CatalogsUpsertRetailItem(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("attributes")
    @get:JsonProperty("attributes", required = true) val attributes: ItemAttributesRequest,

    @Schema(example = "DS0294-M", required = true, description = "The catalog item id in the merchant namespace")
    @param:JsonProperty("item_id")
    @get:JsonProperty("item_id", required = true) val itemId: kotlin.String,

    @Schema(required = true, description = "")
    @param:JsonProperty("operation")
    @get:JsonProperty("operation", required = true) override val operation: CatalogsUpsertRetailItem.Operation = kotlin.String.UPSERT
) : CatalogsRetailBatchRequestItemsItems {

    /**
    * 
    * Values: UPSERT
    */
    enum class Operation(@get:JsonValue val value: kotlin.String) {

        UPSERT("UPSERT");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Operation {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Operation'")
            }
        }
    }

}

