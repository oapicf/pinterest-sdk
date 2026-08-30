package org.openapitools.server.model


/**
 * Single instance of a business member to be removed from the business.
 *
 * @param businessRole  for example: ''null''
 * @param memberId Unique identifier of the member for example: ''140943737684417''
*/
final case class DeleteBusinessMembershipMember (
  businessRole: BusinessRoleForMembers,
  memberId: String
)

