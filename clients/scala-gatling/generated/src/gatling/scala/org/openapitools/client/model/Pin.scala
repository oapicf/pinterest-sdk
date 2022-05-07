
package org.openapitools.client.model

import java.time.OffsetDateTime

case class Pin (
    _id: Option[String],
    _createdAt: Option[OffsetDateTime],
    _link: Option[String],
    _title: Option[String],
    _description: Option[String],
    _altText: Option[String],
    /* The board to which this Pin belongs. */
    _boardId: Option[String],
    /* The board section to which this Pin belongs. */
    _boardSectionId: Option[String],
    _boardOwner: Option[BoardOwner],
    _media: Option[PinMedia],
    _mediaSource: Option[PinMediaSource]
)
object Pin {
    def toStringBody(var_id: Object, var_createdAt: Object, var_link: Object, var_title: Object, var_description: Object, var_altText: Object, var_boardId: Object, var_boardSectionId: Object, var_boardOwner: Object, var_media: Object, var_mediaSource: Object) =
        s"""
        | {
        | "id":$var_id,"createdAt":$var_createdAt,"link":$var_link,"title":$var_title,"description":$var_description,"altText":$var_altText,"boardId":$var_boardId,"boardSectionId":$var_boardSectionId,"boardOwner":$var_boardOwner,"media":$var_media,"mediaSource":$var_mediaSource
        | }
        """.stripMargin
}
