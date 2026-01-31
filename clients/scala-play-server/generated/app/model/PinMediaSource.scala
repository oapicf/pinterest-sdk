package model

import play.api.libs.json._

/**
  * Pin media source that can be an image, video, or a mix of both passed in as a request.
  * @param isStandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
  * @param coverImageContentType Content type for cover image Base64.
  * @param coverImageData Cover image Base64.
  * @param coverImageKeyFrameTime Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
  * @param coverImageUrl Cover image URL.
  * @param items Array with image objects.
  * @param isAffiliateLink This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PinMediaSource(
  contentType: ContentType,
  data: String,
  isStandard: Option[Boolean],
  sourceType: PinMediaSource.SourceType.Value,
  url: String,
  coverImageContentType: Option[ContentType],
  coverImageData: Option[String],
  coverImageKeyFrameTime: Option[Int],
  coverImageUrl: Option[String],
  mediaId: String,
  index: Option[Int],
  items: List[PinMediaSourceImagesURLItem],
  isAffiliateLink: Option[Boolean]
  additionalProperties: 
)

object PinMediaSource {
  implicit lazy val pinMediaSourceJsonFormat: Format[PinMediaSource] = {
    val realJsonFormat = Json.format[PinMediaSource]
    val declaredPropNames = Set("contentType", "data", "isStandard", "sourceType", "url", "coverImageContentType", "coverImageData", "coverImageKeyFrameTime", "coverImageUrl", "mediaId", "index", "items", "isAffiliateLink")
    
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
      Writes { pinMediaSource =>
        val jsObj = realJsonFormat.writes(pinMediaSource)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object SourceType extends Enumeration {
    val PinUrl = Value("pin_url")

    type SourceType = Value
    implicit lazy val SourceTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

