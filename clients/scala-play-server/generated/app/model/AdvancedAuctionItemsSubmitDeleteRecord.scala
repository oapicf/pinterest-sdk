package model

import play.api.libs.json._

/**
  * Object describing an item bid option deletion operation
  * @param itemId The catalog retail item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class AdvancedAuctionItemsSubmitDeleteRecord(
  itemId: String,
  country: Country,
  language: Language
)

object AdvancedAuctionItemsSubmitDeleteRecord {
  implicit lazy val advancedAuctionItemsSubmitDeleteRecordJsonFormat: Format[AdvancedAuctionItemsSubmitDeleteRecord] = Json.format[AdvancedAuctionItemsSubmitDeleteRecord]
}

