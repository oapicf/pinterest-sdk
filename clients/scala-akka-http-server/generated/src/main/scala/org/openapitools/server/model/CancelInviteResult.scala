package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param inviteData  for example: ''null''
 * @param isReceivedInvite  for example: ''null''
 * @param user  for example: ''null''
*/
final case class CancelInviteResult (
  id: Option[String] = None,
  inviteData: Option[InviteDataResponse] = None,
  isReceivedInvite: Option[Boolean] = None,
  user: Option[CancelInviteResultUser] = None
)

