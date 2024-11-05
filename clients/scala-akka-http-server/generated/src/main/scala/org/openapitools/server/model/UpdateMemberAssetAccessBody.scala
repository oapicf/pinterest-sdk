package org.openapitools.server.model


/**
 * An object with a list of all the new accesses.
 *
 * @param accesses  for example: ''null''
*/
final case class UpdateMemberAssetAccessBody (
  accesses: Seq[UpdateMemberAssetAccessBodyAccessesInner]
)

