package org.openapitools.server.model


/**
 * @param exception  for example: ''null''
 * @param invite An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created. for example: ''null''
*/
final case class RespondToInviteResultItem (
  exception: Option[InviteExceptionResponse] = None,
  invite: Option[BaseInviteDataResponse] = None
)

