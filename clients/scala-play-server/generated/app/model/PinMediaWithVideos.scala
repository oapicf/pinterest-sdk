package model

import play.api.libs.json._

/**
  * Pin with multiple videos.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PinMediaWithVideos(
  mediaType: Option[String],
  items: Option[List[VideoMetadata]]
  additionalProperties: PinMedia
)

object PinMediaWithVideos {
  implicit lazy val pinMediaWithVideosJsonFormat: Format[PinMediaWithVideos] = {
    val realJsonFormat = Json.format[PinMediaWithVideos]
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
      Writes { pinMediaWithVideos =>
        val jsObj = realJsonFormat.writes(pinMediaWithVideos)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

