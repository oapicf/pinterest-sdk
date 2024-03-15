package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceDataParty._

case class AudienceDataParty (
  
object AudienceDataParty {
  import DateTimeCodecs._

  implicit val AudienceDataPartyCodecJson: CodecJson[AudienceDataParty] = CodecJson.derive[AudienceDataParty]
  implicit val AudienceDataPartyDecoder: EntityDecoder[AudienceDataParty] = jsonOf[AudienceDataParty]
  implicit val AudienceDataPartyEncoder: EntityEncoder[AudienceDataParty] = jsonEncoderOf[AudienceDataParty]
}
