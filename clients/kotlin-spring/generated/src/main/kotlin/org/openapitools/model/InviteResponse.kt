package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BaseInviteDataResponseInviteData
import org.openapitools.model.BusinessAccessUserSummary
import org.openapitools.model.InviteAssetsSummary
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
 * @param businessRoles The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
 * @param createdByBusiness Metadata for the business that created the invite/request.
 * @param createdByUser Metadata for the user that created the invite/request.
 * @param createdTime The time the invite/request was created. Returned in milliseconds.
 * @param id Unique identifier of the invite/request.
 * @param inviteData 
 * @param isReceivedInvite Indicates whether the invite/request was received.
 * @param user Metadata for the member/partner that was sent the invite/request.
 */
data class InviteResponse(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("assets_summary") val assetsSummary: InviteAssetsSummary? = null,

    @Schema(example = "[\"BIZ_ADMIN\"]", description = "The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.")
    @get:JsonProperty("business_roles") val businessRoles: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "Metadata for the business that created the invite/request.")
    @get:JsonProperty("created_by_business") val createdByBusiness: BusinessAccessUserSummary? = null,

    @field:Valid
    @Schema(example = "null", description = "Metadata for the user that created the invite/request.")
    @get:JsonProperty("created_by_user") val createdByUser: BusinessAccessUserSummary? = null,

    @Schema(example = "1646767577816", description = "The time the invite/request was created. Returned in milliseconds.")
    @get:JsonProperty("created_time") val createdTime: kotlin.Int? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "383791336903426391", description = "Unique identifier of the invite/request.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("invite_data") val inviteData: BaseInviteDataResponseInviteData? = null,

    @Schema(example = "null", description = "Indicates whether the invite/request was received.")
    @get:JsonProperty("is_received_invite") val isReceivedInvite: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "Metadata for the member/partner that was sent the invite/request.")
    @get:JsonProperty("user") val user: BusinessAccessUserSummary? = null
    ) {

}

