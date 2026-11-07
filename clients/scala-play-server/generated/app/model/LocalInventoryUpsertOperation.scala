package model

import play.api.libs.json._

/**
  * Upsert operation for local inventory item
  * @param itemId Catalog item id in the merchant namespace
  * @param storeCode Store code for the local inventory item
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class LocalInventoryUpsertOperation(
  attributes: RetailLocalInventoryItemAttributes,
  itemId: String,
  operation: LocalInventoryUpsertOperation.Operation.Value,
  storeCode: String
)

object LocalInventoryUpsertOperation {
  implicit lazy val localInventoryUpsertOperationJsonFormat: Format[LocalInventoryUpsertOperation] = Json.format[LocalInventoryUpsertOperation]

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val UPSERT = Value("UPSERT")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

