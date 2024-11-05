package org.openapitools.server.model


/**
 * @param exception  for example: ''null''
 * @param invite  for example: ''null''
*/
final case class CreateInvitesResultsResponseArrayItemsInner (
  exception: Option[InviteExceptionResponse] = None,
  invite: Option[CreateInvitesResultsResponseArrayItemsInnerInvite] = None
)

