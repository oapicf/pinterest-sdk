package org.openapitools.server.model


/**
 * Creative assets batch item
 *
 * @param creativeAssetsId The catalog creative assets id in the merchant namespace for example: ''DS0294-M''
 * @param operation  for example: ''null''
 * @param attributes  for example: ''null''
*/
final case class CatalogsCreativeAssetsBatchItem (
  creativeAssetsId: String,
  operation: String,
  attributes: CatalogsUpdatableCreativeAssetsAttributes
)

