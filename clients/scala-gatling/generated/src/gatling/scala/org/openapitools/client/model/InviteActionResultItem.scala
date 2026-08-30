
package org.openapitools.client.model


case class InviteActionResultItem (
    _exception: Option[InviteExceptionResponse],
    _invite: Option[InviteBusinessRoleBinding]
)
object InviteActionResultItem {
    def toStringBody(var_exception: Object, var_invite: Object) =
        s"""
        | {
        | "exception":$var_exception,"invite":$var_invite
        | }
        """.stripMargin
}
