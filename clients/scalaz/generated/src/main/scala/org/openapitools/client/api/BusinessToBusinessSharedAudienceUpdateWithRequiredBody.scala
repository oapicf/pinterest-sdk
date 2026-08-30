package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessToBusinessSharedAudienceUpdateWithRequiredBody._

case class BusinessToBusinessSharedAudienceUpdateWithRequiredBody (
  /* Unique identifier of an audience */
  audienceId: String,
operationType: OperationType,
/* Business IDs to share with or revoke from (request) / that received the audience (response). */
  recipientBusinessIds: List[String])

object BusinessToBusinessSharedAudienceUpdateWithRequiredBody {
  import DateTimeCodecs._

  implicit val BusinessToBusinessSharedAudienceUpdateWithRequiredBodyCodecJson: CodecJson[BusinessToBusinessSharedAudienceUpdateWithRequiredBody] = CodecJson.derive[BusinessToBusinessSharedAudienceUpdateWithRequiredBody]
  implicit val BusinessToBusinessSharedAudienceUpdateWithRequiredBodyDecoder: EntityDecoder[BusinessToBusinessSharedAudienceUpdateWithRequiredBody] = jsonOf[BusinessToBusinessSharedAudienceUpdateWithRequiredBody]
  implicit val BusinessToBusinessSharedAudienceUpdateWithRequiredBodyEncoder: EntityEncoder[BusinessToBusinessSharedAudienceUpdateWithRequiredBody] = jsonEncoderOf[BusinessToBusinessSharedAudienceUpdateWithRequiredBody]
}
