package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BusinessAccessError
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
 * @param exception 
 * @param memberOrPartnerId 
 */
data class UpdatePartnerResultsResponseArrayItemsInner(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("exception") val exception: BusinessAccessError? = null,

    @get:Pattern(regexp="^\\d+$")
    @get:Size(max=18)
    @Schema(example = "1234567890123", description = "")
    @get:JsonProperty("member_or_partner_id") val memberOrPartnerId: kotlin.String? = null
    ) {

}

