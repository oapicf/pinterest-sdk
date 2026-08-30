package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionLearningModeType._

case class ConversionLearningModeType (
  
object ConversionLearningModeType {
  import DateTimeCodecs._

  implicit val ConversionLearningModeTypeCodecJson: CodecJson[ConversionLearningModeType] = CodecJson.derive[ConversionLearningModeType]
  implicit val ConversionLearningModeTypeDecoder: EntityDecoder[ConversionLearningModeType] = jsonOf[ConversionLearningModeType]
  implicit val ConversionLearningModeTypeEncoder: EntityEncoder[ConversionLearningModeType] = jsonEncoderOf[ConversionLearningModeType]
}
