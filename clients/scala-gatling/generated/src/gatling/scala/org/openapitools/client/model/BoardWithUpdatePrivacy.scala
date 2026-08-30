
package org.openapitools.client.model

import java.time.OffsetDateTime

case class BoardWithUpdatePrivacy (
    /* Date and time of last board pins modified. */
    _boardPinsModifiedAt: Option[OffsetDateTime],
    /* Count of collaborators on the board. */
    _collaboratorCount: Option[Integer],
    /* Date and time of board creation. */
    _createdAt: Option[OffsetDateTime],
    _description: Option[String],
    /* Board follower count. */
    _followerCount: Option[Integer],
    _id: String,
    /* If set to `true`, the board will be ad-only and can store ad-only Pins. */
    _isAdsOnly: Option[Boolean],
    /* Board media. */
    _media: Option[BoardMedia],
    /*     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\". */
    _name: String,
    _owner: Option[BoardOwner],
    /* Count of Pins on the board. */
    _pinCount: Option[Integer],
    _privacy: Option[BoardUpdatePrivacy]
)
object BoardWithUpdatePrivacy {
    def toStringBody(var_boardPinsModifiedAt: Object, var_collaboratorCount: Object, var_createdAt: Object, var_description: Object, var_followerCount: Object, var_id: Object, var_isAdsOnly: Object, var_media: Object, var_name: Object, var_owner: Object, var_pinCount: Object, var_privacy: Object) =
        s"""
        | {
        | "boardPinsModifiedAt":$var_boardPinsModifiedAt,"collaboratorCount":$var_collaboratorCount,"createdAt":$var_createdAt,"description":$var_description,"followerCount":$var_followerCount,"id":$var_id,"isAdsOnly":$var_isAdsOnly,"media":$var_media,"name":$var_name,"owner":$var_owner,"pinCount":$var_pinCount,"privacy":$var_privacy
        | }
        """.stripMargin
}
