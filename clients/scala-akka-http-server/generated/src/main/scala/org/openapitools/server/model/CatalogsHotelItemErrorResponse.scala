package org.openapitools.server.model


/**
 * Object describing a hotel item error
 *
 * @param catalogType  for example: ''null''
 * @param errors Array with the errors for the item id requested for example: ''null''
 * @param hotelId The catalog hotel id in the merchant namespace for example: ''DS0294-M''
*/
final case class CatalogsHotelItemErrorResponse (
  catalogType: CatalogsType,
  errors: Seq[ItemValidationEvent],
  hotelId: Option[String] = None
)

