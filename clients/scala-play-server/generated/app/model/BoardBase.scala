package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for BoardBase.
  * @param boardPinsModifiedAt Date and time of last board pins modified.
  * @param collaboratorCount Count of collaborators on the board.
  * @param createdAt Date and time of board creation.
  * @param followerCount Board follower count.
  * @param isAdsOnly If set to `true`, the board will be ad-only and can store ad-only Pins.
  * @param media Board media.
  * @param name     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
  * @param pinCount Count of Pins on the board.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BoardBase(
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
  pinCount: Option[Int]
)

object BoardBase {
  implicit lazy val boardBaseJsonFormat: Format[BoardBase] = Json.format[BoardBase]
}

