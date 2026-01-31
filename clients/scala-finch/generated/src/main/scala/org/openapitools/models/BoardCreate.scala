package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BoardPrivacy

/**
 * Resource create operation model.
 * @param description 
 * @param isUnderscoreadsUnderscoreonly If set to `true`, the board will be ad-only and can store ad-only Pins.
 * @param name      Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\".
 * @param privacy     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`. 
 */
case class BoardCreate(description: Option[String],
                isUnderscoreadsUnderscoreonly: Option[Boolean],
                name: String,
                privacy: Option[BoardPrivacy]
                )

object BoardCreate {
    /**
     * Creates the codec for converting BoardCreate from and to JSON.
     */
    implicit val decoder: Decoder[BoardCreate] = deriveDecoder
    implicit val encoder: ObjectEncoder[BoardCreate] = deriveEncoder
}
