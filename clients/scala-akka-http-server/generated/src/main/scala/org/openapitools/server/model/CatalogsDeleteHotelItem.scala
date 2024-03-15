package org.openapitools.server.model


/**
 * A hotel item to be deleted
 *
 * @param hotelId The catalog hotel id in the merchant namespace for example: ''DS0294-M''
 * @param operation  for example: ''null''
*/
final case class CatalogsDeleteHotelItem (
  hotelId: String,
  operation: String
)

