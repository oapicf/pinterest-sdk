package org.openapitools.server.model


/**
 * Object describing an item record or error
 *
 * @param catalogType  for example: ''null''
 * @param attributes  for example: ''null''
 * @param itemId The catalog item id in the merchant namespace for example: ''DS0294-M''
 * @param pins The pins mapped to the item for example: ''null''
 * @param hotelId The catalog hotel id in the merchant namespace for example: ''DS0294-M''
 * @param creativeAssetsId The catalog creative assets id in the merchant namespace for example: ''DS0294-M''
 * @param errors Array with the errors for the item id requested for example: ''null''
*/
final case class ItemResponse (
  catalogType: CatalogsType,
  attributes: Option[CatalogsCreativeAssetsAttributes] = None,
  itemId: Option[String] = None,
  pins: Option[Seq[Pin]] = None,
  hotelId: Option[String] = None,
  creativeAssetsId: Option[String] = None,
  errors: Seq[ItemValidationEvent]
)

