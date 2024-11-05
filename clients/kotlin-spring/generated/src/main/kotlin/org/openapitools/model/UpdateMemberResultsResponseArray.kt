package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.UpdateMemberResult
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
 * @param items List of members with updated business access role.
 */
data class UpdateMemberResultsResponseArray(

    @field:Valid
    @Schema(example = "null", description = "List of members with updated business access role.")
    @get:JsonProperty("items") val items: kotlin.collections.List<UpdateMemberResult>? = null
    ) {

}

