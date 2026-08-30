package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdAccountToBusinessSharedAudience._

case class AdAccountToBusinessSharedAudience (
  /* Unique identifier of an audience */
  audienceId: String,
/* Permissions granted to the recipients. */
  permissions: Option[List[Role]],
/* Business IDs to share with or revoke from (request) / that received the audience (response). */
  recipientBusinessIds: List[String])

object AdAccountToBusinessSharedAudience {
  import DateTimeCodecs._

  implicit val AdAccountToBusinessSharedAudienceCodecJson: CodecJson[AdAccountToBusinessSharedAudience] = CodecJson.derive[AdAccountToBusinessSharedAudience]
  implicit val AdAccountToBusinessSharedAudienceDecoder: EntityDecoder[AdAccountToBusinessSharedAudience] = jsonOf[AdAccountToBusinessSharedAudience]
  implicit val AdAccountToBusinessSharedAudienceEncoder: EntityEncoder[AdAccountToBusinessSharedAudience] = jsonEncoderOf[AdAccountToBusinessSharedAudience]
}
