package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.BrandAccountProfileImage
import org.openapitools.model.Country
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
 * Resource create operation model.
 * @param country 
 * @param name Brand Account name
 * @param username Brand Account username
 * @param about Brand Account about information
 * @param profileImage 
 * @param website Brand Account website
 */
data class BrandAccountCreate(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("country", required = true)
    @get:JsonProperty("country", required = true) val country: Country,

    @Schema(required = true, description = "Brand Account name")
    @param:JsonProperty("name", required = true)
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(required = true, description = "Brand Account username")
    @param:JsonProperty("username", required = true)
    @get:JsonProperty("username", required = true) val username: kotlin.String,

    @Schema(description = "Brand Account about information")
    @param:JsonProperty("about")
    @get:JsonProperty("about") val about: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("profile_image")
    @get:JsonProperty("profile_image") val profileImage: BrandAccountProfileImage? = null,

    @Schema(description = "Brand Account website")
    @param:JsonProperty("website")
    @get:JsonProperty("website") val website: kotlin.String? = null
) {

}

