package model

import play.api.libs.json._

/**
  * Object describing an item bid option deletion operation
  * @param itemId The catalog retail item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdvancedAuctionItemsSubmitDeleteRecord(
  itemId: String,
  country: Country,
  language: Language
)

object AdvancedAuctionItemsSubmitDeleteRecord {
  implicit lazy val advancedAuctionItemsSubmitDeleteRecordJsonFormat: Format[AdvancedAuctionItemsSubmitDeleteRecord] = Json.format[AdvancedAuctionItemsSubmitDeleteRecord]
}

