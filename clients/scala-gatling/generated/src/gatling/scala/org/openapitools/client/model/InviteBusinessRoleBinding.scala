
package org.openapitools.client.model


case class InviteBusinessRoleBinding (
    /* Unique identifier of the invite/request. */
    _id: Option[String],
    _inviteData: Option[BaseInviteDataResponseInviteData],
    /* Indicates whether the invite/request was received. */
    _isReceivedInvite: Option[Boolean],
    /* Metadata for the user that updated the invite/request. */
    _user: Option[Any],
    /* Unique identifier for the business that created the invite/request. */
    _createdByBusinessId: Option[String],
    /* Unique identifier for the user that created the invite/request. */
    _createdByUserId: Option[String]
)
object InviteBusinessRoleBinding {
    def toStringBody(var_id: Object, var_inviteData: Object, var_isReceivedInvite: Object, var_user: Object, var_createdByBusinessId: Object, var_createdByUserId: Object) =
        s"""
        | {
        | "id":$var_id,"inviteData":$var_inviteData,"isReceivedInvite":$var_isReceivedInvite,"user":$var_user,"createdByBusinessId":$var_createdByBusinessId,"createdByUserId":$var_createdByUserId
        | }
        """.stripMargin
}
