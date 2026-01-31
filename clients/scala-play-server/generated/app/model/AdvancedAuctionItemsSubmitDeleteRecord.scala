package model

import play.api.libs.json._

/**
  * Object describing an item bid option deletion operation
  * @param itemId The catalog retail item id in the merchant namespace
  * @param errors Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdvancedAuctionItemsSubmitDeleteRecord(
  country: Country,
  itemId: String,
  language: Language,
  errors: Option[List[AdvancedAuctionOperationError]]
)

object AdvancedAuctionItemsSubmitDeleteRecord {
  implicit lazy val advancedAuctionItemsSubmitDeleteRecordJsonFormat: Format[AdvancedAuctionItemsSubmitDeleteRecord] = Json.format[AdvancedAuctionItemsSubmitDeleteRecord]
}

