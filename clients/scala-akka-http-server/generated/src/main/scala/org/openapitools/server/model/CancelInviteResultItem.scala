package org.openapitools.server.model


/**
 * @param exception  for example: ''null''
 * @param invite  for example: ''null''
*/
final case class CancelInviteResultItem (
  exception: Option[CancelInviteException] = None,
  invite: Option[CancelInviteResult] = None
)

