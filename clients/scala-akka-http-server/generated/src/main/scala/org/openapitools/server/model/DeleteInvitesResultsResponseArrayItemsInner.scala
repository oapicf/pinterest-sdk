package org.openapitools.server.model


/**
 * @param exception  for example: ''null''
 * @param invite  for example: ''null''
*/
final case class DeleteInvitesResultsResponseArrayItemsInner (
  exception: Option[DeleteInvitesResultsResponseArrayItemsInnerException] = None,
  invite: Option[BaseInviteDataResponse] = None
)

