package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for Board.
  * @param boardPinsModifiedAt Date and time of last board pins modified.
  * @param collaboratorCount Count of collaborators on the board.
  * @param createdAt Date and time of board creation.
  * @param followerCount Board follower count.
  * @param isAdsOnly If set to `true`, the board will be ad-only and can store ad-only Pins.
  * @param media Board media.
  * @param name      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
  * @param pinCount Count of Pins on the board.
  * @param privacy     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`. 
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class Board(
  boardPinsModifiedAt: Option[OffsetDateTime],
  collaboratorCount: Option[Int],
  createdAt: Option[OffsetDateTime],
  description: Option[String],
  followerCount: Option[Int],
  id: String,
  isAdsOnly: Option[Boolean],
  media: Option[BoardMedia],
  name: String,
  owner: Option[BoardOwner],
  pinCount: Option[Int],
  privacy: Option[BoardPrivacy]
  additionalProperties: 
)

object Board {
  implicit lazy val boardJsonFormat: Format[Board] = {
    val realJsonFormat = Json.format[Board]
    val declaredPropNames = Set("boardPinsModifiedAt", "collaboratorCount", "createdAt", "description", "followerCount", "id", "isAdsOnly", "media", "name", "owner", "pinCount", "privacy")
    
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
      Writes { board =>
        val jsObj = realJsonFormat.writes(board)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

