package org.openapitools.server.model


/**
 * Result of a supplemental item operation, discriminated by supplemental_type
 *
 * @param errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. for example: ''null''
 * @param itemId Catalog item id in the merchant namespace for example: ''item_id_1''
 * @param status Status of the item processing record for example: ''null''
 * @param storeCode Store code for the local inventory item for example: ''store_1''
 * @param supplementalType  for example: ''null''
 * @param warnings Array with the validation warnings for the item processing record for example: ''null''
*/
final case class SupplementalOperationResult (
  errors: Option[Seq[SupplementalItemValidationEvent]] = None,
  itemId: String,
  status: SupplementalItemProcessingStatus,
  storeCode: String,
  supplementalType: String,
  warnings: Option[Seq[SupplementalItemValidationEvent]] = None
)

