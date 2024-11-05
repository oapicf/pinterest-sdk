package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessSharedAudience._

case class BusinessSharedAudience (
  /* Unique identifier of an audience */
  audienceId: String,
operationType: OperationType,
/* List of business IDs to share with or revoke from. */
  recipientBusinessIds: List[String])

object BusinessSharedAudience {
  import DateTimeCodecs._

  implicit val BusinessSharedAudienceCodecJson: CodecJson[BusinessSharedAudience] = CodecJson.derive[BusinessSharedAudience]
  implicit val BusinessSharedAudienceDecoder: EntityDecoder[BusinessSharedAudience] = jsonOf[BusinessSharedAudience]
  implicit val BusinessSharedAudienceEncoder: EntityEncoder[BusinessSharedAudience] = jsonEncoderOf[BusinessSharedAudience]
}
