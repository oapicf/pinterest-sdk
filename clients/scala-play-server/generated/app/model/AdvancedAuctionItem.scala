package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdvancedAuctionItem.
  * @param itemId The catalog retail item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class AdvancedAuctionItem(
  itemId: String,
  country: Country,
  language: Language,
  bidOptions: AdvancedAuctionBidOptions
)

object AdvancedAuctionItem {
  implicit lazy val advancedAuctionItemJsonFormat: Format[AdvancedAuctionItem] = Json.format[AdvancedAuctionItem]
}

