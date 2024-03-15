package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceCreateCustomRequest._

case class AudienceCreateCustomRequest (
  /* Ad account ID. */
  adAccountId: Option[String],
/* Audience name. */
  name: String,
rule: AudienceRule,
sharingType: AudienceSharingType,
dataParty: AudienceDataParty,
category: Option[String])

object AudienceCreateCustomRequest {
  import DateTimeCodecs._

  implicit val AudienceCreateCustomRequestCodecJson: CodecJson[AudienceCreateCustomRequest] = CodecJson.derive[AudienceCreateCustomRequest]
  implicit val AudienceCreateCustomRequestDecoder: EntityDecoder[AudienceCreateCustomRequest] = jsonOf[AudienceCreateCustomRequest]
  implicit val AudienceCreateCustomRequestEncoder: EntityEncoder[AudienceCreateCustomRequest] = jsonEncoderOf[AudienceCreateCustomRequest]
}
