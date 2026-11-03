package model

import play.api.libs.json._

/**
  * Response object containing item bid options
  * @param catalogId Response object of item bid options
  * @param items Array with item bid options
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AdvancedAuctionItems(
  catalogId: Option[String],
  items: Option[List[AdvancedAuctionItem]]
)

object AdvancedAuctionItems {
  implicit lazy val advancedAuctionItemsJsonFormat: Format[AdvancedAuctionItems] = Json.format[AdvancedAuctionItems]
}

