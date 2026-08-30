package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AppsflyerAudience._

case class AppsflyerAudience (
  /* The ID of the audience container */
  containerId: String,
/* The name of the audience */
  name: String,
/* The platform of the audience */
  platform: AppsflyerPlatform)

object AppsflyerAudience {
  import DateTimeCodecs._

  implicit val AppsflyerAudienceCodecJson: CodecJson[AppsflyerAudience] = CodecJson.derive[AppsflyerAudience]
  implicit val AppsflyerAudienceDecoder: EntityDecoder[AppsflyerAudience] = jsonOf[AppsflyerAudience]
  implicit val AppsflyerAudienceEncoder: EntityEncoder[AppsflyerAudience] = jsonEncoderOf[AppsflyerAudience]
}
