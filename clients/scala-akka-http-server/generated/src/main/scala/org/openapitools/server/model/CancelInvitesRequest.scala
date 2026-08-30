package org.openapitools.server.model


/**
 * An object with the list of invite/request ids to cancel.
 *
 * @param inviteIds A list of invite/request ids to cancel. for example: ''null''
*/
final case class CancelInvitesRequest (
  inviteIds: Seq[String]
)

