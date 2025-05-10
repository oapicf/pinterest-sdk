package model

import play.api.libs.json._

/**
  * Object uniquely identifying a retail catalog item
  * @param itemId The catalog retail item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class AdvancedAuctionKey(
  itemId: String,
  country: Country,
  language: Language
)

object AdvancedAuctionKey {
  implicit lazy val advancedAuctionKeyJsonFormat: Format[AdvancedAuctionKey] = Json.format[AdvancedAuctionKey]
}

