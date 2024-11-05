package model

import play.api.libs.json._

/**
  * Request object used to get bid options values for a batch of retail catalog items
  * @param catalogId Catalog id pertaining to the retail item
  * @param items A list of retail catalog items to fetch bid options for
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdvancedAuctionItemsGetRequest(
  catalogId: String,
  items: List[AdvancedAuctionItemsGetRecord]
)

object AdvancedAuctionItemsGetRequest {
  implicit lazy val advancedAuctionItemsGetRequestJsonFormat: Format[AdvancedAuctionItemsGetRequest] = Json.format[AdvancedAuctionItemsGetRequest]
}

