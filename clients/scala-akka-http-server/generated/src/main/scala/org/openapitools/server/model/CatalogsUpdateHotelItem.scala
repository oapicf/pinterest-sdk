package org.openapitools.server.model


/**
 * Object describing an hotel item batch record
 *
 * @param attributes  for example: ''null''
 * @param hotelId The catalog hotel item id in the merchant namespace for example: ''DS0294-M''
 * @param operation  for example: ''null''
*/
final case class CatalogsUpdateHotelItem (
  attributes: CatalogsUpdatableHotelAttributes,
  hotelId: String,
  operation: String
)

