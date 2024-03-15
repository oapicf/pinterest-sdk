package model

import play.api.libs.json._

/**
  * Object describing an item batch record
  * @param itemId The catalog item id in the merchant namespace
  * @param updateMask The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ItemBatchRecord(
  itemId: Option[String],
  attributes: Option[ItemAttributes],
  updateMask: Option[List[UpdateMaskFieldType]]
  additionalProperties: 
)

object ItemBatchRecord {
  implicit lazy val itemBatchRecordJsonFormat: Format[ItemBatchRecord] = {
    val realJsonFormat = Json.format[ItemBatchRecord]
    val declaredPropNames = Set("itemId", "attributes", "updateMask")
    
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
      Writes { itemBatchRecord =>
        val jsObj = realJsonFormat.writes(itemBatchRecord)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

