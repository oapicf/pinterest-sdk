package org.openapitools.server.model


/**
 * An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).
 *
 * @param exception  for example: ''null''
 * @param invite  for example: ''null''
*/
final case class InviteActionResultItem (
  exception: Option[InviteExceptionResponse] = None,
  invite: Option[InviteBusinessRoleBinding] = None
)

