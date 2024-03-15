package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceUpdateRequest._

case class AudienceUpdateRequest (
  /* Ad account ID. */
  adAccountId: Option[String],
/* Audience name. */
  name: Option[String],
rule: Option[AudienceRule],
/* Audience description. */
  description: Option[String],
operationType: Option[AudienceUpdateOperationType])

object AudienceUpdateRequest {
  import DateTimeCodecs._

  implicit val AudienceUpdateRequestCodecJson: CodecJson[AudienceUpdateRequest] = CodecJson.derive[AudienceUpdateRequest]
  implicit val AudienceUpdateRequestDecoder: EntityDecoder[AudienceUpdateRequest] = jsonOf[AudienceUpdateRequest]
  implicit val AudienceUpdateRequestEncoder: EntityEncoder[AudienceUpdateRequest] = jsonEncoderOf[AudienceUpdateRequest]
}
