
package org.openapitools.client.model


case class RespondToInviteResultItem (
    _exception: Option[InviteExceptionResponse],
    /* An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created. */
    _invite: Option[BaseInviteDataResponse]
)
object RespondToInviteResultItem {
    def toStringBody(var_exception: Object, var_invite: Object) =
        s"""
        | {
        | "exception":$var_exception,"invite":$var_invite
        | }
        """.stripMargin
}
