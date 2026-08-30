package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for Pin.
  * @param aiDisclosures AI disclosure declarations the creator has made about this Pin.
  * @param boardId The board to which this Pin belongs.
  * @param boardSectionId The board section to which this Pin belongs.
  * @param dominantColor Dominant pin color. Hex number, e.g. `#6E7874`.
  * @param hasBeenPromoted Whether the Pin has been promoted or not.
  * @param isOwner Whether the \"operation user_account\" is the Pin owner.
  * @param isProduct Whether the Pin is a product Pin.
  * @param isStandard Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information.
  * @param parentPinId The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
  * @param pinMetrics Pin metrics with associated time intervals if any.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class Pin(
  aiDisclosures: Option[AiDisclosures],
  boardId: Option[String],
  boardOwner: Option[BoardOwner],
  boardSectionId: Option[String],
  createdAt: Option[OffsetDateTime],
  creativeType: Option[CreativeType],
  dominantColor: Option[String],
  hasBeenPromoted: Option[Boolean],
  id: String,
  isOwner: Option[Boolean],
  isProduct: Option[Boolean],
  isStandard: Option[Boolean],
  media: Option[PinMedia],
  parentPinId: Option[String],
  pinMetrics: Option[JsObject],
  altText: Option[String],
  description: Option[String],
  link: Option[String],
  title: Option[String]
  additionalProperties: 
)

object Pin {
  implicit lazy val pinJsonFormat: Format[Pin] = {
    val realJsonFormat = Json.format[Pin]
    val declaredPropNames = Set("aiDisclosures", "boardId", "boardOwner", "boardSectionId", "createdAt", "creativeType", "dominantColor", "hasBeenPromoted", "id", "isOwner", "isProduct", "isStandard", "media", "parentPinId", "pinMetrics", "altText", "description", "link", "title")
    
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

