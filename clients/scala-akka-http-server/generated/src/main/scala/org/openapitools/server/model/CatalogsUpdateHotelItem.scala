package org.openapitools.server.model


/**
 * Object describing an hotel item batch record
 *
 * @param hotelId The catalog hotel item id in the merchant namespace for example: ''DS0294-M''
 * @param operation  for example: ''null''
 * @param attributes  for example: ''null''
*/
final case class CatalogsUpdateHotelItem (
  hotelId: String,
  operation: String,
  attributes: CatalogsUpdatableHotelAttributes
)

