
package org.openapitools.client.model


case class RespondToInvitesResponseArrayItemsInner (
    _exception: Option[InviteExceptionResponse],
    _invite: Option[BaseInviteDataResponse]
)
object RespondToInvitesResponseArrayItemsInner {
    def toStringBody(var_exception: Object, var_invite: Object) =
        s"""
        | {
        | "exception":$var_exception,"invite":$var_invite
        | }
        """.stripMargin
}
