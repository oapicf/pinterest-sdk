package model

import play.api.libs.json._

/**
  * Object describing an item batch record to create items
  * @param itemId The catalog item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ItemCreateBatchRecord(
  attributes: Option[ItemAttributesRequest],
  itemId: Option[String]
)

object ItemCreateBatchRecord {
  implicit lazy val itemCreateBatchRecordJsonFormat: Format[ItemCreateBatchRecord] = Json.format[ItemCreateBatchRecord]
}

