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
 * @param website Website with path or domain only
 * @param status Status of the verification process
 * @param verifiedAt UTC timestamp when the verification happened - sometimes missing
 */
data class UserWebsiteSummary(

    @Schema(example = "mysite.test", description = "Website with path or domain only")
    @get:JsonProperty("website") val website: kotlin.String? = null,

    @Schema(example = "success", description = "Status of the verification process")
    @get:JsonProperty("status") val status: kotlin.String? = null,

    @Schema(example = "2022-12-14T21:03:01.602000", description = "UTC timestamp when the verification happened - sometimes missing")
    @get:JsonProperty("verified_at") val verifiedAt: kotlin.String? = null
    ) {

}

