package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomLabel3Filter._

case class CustomLabel3Filter (
  CUSTOM_LABEL_3: CatalogsProductGroupMultipleStringCriteria)

object CustomLabel3Filter {
  import DateTimeCodecs._

  implicit val CustomLabel3FilterCodecJson: CodecJson[CustomLabel3Filter] = CodecJson.derive[CustomLabel3Filter]
  implicit val CustomLabel3FilterDecoder: EntityDecoder[CustomLabel3Filter] = jsonOf[CustomLabel3Filter]
  implicit val CustomLabel3FilterEncoder: EntityEncoder[CustomLabel3Filter] = jsonEncoderOf[CustomLabel3Filter]
}
