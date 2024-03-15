package org.openapitools.server.model


/**
 * A hotel item to be created.
 *
 * @param hotelId The catalog hotel id in the merchant namespace for example: ''DS0294-M''
 * @param operation  for example: ''null''
 * @param attributes  for example: ''null''
*/
final case class CatalogsCreateHotelItem (
  hotelId: String,
  operation: String,
  attributes: CatalogsHotelAttributes
)

