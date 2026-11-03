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
 * @param deletedMembers 
 */
data class DeleteBusinessMembership200Response(

    @Schema(description = "")
    @param:JsonProperty("deleted_members")
    @get:JsonProperty("deleted_members") val deletedMembers: kotlin.collections.List<kotlin.String>? = null
) {

}

