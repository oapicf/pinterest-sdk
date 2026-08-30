package org.openapitools.server.model


/**
 * A business member identified by `member_id` with their `business_role` in the business.
 *
 * @param businessRole  for example: ''null''
 * @param memberId Unique identifier of the member. for example: ''140943737684417''
*/
final case class BusinessMembershipMember (
  businessRole: BusinessRoleForMembers,
  memberId: String
)

