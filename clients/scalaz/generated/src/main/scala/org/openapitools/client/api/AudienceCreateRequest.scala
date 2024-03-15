package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceCreateRequest._

case class AudienceCreateRequest (
  /* Ad account ID. */
  adAccountId: Option[String],
/* Audience name. */
  name: String,
rule: AudienceRule,
/* Audience description. */
  description: Option[String],
audienceType: AudienceCreateRequest1AudienceType)

object AudienceCreateRequest {
  import DateTimeCodecs._

  implicit val AudienceCreateRequestCodecJson: CodecJson[AudienceCreateRequest] = CodecJson.derive[AudienceCreateRequest]
  implicit val AudienceCreateRequestDecoder: EntityDecoder[AudienceCreateRequest] = jsonOf[AudienceCreateRequest]
  implicit val AudienceCreateRequestEncoder: EntityEncoder[AudienceCreateRequest] = jsonEncoderOf[AudienceCreateRequest]
}
