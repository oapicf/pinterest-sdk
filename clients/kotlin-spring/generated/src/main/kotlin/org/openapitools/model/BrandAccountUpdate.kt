package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.BrandAccountProfileImageUpdate
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
 * Resource create or update operation model.
 * @param about Brand Account about information
 * @param country 
 * @param name Brand Account name
 * @param profileImage 
 * @param username Brand Account username
 * @param website Brand Account website
 */
data class BrandAccountUpdate(

    @Schema(description = "Brand Account about information")
    @param:JsonProperty("about")
    @get:JsonProperty("about") val about: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("country")
    @get:JsonProperty("country") val country: Country? = null,

    @Schema(description = "Brand Account name")
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("profile_image")
    @get:JsonProperty("profile_image") val profileImage: BrandAccountProfileImageUpdate? = null,

    @Schema(description = "Brand Account username")
    @param:JsonProperty("username")
    @get:JsonProperty("username") val username: kotlin.String? = null,

    @Schema(description = "Brand Account website")
    @param:JsonProperty("website")
    @get:JsonProperty("website") val website: kotlin.String? = null
) {

}

