package model

import play.api.libs.json._

/**
  * Object describing an item batch record to update items
  * @param itemId The catalog item id in the merchant namespace
  * @param updateMask The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ItemUpdateBatchRecord(
  attributes: Option[UpdatableItemAttributes],
  itemId: Option[String],
  updateMask: Option[List[UpdateMaskFieldType]]
)

object ItemUpdateBatchRecord {
  implicit lazy val itemUpdateBatchRecordJsonFormat: Format[ItemUpdateBatchRecord] = Json.format[ItemUpdateBatchRecord]
}

