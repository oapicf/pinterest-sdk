
package org.openapitools.client.model


case class InviteExceptionResponse (
    /* Error code associated with the error in performing the action on the invite/request. */
    _code: Option[Integer],
    /* Unique identifier of the invite/request. */
    _inviteOrRequestId: Option[String],
    /* Error message associated with the error in performing the action on the invite/request. */
    _message: Option[String],
    /* A list of users' usernames or emails OR a list of partner ids that caused the error. */
    _usersOrPartnerIds: Option[List[String]]
)
object InviteExceptionResponse {
    def toStringBody(var_code: Object, var_inviteOrRequestId: Object, var_message: Object, var_usersOrPartnerIds: Object) =
        s"""
        | {
        | "code":$var_code,"inviteOrRequestId":$var_inviteOrRequestId,"message":$var_message,"usersOrPartnerIds":$var_usersOrPartnerIds
        | }
        """.stripMargin
}
