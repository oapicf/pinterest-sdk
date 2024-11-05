package org.openapitools.server.model


/**
 * @param items List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned. for example: ''null''
*/
final case class CreateInvitesResultsResponseArray (
  items: Option[Seq[CreateInvitesResultsResponseArrayItemsInner]] = None
)

