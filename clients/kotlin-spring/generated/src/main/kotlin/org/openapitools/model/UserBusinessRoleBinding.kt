package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BusinessAccessUserSummary
import org.openapitools.model.BusinessMemberAssetsSummary
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
 * @param assetsSummary 
 * @param businessRoles The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
 * @param createdByBusiness Metadata for the business that created the business relationship.
 * @param createdByUser Metadata for the user that created the business relationship.
 * @param createdTime The time the business relationship was created. Returned in milliseconds.
 * @param id Unique identifier of the business member/business partner/employer.
 * @param isSharedPartner This field is only relevant when business_role=\"PARTNER\". <br>If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. <br>If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to.
 * @param user Metadata for the business member/business partner/employer.
 */
data class UserBusinessRoleBinding(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("assets_summary") val assetsSummary: BusinessMemberAssetsSummary? = null,

    @Schema(example = "[\"BIZ_ADMIN\"]", description = "The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.")
    @get:JsonProperty("business_roles") val businessRoles: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "Metadata for the business that created the business relationship.")
    @get:JsonProperty("created_by_business") val createdByBusiness: BusinessAccessUserSummary? = null,

    @field:Valid
    @Schema(example = "null", description = "Metadata for the user that created the business relationship.")
    @get:JsonProperty("created_by_user") val createdByUser: BusinessAccessUserSummary? = null,

    @Schema(example = "1646767577816", description = "The time the business relationship was created. Returned in milliseconds.")
    @get:JsonProperty("created_time") val createdTime: kotlin.Int? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "383791336903426391", description = "Unique identifier of the business member/business partner/employer.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "false", description = "This field is only relevant when business_role=\"PARTNER\". <br>If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. <br>If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to.")
    @get:JsonProperty("is_shared_partner") val isSharedPartner: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "Metadata for the business member/business partner/employer.")
    @get:JsonProperty("user") val user: BusinessAccessUserSummary? = null
    ) {

}

