package org.openapitools.server.model


/**
 * @param items List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned. for example: ''null''
*/
final case class RespondToInvitesResponseArray (
  items: Option[Seq[RespondToInvitesResponseArrayItemsInner]] = None
)

