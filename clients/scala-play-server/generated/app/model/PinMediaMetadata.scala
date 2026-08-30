package model

import play.api.libs.json._

/**
  * Per-item entry inside `PinMedia.items` for mixed image/video pins. Discriminated by `item_type`.
  * @param itemType Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.
  * @param duration Duration (in miliseconds). Field maybe null after creation due to video processing time.
  * @param height Height (in pixels). Field maybe null after creation due to video processing time.
  * @param videoUrl Video url (720p).  **Note:** This field is limited and not available to all apps.
  * @param videoUrlHls Video url (HLS).  **Note:** This field is limited and not available to all apps.
  * @param width Width (in pixels). Field maybe null after creation due to video processing time.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PinMediaMetadata(
  description: Option[String],
  images: Option[ImageSize],
  itemType: PinMediaMetadata.ItemType.Value,
  link: Option[String],
  title: Option[String],
  coverImageUrl: Option[String],
  duration: Option[BigDecimal],
  height: Option[Int],
  videoUrl: Option[String],
  videoUrlHls: Option[String],
  width: Option[Int]
  additionalProperties: 
)

object PinMediaMetadata {
  implicit lazy val pinMediaMetadataJsonFormat: Format[PinMediaMetadata] = {
    val realJsonFormat = Json.format[PinMediaMetadata]
    val declaredPropNames = Set("description", "images", "itemType", "link", "title", "coverImageUrl", "duration", "height", "videoUrl", "videoUrlHls", "width")
    
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

  // noinspection TypeAnnotation
  object ItemType extends Enumeration {
    val Video = Value("video")

    type ItemType = Value
    implicit lazy val ItemTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

