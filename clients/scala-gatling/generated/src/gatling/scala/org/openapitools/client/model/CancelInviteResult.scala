
package org.openapitools.client.model


case class CancelInviteResult (
    _id: Option[String],
    _inviteData: Option[InviteDataResponse],
    _isReceivedInvite: Option[Boolean],
    _user: Option[CancelInviteResultUser]
)
object CancelInviteResult {
    def toStringBody(var_id: Object, var_inviteData: Object, var_isReceivedInvite: Object, var_user: Object) =
        s"""
        | {
        | "id":$var_id,"inviteData":$var_inviteData,"isReceivedInvite":$var_isReceivedInvite,"user":$var_user
        | }
        """.stripMargin
}
