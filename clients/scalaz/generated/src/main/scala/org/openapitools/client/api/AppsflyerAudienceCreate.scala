package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AppsflyerAudienceCreate._

case class AppsflyerAudienceCreate (
  /* The name of the audience */
  name: String,
/* The platform of the audience */
  platform: AppsflyerPlatform)

object AppsflyerAudienceCreate {
  import DateTimeCodecs._

  implicit val AppsflyerAudienceCreateCodecJson: CodecJson[AppsflyerAudienceCreate] = CodecJson.derive[AppsflyerAudienceCreate]
  implicit val AppsflyerAudienceCreateDecoder: EntityDecoder[AppsflyerAudienceCreate] = jsonOf[AppsflyerAudienceCreate]
  implicit val AppsflyerAudienceCreateEncoder: EntityEncoder[AppsflyerAudienceCreate] = jsonEncoderOf[AppsflyerAudienceCreate]
}
