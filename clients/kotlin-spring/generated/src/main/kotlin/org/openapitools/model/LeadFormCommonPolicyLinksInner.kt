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
 * @param label Policy label for an additional policy link.
 * @param link Policy link for an additional policy link.
 */
data class LeadFormCommonPolicyLinksInner(

    @Schema(example = "null", description = "Policy label for an additional policy link.")
    @get:JsonProperty("label") val label: kotlin.String? = null,

    @Schema(example = "null", description = "Policy link for an additional policy link.")
    @get:JsonProperty("link") val link: kotlin.String? = null
    ) {

}

