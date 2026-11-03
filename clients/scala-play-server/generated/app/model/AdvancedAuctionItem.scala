package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdvancedAuctionItem.
  * @param itemId The catalog retail item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AdvancedAuctionItem(
  bidOptions: AdvancedAuctionBidOptions,
  country: Country,
  itemId: String,
  language: Language
)

object AdvancedAuctionItem {
  implicit lazy val advancedAuctionItemJsonFormat: Format[AdvancedAuctionItem] = Json.format[AdvancedAuctionItem]
}

