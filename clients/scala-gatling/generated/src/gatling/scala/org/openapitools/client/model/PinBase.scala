
package org.openapitools.client.model

import java.time.OffsetDateTime

case class PinBase (
    /* AI disclosure declarations the creator has made about this Pin. */
    _aiDisclosures: Option[AiDisclosures],
    /* The board to which this Pin belongs. */
    _boardId: Option[String],
    _boardOwner: Option[BoardOwner],
    /* The board section to which this Pin belongs. */
    _boardSectionId: Option[String],
    _createdAt: Option[OffsetDateTime],
    _creativeType: Option[CreativeType],
    /* Dominant pin color. Hex number, e.g. `#6E7874`. */
    _dominantColor: Option[String],
    /* Whether the Pin has been promoted or not. */
    _hasBeenPromoted: Option[Boolean],
    _id: String,
    /* Whether the \"operation user_account\" is the Pin owner. */
    _isOwner: Option[Boolean],
    /* Whether the Pin is a product Pin. */
    _isProduct: Option[Boolean],
    /* Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. */
    _isStandard: Option[Boolean],
    _media: Option[PinMedia],
    /* The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). */
    _parentPinId: Option[String],
    /* Pin metrics with associated time intervals if any. */
    _pinMetrics: Option[Any]
)
object PinBase {
    def toStringBody(var_aiDisclosures: Object, var_boardId: Object, var_boardOwner: Object, var_boardSectionId: Object, var_createdAt: Object, var_creativeType: Object, var_dominantColor: Object, var_hasBeenPromoted: Object, var_id: Object, var_isOwner: Object, var_isProduct: Object, var_isStandard: Object, var_media: Object, var_parentPinId: Object, var_pinMetrics: Object) =
        s"""
        | {
        | "aiDisclosures":$var_aiDisclosures,"boardId":$var_boardId,"boardOwner":$var_boardOwner,"boardSectionId":$var_boardSectionId,"createdAt":$var_createdAt,"creativeType":$var_creativeType,"dominantColor":$var_dominantColor,"hasBeenPromoted":$var_hasBeenPromoted,"id":$var_id,"isOwner":$var_isOwner,"isProduct":$var_isProduct,"isStandard":$var_isStandard,"media":$var_media,"parentPinId":$var_parentPinId,"pinMetrics":$var_pinMetrics
        | }
        """.stripMargin
}
