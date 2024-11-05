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
 * @param operationType 
 * @param id Targeting template ID
 */
data class TargetingTemplateUpdateRequest(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("operation_type", required = true) val operationType: TargetingTemplateUpdateRequest.OperationType,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "643", required = true, description = "Targeting template ID")
    @get:JsonProperty("id", required = true) val id: kotlin.String
    ) {

    /**
    * 
    * Values: REMOVE
    */
    enum class OperationType(@get:JsonValue val value: kotlin.String) {

        REMOVE("REMOVE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): OperationType {
                return values().first{it -> it.value == value}
            }
        }
    }

}

