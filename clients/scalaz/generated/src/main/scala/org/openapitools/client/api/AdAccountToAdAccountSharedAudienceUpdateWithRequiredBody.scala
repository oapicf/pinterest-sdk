package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody._

case class AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody (
  /* Unique identifier of an audience */
  audienceId: String,
operationType: OperationType,
/* Ad account IDs to share with or revoke from (request) / that received the audience (response). */
  recipientAccountIds: List[String])

object AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody {
  import DateTimeCodecs._

  implicit val AdAccountToAdAccountSharedAudienceUpdateWithRequiredBodyCodecJson: CodecJson[AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody] = CodecJson.derive[AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody]
  implicit val AdAccountToAdAccountSharedAudienceUpdateWithRequiredBodyDecoder: EntityDecoder[AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody] = jsonOf[AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody]
  implicit val AdAccountToAdAccountSharedAudienceUpdateWithRequiredBodyEncoder: EntityEncoder[AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody] = jsonEncoderOf[AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody]
}
