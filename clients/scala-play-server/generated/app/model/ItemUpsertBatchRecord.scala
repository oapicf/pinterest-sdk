package model

import play.api.libs.json._

/**
  * Object describing an item batch record to upsert items
  * @param itemId The catalog item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ItemUpsertBatchRecord(
  itemId: Option[String],
  attributes: Option[ItemAttributesRequest]
)

object ItemUpsertBatchRecord {
  implicit lazy val itemUpsertBatchRecordJsonFormat: Format[ItemUpsertBatchRecord] = Json.format[ItemUpsertBatchRecord]
}

