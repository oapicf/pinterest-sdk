package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.SupplementalItemProcessingStatus
import org.openapitools.model.SupplementalItemValidationEvent
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
 * Result model for local inventory operation
 * @param itemId Catalog item id in the merchant namespace
 * @param status Status of the item processing record
 * @param storeCode Store code for the local inventory item
 * @param supplementalType 
 * @param errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
 * @param warnings Array with the validation warnings for the item processing record
 */
data class LocalInventoryOperationResult(

    @Schema(example = "item_id_1", required = true, description = "Catalog item id in the merchant namespace")
    @param:JsonProperty("item_id")
    @get:JsonProperty("item_id", required = true) val itemId: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "Status of the item processing record")
    @param:JsonProperty("status")
    @get:JsonProperty("status", required = true) val status: SupplementalItemProcessingStatus,

    @Schema(example = "store_1", required = true, description = "Store code for the local inventory item")
    @param:JsonProperty("store_code")
    @get:JsonProperty("store_code", required = true) val storeCode: kotlin.String,

    @Schema(required = true, description = "")
    @param:JsonProperty("supplemental_type")
    @get:JsonProperty("supplemental_type", required = true) val supplementalType: LocalInventoryOperationResult.SupplementalType,

    @field:Valid
    @Schema(description = "Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("errors")
    @get:JsonProperty("errors") val errors: kotlin.collections.List<SupplementalItemValidationEvent>? = null,

    @field:Valid
    @Schema(description = "Array with the validation warnings for the item processing record")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("warnings")
    @get:JsonProperty("warnings") val warnings: kotlin.collections.List<SupplementalItemValidationEvent>? = null
) {

    /**
    * 
    * Values: LOCAL_INVENTORY
    */
    enum class SupplementalType(@get:JsonValue val value: kotlin.String) {

        LOCAL_INVENTORY("LOCAL_INVENTORY");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): SupplementalType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'SupplementalType'")
            }
        }
    }

}

