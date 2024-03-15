package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsRetailBatchRequest_items_inner.
  * @param itemId The catalog item id in the merchant namespace
  * @param updateMask The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsRetailBatchRequestItemsInner(
  itemId: String,
  operation: CatalogsRetailBatchRequestItemsInner.Operation.Value,
  attributes: ItemAttributes,
  updateMask: Option[List[UpdateMaskFieldType]]
)

object CatalogsRetailBatchRequestItemsInner {
  implicit lazy val catalogsRetailBatchRequestItemsInnerJsonFormat: Format[CatalogsRetailBatchRequestItemsInner] = Json.format[CatalogsRetailBatchRequestItemsInner]

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val CREATE = Value("CREATE")
    val UPDATE = Value("UPDATE")
    val UPSERT = Value("UPSERT")
    val DELETE = Value("DELETE")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

