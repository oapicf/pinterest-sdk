package org.openapitools.server.model


/**
 * A creative assets item to be created.
 *
 * @param creativeAssetsId The catalog creative assets id in the merchant namespace for example: ''DS0294-M''
 * @param operation  for example: ''null''
 * @param attributes  for example: ''null''
*/
final case class CatalogsCreateCreativeAssetsItem (
  creativeAssetsId: String,
  operation: String,
  attributes: CatalogsCreativeAssetsAttributes
)

