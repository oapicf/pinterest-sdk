
package org.openapitools.client.model


case class DeleteInvitesResultsResponseArrayItemsInner (
    _exception: Option[DeleteInvitesResultsResponseArrayItemsInnerException],
    _invite: Option[BaseInviteDataResponse]
)
object DeleteInvitesResultsResponseArrayItemsInner {
    def toStringBody(var_exception: Object, var_invite: Object) =
        s"""
        | {
        | "exception":$var_exception,"invite":$var_invite
        | }
        """.stripMargin
}
