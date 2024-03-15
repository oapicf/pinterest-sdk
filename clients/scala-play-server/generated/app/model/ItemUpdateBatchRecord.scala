package model

import play.api.libs.json._

/**
  * Object describing an item batch record to update items
  * @param itemId The catalog item id in the merchant namespace
  * @param updateMask The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ItemUpdateBatchRecord(
  itemId: Option[String],
  attributes: Option[UpdatableItemAttributes],
  updateMask: Option[List[UpdateMaskFieldType]]
)

object ItemUpdateBatchRecord {
  implicit lazy val itemUpdateBatchRecordJsonFormat: Format[ItemUpdateBatchRecord] = Json.format[ItemUpdateBatchRecord]
}

