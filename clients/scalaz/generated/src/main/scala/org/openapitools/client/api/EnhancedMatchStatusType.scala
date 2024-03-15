package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EnhancedMatchStatusType._

case class EnhancedMatchStatusType (
  
object EnhancedMatchStatusType {
  import DateTimeCodecs._

  implicit val EnhancedMatchStatusTypeCodecJson: CodecJson[EnhancedMatchStatusType] = CodecJson.derive[EnhancedMatchStatusType]
  implicit val EnhancedMatchStatusTypeDecoder: EntityDecoder[EnhancedMatchStatusType] = jsonOf[EnhancedMatchStatusType]
  implicit val EnhancedMatchStatusTypeEncoder: EntityEncoder[EnhancedMatchStatusType] = jsonEncoderOf[EnhancedMatchStatusType]
}
