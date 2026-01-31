package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdvancedAuctionItem.
  * @param itemId The catalog retail item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdvancedAuctionItem(
  itemId: String,
  country: Country,
  language: Language,
  bidOptions: AdvancedAuctionBidOptions
)

object AdvancedAuctionItem {
  implicit lazy val advancedAuctionItemJsonFormat: Format[AdvancedAuctionItem] = Json.format[AdvancedAuctionItem]
}

