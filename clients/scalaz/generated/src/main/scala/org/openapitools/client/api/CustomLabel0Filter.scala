package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomLabel0Filter._

case class CustomLabel0Filter (
  CUSTOM_LABEL_0: CatalogsProductGroupMultipleStringCriteria)

object CustomLabel0Filter {
  import DateTimeCodecs._

  implicit val CustomLabel0FilterCodecJson: CodecJson[CustomLabel0Filter] = CodecJson.derive[CustomLabel0Filter]
  implicit val CustomLabel0FilterDecoder: EntityDecoder[CustomLabel0Filter] = jsonOf[CustomLabel0Filter]
  implicit val CustomLabel0FilterEncoder: EntityEncoder[CustomLabel0Filter] = jsonEncoderOf[CustomLabel0Filter]
}
