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
 * An object with a list of partners that were deleted.
 * @param deletedPartners List of partners whose business partnership have been terminated.
 */
data class DeletePartnersResponse(

    @Schema(example = "[\"809944451643622187\",\"383791336903426391\"]", description = "List of partners whose business partnership have been terminated.")
    @get:JsonProperty("deleted_partners") val deletedPartners: kotlin.collections.List<kotlin.String>? = null
    ) {

}

