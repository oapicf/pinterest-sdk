package org.openapitools.server.api.model

import org.openapitools.server.api.model.BusinessAccessUserSummary
import org.openapitools.server.api.model.BusinessMemberAssetsSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserBusinessRoleBinding(
    /** Ad accounts and profiles the business member/partner has access to. */
    val assetsSummary: BusinessMemberAssetsSummary? = null,
    /** The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. */
    val businessRoles: kotlin.collections.List<kotlin.String>? = null,
    /** Metadata for the business that created the business relationship. */
    val createdByBusiness: BusinessAccessUserSummary? = null,
    /** Metadata for the user that created the business relationship. */
    val createdByUser: BusinessAccessUserSummary? = null,
    /** The time the business relationship was created. Returned in milliseconds. */
    val createdTime: kotlin.Int? = null,
    /** Unique identifier of the business member/business partner/employer. */
    val id: kotlin.String? = null,
    /** This field is only relevant when business_role&#x3D;\&quot;PARTNER\&quot;. If is_shared_partner&#x3D;FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. If is_shared_partner&#x3D;TRUE, you can access the partner&#39;s business asset. If assets_summary is not empty, the assets listed are the partner&#39;s business assets you have access to. */
    val isSharedPartner: kotlin.Boolean? = null,
    /** Metadata for the business member/business partner/employer. */
    val user: BusinessAccessUserSummary? = null
)
