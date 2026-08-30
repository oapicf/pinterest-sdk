package org.openapitools.server.model


/**
 * An object with a list of partner asset accesses to delete.
 *
 * @param accesses List of partner asset accesses to delete. for example: ''null''
*/
final case class DeletePartnerAssetAccessBody (
  accesses: Seq[DeletePartnerAssetAccessItem]
)

