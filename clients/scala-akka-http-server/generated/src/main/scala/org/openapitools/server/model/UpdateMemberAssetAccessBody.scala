package org.openapitools.server.model


/**
 * An object with a list of all the new member asset accesses.
 *
 * @param accesses List of member asset accesses to assign or update. for example: ''null''
*/
final case class UpdateMemberAssetAccessBody (
  accesses: Seq[UpdateMemberAssetAccessItem]
)

