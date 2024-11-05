
package org.openapitools.client.model


case class UpdateInvitesResultsResponseArrayItemsInner (
    _exception: Option[InviteExceptionResponse],
    _invite: Option[InviteBusinessRoleBinding]
)
object UpdateInvitesResultsResponseArrayItemsInner {
    def toStringBody(var_exception: Object, var_invite: Object) =
        s"""
        | {
        | "exception":$var_exception,"invite":$var_invite
        | }
        """.stripMargin
}
