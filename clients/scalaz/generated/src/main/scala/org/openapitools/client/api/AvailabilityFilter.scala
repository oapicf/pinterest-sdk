package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AvailabilityFilter._

case class AvailabilityFilter (
  AVAILABILITY: CatalogsProductGroupMultipleStringCriteria)

object AvailabilityFilter {
  import DateTimeCodecs._

  implicit val AvailabilityFilterCodecJson: CodecJson[AvailabilityFilter] = CodecJson.derive[AvailabilityFilter]
  implicit val AvailabilityFilterDecoder: EntityDecoder[AvailabilityFilter] = jsonOf[AvailabilityFilter]
  implicit val AvailabilityFilterEncoder: EntityEncoder[AvailabilityFilter] = jsonEncoderOf[AvailabilityFilter]
}
