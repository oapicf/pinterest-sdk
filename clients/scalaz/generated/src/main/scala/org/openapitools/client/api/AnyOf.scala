package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AnyOf._

case class AnyOf (
  anyOf: List[CatalogsProductGroupFilterKeys])

object AnyOf {
  import DateTimeCodecs._

  implicit val AnyOfCodecJson: CodecJson[AnyOf] = CodecJson.derive[AnyOf]
  implicit val AnyOfDecoder: EntityDecoder[AnyOf] = jsonOf[AnyOf]
  implicit val AnyOfEncoder: EntityEncoder[AnyOf] = jsonEncoderOf[AnyOf]
}
