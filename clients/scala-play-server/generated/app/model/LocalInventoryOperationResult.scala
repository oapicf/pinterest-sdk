package model

import play.api.libs.json._

/**
  * Result model for local inventory operation
  * @param errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
  * @param itemId Catalog item id in the merchant namespace
  * @param status Status of the item processing record
  * @param storeCode Store code for the local inventory item
  * @param warnings Array with the validation warnings for the item processing record
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LocalInventoryOperationResult(
  errors: Option[List[SupplementalItemValidationEvent]],
  itemId: String,
  status: SupplementalItemProcessingStatus,
  storeCode: String,
  supplementalType: LocalInventoryOperationResult.SupplementalType.Value,
  warnings: Option[List[SupplementalItemValidationEvent]]
)

object LocalInventoryOperationResult {
  implicit lazy val localInventoryOperationResultJsonFormat: Format[LocalInventoryOperationResult] = Json.format[LocalInventoryOperationResult]

  // noinspection TypeAnnotation
  object SupplementalType extends Enumeration {
    val LOCALINVENTORY = Value("LOCAL_INVENTORY")

    type SupplementalType = Value
    implicit lazy val SupplementalTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

