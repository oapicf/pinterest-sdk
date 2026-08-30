package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
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
 * An item to be deleted
 * @param itemId The catalog item id in the merchant namespace
 * @param operation 
 * @param lastUpdatedTime The millisecond timestamp when the item was lastly modified by the merchant.
 */
data class CatalogsDeleteRetailItem(

    @Schema(example = "DS0294-M", required = true, description = "The catalog item id in the merchant namespace")
    @param:JsonProperty("item_id")
    @get:JsonProperty("item_id", required = true) val itemId: kotlin.String,

    @Schema(required = true, description = "")
    @param:JsonProperty("operation")
    @get:JsonProperty("operation", required = true) override val operation: CatalogsDeleteRetailItem.Operation = kotlin.String.DELETE,

    @Schema(example = "1641483432072", description = "The millisecond timestamp when the item was lastly modified by the merchant.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("last_updated_time")
    @get:JsonProperty("last_updated_time") val lastUpdatedTime: kotlin.Long? = null
) : CatalogsRetailBatchRequestItemsItems {

    /**
    * 
    * Values: DELETE
    */
    enum class Operation(@get:JsonValue val value: kotlin.String) {

        DELETE("DELETE");

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

