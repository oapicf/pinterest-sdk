package model

import play.api.libs.json._

/**
  * Object describing an item bid option operation
  * @param errors Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
  * @param itemId The catalog retail item id in the merchant namespace
  * @param updateMask The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdvancedAuctionItemsSubmitRecord(
  bidOptions: AdvancedAuctionBidOptions,
  country: Country,
  errors: Option[List[AdvancedAuctionOperationError]],
  itemId: String,
  language: Language,
  operation: AdvancedAuctionItemsSubmitRecord.Operation.Value,
  updateMask: List[UpdateMaskBidOptionField]
  additionalProperties: 
)

object AdvancedAuctionItemsSubmitRecord {
  implicit lazy val advancedAuctionItemsSubmitRecordJsonFormat: Format[AdvancedAuctionItemsSubmitRecord] = {
    val realJsonFormat = Json.format[AdvancedAuctionItemsSubmitRecord]
    val declaredPropNames = Set("bidOptions", "country", "errors", "itemId", "language", "operation", "updateMask")
    
    Format(
      Reads {
        case JsObject(xs) =>
          val declaredProps = xs.filterKeys(declaredPropNames)
          val additionalProps = JsObject(xs -- declaredPropNames)
          val restructuredProps = declaredProps + ("additionalProperties" -> additionalProps)
          val newObj = JsObject(restructuredProps)
          realJsonFormat.reads(newObj)
        case _ =>
          JsError("error.expected.jsobject")
      },
      Writes { advancedAuctionItemsSubmitRecord =>
        val jsObj = realJsonFormat.writes(advancedAuctionItemsSubmitRecord)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object Operation extends Enumeration {
    val DELETE = Value("DELETE")

    type Operation = Value
    implicit lazy val OperationJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

