package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BoardWithUpdatePrivacyUpdate._

case class BoardWithUpdatePrivacyUpdate (
  description: Option[String],
/*     Name of the board.      **Note:** If you create an ad-only board by setting `is_ads_only`     to `true`, the board name automatically becomes \"Ad-only Pins\". */
  name: Option[String],
privacy: Option[BoardUpdatePrivacy])

object BoardWithUpdatePrivacyUpdate {
  import DateTimeCodecs._

  implicit val BoardWithUpdatePrivacyUpdateCodecJson: CodecJson[BoardWithUpdatePrivacyUpdate] = CodecJson.derive[BoardWithUpdatePrivacyUpdate]
  implicit val BoardWithUpdatePrivacyUpdateDecoder: EntityDecoder[BoardWithUpdatePrivacyUpdate] = jsonOf[BoardWithUpdatePrivacyUpdate]
  implicit val BoardWithUpdatePrivacyUpdateEncoder: EntityEncoder[BoardWithUpdatePrivacyUpdate] = jsonEncoderOf[BoardWithUpdatePrivacyUpdate]
}
