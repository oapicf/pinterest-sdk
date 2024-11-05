package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OrderLine
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
 * @param &#x60;data&#x60; 
 * @param errorMessages 
 */
data class OrderLineError(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("data") val `data`: OrderLine? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("error_messages") val errorMessages: kotlin.collections.List<kotlin.String>? = null
    ) {

}

