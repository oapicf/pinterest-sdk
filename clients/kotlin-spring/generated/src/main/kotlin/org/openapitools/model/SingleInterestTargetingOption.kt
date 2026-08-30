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
 * @param childInterests 
 * @param id 
 * @param level 
 * @param name 
 */
data class SingleInterestTargetingOption(

    @Schema(required = true, description = "")
    @param:JsonProperty("child_interests")
    @get:JsonProperty("child_interests", required = true) val childInterests: kotlin.collections.List<kotlin.String>,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "945391946569", required = true, description = "")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "2", required = true, description = "")
    @param:JsonProperty("level")
    @get:JsonProperty("level", required = true) val level: kotlin.Int,

    @Schema(example = "Dress", required = true, description = "")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String
) {

}

