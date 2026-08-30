package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for AggregatedPinComment.
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
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AggregatedPinComment(
  aiDisclosures: Option[AiDisclosures],
  altText: Option[String],
  boardId: Option[String],
  boardOwner: Option[BoardOwner],
  boardSectionId: Option[String],
  createdAt: Option[OffsetDateTime],
  creativeType: Option[CreativeType],
  description: Option[String],
  dominantColor: Option[String],
  hasBeenPromoted: Option[Boolean],
  id: String,
  isOwner: Option[Boolean],
  isProduct: Option[Boolean],
  isStandard: Option[Boolean],
  link: Option[String],
  media: Option[PinMedia],
  parentPinId: Option[String],
  pinMetrics: Option[JsObject],
  title: Option[String]
)

object AggregatedPinComment {
  implicit lazy val aggregatedPinCommentJsonFormat: Format[AggregatedPinComment] = Json.format[AggregatedPinComment]
}

