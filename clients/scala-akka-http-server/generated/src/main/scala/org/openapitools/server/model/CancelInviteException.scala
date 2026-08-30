package org.openapitools.server.model


/**
 * An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 *
 * @param inviteId  for example: ''null''
 * @param message  for example: ''null''
*/
final case class CancelInviteException (
  inviteId: Option[String] = None,
  message: Option[String] = None
)

