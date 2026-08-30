package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessToBusinessSharedAudience._

case class BusinessToBusinessSharedAudience (
  /* Unique identifier of an audience */
  audienceId: String,
/* Permissions granted to the recipients. */
  permissions: Option[List[Role]],
/* Business IDs to share with or revoke from (request) / that received the audience (response). */
  recipientBusinessIds: List[String])

object BusinessToBusinessSharedAudience {
  import DateTimeCodecs._

  implicit val BusinessToBusinessSharedAudienceCodecJson: CodecJson[BusinessToBusinessSharedAudience] = CodecJson.derive[BusinessToBusinessSharedAudience]
  implicit val BusinessToBusinessSharedAudienceDecoder: EntityDecoder[BusinessToBusinessSharedAudience] = jsonOf[BusinessToBusinessSharedAudience]
  implicit val BusinessToBusinessSharedAudienceEncoder: EntityEncoder[BusinessToBusinessSharedAudience] = jsonEncoderOf[BusinessToBusinessSharedAudience]
}
