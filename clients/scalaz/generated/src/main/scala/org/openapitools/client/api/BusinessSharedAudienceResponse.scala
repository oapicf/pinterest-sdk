package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessSharedAudienceResponse._

case class BusinessSharedAudienceResponse (
  /* Audience ID that was shared */
  audienceId: Option[String],
permissions: Option[List[Role]],
/* Business IDs that received the audience */
  recipientBusinessIds: Option[List[String]])

object BusinessSharedAudienceResponse {
  import DateTimeCodecs._

  implicit val BusinessSharedAudienceResponseCodecJson: CodecJson[BusinessSharedAudienceResponse] = CodecJson.derive[BusinessSharedAudienceResponse]
  implicit val BusinessSharedAudienceResponseDecoder: EntityDecoder[BusinessSharedAudienceResponse] = jsonOf[BusinessSharedAudienceResponse]
  implicit val BusinessSharedAudienceResponseEncoder: EntityEncoder[BusinessSharedAudienceResponse] = jsonEncoderOf[BusinessSharedAudienceResponse]
}
