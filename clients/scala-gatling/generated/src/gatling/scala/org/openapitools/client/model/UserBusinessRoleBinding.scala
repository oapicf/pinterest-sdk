
package org.openapitools.client.model


case class UserBusinessRoleBinding (
    _assetsSummary: Option[BusinessMemberAssetsSummary],
    /* The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. */
    _businessRoles: Option[List[String]],
    /* Metadata for the business that created the business relationship. */
    _createdByBusiness: Option[BusinessAccessUserSummary],
    /* Metadata for the user that created the business relationship. */
    _createdByUser: Option[BusinessAccessUserSummary],
    /* The time the business relationship was created. Returned in milliseconds. */
    _createdTime: Option[Integer],
    /* Unique identifier of the business member/business partner/employer. */
    _id: Option[String],
    /* This field is only relevant when business_role=\"PARTNER\". <br>If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. <br>If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to. */
    _isSharedPartner: Option[Boolean],
    /* Metadata for the business member/business partner/employer. */
    _user: Option[BusinessAccessUserSummary]
)
object UserBusinessRoleBinding {
    def toStringBody(var_assetsSummary: Object, var_businessRoles: Object, var_createdByBusiness: Object, var_createdByUser: Object, var_createdTime: Object, var_id: Object, var_isSharedPartner: Object, var_user: Object) =
        s"""
        | {
        | "assetsSummary":$var_assetsSummary,"businessRoles":$var_businessRoles,"createdByBusiness":$var_createdByBusiness,"createdByUser":$var_createdByUser,"createdTime":$var_createdTime,"id":$var_id,"isSharedPartner":$var_isSharedPartner,"user":$var_user
        | }
        """.stripMargin
}
