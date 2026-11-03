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
 * @param type Always 'user'
 * @param username Username
 */
data class FollowUser(

    @Schema(readOnly = true, description = "Always 'user'")
    @param:JsonProperty("type")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @Schema(readOnly = true, description = "Username")
    @param:JsonProperty("username")
    @get:JsonProperty("username") val username: kotlin.String? = null
) {

}

