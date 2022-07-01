package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PinMediaWithImage_allOf.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class PinMediaWithImageAllOf(
  images: Option[Map[String, ImageDetails]],
  additionalProperties: 
)

object PinMediaWithImageAllOf {
  implicit lazy val pinMediaWithImageAllOfJsonFormat: Format[PinMediaWithImageAllOf] = {
    val realJsonFormat = Json.format[PinMediaWithImageAllOf]
    val declaredPropNames = Set("images")
    
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
      Writes { pinMediaWithImageAllOf =>
        val jsObj = realJsonFormat.writes(pinMediaWithImageAllOf)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

