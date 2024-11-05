
package org.openapitools.client.model

import java.time.OffsetDateTime

case class Pin (
    _id: Option[String],
    _createdAt: Option[OffsetDateTime],
    _link: Option[String],
    _title: Option[String],
    _description: Option[String],
    /* Dominant pin color. Hex number, e.g. \\\"#6E7874\\\". */
    _dominantColor: Option[String],
    _altText: Option[String],
    _creativeType: Option[CreativeType],
    /* The board to which this Pin belongs. */
    _boardId: Option[String],
    /* The board section to which this Pin belongs. */
    _boardSectionId: Option[String],
    _boardOwner: Option[BoardOwner],
    /* Whether the \"operation user_account\" is the Pin owner. */
    _isOwner: Option[Boolean],
    _media: Option[PinMedia],
    _mediaSource: Option[PinMediaSource],
    /* The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>. */
    _parentPinId: Option[String],
    /* Whether the Pin is standard or not. See documentation on <a href=\"/docs/api-features/content-overview/\">Changes to Pin creation</a> for more information. */
    _isStandard: Option[Boolean],
    /* Whether the Pin has been promoted or not. */
    _hasBeenPromoted: Option[Boolean],
    /* Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>. */
    _note: Option[String],
    /* Pin metrics with associated time intervals if any. */
    _pinMetrics: Option[Any]
)
object Pin {
    def toStringBody(var_id: Object, var_createdAt: Object, var_link: Object, var_title: Object, var_description: Object, var_dominantColor: Object, var_altText: Object, var_creativeType: Object, var_boardId: Object, var_boardSectionId: Object, var_boardOwner: Object, var_isOwner: Object, var_media: Object, var_mediaSource: Object, var_parentPinId: Object, var_isStandard: Object, var_hasBeenPromoted: Object, var_note: Object, var_pinMetrics: Object) =
        s"""
        | {
        | "id":$var_id,"createdAt":$var_createdAt,"link":$var_link,"title":$var_title,"description":$var_description,"dominantColor":$var_dominantColor,"altText":$var_altText,"creativeType":$var_creativeType,"boardId":$var_boardId,"boardSectionId":$var_boardSectionId,"boardOwner":$var_boardOwner,"isOwner":$var_isOwner,"media":$var_media,"mediaSource":$var_mediaSource,"parentPinId":$var_parentPinId,"isStandard":$var_isStandard,"hasBeenPromoted":$var_hasBeenPromoted,"note":$var_note,"pinMetrics":$var_pinMetrics
        | }
        """.stripMargin
}
