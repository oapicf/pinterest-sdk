package org.openapitools.server.model


/**
 * Request body used to cancel invites
 *
 * @param inviteIds List of invite/request ids to be cancelled for example: ''["1234567890123456789","1122334455667788991"]''
*/
final case class CancelInvitesBody (
  inviteIds: Seq[String]
)

