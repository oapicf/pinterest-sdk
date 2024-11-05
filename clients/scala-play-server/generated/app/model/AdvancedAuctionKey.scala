package model

import play.api.libs.json._

/**
  * Object uniquely identifying a retail catalog item
  * @param itemId The catalog retail item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdvancedAuctionKey(
  itemId: String,
  country: Country,
  language: Language
)

object AdvancedAuctionKey {
  implicit lazy val advancedAuctionKeyJsonFormat: Format[AdvancedAuctionKey] = Json.format[AdvancedAuctionKey]
}

