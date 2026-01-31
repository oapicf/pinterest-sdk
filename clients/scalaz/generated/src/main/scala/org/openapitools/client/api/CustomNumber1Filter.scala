package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomNumber1Filter._

case class CustomNumber1Filter (
  CUSTOM_NUMBER_1: CatalogsProductGroupUint32Criteria)

object CustomNumber1Filter {
  import DateTimeCodecs._

  implicit val CustomNumber1FilterCodecJson: CodecJson[CustomNumber1Filter] = CodecJson.derive[CustomNumber1Filter]
  implicit val CustomNumber1FilterDecoder: EntityDecoder[CustomNumber1Filter] = jsonOf[CustomNumber1Filter]
  implicit val CustomNumber1FilterEncoder: EntityEncoder[CustomNumber1Filter] = jsonEncoderOf[CustomNumber1Filter]
}
