package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdAccountToBusinessSharedAudienceUpdateWithRequiredBody._

case class AdAccountToBusinessSharedAudienceUpdateWithRequiredBody (
  /* Unique identifier of an audience */
  audienceId: String,
operationType: OperationType,
/* Business IDs to share with or revoke from (request) / that received the audience (response). */
  recipientBusinessIds: List[String])

object AdAccountToBusinessSharedAudienceUpdateWithRequiredBody {
  import DateTimeCodecs._

  implicit val AdAccountToBusinessSharedAudienceUpdateWithRequiredBodyCodecJson: CodecJson[AdAccountToBusinessSharedAudienceUpdateWithRequiredBody] = CodecJson.derive[AdAccountToBusinessSharedAudienceUpdateWithRequiredBody]
  implicit val AdAccountToBusinessSharedAudienceUpdateWithRequiredBodyDecoder: EntityDecoder[AdAccountToBusinessSharedAudienceUpdateWithRequiredBody] = jsonOf[AdAccountToBusinessSharedAudienceUpdateWithRequiredBody]
  implicit val AdAccountToBusinessSharedAudienceUpdateWithRequiredBodyEncoder: EntityEncoder[AdAccountToBusinessSharedAudienceUpdateWithRequiredBody] = jsonEncoderOf[AdAccountToBusinessSharedAudienceUpdateWithRequiredBody]
}
