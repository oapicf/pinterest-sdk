package org.openapitools.server.model


/**
 * Object describing an item processing record
 *
 * @param errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. for example: ''null''
 * @param hotelId The catalog hotel id in the merchant namespace for example: ''DS0294-M''
 * @param status  for example: ''null''
 * @param warnings Array with the validation warnings for the item processing record for example: ''null''
*/
final case class HotelProcessingRecord (
  errors: Option[Seq[ItemValidationEvent]] = None,
  hotelId: Option[String] = None,
  status: Option[ItemProcessingStatus] = None,
  warnings: Option[Seq[ItemValidationEvent]] = None
)

