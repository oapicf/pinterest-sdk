package org.openapitools.server.model


/**
 * Hotel batch item
 *
 * @param attributes  for example: ''null''
 * @param hotelId The catalog hotel id in the merchant namespace for example: ''DS0294-M''
 * @param operation  for example: ''null''
*/
final case class CatalogsHotelBatchItem (
  attributes: CatalogsUpdatableHotelAttributes,
  hotelId: String,
  operation: String
)

