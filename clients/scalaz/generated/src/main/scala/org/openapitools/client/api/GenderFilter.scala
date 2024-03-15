package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GenderFilter._

case class GenderFilter (
  GENDER: CatalogsProductGroupMultipleGenderCriteria)

object GenderFilter {
  import DateTimeCodecs._

  implicit val GenderFilterCodecJson: CodecJson[GenderFilter] = CodecJson.derive[GenderFilter]
  implicit val GenderFilterDecoder: EntityDecoder[GenderFilter] = jsonOf[GenderFilter]
  implicit val GenderFilterEncoder: EntityEncoder[GenderFilter] = jsonEncoderOf[GenderFilter]
}
