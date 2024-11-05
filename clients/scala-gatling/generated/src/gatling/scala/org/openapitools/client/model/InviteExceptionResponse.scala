
package org.openapitools.client.model


case class InviteExceptionResponse (
    /* Unique identifier of the invite/request. */
    _inviteOrRequestId: Option[String],
    /* Error code associated with the error in performing the action on the invite/request. */
    _code: Option[Integer],
    /* Error message associated with the error in performing the action on the invite/request. */
    _message: Option[String],
    /* A list of users' usernames or emails OR a list of partner ids that caused the error. */
    _usersOrPartnerIds: Option[List[String]]
)
object InviteExceptionResponse {
    def toStringBody(var_inviteOrRequestId: Object, var_code: Object, var_message: Object, var_usersOrPartnerIds: Object) =
        s"""
        | {
        | "inviteOrRequestId":$var_inviteOrRequestId,"code":$var_code,"message":$var_message,"usersOrPartnerIds":$var_usersOrPartnerIds
        | }
        """.stripMargin
}
