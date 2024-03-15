package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomLabel4Filter._

case class CustomLabel4Filter (
  CUSTOM_LABEL_4: CatalogsProductGroupMultipleStringCriteria)

object CustomLabel4Filter {
  import DateTimeCodecs._

  implicit val CustomLabel4FilterCodecJson: CodecJson[CustomLabel4Filter] = CodecJson.derive[CustomLabel4Filter]
  implicit val CustomLabel4FilterDecoder: EntityDecoder[CustomLabel4Filter] = jsonOf[CustomLabel4Filter]
  implicit val CustomLabel4FilterEncoder: EntityEncoder[CustomLabel4Filter] = jsonEncoderOf[CustomLabel4Filter]
}
