package org.openapitools.server.model


/**
 * @param items List of members with updated business access role. for example: ''null''
*/
final case class UpdateMemberResultsResponseArray (
  items: Option[Seq[UpdateMemberResult]] = None
)

