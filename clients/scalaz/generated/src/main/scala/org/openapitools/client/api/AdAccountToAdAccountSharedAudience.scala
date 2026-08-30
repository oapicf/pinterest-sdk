package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdAccountToAdAccountSharedAudience._

case class AdAccountToAdAccountSharedAudience (
  /* Unique identifier of an audience */
  audienceId: String,
/* Permissions granted to the recipients. */
  permissions: Option[List[Role]],
/* Ad account IDs to share with or revoke from (request) / that received the audience (response). */
  recipientAccountIds: List[String])

object AdAccountToAdAccountSharedAudience {
  import DateTimeCodecs._

  implicit val AdAccountToAdAccountSharedAudienceCodecJson: CodecJson[AdAccountToAdAccountSharedAudience] = CodecJson.derive[AdAccountToAdAccountSharedAudience]
  implicit val AdAccountToAdAccountSharedAudienceDecoder: EntityDecoder[AdAccountToAdAccountSharedAudience] = jsonOf[AdAccountToAdAccountSharedAudience]
  implicit val AdAccountToAdAccountSharedAudienceEncoder: EntityEncoder[AdAccountToAdAccountSharedAudience] = jsonEncoderOf[AdAccountToAdAccountSharedAudience]
}
