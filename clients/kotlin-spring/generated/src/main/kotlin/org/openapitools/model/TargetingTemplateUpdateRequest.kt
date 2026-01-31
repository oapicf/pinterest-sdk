package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.TargetingSpec
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
 * @param id Targeting template ID
 * @param operationType 
 * @param targetingAttributes 
 */
data class TargetingTemplateUpdateRequest(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "643", required = true, description = "Targeting template ID")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("operation_type", required = true) val operationType: TargetingTemplateUpdateRequest.OperationType,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("targeting_attributes") val targetingAttributes: TargetingSpec? = null
) {

    /**
    * 
    * Values: REMOVE,UPDATE
    */
    enum class OperationType(@get:JsonValue val value: kotlin.String) {

        REMOVE("REMOVE"),
        UPDATE("UPDATE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): OperationType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'TargetingTemplateUpdateRequest'")
            }
        }
    }

}

