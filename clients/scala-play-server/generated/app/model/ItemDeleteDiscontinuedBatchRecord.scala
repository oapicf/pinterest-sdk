package model

import play.api.libs.json._

/**
  * Object describing an item batch record to discontinue items
  * @param itemId The catalog item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class ItemDeleteDiscontinuedBatchRecord(
  itemId: Option[String]
)

object ItemDeleteDiscontinuedBatchRecord {
  implicit lazy val itemDeleteDiscontinuedBatchRecordJsonFormat: Format[ItemDeleteDiscontinuedBatchRecord] = Json.format[ItemDeleteDiscontinuedBatchRecord]
}

