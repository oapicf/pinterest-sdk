package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsRetailBatchRequest_items_inner.
  * @param itemId The catalog item id in the merchant namespace
  * @param updateMask The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
  * @param lastUpdatedTime The millisecond timestamp when the item was lastly modified by the merchant.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsRetailBatchRequestItemsInner(
  attributes: ItemAttributesRequest,
  itemId: String,
  operation: CatalogsRetailBatchRequestItemsInner.Operation.Value,
  updateMask: Option[List[UpdateMaskFieldType]],
  lastUpdatedTime: Option[Long]
)

object CatalogsRetailBatchRequestItemsInner {
  implicit lazy val catalogsRetailBatchRequestItemsInnerJsonFormat: Format[CatalogsRetailBatchRequestItemsInner] = Json.format[CatalogsRetailBatchRequestItemsInner]

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val DELETE = Value("DELETE")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

