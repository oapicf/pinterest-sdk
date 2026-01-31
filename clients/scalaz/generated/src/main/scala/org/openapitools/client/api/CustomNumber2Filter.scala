package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomNumber2Filter._

case class CustomNumber2Filter (
  CUSTOM_NUMBER_2: CatalogsProductGroupUint32Criteria)

object CustomNumber2Filter {
  import DateTimeCodecs._

  implicit val CustomNumber2FilterCodecJson: CodecJson[CustomNumber2Filter] = CodecJson.derive[CustomNumber2Filter]
  implicit val CustomNumber2FilterDecoder: EntityDecoder[CustomNumber2Filter] = jsonOf[CustomNumber2Filter]
  implicit val CustomNumber2FilterEncoder: EntityEncoder[CustomNumber2Filter] = jsonEncoderOf[CustomNumber2Filter]
}
