package org.openapitools.server.model


/**
 * An exception object if there is an error performing the action. Will only be provided if there is an error.
 *
 * @param inviteOrRequestId Unique identifier of the invite/request. for example: ''383791336903426391''
 * @param code Error code associated with the error in performing the action on the invite/request. for example: ''403''
 * @param message Error message associated with the error in performing the action on the invite/request. for example: ''You hit the maximum number of pending invites allowed.''
 * @param usersOrPartnerIds A list of users' usernames or emails OR a list of partner ids that caused the error. for example: ''["businessMember0101","business+member@business.com"]''
*/
final case class InviteExceptionResponse (
  inviteOrRequestId: Option[String] = None,
  code: Option[Int] = None,
  message: Option[String] = None,
  usersOrPartnerIds: Option[Seq[String]] = None
)

