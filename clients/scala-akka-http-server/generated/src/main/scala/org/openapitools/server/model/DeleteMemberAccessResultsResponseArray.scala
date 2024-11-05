package org.openapitools.server.model


/**
 * @param items List of member asset permissions that were deleted. for example: ''null''
*/
final case class DeleteMemberAccessResultsResponseArray (
  items: Option[Seq[DeleteMemberAccessResult]] = None
)

