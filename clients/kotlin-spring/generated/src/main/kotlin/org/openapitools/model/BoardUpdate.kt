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
 * Board fields for updates
 * @param name 
 * @param description 
 * @param privacy 
 */
data class BoardUpdate(

    @Schema(example = "Summer Recipes", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "My favorite summer recipes", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("privacy") val privacy: BoardUpdate.Privacy? = null
    ) {

    /**
    * 
    * Values: PUBLIC,SECRET
    */
    enum class Privacy(@get:JsonValue val value: kotlin.String) {

        PUBLIC("PUBLIC"),
        SECRET("SECRET");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Privacy {
                return values().first{it -> it.value == value}
            }
        }
    }

}

