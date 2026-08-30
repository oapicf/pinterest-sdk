package model

import play.api.libs.json._

/**
  * Update operation for local inventory item
  * @param itemId Catalog item id in the merchant namespace
  * @param storeCode Store code for the local inventory item
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LocalInventoryUpdateOperation(
  attributes: RetailLocalInventoryItemAttributesOptional,
  itemId: String,
  operation: LocalInventoryUpdateOperation.Operation.Value,
  storeCode: String
)

object LocalInventoryUpdateOperation {
  implicit lazy val localInventoryUpdateOperationJsonFormat: Format[LocalInventoryUpdateOperation] = Json.format[LocalInventoryUpdateOperation]

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val UPDATE = Value("UPDATE")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

