
package org.openapitools.client.model


case class BaseInviteDataResponse (
    /* Unique identifier of the invite/request. */
    _id: Option[String],
    _inviteData: Option[BaseInviteDataResponseInviteData],
    /* Indicates whether the invite/request was received. */
    _isReceivedInvite: Option[Boolean],
    /* Metadata for the member/partner that was sent the invite/request. */
    _user: Option[BusinessAccessUserSummary]
)
object BaseInviteDataResponse {
    def toStringBody(var_id: Object, var_inviteData: Object, var_isReceivedInvite: Object, var_user: Object) =
        s"""
        | {
        | "id":$var_id,"inviteData":$var_inviteData,"isReceivedInvite":$var_isReceivedInvite,"user":$var_user
        | }
        """.stripMargin
}
