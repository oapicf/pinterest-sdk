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
 * @param username Public username for the user account
 * @param id The owning account's user ID.
 */
data class AdAccountOwner(

    @Schema(example = "null", description = "Public username for the user account")
    @get:JsonProperty("username") val username: kotlin.String? = null,

    @Schema(example = "null", description = "The owning account's user ID.")
    @get:JsonProperty("id") val id: kotlin.String? = null
) {

}

