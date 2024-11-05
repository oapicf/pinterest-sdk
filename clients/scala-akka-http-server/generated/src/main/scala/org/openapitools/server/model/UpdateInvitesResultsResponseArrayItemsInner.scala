package org.openapitools.server.model


/**
 * @param exception  for example: ''null''
 * @param invite  for example: ''null''
*/
final case class UpdateInvitesResultsResponseArrayItemsInner (
  exception: Option[InviteExceptionResponse] = None,
  invite: Option[InviteBusinessRoleBinding] = None
)

