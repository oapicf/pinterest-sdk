package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * @param assetsSummary Ad accounts and profiles the business member/partner has access to.
 * @param businessRoles The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
 * @param createdByBusiness Metadata for the business that created the business relationship.
 * @param createdByUser Metadata for the user that created the business relationship.
 * @param createdTime The time the business relationship was created. Returned in milliseconds.
 * @param id Unique identifier of the business member/business partner/employer.
 * @param isSharedPartner This field is only relevant when business_role=\"PARTNER\". If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to.
 * @param user Metadata for the business member/business partner/employer.
 */
data class UserBusinessRoleBinding(

    @field:Valid
    @Schema(description = "Ad accounts and profiles the business member/partner has access to.")
    @param:JsonProperty("assets_summary")
    @get:JsonProperty("assets_summary") val assetsSummary: BusinessMemberAssetsSummary? = null,

    @Schema(example = "[\"BIZ_ADMIN\"]", description = "The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("business_roles")
    @get:JsonProperty("business_roles") val businessRoles: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(description = "Metadata for the business that created the business relationship.")
    @param:JsonProperty("created_by_business")
    @get:JsonProperty("created_by_business") val createdByBusiness: BusinessAccessUserSummary? = null,

    @field:Valid
    @Schema(description = "Metadata for the user that created the business relationship.")
    @param:JsonProperty("created_by_user")
    @get:JsonProperty("created_by_user") val createdByUser: BusinessAccessUserSummary? = null,

    @Schema(example = "1646767577816", description = "The time the business relationship was created. Returned in milliseconds.")
    @param:JsonProperty("created_time")
    @get:JsonProperty("created_time") val createdTime: kotlin.Int? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "549755885175", description = "Unique identifier of the business member/business partner/employer.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("id")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "false", description = "This field is only relevant when business_role=\"PARTNER\". If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_shared_partner")
    @get:JsonProperty("is_shared_partner") val isSharedPartner: kotlin.Boolean? = null,

    @field:Valid
    @Schema(description = "Metadata for the business member/business partner/employer.")
    @param:JsonProperty("user")
    @get:JsonProperty("user") val user: BusinessAccessUserSummary? = null
) {

}

