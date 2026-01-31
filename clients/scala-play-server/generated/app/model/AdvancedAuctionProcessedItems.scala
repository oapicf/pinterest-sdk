package model

import play.api.libs.json._

/**
  * Response object containing the results of an operation on an item bid option
  * @param catalogId Catalog id pertaining to all items
  * @param items Array of advanced auction processed items
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdvancedAuctionProcessedItems(
  catalogId: Option[String],
  items: Option[List[AdvancedAuctionItemsSubmitRecord]]
)

object AdvancedAuctionProcessedItems {
  implicit lazy val advancedAuctionProcessedItemsJsonFormat: Format[AdvancedAuctionProcessedItems] = Json.format[AdvancedAuctionProcessedItems]
}

