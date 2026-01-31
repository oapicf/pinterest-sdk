package model

import play.api.libs.json._

/**
  * Object describing an item bid option operation
  * @param itemId The catalog retail item id in the merchant namespace
  * @param updateMask The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdvancedAuctionItemsSubmitRecord(
  operation: AdvancedAuctionOperation,
  itemId: String,
  country: Country,
  language: Language,
  bidOptions: AdvancedAuctionBidOptions,
  updateMask: List[UpdateMaskBidOptionField]
)

object AdvancedAuctionItemsSubmitRecord {
  implicit lazy val advancedAuctionItemsSubmitRecordJsonFormat: Format[AdvancedAuctionItemsSubmitRecord] = Json.format[AdvancedAuctionItemsSubmitRecord]
}

