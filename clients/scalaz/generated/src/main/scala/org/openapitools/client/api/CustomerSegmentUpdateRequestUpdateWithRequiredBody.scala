package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomerSegmentUpdateRequestUpdateWithRequiredBody._

case class CustomerSegmentUpdateRequestUpdateWithRequiredBody (
  /* Audience IDs to update the customer segment to. Only applicable for UPDATE operations. */
  audienceIds: Option[List[String]],
/* Customer segment ID. */
  id: String,
operationType: AudienceUpdateOperationType)

object CustomerSegmentUpdateRequestUpdateWithRequiredBody {
  import DateTimeCodecs._

  implicit val CustomerSegmentUpdateRequestUpdateWithRequiredBodyCodecJson: CodecJson[CustomerSegmentUpdateRequestUpdateWithRequiredBody] = CodecJson.derive[CustomerSegmentUpdateRequestUpdateWithRequiredBody]
  implicit val CustomerSegmentUpdateRequestUpdateWithRequiredBodyDecoder: EntityDecoder[CustomerSegmentUpdateRequestUpdateWithRequiredBody] = jsonOf[CustomerSegmentUpdateRequestUpdateWithRequiredBody]
  implicit val CustomerSegmentUpdateRequestUpdateWithRequiredBodyEncoder: EntityEncoder[CustomerSegmentUpdateRequestUpdateWithRequiredBody] = jsonEncoderOf[CustomerSegmentUpdateRequestUpdateWithRequiredBody]
}
