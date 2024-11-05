package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SharedAudienceResponse._

case class SharedAudienceResponse (
  /* Audience ID that was shared */
  audienceId: Option[String],
permissions: Option[List[Role]],
/* Account IDs that received the audience */
  recipientAccountIds: Option[List[String]])

object SharedAudienceResponse {
  import DateTimeCodecs._

  implicit val SharedAudienceResponseCodecJson: CodecJson[SharedAudienceResponse] = CodecJson.derive[SharedAudienceResponse]
  implicit val SharedAudienceResponseDecoder: EntityDecoder[SharedAudienceResponse] = jsonOf[SharedAudienceResponse]
  implicit val SharedAudienceResponseEncoder: EntityEncoder[SharedAudienceResponse] = jsonEncoderOf[SharedAudienceResponse]
}
