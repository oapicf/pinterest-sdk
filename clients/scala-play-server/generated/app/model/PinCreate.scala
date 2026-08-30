package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param aiDisclosures AI disclosure declarations the creator has made about this Pin.
  * @param boardId The board to which this Pin belongs.
  * @param boardSectionId The board section to which this Pin belongs.
  * @param dominantColor Dominant pin color. Hex number, e.g. `#6E7874`.
  * @param parentPinId The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest).
  * @param sponsorId The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PinCreate(
  aiDisclosures: Option[AiDisclosures],
  altText: Option[String],
  boardId: Option[String],
  boardSectionId: Option[String],
  description: Option[String],
  dominantColor: Option[String],
  link: Option[String],
  mediaSource: Option[PinMediaSource],
  parentPinId: Option[String],
  sponsorId: Option[String],
  title: Option[String]
)

object PinCreate {
  implicit lazy val pinCreateJsonFormat: Format[PinCreate] = Json.format[PinCreate]
}

