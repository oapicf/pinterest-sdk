package org.openapitools.server.model


/**
 * = catalogs_creative_assets_item_response =
 *
 * Object describing a creative assets item record
 *
 * @param attributes  for example: ''null''
 * @param catalogType  for example: ''null''
 * @param creativeAssetsId The catalog creative assets id in the merchant namespace for example: ''DS0294-M''
 * @param itemResponseKind Discriminator literal identifying this leaf inside an `ItemResponse` payload. for example: ''null''
 * @param pins The pins mapped to the item for example: ''null''
*/
final case class CatalogsCreativeAssetsItemResponse (
  attributes: Option[CatalogsCreativeAssetsAttributes] = None,
  catalogType: String,
  creativeAssetsId: Option[String] = None,
  itemResponseKind: String,
  pins: Option[Seq[Pin]] = None
)

