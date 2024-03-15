package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Board
  * @param createdAt Date and time of board creation.
  * @param boardPinsModifiedAt Date and time of last board pins modified.
  * @param collaboratorCount Count of collaborators on the board.
  * @param pinCount Count of pins on the board.
  * @param followerCount Board follower count.
  * @param privacy Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a>
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class Board(
  id: Option[String],
  createdAt: Option[OffsetDateTime],
  boardPinsModifiedAt: Option[OffsetDateTime],
  name: String,
  description: Option[String],
  collaboratorCount: Option[Int],
  pinCount: Option[Int],
  followerCount: Option[Int],
  media: Option[BoardMedia],
  owner: Option[BoardOwner],
  privacy: Option[Board.Privacy.Value]
)

object Board {
  implicit lazy val boardJsonFormat: Format[Board] = Json.format[Board]

  // noinspection TypeAnnotation
  object Privacy extends Enumeration {
    val PUBLIC = Value("PUBLIC")
    val PROTECTED = Value("PROTECTED")
    val SECRET = Value("SECRET")

    type Privacy = Value
    implicit lazy val PrivacyJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

