package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceCreateRequest1AudienceType._

case class AudienceCreateRequest1AudienceType (
  
object AudienceCreateRequest1AudienceType {
  import DateTimeCodecs._

  implicit val AudienceCreateRequest1AudienceTypeCodecJson: CodecJson[AudienceCreateRequest1AudienceType] = CodecJson.derive[AudienceCreateRequest1AudienceType]
  implicit val AudienceCreateRequest1AudienceTypeDecoder: EntityDecoder[AudienceCreateRequest1AudienceType] = jsonOf[AudienceCreateRequest1AudienceType]
  implicit val AudienceCreateRequest1AudienceTypeEncoder: EntityEncoder[AudienceCreateRequest1AudienceType] = jsonEncoderOf[AudienceCreateRequest1AudienceType]
}
