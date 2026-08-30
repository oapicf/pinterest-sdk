package org.openapitools.server.model


/**
 * @param items  for example: ''null''
*/
final case class CancelInvitesResponse (
  items: Option[Seq[CancelInviteResultItem]] = None
)

