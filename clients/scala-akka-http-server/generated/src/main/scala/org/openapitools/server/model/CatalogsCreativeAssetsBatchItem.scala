package org.openapitools.server.model


/**
 * Creative assets batch item
 *
 * @param attributes  for example: ''null''
 * @param creativeAssetsId The catalog creative assets id in the merchant namespace for example: ''DS0294-M''
 * @param operation  for example: ''null''
*/
final case class CatalogsCreativeAssetsBatchItem (
  attributes: CatalogsUpdatableCreativeAssetsAttributes,
  creativeAssetsId: String,
  operation: String
)

