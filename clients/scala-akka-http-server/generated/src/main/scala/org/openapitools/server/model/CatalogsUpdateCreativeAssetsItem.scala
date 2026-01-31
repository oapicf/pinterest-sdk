package org.openapitools.server.model


/**
 * A creative assets item to be updated.
 *
 * @param attributes  for example: ''null''
 * @param creativeAssetsId The catalog creative assets item id in the merchant namespace for example: ''DS0294-M''
 * @param operation  for example: ''null''
*/
final case class CatalogsUpdateCreativeAssetsItem (
  attributes: CatalogsUpdatableCreativeAssetsAttributes,
  creativeAssetsId: String,
  operation: String
)

