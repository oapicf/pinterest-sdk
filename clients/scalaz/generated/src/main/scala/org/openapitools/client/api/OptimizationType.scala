package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OptimizationType._

case class OptimizationType (
  
object OptimizationType {
  import DateTimeCodecs._

  implicit val OptimizationTypeCodecJson: CodecJson[OptimizationType] = CodecJson.derive[OptimizationType]
  implicit val OptimizationTypeDecoder: EntityDecoder[OptimizationType] = jsonOf[OptimizationType]
  implicit val OptimizationTypeEncoder: EntityEncoder[OptimizationType] = jsonEncoderOf[OptimizationType]
}
