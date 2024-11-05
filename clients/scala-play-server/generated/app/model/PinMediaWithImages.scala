package model

import play.api.libs.json._

/**
  * Pin with multiple images.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class PinMediaWithImages(
  mediaType: Option[String],
  items: Option[List[ImageMetadata]]
  additionalProperties: PinMedia
)

object PinMediaWithImages {
  implicit lazy val pinMediaWithImagesJsonFormat: Format[PinMediaWithImages] = {
    val realJsonFormat = Json.format[PinMediaWithImages]
    val declaredPropNames = Set("mediaType", "items")
    
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
      Writes { pinMediaWithImages =>
        val jsObj = realJsonFormat.writes(pinMediaWithImages)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

