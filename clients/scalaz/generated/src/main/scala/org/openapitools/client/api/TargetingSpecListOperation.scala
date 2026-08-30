package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingSpecListOperation._

case class TargetingSpecListOperation (
  
object TargetingSpecListOperation {
  import DateTimeCodecs._

  implicit val TargetingSpecListOperationCodecJson: CodecJson[TargetingSpecListOperation] = CodecJson.derive[TargetingSpecListOperation]
  implicit val TargetingSpecListOperationDecoder: EntityDecoder[TargetingSpecListOperation] = jsonOf[TargetingSpecListOperation]
  implicit val TargetingSpecListOperationEncoder: EntityEncoder[TargetingSpecListOperation] = jsonEncoderOf[TargetingSpecListOperation]
}
