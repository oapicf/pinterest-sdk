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
 * Metadata of the member/partner that has access to the asset.
 * @param email Email of the business member/partner.
 * @param id Unique identifier of the business member/partner.
 * @param username Username of the business member/partner.
 */
data class BusinessAccessUserSummary(

    @Schema(example = "business0101@business.com", description = "Email of the business member/partner.")
    @get:JsonProperty("email") val email: kotlin.String? = null,

    @get:Size(min=1,max=20)
    @Schema(example = "383791336903426391", description = "Unique identifier of the business member/partner.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "business0101", description = "Username of the business member/partner.")
    @get:JsonProperty("username") val username: kotlin.String? = null
    ) {

}

