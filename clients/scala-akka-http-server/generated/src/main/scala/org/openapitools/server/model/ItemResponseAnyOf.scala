package org.openapitools.server.model


/**
 * @param catalogType  for example: ''null''
 * @param itemId The catalog retail item id in the merchant namespace for example: ''DS0294-M''
 * @param pins The pins mapped to the item for example: ''null''
 * @param attributes  for example: ''null''
 * @param hotelId The catalog hotel id in the merchant namespace for example: ''DS0294-M''
*/
final case class ItemResponseAnyOf (
  catalogType: CatalogsType,
  itemId: Option[String] = None,
  pins: Option[Seq[Pin]] = None,
  attributes: Option[CatalogsHotelAttributes] = None,
  hotelId: Option[String] = None
)

