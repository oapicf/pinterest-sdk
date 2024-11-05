package model

import play.api.libs.json._

/**
  * Object describing an item batch record to upsert items
  * @param itemId The catalog item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ItemUpsertBatchRecord(
  itemId: Option[String],
  attributes: Option[ItemAttributesRequest]
)

object ItemUpsertBatchRecord {
  implicit lazy val itemUpsertBatchRecordJsonFormat: Format[ItemUpsertBatchRecord] = Json.format[ItemUpsertBatchRecord]
}

