package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ItemProcessingStatus
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
 * Object describing an item processing record
 * @param creativeAssetsId The catalog creative assets id in the merchant namespace
 * @param errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
 * @param status 
 * @param warnings Array with the validation warnings for the item processing record
 */
data class CreativeAssetsProcessingRecord(

    @Schema(example = "DS0294-M", description = "The catalog creative assets id in the merchant namespace")
    @param:JsonProperty("creative_assets_id")
    @get:JsonProperty("creative_assets_id") val creativeAssetsId: kotlin.String? = null,

    @field:Valid
    @Schema(description = "Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.")
    @param:JsonProperty("errors")
    @get:JsonProperty("errors") val errors: kotlin.collections.List<ItemValidationEvent>? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("status")
    @get:JsonProperty("status") val status: ItemProcessingStatus? = null,

    @field:Valid
    @Schema(description = "Array with the validation warnings for the item processing record")
    @param:JsonProperty("warnings")
    @get:JsonProperty("warnings") val warnings: kotlin.collections.List<ItemValidationEvent>? = null
) {

}

