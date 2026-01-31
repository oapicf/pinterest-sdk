package org.openapitools.server.model


/**
 * A hotel item to be upserted.
 *
 * @param attributes  for example: ''null''
 * @param hotelId The catalog hotel id in the merchant namespace for example: ''DS0294-M''
 * @param operation  for example: ''null''
*/
final case class CatalogsUpsertHotelItem (
  attributes: CatalogsHotelAttributes,
  hotelId: String,
  operation: String
)

