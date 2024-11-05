package model

import play.api.libs.json._

/**
  * Response object containing the results of an operation on an item bid option
  * @param catalogId Catalog id pertaining to all items
  * @param items Array of advanced auction processed items
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdvancedAuctionProcessedItems(
  catalogId: Option[String],
  items: Option[List[AdvancedAuctionProcessedItem]]
)

object AdvancedAuctionProcessedItems {
  implicit lazy val advancedAuctionProcessedItemsJsonFormat: Format[AdvancedAuctionProcessedItems] = Json.format[AdvancedAuctionProcessedItems]
}

