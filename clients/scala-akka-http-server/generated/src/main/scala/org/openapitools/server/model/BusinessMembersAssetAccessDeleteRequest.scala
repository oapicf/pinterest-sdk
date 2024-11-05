package org.openapitools.server.model


/**
 * @param accesses List of members asset access to be deleted for example: ''null''
*/
final case class BusinessMembersAssetAccessDeleteRequest (
  accesses: Seq[BusinessMembersAssetAccessDeleteRequestAccessesInner]
)

