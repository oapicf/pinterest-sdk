package model

import play.api.libs.json._

/**
  * Create operation for local inventory item
  * @param itemId Catalog item id in the merchant namespace
  * @param storeCode Store code for the local inventory item
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LocalInventoryCreateOperation(
  attributes: RetailLocalInventoryItemAttributes,
  itemId: String,
  operation: LocalInventoryCreateOperation.Operation.Value,
  storeCode: String
)

object LocalInventoryCreateOperation {
  implicit lazy val localInventoryCreateOperationJsonFormat: Format[LocalInventoryCreateOperation] = Json.format[LocalInventoryCreateOperation]

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val CREATE = Value("CREATE")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

