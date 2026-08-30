package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BoardCreate._

case class BoardCreate (
  description: Option[String],
/* If set to `true`, the board will be ad-only and can store ad-only Pins. */
  isAdsOnly: Option[Boolean],
/*     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\". */
  name: String,
/*     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the `privacy` settng automatically becomes `PROTECTED`.  */
  privacy: Option[BoardPrivacy])

object BoardCreate {
  import DateTimeCodecs._

  implicit val BoardCreateCodecJson: CodecJson[BoardCreate] = CodecJson.derive[BoardCreate]
  implicit val BoardCreateDecoder: EntityDecoder[BoardCreate] = jsonOf[BoardCreate]
  implicit val BoardCreateEncoder: EntityEncoder[BoardCreate] = jsonEncoderOf[BoardCreate]
}
