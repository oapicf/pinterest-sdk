package org.openapitools.server.model


/**
 * An object with a list of member asset accesses to delete.
 *
 * @param accesses List of members asset access to be deleted for example: ''null''
*/
final case class BusinessMembersAssetAccessDeleteBody (
  accesses: Seq[DeleteMemberAssetAccessItem]
)

