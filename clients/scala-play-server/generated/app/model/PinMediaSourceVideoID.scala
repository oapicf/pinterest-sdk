package model

import play.api.libs.json._

/**
  * Video ID-based media source
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class PinMediaSourceVideoID(
  sourceType: PinMediaSourceVideoID.SourceType.Value,
  coverImageUrl: String,
  mediaId: String
  additionalProperties: 
)

object PinMediaSourceVideoID {
  implicit lazy val pinMediaSourceVideoIDJsonFormat: Format[PinMediaSourceVideoID] = {
    val realJsonFormat = Json.format[PinMediaSourceVideoID]
    val declaredPropNames = Set("sourceType", "coverImageUrl", "mediaId")
    
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
      Writes { pinMediaSourceVideoID =>
        val jsObj = realJsonFormat.writes(pinMediaSourceVideoID)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object SourceType extends Enumeration {
    val VideoId = Value("video_id")

    type SourceType = Value
    implicit lazy val SourceTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

