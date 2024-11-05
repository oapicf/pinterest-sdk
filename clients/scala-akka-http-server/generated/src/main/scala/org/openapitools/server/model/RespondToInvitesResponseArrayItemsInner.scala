package org.openapitools.server.model


/**
 * @param exception  for example: ''null''
 * @param invite  for example: ''null''
*/
final case class RespondToInvitesResponseArrayItemsInner (
  exception: Option[InviteExceptionResponse] = None,
  invite: Option[BaseInviteDataResponse] = None
)

