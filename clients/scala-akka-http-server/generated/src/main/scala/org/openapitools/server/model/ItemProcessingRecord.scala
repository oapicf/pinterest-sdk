package org.openapitools.server.model


/**
 * Object describing an item processing record
 *
 * @param itemId The catalog item id in the merchant namespace for example: ''DS0294-M''
 * @param errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. for example: ''null''
 * @param warnings Array with the validation warnings for the item processing record for example: ''null''
 * @param status  for example: ''null''
*/
final case class ItemProcessingRecord (
  itemId: Option[String],
  errors: Option[Seq[ItemValidationEvent]],
  warnings: Option[Seq[ItemValidationEvent]],
  status: Option[ItemProcessingStatus]
)

