package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PinMediaMetadata.
  * @param videoUrl Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.
  * @param duration Duration (in milliseconds)
  * @param height Height (in pixels)
  * @param width Width (in pixels)
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class PinMediaMetadata(
  itemType: Option[String],
  title: Option[String],
  description: Option[String],
  link: Option[String],
  images: Option[ImageMetadataImages],
  coverImageUrl: Option[String],
  videoUrl: Option[String],
  duration: Option[BigDecimal],
  height: Option[Int],
  width: Option[Int]
  additionalProperties: 
)

object PinMediaMetadata {
  implicit lazy val pinMediaMetadataJsonFormat: Format[PinMediaMetadata] = {
    val realJsonFormat = Json.format[PinMediaMetadata]
    val declaredPropNames = Set("itemType", "title", "description", "link", "images", "coverImageUrl", "videoUrl", "duration", "height", "width")
    
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
      Writes { pinMediaMetadata =>
        val jsObj = realJsonFormat.writes(pinMediaMetadata)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

