package model

import play.api.libs.json._

/**
  * Object describing an item record
  * @param itemId The catalog item id in the merchant namespace
  * @param pins The pins mapped to the item
  * @param hotelId The catalog hotel id in the merchant namespace
  * @param errors Array with the errors for the item id requested
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ItemResponse(
  catalogType: CatalogsType,
  itemId: Option[String],
  pins: Option[List[Pin]],
  attributes: Option[CatalogsHotelAttributes],
  hotelId: Option[String],
  errors: Option[List[ItemValidationEvent]]
  additionalProperties: 
)

object ItemResponse {
  implicit lazy val itemResponseJsonFormat: Format[ItemResponse] = {
    val realJsonFormat = Json.format[ItemResponse]
    val declaredPropNames = Set("catalogType", "itemId", "pins", "attributes", "hotelId", "errors")
    
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
      Writes { itemResponse =>
        val jsObj = realJsonFormat.writes(itemResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

