package model

import play.api.libs.json._

/**
  * Response object containing the results of an operation on an item bid option
  * @param catalogId Catalog id pertaining to all items
  * @param items Array of advanced auction processed items
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AdvancedAuctionProcessedItems(
  catalogId: Option[String],
  items: Option[List[AdvancedAuctionItemsSubmitRecord]]
)

object AdvancedAuctionProcessedItems {
  implicit lazy val advancedAuctionProcessedItemsJsonFormat: Format[AdvancedAuctionProcessedItems] = Json.format[AdvancedAuctionProcessedItems]
}

