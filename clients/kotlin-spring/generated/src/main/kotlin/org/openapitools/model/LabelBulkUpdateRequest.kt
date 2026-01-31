package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param id Label ID.
 * @param status Set status to `ARCHIVED` to remove the label from the parent entity.
 * @param &#x60;value&#x60; </p><strong>Note:</strong> value field will be deprecated. Label name. 100-character limit.
 */
data class LabelBulkUpdateRequest(

    @Schema(example = "1106385754497", required = true, description = "Label ID.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "ARCHIVED", description = "Set status to `ARCHIVED` to remove the label from the parent entity.")
    @get:JsonProperty("status") val status: LabelBulkUpdateRequest.Status? = null,

    @get:Size(max=100)
    @Schema(example = "null", description = "</p><strong>Note:</strong> value field will be deprecated. Label name. 100-character limit.")
    @get:JsonProperty("value") val `value`: kotlin.String? = null
) {

    /**
    * Set status to `ARCHIVED` to remove the label from the parent entity.
    * Values: ARCHIVED
    */
    enum class Status(@get:JsonValue val value: kotlin.String) {

        ARCHIVED("ARCHIVED");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Status {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'LabelBulkUpdateRequest'")
            }
        }
    }

}

