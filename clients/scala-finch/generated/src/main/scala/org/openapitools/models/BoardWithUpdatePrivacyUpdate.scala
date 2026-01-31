package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BoardUpdatePrivacy

/**
 * Resource create or update operation model.
 * @param description 
 * @param name      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
 * @param privacy 
 */
case class BoardWithUpdatePrivacyUpdate(description: Option[String],
                name: Option[String],
                privacy: Option[BoardUpdatePrivacy]
                )

object BoardWithUpdatePrivacyUpdate {
    /**
     * Creates the codec for converting BoardWithUpdatePrivacyUpdate from and to JSON.
     */
    implicit val decoder: Decoder[BoardWithUpdatePrivacyUpdate] = deriveDecoder
    implicit val encoder: ObjectEncoder[BoardWithUpdatePrivacyUpdate] = deriveEncoder
}
