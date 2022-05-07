package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomLabel2Filter._

case class CustomLabel2Filter (
  CUSTOM_LABEL_2: CatalogsProductGroupMultipleStringCriteria)

object CustomLabel2Filter {
  import DateTimeCodecs._

  implicit val CustomLabel2FilterCodecJson: CodecJson[CustomLabel2Filter] = CodecJson.derive[CustomLabel2Filter]
  implicit val CustomLabel2FilterDecoder: EntityDecoder[CustomLabel2Filter] = jsonOf[CustomLabel2Filter]
  implicit val CustomLabel2FilterEncoder: EntityEncoder[CustomLabel2Filter] = jsonEncoderOf[CustomLabel2Filter]
}
