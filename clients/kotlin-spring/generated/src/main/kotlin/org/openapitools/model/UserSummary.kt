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
 * @param username Username
 * @param type Always \"user\"
 */
data class UserSummary(

    @Schema(example = "username", description = "Username")
    @get:JsonProperty("username") val username: kotlin.String? = null,

    @Schema(example = "user", description = "Always \"user\"")
    @get:JsonProperty("type") val type: kotlin.String? = null
) {

}

