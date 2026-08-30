package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DeleteBusinessMembershipMember
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
 * List of members with role to delete.
 * @param members 
 */
data class DeleteBusinessMembershipBody(

    @field:Valid
    @get:Size(min=1,max=50) 
    @Schema(required = true, description = "")
    @param:JsonProperty("members")
    @get:JsonProperty("members", required = true) val members: kotlin.collections.List<DeleteBusinessMembershipMember>
) {

}

