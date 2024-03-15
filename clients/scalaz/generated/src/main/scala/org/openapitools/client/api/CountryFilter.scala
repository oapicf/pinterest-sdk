package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CountryFilter._

case class CountryFilter (
  COUNTRY: CatalogsProductGroupMultipleCountriesCriteria)

object CountryFilter {
  import DateTimeCodecs._

  implicit val CountryFilterCodecJson: CodecJson[CountryFilter] = CodecJson.derive[CountryFilter]
  implicit val CountryFilterDecoder: EntityDecoder[CountryFilter] = jsonOf[CountryFilter]
  implicit val CountryFilterEncoder: EntityEncoder[CountryFilter] = jsonEncoderOf[CountryFilter]
}
