package model

import play.api.libs.json._

/**
  * Object uniquely identifying a retail catalog item
  * @param itemId The catalog retail item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdvancedAuctionKey(
  country: Country,
  itemId: String,
  language: Language
)

object AdvancedAuctionKey {
  implicit lazy val advancedAuctionKeyJsonFormat: Format[AdvancedAuctionKey] = Json.format[AdvancedAuctionKey]
}

