package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.IneligibleProductTagReason
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
 * Error item for a product tag that failed eligibility check.
 * @param errorMessage Reason why the pin is ineligible for tagging.
 * @param pinId Pin ID that failed eligibility check.
 */
data class IneligibleProductTagErrorItem(

    @field:Valid
    @Schema(required = true, description = "Reason why the pin is ineligible for tagging.")
    @param:JsonProperty("error_message")
    @get:JsonProperty("error_message", required = true) val errorMessage: IneligibleProductTagReason,

    @get:Pattern(regexp="^\\d+$")
    @Schema(required = true, description = "Pin ID that failed eligibility check.")
    @param:JsonProperty("pin_id")
    @get:JsonProperty("pin_id", required = true) val pinId: kotlin.String
) {

}

