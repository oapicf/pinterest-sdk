package model

import play.api.libs.json._

/**
  * Object describing an item bid option deletion operation
  * @param errors Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
  * @param itemId The catalog retail item id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdvancedAuctionItemsSubmitDeleteRecord(
  country: Country,
  errors: Option[List[AdvancedAuctionOperationError]],
  itemId: String,
  language: Language,
  operation: AdvancedAuctionItemsSubmitDeleteRecord.Operation.Value
)

object AdvancedAuctionItemsSubmitDeleteRecord {
  implicit lazy val advancedAuctionItemsSubmitDeleteRecordJsonFormat: Format[AdvancedAuctionItemsSubmitDeleteRecord] = Json.format[AdvancedAuctionItemsSubmitDeleteRecord]

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val DELETE = Value("DELETE")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

