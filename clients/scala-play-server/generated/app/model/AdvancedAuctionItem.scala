package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdvancedAuctionItem.
  * @param itemId The catalog retail item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdvancedAuctionItem(
  bidOptions: AdvancedAuctionBidOptions,
  country: Country,
  itemId: String,
  language: Language
)

object AdvancedAuctionItem {
  implicit lazy val advancedAuctionItemJsonFormat: Format[AdvancedAuctionItem] = Json.format[AdvancedAuctionItem]
}

