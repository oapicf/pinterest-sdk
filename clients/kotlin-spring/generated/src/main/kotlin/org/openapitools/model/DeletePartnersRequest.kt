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
 * @param partnerIds 
 * @param partnerType 
 */
data class DeletePartnersRequest(

    @get:Size(min=1,max=50) 
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("partner_ids", required = true) val partnerIds: kotlin.collections.List<kotlin.String>,

    @Schema(example = "null", description = "")
    @get:JsonProperty("partner_type") val partnerType: kotlin.String? = null
    ) {

}

