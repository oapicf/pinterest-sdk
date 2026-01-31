package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomNumber0Filter._

case class CustomNumber0Filter (
  CUSTOM_NUMBER_0: CatalogsProductGroupUint32Criteria)

object CustomNumber0Filter {
  import DateTimeCodecs._

  implicit val CustomNumber0FilterCodecJson: CodecJson[CustomNumber0Filter] = CodecJson.derive[CustomNumber0Filter]
  implicit val CustomNumber0FilterDecoder: EntityDecoder[CustomNumber0Filter] = jsonOf[CustomNumber0Filter]
  implicit val CustomNumber0FilterEncoder: EntityEncoder[CustomNumber0Filter] = jsonEncoderOf[CustomNumber0Filter]
}
