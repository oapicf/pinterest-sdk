package org.openapitools.server.model


/**
 * @param memberId Unique identifier of the member for example: ''140943737684417''
 * @param businessRole  for example: ''null''
*/
final case class MembersToDeleteBodyMembersInner (
  memberId: String,
  businessRole: BusinessRoleForMembers
)

