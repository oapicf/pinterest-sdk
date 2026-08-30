package model

import play.api.libs.json._

/**
  * Pin media that can be an image, video, or a mix of both.
  * @param duration Duration (in miliseconds). Field maybe null after creation due to video processing time.
  * @param height Height (in pixels). Field maybe null after creation due to video processing time.
  * @param videoUrl Video url (720p).  **Note:** This field is limited and not available to all apps.
  * @param videoUrlHls Video url (HLS).  **Note:** This field is limited and not available to all apps.
  * @param width Width (in pixels). Field maybe null after creation due to video processing time.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PinMedia(
  images: Option[ImageSize],
  mediaType: PinMedia.MediaType.Value,
  coverImageUrl: Option[String],
  duration: Option[BigDecimal],
  height: Option[Int],
  videoUrl: Option[String],
  videoUrlHls: Option[String],
  width: Option[Int],
  items: Option[List[PinMediaMetadata]]
  additionalProperties: 
)

object PinMedia {
  implicit lazy val pinMediaJsonFormat: Format[PinMedia] = {
    val realJsonFormat = Json.format[PinMedia]
    val declaredPropNames = Set("images", "mediaType", "coverImageUrl", "duration", "height", "videoUrl", "videoUrlHls", "width", "items")
    
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
      Writes { pinMedia =>
        val jsObj = realJsonFormat.writes(pinMedia)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object MediaType extends Enumeration {
    val MultipleMixed = Value("multiple_mixed")

    type MediaType = Value
    implicit lazy val MediaTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

