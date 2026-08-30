package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceOwnershipType._

case class AudienceOwnershipType (
  
object AudienceOwnershipType {
  import DateTimeCodecs._

  implicit val AudienceOwnershipTypeCodecJson: CodecJson[AudienceOwnershipType] = CodecJson.derive[AudienceOwnershipType]
  implicit val AudienceOwnershipTypeDecoder: EntityDecoder[AudienceOwnershipType] = jsonOf[AudienceOwnershipType]
  implicit val AudienceOwnershipTypeEncoder: EntityEncoder[AudienceOwnershipType] = jsonEncoderOf[AudienceOwnershipType]
}
