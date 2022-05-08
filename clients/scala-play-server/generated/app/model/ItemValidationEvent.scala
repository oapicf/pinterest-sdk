package model

import play.api.libs.json._

/**
  * Object describing an item validation event
  * @param attribute The attribute that the item validation event references
  * @param code The event code that the item validation event references
  * @param message Title message describing the item validation event
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class ItemValidationEvent(
  attribute: Option[String],
  code: Option[Int],
  message: Option[String]
  additionalProperties: 
)

object ItemValidationEvent {
  implicit lazy val itemValidationEventJsonFormat: Format[ItemValidationEvent] = {
    val realJsonFormat = Json.format[ItemValidationEvent]
    val declaredPropNames = Set("attribute", "code", "message")
    
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
      Writes { itemValidationEvent =>
        val jsObj = realJsonFormat.writes(itemValidationEvent)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

