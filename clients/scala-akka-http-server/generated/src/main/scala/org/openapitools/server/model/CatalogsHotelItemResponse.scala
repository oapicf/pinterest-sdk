package org.openapitools.server.model


/**
 * = catalogs_hotel_item_response =
 *
 * Object describing a hotel record
 *
 * @param attributes  for example: ''null''
 * @param catalogType  for example: ''null''
 * @param hotelId The catalog hotel id in the merchant namespace for example: ''DS0294-M''
 * @param itemResponseKind Discriminator literal identifying this leaf inside an `ItemResponse` payload. for example: ''null''
 * @param pins The pins mapped to the item for example: ''null''
*/
final case class CatalogsHotelItemResponse (
  attributes: Option[CatalogsHotelAttributes] = None,
  catalogType: String,
  hotelId: Option[String] = None,
  itemResponseKind: String,
  pins: Option[Seq[Pin]] = None
)

