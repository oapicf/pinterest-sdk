package model

import play.api.libs.json._

/**
  * Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items
  * @param catalogId Catalog id pertaining to all items
  * @param items Array of item bid option operations
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdvancedAuctionItemsSubmitRequest(
  catalogId: String,
  items: List[AdvancedAuctionItemsSubmitRecord]
)

object AdvancedAuctionItemsSubmitRequest {
  implicit lazy val advancedAuctionItemsSubmitRequestJsonFormat: Format[AdvancedAuctionItemsSubmitRequest] = Json.format[AdvancedAuctionItemsSubmitRequest]
}

