package org.openapitools.server.model


/**
 * @param businessRole  for example: ''null''
 * @param memberId Unique identifier of the member for example: ''140943737684417''
*/
final case class MembersToDeleteBodyMembersInner (
  businessRole: BusinessRoleForMembers,
  memberId: String
)

