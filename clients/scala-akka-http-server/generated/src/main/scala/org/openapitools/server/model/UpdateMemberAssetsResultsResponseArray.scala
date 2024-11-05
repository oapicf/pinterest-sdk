package org.openapitools.server.model


/**
 * @param items List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned. for example: ''null''
*/
final case class UpdateMemberAssetsResultsResponseArray (
  items: Option[Seq[UpdateMemberAssetsResultsResponseArrayItemsInner]] = None
)

