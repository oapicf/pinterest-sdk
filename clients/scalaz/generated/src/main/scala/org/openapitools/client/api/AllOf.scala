package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AllOf._

case class AllOf (
  allOf: List[CatalogsProductGroupFilterKeys])

object AllOf {
  import DateTimeCodecs._

  implicit val AllOfCodecJson: CodecJson[AllOf] = CodecJson.derive[AllOf]
  implicit val AllOfDecoder: EntityDecoder[AllOf] = jsonOf[AllOf]
  implicit val AllOfEncoder: EntityEncoder[AllOf] = jsonEncoderOf[AllOf]
}
