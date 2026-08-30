package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
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
 * 
 * @param &#x60;field&#x60; The field name containing an invalid value.
 * @param reason The reason the value is invalid.
 * @param &#x60;value&#x60; The value that is invalid.
 * @param logIndex Index of the log in the batch.
 */
data class IntegrationLogsInvalidLogResponseRejectedLogsItems(

    @Schema(required = true, description = "The field name containing an invalid value.")
    @param:JsonProperty("field")
    @get:JsonProperty("field", required = true) val `field`: kotlin.String,

    @Schema(required = true, description = "The reason the value is invalid.")
    @param:JsonProperty("reason")
    @get:JsonProperty("reason", required = true) val reason: kotlin.String,

    @Schema(required = true, description = "The value that is invalid.")
    @param:JsonProperty("value")
    @get:JsonProperty("value", required = true) val `value`: kotlin.String,

    @Schema(description = "Index of the log in the batch.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("log_index")
    @get:JsonProperty("log_index") val logIndex: kotlin.Int? = null
) {

}

