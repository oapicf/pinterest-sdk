package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomLabel1Filter._

case class CustomLabel1Filter (
  CUSTOM_LABEL_1: CatalogsProductGroupMultipleStringCriteria)

object CustomLabel1Filter {
  import DateTimeCodecs._

  implicit val CustomLabel1FilterCodecJson: CodecJson[CustomLabel1Filter] = CodecJson.derive[CustomLabel1Filter]
  implicit val CustomLabel1FilterDecoder: EntityDecoder[CustomLabel1Filter] = jsonOf[CustomLabel1Filter]
  implicit val CustomLabel1FilterEncoder: EntityEncoder[CustomLabel1Filter] = jsonEncoderOf[CustomLabel1Filter]
}
