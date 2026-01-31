
package org.openapitools.client.model


case class InviteResponse (
    /* Unique identifier of the invite/request. */
    _id: Option[String],
    _inviteData: Option[BaseInviteDataResponseInviteData],
    /* Indicates whether the invite/request was received. */
    _isReceivedInvite: Option[Boolean],
    /* Metadata for the member/partner that was sent the invite/request. */
    _user: Option[BusinessAccessUserSummary],
    _assetsSummary: Option[InviteAssetsSummary],
    /* The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. */
    _businessRoles: Option[List[String]],
    /* Metadata for the business that created the invite/request. */
    _createdByBusiness: Option[Any],
    /* Metadata for the user that created the invite/request. */
    _createdByUser: Option[Any],
    /* The time the invite/request was created. Returned in milliseconds. */
    _createdTime: Option[Integer]
)
object InviteResponse {
    def toStringBody(var_id: Object, var_inviteData: Object, var_isReceivedInvite: Object, var_user: Object, var_assetsSummary: Object, var_businessRoles: Object, var_createdByBusiness: Object, var_createdByUser: Object, var_createdTime: Object) =
        s"""
        | {
        | "id":$var_id,"inviteData":$var_inviteData,"isReceivedInvite":$var_isReceivedInvite,"user":$var_user,"assetsSummary":$var_assetsSummary,"businessRoles":$var_businessRoles,"createdByBusiness":$var_createdByBusiness,"createdByUser":$var_createdByUser,"createdTime":$var_createdTime
        | }
        """.stripMargin
}
