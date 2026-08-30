package org.openapitools.server.model


/**
 * = catalogs_hotel_item_error_response =
 *
 * Object describing a hotel item error
 *
 * @param catalogType  for example: ''null''
 * @param errors Array with the errors for the item id requested for example: ''null''
 * @param hotelId The catalog hotel id in the merchant namespace for example: ''DS0294-M''
 * @param itemResponseKind Discriminator literal identifying this leaf inside an `ItemResponse` payload. for example: ''null''
*/
final case class CatalogsHotelItemErrorResponse (
  catalogType: String,
  errors: Seq[ItemValidationEvent],
  hotelId: Option[String] = None,
  itemResponseKind: String
)

