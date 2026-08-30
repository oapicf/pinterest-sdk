package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessToAdAccountSharedAudience._

case class BusinessToAdAccountSharedAudience (
  /* Unique identifier of an audience */
  audienceId: String,
/* Permissions granted to the recipients. */
  permissions: Option[List[Role]],
/* Ad account IDs to share with or revoke from (request) / that received the audience (response). */
  recipientAccountIds: List[String])

object BusinessToAdAccountSharedAudience {
  import DateTimeCodecs._

  implicit val BusinessToAdAccountSharedAudienceCodecJson: CodecJson[BusinessToAdAccountSharedAudience] = CodecJson.derive[BusinessToAdAccountSharedAudience]
  implicit val BusinessToAdAccountSharedAudienceDecoder: EntityDecoder[BusinessToAdAccountSharedAudience] = jsonOf[BusinessToAdAccountSharedAudience]
  implicit val BusinessToAdAccountSharedAudienceEncoder: EntityEncoder[BusinessToAdAccountSharedAudience] = jsonEncoderOf[BusinessToAdAccountSharedAudience]
}
