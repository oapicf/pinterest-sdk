package org.openapitools.server.model


/**
 * Hotel batch item
 *
 * @param hotelId The catalog hotel id in the merchant namespace for example: ''DS0294-M''
 * @param operation  for example: ''null''
 * @param attributes  for example: ''null''
*/
final case class CatalogsHotelBatchItem (
  hotelId: String,
  operation: String,
  attributes: CatalogsUpdatableHotelAttributes
)

