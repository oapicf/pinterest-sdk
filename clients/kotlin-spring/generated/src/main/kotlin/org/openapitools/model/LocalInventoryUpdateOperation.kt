package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RetailLocalInventoryItemAttributesOptional
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
 * Update operation for local inventory item
 * @param attributes 
 * @param itemId Catalog item id in the merchant namespace
 * @param operation 
 * @param storeCode Store code for the local inventory item
 */
data class LocalInventoryUpdateOperation(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("attributes")
    @get:JsonProperty("attributes", required = true) val attributes: RetailLocalInventoryItemAttributesOptional,

    @Schema(example = "item_id_1", required = true, description = "Catalog item id in the merchant namespace")
    @param:JsonProperty("item_id")
    @get:JsonProperty("item_id", required = true) val itemId: kotlin.String,

    @Schema(required = true, description = "")
    @param:JsonProperty("operation")
    @get:JsonProperty("operation", required = true) override val operation: LocalInventoryUpdateOperation.Operation = kotlin.String.UPDATE,

    @Schema(example = "store_1", required = true, description = "Store code for the local inventory item")
    @param:JsonProperty("store_code")
    @get:JsonProperty("store_code", required = true) val storeCode: kotlin.String
) : LocalInventoryOperation {

    /**
    * 
    * Values: UPDATE
    */
    enum class Operation(@get:JsonValue val value: kotlin.String) {

        UPDATE("UPDATE");

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

