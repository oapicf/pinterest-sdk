package model

import play.api.libs.json._

/**
  * Object describing an item bid option upsert operation
  * @param itemId The catalog retail item id in the merchant namespace
  * @param updateMask The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdvancedAuctionItemsSubmitUpsertRecord(
  itemId: String,
  country: Country,
  language: Language,
  bidOptions: AdvancedAuctionBidOptions,
  updateMask: List[UpdateMaskBidOptionField]
)

object AdvancedAuctionItemsSubmitUpsertRecord {
  implicit lazy val advancedAuctionItemsSubmitUpsertRecordJsonFormat: Format[AdvancedAuctionItemsSubmitUpsertRecord] = Json.format[AdvancedAuctionItemsSubmitUpsertRecord]
}

