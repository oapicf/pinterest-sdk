package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.BusinessRoleForMembers
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
 * A business member identified by `member_id` with their `business_role` in the business.
 * @param businessRole 
 * @param memberId Unique identifier of the member.
 */
data class BusinessMembershipMember(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("business_role")
    @get:JsonProperty("business_role", required = true) val businessRole: BusinessRoleForMembers,

    @get:Pattern(regexp="^\\d+$")
    @get:Size(max=25)
    @Schema(example = "140943737684417", required = true, description = "Unique identifier of the member.")
    @param:JsonProperty("member_id")
    @get:JsonProperty("member_id", required = true) val memberId: kotlin.String
) {

}

