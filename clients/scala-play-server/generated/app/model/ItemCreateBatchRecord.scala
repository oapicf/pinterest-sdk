package model

import play.api.libs.json._

/**
  * Object describing an item batch record to create items
  * @param itemId The catalog item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ItemCreateBatchRecord(
  itemId: Option[String],
  attributes: Option[ItemAttributes]
)

object ItemCreateBatchRecord {
  implicit lazy val itemCreateBatchRecordJsonFormat: Format[ItemCreateBatchRecord] = Json.format[ItemCreateBatchRecord]
}

