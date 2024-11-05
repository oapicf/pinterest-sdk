package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param id 
 * @param name 
 * @param childInterests 
 * @param level 
 */
data class SingleInterestTargetingOptionResponse(

    @get:Pattern(regexp="\\d+")
    @Schema(example = "945391946569", description = "")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "Dress", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("child_interests") val childInterests: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "2", description = "")
    @get:JsonProperty("level") val level: kotlin.Int? = null
    ) {

}

