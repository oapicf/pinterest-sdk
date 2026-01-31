package model

import play.api.libs.json._

/**
  * Request object used to get bid options values for a batch of retail catalog items
  * @param catalogId Catalog id pertaining to the retail item
  * @param items A list of retail catalog items to fetch bid options for
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdvancedAuctionItemsGetRequest(
  catalogId: String,
  items: List[AdvancedAuctionItemsGetRecord]
)

object AdvancedAuctionItemsGetRequest {
  implicit lazy val advancedAuctionItemsGetRequestJsonFormat: Format[AdvancedAuctionItemsGetRequest] = Json.format[AdvancedAuctionItemsGetRequest]
}

