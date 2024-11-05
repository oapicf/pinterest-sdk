package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SharedAudience._

case class SharedAudience (
  /* Unique identifier of an audience */
  audienceId: String,
operationType: OperationType,
/* List of ad account IDs to share with or revoke from. */
  recipientAccountIds: List[String])

object SharedAudience {
  import DateTimeCodecs._

  implicit val SharedAudienceCodecJson: CodecJson[SharedAudience] = CodecJson.derive[SharedAudience]
  implicit val SharedAudienceDecoder: EntityDecoder[SharedAudience] = jsonOf[SharedAudience]
  implicit val SharedAudienceEncoder: EntityEncoder[SharedAudience] = jsonEncoderOf[SharedAudience]
}
