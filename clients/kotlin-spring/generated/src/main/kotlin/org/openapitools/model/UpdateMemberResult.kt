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
 * @param businessRole The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
 * @param memberId Unique identifier of the business member.
 */
data class UpdateMemberResult(

    @Schema(example = "EMPLOYEE", description = "The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.")
    @get:JsonProperty("business_role") val businessRole: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "140943737684417", description = "Unique identifier of the business member.")
    @get:JsonProperty("member_id") val memberId: kotlin.String? = null
    ) {

}

