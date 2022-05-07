package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * Use this if your feed file requires username and password.
 * @param password The required password for downloading a feed.
 * @param username The required username for downloading a feed.
 */
data class CatalogsFeedCredentials(

    @field:JsonProperty("password", required = true) val password: kotlin.String,

    @field:JsonProperty("username", required = true) val username: kotlin.String
) {

}

