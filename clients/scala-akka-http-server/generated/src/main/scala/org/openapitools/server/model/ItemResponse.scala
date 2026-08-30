package org.openapitools.server.model


/**
 * Object describing an item record or error. Discriminated by `item_response_kind` (one unique value per leaf).
 *
 * @param attributes  for example: ''null''
 * @param catalogType  for example: ''null''
 * @param itemId The catalog item id in the merchant namespace for example: ''DS0294-M''
 * @param itemResponseKind Discriminator literal identifying this leaf inside an `ItemResponse` payload. for example: ''null''
 * @param pins The pins mapped to the item for example: ''null''
 * @param hotelId The catalog hotel id in the merchant namespace for example: ''DS0294-M''
 * @param creativeAssetsId The catalog creative assets id in the merchant namespace for example: ''DS0294-M''
 * @param errors Array with the errors for the item id requested for example: ''null''
*/
final case class ItemResponse (
  attributes: Option[CatalogsCreativeAssetsAttributes] = None,
  catalogType: String,
  itemId: Option[String] = None,
  itemResponseKind: String,
  pins: Option[Seq[Pin]] = None,
  hotelId: Option[String] = None,
  creativeAssetsId: Option[String] = None,
  errors: Seq[ItemValidationEvent]
)

