package model

import play.api.libs.json._

/**
  * Object uniquely identifying a retail catalog item
  * @param itemId The catalog retail item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdvancedAuctionItemsGetRecord(
  country: Country,
  itemId: String,
  language: Language
)

object AdvancedAuctionItemsGetRecord {
  implicit lazy val advancedAuctionItemsGetRecordJsonFormat: Format[AdvancedAuctionItemsGetRecord] = Json.format[AdvancedAuctionItemsGetRecord]
}

