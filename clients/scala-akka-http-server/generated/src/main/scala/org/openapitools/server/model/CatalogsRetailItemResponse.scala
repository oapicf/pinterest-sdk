package org.openapitools.server.model


/**
 * = catalogs_retail_item_response =
 *
 * Object describing a retail item record
 *
 * @param attributes  for example: ''null''
 * @param catalogType  for example: ''null''
 * @param itemId The catalog retail item id in the merchant namespace for example: ''DS0294-M''
 * @param itemResponseKind Discriminator literal identifying this leaf inside an `ItemResponse` payload. for example: ''null''
 * @param pins The pins mapped to the item for example: ''null''
*/
final case class CatalogsRetailItemResponse (
  attributes: Option[ItemAttributes] = None,
  catalogType: String,
  itemId: Option[String] = None,
  itemResponseKind: String,
  pins: Option[Seq[Pin]] = None
)

