package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Country
import org.openapitools.model.ImageBase64
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
 * @param name Brand Account name
 * @param username Brand Account username
 * @param country 
 * @param about Brand Account about information
 * @param website Brand Account website
 * @param profileImage 
 */
data class BrandAccountsUpdateRequest(

    @Schema(example = "Canada Stores", description = "Brand Account name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "canada_stores", description = "Brand Account username")
    @get:JsonProperty("username") val username: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("country") val country: Country? = null,

    @Schema(example = "Stores in Canada", description = "Brand Account about information")
    @get:JsonProperty("about") val about: kotlin.String? = null,

    @Schema(example = "https://www.example.com", description = "Brand Account website")
    @get:JsonProperty("website") val website: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("profile_image") val profileImage: ImageBase64? = null
) {

}

