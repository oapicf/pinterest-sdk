package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessToAdAccountSharedAudienceUpdateWithRequiredBody._

case class BusinessToAdAccountSharedAudienceUpdateWithRequiredBody (
  /* Unique identifier of an audience */
  audienceId: String,
operationType: OperationType,
/* Ad account IDs to share with or revoke from (request) / that received the audience (response). */
  recipientAccountIds: List[String])

object BusinessToAdAccountSharedAudienceUpdateWithRequiredBody {
  import DateTimeCodecs._

  implicit val BusinessToAdAccountSharedAudienceUpdateWithRequiredBodyCodecJson: CodecJson[BusinessToAdAccountSharedAudienceUpdateWithRequiredBody] = CodecJson.derive[BusinessToAdAccountSharedAudienceUpdateWithRequiredBody]
  implicit val BusinessToAdAccountSharedAudienceUpdateWithRequiredBodyDecoder: EntityDecoder[BusinessToAdAccountSharedAudienceUpdateWithRequiredBody] = jsonOf[BusinessToAdAccountSharedAudienceUpdateWithRequiredBody]
  implicit val BusinessToAdAccountSharedAudienceUpdateWithRequiredBodyEncoder: EntityEncoder[BusinessToAdAccountSharedAudienceUpdateWithRequiredBody] = jsonEncoderOf[BusinessToAdAccountSharedAudienceUpdateWithRequiredBody]
}
