package org.openapitools.server.model


/**
 * List of members with role to delete.
 *
 * @param members  for example: ''null''
*/
final case class DeleteBusinessMembershipBody (
  members: Seq[DeleteBusinessMembershipMember]
)

