package org.openapitools.server.model


/**
 * A creative assets item to be upserted.
 *
 * @param attributes  for example: ''null''
 * @param creativeAssetsId The catalog creative assets id in the merchant namespace for example: ''DS0294-M''
 * @param operation  for example: ''null''
*/
final case class CatalogsUpsertCreativeAssetsItem (
  attributes: CatalogsCreativeAssetsAttributes,
  creativeAssetsId: String,
  operation: String
)

