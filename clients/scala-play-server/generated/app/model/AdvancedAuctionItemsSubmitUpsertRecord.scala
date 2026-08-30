package model

import play.api.libs.json._

/**
  * Object describing an item bid option upsert operation
  * @param errors Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
  * @param itemId The catalog retail item id in the merchant namespace
  * @param updateMask The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdvancedAuctionItemsSubmitUpsertRecord(
  bidOptions: AdvancedAuctionBidOptions,
  country: Country,
  errors: Option[List[AdvancedAuctionOperationError]],
  itemId: String,
  language: Language,
  operation: AdvancedAuctionItemsSubmitUpsertRecord.Operation.Value,
  updateMask: List[UpdateMaskBidOptionField]
)

object AdvancedAuctionItemsSubmitUpsertRecord {
  implicit lazy val advancedAuctionItemsSubmitUpsertRecordJsonFormat: Format[AdvancedAuctionItemsSubmitUpsertRecord] = Json.format[AdvancedAuctionItemsSubmitUpsertRecord]

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val UPSERT = Value("UPSERT")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

