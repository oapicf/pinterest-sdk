package model

import play.api.libs.json._

/**
  * Request object used to get bid options values for a batch of retail catalog items
  * @param catalogId Catalog id pertaining to the retail item
  * @param items A list of retail catalog items to fetch bid options for
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AdvancedAuctionItemsGetRequest(
  catalogId: String,
  items: List[AdvancedAuctionKey]
)

object AdvancedAuctionItemsGetRequest {
  implicit lazy val advancedAuctionItemsGetRequestJsonFormat: Format[AdvancedAuctionItemsGetRequest] = Json.format[AdvancedAuctionItemsGetRequest]
}

