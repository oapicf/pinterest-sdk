
package org.openapitools.client.model


case class DeleteInvitesResultsResponseArrayItemsInnerException (
    /* Unique identifier of an invite. */
    _inviteId: Option[String],
    /* Error message associated with the error in performing the action on the invite/request. */
    _message: Option[String]
)
object DeleteInvitesResultsResponseArrayItemsInnerException {
    def toStringBody(var_inviteId: Object, var_message: Object) =
        s"""
        | {
        | "inviteId":$var_inviteId,"message":$var_message
        | }
        """.stripMargin
}
