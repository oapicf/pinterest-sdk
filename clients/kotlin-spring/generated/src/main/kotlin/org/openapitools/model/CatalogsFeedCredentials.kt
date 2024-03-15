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
 * This field is **OPTIONAL**. Use this if your feed file requires username and password.
 * @param password The required password for downloading a feed.
 * @param username The required username for downloading a feed.
 */
data class CatalogsFeedCredentials(

    @Schema(example = "null", required = true, description = "The required password for downloading a feed.")
    @get:JsonProperty("password", required = true) val password: kotlin.String,

    @Schema(example = "null", required = true, description = "The required username for downloading a feed.")
    @get:JsonProperty("username", required = true) val username: kotlin.String
) {

}

