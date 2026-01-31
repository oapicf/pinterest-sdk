package org.openapitools.server.model


/**
 * A hotel item to be created.
 *
 * @param attributes  for example: ''null''
 * @param hotelId The catalog hotel id in the merchant namespace for example: ''DS0294-M''
 * @param operation  for example: ''null''
*/
final case class CatalogsCreateHotelItem (
  attributes: CatalogsHotelAttributes,
  hotelId: String,
  operation: String
)

