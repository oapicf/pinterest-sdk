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
 * @param deletedPartners 
 */
data class DeleteBusinessPartners(

    @Schema(readOnly = true, description = "")
    @param:JsonProperty("deleted_partners")
    @get:JsonProperty("deleted_partners") val deletedPartners: kotlin.collections.List<kotlin.String>? = null
) {

}

