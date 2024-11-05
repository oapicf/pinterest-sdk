package model

import play.api.libs.json._

/**
  * Object describing the result of an operation on an item bid option
  * @param itemId The catalog retail item id in the merchant namespace
  * @param updateMask The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the `bid_options` object in the body will be set to `null`. If an item bid option record is being created, fields not specified in the update mask will be initialized to `null`.
  * @param errors Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdvancedAuctionProcessedItem(
  operation: AdvancedAuctionOperation,
  itemId: String,
  country: Country,
  language: Language,
  bidOptions: AdvancedAuctionBidOptions,
  updateMask: List[UpdateMaskBidOptionField],
  errors: Option[List[AdvancedAuctionOperationError]]
  additionalProperties: AdvancedAuctionItemsSubmitRecord
)

object AdvancedAuctionProcessedItem {
  implicit lazy val advancedAuctionProcessedItemJsonFormat: Format[AdvancedAuctionProcessedItem] = {
    val realJsonFormat = Json.format[AdvancedAuctionProcessedItem]
    val declaredPropNames = Set("operation", "itemId", "country", "language", "bidOptions", "updateMask", "errors")
    
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
      Writes { advancedAuctionProcessedItem =>
        val jsObj = realJsonFormat.writes(advancedAuctionProcessedItem)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

