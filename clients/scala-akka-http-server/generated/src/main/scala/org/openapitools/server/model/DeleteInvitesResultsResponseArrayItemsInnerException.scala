package org.openapitools.server.model


/**
 * An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 *
 * @param inviteId Unique identifier of an invite. for example: ''null''
 * @param message Error message associated with the error in performing the action on the invite/request. for example: ''Business Invite request cannot be performed on current invitation status.''
*/
final case class DeleteInvitesResultsResponseArrayItemsInnerException (
  inviteId: Option[String] = None,
  message: Option[String] = None
)

