package org.openapitools.server.model


/**
 * An object with a list of members that were deleted.
 *
 * @param deletedMembers List of members whose business membership have been terminated. for example: ''["809944451643622187","383791336903426391"]''
*/
final case class DeletedMembersResponse (
  deletedMembers: Option[Seq[String]] = None
)

