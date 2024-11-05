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
 * 
 * @param memberId Unique identifier of the member
 * @param businessRole 
 */
data class MembersToDeleteBodyMembersInner(

    @get:Pattern(regexp="^\\d+$")
    @get:Size(max=25)
    @Schema(example = "140943737684417", required = true, description = "Unique identifier of the member")
    @get:JsonProperty("member_id", required = true) val memberId: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("business_role", required = true) val businessRole: BusinessRoleForMembers
    ) {

}

