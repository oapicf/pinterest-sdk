package model

import play.api.libs.json._

/**
  * Response object containing item bid options
  * @param catalogId Response object of item bid options
  * @param items Array with item bid options
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdvancedAuctionItems(
  catalogId: Option[String],
  items: Option[List[AdvancedAuctionItem]]
)

object AdvancedAuctionItems {
  implicit lazy val advancedAuctionItemsJsonFormat: Format[AdvancedAuctionItems] = Json.format[AdvancedAuctionItems]
}

