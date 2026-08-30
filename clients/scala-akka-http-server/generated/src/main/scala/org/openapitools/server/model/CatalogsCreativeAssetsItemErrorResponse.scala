package org.openapitools.server.model


/**
 * = catalogs_creative_assets_item_error_response =
 *
 * Object describing a creative assets item error
 *
 * @param catalogType  for example: ''null''
 * @param creativeAssetsId The catalog creative assets id in the merchant namespace for example: ''DS0294-M''
 * @param errors Array with the errors for the item id requested for example: ''null''
 * @param itemResponseKind Discriminator literal identifying this leaf inside an `ItemResponse` payload. for example: ''null''
*/
final case class CatalogsCreativeAssetsItemErrorResponse (
  catalogType: String,
  creativeAssetsId: Option[String] = None,
  errors: Seq[ItemValidationEvent],
  itemResponseKind: String
)

