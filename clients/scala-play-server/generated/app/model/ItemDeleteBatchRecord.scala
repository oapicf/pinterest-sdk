package model

import play.api.libs.json._

/**
  * Object describing an item batch record to delete items
  * @param itemId The catalog item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ItemDeleteBatchRecord(
  itemId: Option[String]
)

object ItemDeleteBatchRecord {
  implicit lazy val itemDeleteBatchRecordJsonFormat: Format[ItemDeleteBatchRecord] = Json.format[ItemDeleteBatchRecord]
}

