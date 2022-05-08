package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Pin
  * @param boardId The board to which this Pin belongs.
  * @param boardSectionId The board section to which this Pin belongs.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class Pin(
  id: Option[String],
  createdAt: Option[OffsetDateTime],
  link: Option[String],
  title: Option[String],
  description: Option[String],
  altText: Option[String],
  boardId: Option[String],
  boardSectionId: Option[String],
  boardOwner: Option[BoardOwner],
  media: Option[PinMedia],
  mediaSource: Option[PinMediaSource],
  additionalProperties: 
)

object Pin {
  implicit lazy val pinJsonFormat: Format[Pin] = {
    val realJsonFormat = Json.format[Pin]
    val declaredPropNames = Set("id", "createdAt", "link", "title", "description", "altText", "boardId", "boardSectionId", "boardOwner", "media", "mediaSource")
    
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
      Writes { pin =>
        val jsObj = realJsonFormat.writes(pin)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

