package org.openapitools.server.model


/**
 * An object with a list of partner asset accesses to assign or update.
 *
 * @param accesses List of partner asset accesses to assign or update. for example: ''null''
*/
final case class UpdatePartnerAssetAccessBody (
  accesses: Seq[UpdatePartnerAssetAccessItem]
)

