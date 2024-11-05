package org.openapitools.server.model


/**
 * Single instance of a business member to have its role updated
 *
 * @param businessRole  for example: ''null''
 * @param memberId Unique identifier of the member for example: ''140943737684417''
*/
final case class UpdateMemberBusinessRoleBody (
  businessRole: BusinessRoleForMembers,
  memberId: String
)

