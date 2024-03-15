package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceUpdateOperationType._

case class AudienceUpdateOperationType (
  
object AudienceUpdateOperationType {
  import DateTimeCodecs._

  implicit val AudienceUpdateOperationTypeCodecJson: CodecJson[AudienceUpdateOperationType] = CodecJson.derive[AudienceUpdateOperationType]
  implicit val AudienceUpdateOperationTypeDecoder: EntityDecoder[AudienceUpdateOperationType] = jsonOf[AudienceUpdateOperationType]
  implicit val AudienceUpdateOperationTypeEncoder: EntityEncoder[AudienceUpdateOperationType] = jsonEncoderOf[AudienceUpdateOperationType]
}
