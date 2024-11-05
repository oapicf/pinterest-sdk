package org.openapitools.server.model


/**
 * A creative assets item to be updated.
 *
 * @param creativeAssetsId The catalog creative assets item id in the merchant namespace for example: ''DS0294-M''
 * @param operation  for example: ''null''
 * @param attributes  for example: ''null''
*/
final case class CatalogsUpdateCreativeAssetsItem (
  creativeAssetsId: String,
  operation: String,
  attributes: CatalogsUpdatableCreativeAssetsAttributes
)

