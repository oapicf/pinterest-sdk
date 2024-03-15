
package org.openapitools.client.model

import java.time.OffsetDateTime

case class Board (
    _id: Option[String],
    /* Date and time of board creation. */
    _createdAt: Option[OffsetDateTime],
    /* Date and time of last board pins modified. */
    _boardPinsModifiedAt: Option[OffsetDateTime],
    _name: String,
    _description: Option[String],
    /* Count of collaborators on the board. */
    _collaboratorCount: Option[Integer],
    /* Count of pins on the board. */
    _pinCount: Option[Integer],
    /* Board follower count. */
    _followerCount: Option[Integer],
    _media: Option[BoardMedia],
    _owner: Option[BoardOwner],
    /* Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a> */
    _privacy: Option[String]
)
object Board {
    def toStringBody(var_id: Object, var_createdAt: Object, var_boardPinsModifiedAt: Object, var_name: Object, var_description: Object, var_collaboratorCount: Object, var_pinCount: Object, var_followerCount: Object, var_media: Object, var_owner: Object, var_privacy: Object) =
        s"""
        | {
        | "id":$var_id,"createdAt":$var_createdAt,"boardPinsModifiedAt":$var_boardPinsModifiedAt,"name":$var_name,"description":$var_description,"collaboratorCount":$var_collaboratorCount,"pinCount":$var_pinCount,"followerCount":$var_followerCount,"media":$var_media,"owner":$var_owner,"privacy":$var_privacy
        | }
        """.stripMargin
}
